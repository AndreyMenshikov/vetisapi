package ru.vsdmobile;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.Binding;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;
import javax.xml.ws.handler.Handler;

import ru.vetrf.api.schema.cdm.application.Application;
import ru.vetrf.api.schema.cdm.application.ApplicationDataWrapper;
import ru.vetrf.api.schema.cdm.application.ApplicationStatus;
import ru.vetrf.api.schema.cdm.application.BusinessError;
import ru.vetrf.api.schema.cdm.application.service.ApplicationManagementServiceBindingQSService;
import ru.vetrf.api.schema.cdm.application.service.ApplicationManagementServicePortType;
import ru.vetrf.api.schema.cdm.application.ws_definitions.ReceiveApplicationResultRequest;
import ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2.MercuryApplicationRequest;
import ru.vetrf.api.schema.cdm.mercury.vet_document.v2.User;
import ru.vsdmobile.LogMessageHandler.ILogger;

public class VetisApplicationService {
    private final static int IN_PROCESS_MAX_REPEAT = 30;
    private static final int WAIT_FOR_RETRY_IN_SECONDS = 15;
    private final static int APLM0012_MAX_REPEAT = 30;

    private final int waitInSecond;
	private final Timer timer;
	private final Profile profile;

	public interface IApplicationServiceEvents {
		void onRequestCompleted(RequestTask completedRequestTask);
	}

	private final IApplicationServiceEvents callbacks;
	private final List<ApplicationTask> taskList;

	public VetisApplicationService(Profile profile, IApplicationServiceEvents callbacks) {
		this.waitInSecond = WAIT_FOR_RETRY_IN_SECONDS;
		this.profile = profile;
		this.callbacks = callbacks;
		this.taskList = new ArrayList<ApplicationTask>();

		timer = new java.util.Timer();
	}

	public void addApplicationToList(Application app, String taskUid) {
		ApplicationTask task = new ApplicationTask();
		task.initialApplication = app;
		task.uid = taskUid;
		taskList.add(task);
	}

	public void clearTaskList() {
		taskList.clear();
	}

	public void execute() {
		for (ApplicationTask task : taskList) {
			task.status = TASK_STATUS.QUEUED;
			sendApplicationRequest(task);
		}
	}

	private void sendApplicationRequest(ApplicationTask task) {
		try {
			RequestTask reqTask = new RequestTask();

			ApplicationManagementServicePortType port = getPort(profile, reqTask);
			Holder<Application> ha = new Holder<Application>(task.initialApplication);
			port.submitApplicationRequest(profile.apiKey, ha);

			ReceiveApplicationResultRequest request = new ReceiveApplicationResultRequest();
			request.setApiKey(profile.apiKey);
			request.setApplicationId(ha.value.getApplicationId());
			request.setIssuerId(profile.issuerId);

			task.requestForResult = request;
			reqTask.initialApplicationTask = task;

			waitfor(task);

			// Выполнение синхронное, поэтому здесь все поля сообщений должны быть
			// заполнены. Надо проверить!
			reqTask.initialTaskStatus = TASK_STATUS.QUEUED;
			reqTask.message = "Заявка отправлена";
			callbacks.onRequestCompleted(reqTask);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	private ApplicationManagementServicePortType getPort(Profile profile, RequestTask requestTask) {
		ApplicationManagementServiceBindingQSService service = profile.useProductiveServer ? new ApplicationManagementServiceBindingQSService()
				: new ApplicationManagementServiceBindingQSService(TestServerLocation.getApplicationWsdlLocation());
		ApplicationManagementServicePortType port = service.getApplicationManagementServiceBindingQSPort();
		BindingProvider prov = (BindingProvider) port;
		prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, profile.login);
		prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, profile.password);

		Binding binding = prov.getBinding();
		List<Handler> handlerChain = binding.getHandlerChain();
		LogMessageHandler handler = new LogMessageHandler(new ILogger() {

			@Override
			public void outgoing(SOAPMessage msg) {
				try {
					ByteArrayOutputStream os = new ByteArrayOutputStream();
					msg.writeTo(os);
					requestTask.outgoingHttpDump = os.toString("UTF-8");
					// System.out.println("Out: " + requestTask.outgoingHttpDump);
				} catch (SOAPException | IOException e) {
					e.printStackTrace();
				}
			}

			@Override
			public void incoming(SOAPMessage msg) {
				try {
					ByteArrayOutputStream os = new ByteArrayOutputStream();
					msg.writeTo(os);
					requestTask.incomingHttpDump = os.toString("UTF-8");
					// System.out.println("In: " + requestTask.incomingHttpDump);
				} catch (SOAPException | IOException e) {
					e.printStackTrace();
				}
			}

			@Override
			public void fault(SOAPMessage msg) {
				try {
					ByteArrayOutputStream os = new ByteArrayOutputStream();
					msg.writeTo(os);
					requestTask.faultHttpDump = os.toString("UTF-8");
					// System.out.println("Fault: " + os.toString("UTF-8"));
				} catch (SOAPException | IOException e) {
					e.printStackTrace();
				}
			}

		});

		handlerChain.add(handler);
		binding.setHandlerChain(handlerChain);

		return port;
	}

