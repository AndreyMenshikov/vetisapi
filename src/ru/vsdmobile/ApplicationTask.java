package ru.vsdmobile;

import ru.vetrf.api.schema.cdm.application.Application;
import ru.vetrf.api.schema.cdm.application.ws_definitions.ReceiveApplicationResultRequest;

public class ApplicationTask {
	public String uid;
	public TASK_STATUS status;
	public String message;
	
	/**
	 * Количество попыток получить результат выполнения заявки при получени статуса
	 * IN_PROCESS
	 */
	public int tryCountInProcess = 0;

	/**
	 * Количество повторных попыток отправить заявку при получении ошибки APLM0012
	 */
	public int tryCountRejected = 0;

	public String applicationIdInProcess;
	
	public Application initialApplication;
	ReceiveApplicationResultRequest requestForResult;

	public ApplicationTask() {
		tryCountInProcess = 0;
	}
}