	public void _submit(Application app) {
	}

	private void parseResponse(RequestTask reqTask) throws Exception {
		Application app = reqTask.response.getApplication();
		ApplicationStatus status = app.getStatus();
		if (status != null) {
			switch (status) {
			case ACCEPTED:
				reqTask.initialTaskStatus = TASK_STATUS.ACCEPTED;
				reqTask.message = "Заявка принята. Отправляем запрос на получение статуса";
				callbacks.onRequestCompleted(reqTask);
				waitfor(reqTask.initialApplicationTask);
				break;
			case COMPLETED:
				reqTask.initialTaskStatus = TASK_STATUS.COMPLETED;
				reqTask.message = "Заявка выполнена";
				callbacks.onRequestCompleted(reqTask);
				break;
			case IN_PROCESS:
				reqTask.initialTaskStatus = TASK_STATUS.IN_PROCESS;
				reqTask.message = "Заявка в процессе выполнения, отправляем повторный запрос состояния.";
				callbacks.onRequestCompleted(reqTask);
				waitfor(reqTask.initialApplicationTask);
				break;
			case REJECTED:
				verboseReason(reqTask);
			}
		}
	}

	private void waitfor(ApplicationTask task) {
		TimerTask tt = new TimerTask() {

			@Override
			public void run() {
				try {
					RequestTask reqTask = new RequestTask();
					reqTask.initialApplicationTask = task;
					ApplicationManagementServicePortType port = getPort(profile, reqTask);
					reqTask.response = port.receiveApplicationResult(task.requestForResult);
					parseResponse(reqTask);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};

		timer.schedule(tt, waitInSecond * 1000);
	}

	private void verboseReason(RequestTask reqTask) {
		Application app = reqTask.response.getApplication();
		List<BusinessError> list = app.getErrors().getError();
		if (list != null) {
			StringBuilder sb = new StringBuilder();
			for (BusinessError error : list) {

				if ("APLM0012".equals(error.getCode())) {					
					if(++reqTask.initialApplicationTask.tryCountRejected > APLM0012_MAX_REPEAT) {
						reqTask.initialTaskStatus = TASK_STATUS.REJECTED;
						reqTask.message = "Превышено максимальное количество ошшибок APLM0012: " + APLM0012_MAX_REPEAT;
					} else {
						TimerTask repeatTask = new TimerTask() {
							@Override
							public void run() {
								sendApplicationRequest(reqTask.initialApplicationTask);
							}
						};

						reqTask.initialTaskStatus = TASK_STATUS.REPEAT_REQUEST;
						reqTask.message = "Получена ошибка APLM0012, выполняем повторный запрос...";
						timer.schedule(repeatTask, WAIT_FOR_RETRY_IN_SECONDS * 1000);
					}
					callbacks.onRequestCompleted(reqTask);
					return;
				}

				String msg = String.format("Code: %s, message: %s\n", error.getCode(), error.getValue());
				sb.append(msg);
			}

			reqTask.initialTaskStatus = TASK_STATUS.REJECTED;
			reqTask.message = sb.toString();
			callbacks.onRequestCompleted(reqTask);
		}
	}

}
