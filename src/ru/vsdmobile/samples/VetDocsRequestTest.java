package ru.vsdmobile.samples;

import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.UUID;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.joda.time.DateTime;

import ru.vetrf.api.schema.cdm.application.Application;
import ru.vetrf.api.schema.cdm.application.ApplicationDataWrapper;
import ru.vetrf.api.schema.cdm.application.ws_definitions.ReceiveApplicationResultResponse;
import ru.vetrf.api.schema.cdm.base.DateInterval;
import ru.vetrf.api.schema.cdm.base.ListOptions;
import ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2.GetVetDocumentByUuidRequest;
import ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2.GetVetDocumentChangesListRequest;
import ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2.GetVetDocumentListRequest;
import ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2.GetVetDocumentListResponse;
import ru.vetrf.api.schema.cdm.mercury.vet_document.v2.User;
import ru.vetrf.api.schema.cdm.mercury.vet_document.v2.VetDocument;
import ru.vetrf.api.schema.cdm.mercury.vet_document.v2.VetDocumentStatus;
import ru.vetrf.api.schema.cdm.mercury.vet_document.v2.VetDocumentType;
import ru.vsdmobile.Profile;
import ru.vsdmobile.RequestTask;
import ru.vsdmobile.TASK_STATUS;
import ru.vsdmobile.VetisApplicationService;
import ru.vsdmobile.VetisApplicationService.IApplicationServiceEvents;

public class VetDocsRequestTest {
	public static void main(String[] args) {
		new VetDocsRequestTest().runTest();
	}

	private void runTest() {		
		try {
			Profile profile = ProfileFactory.getYourProfile();
			VetisApplicationService srv = new VetisApplicationService(profile, new IApplicationServiceEvents() {

				@Override
				public void onRequestCompleted(RequestTask crt) {
					System.out.println(new Date().toString());
					System.out.println("Outgoing request:");
					System.out.println(crt.outgoingHttpDump);
					saveXML(crt.outgoingHttpDump, "reqout.xml");
					System.out.println("Incoming request:");
					System.out.println(crt.incomingHttpDump);
					saveXML(crt.incomingHttpDump, "reqin.xml");
					System.out.println("Recieved application status:");
					System.out.println(crt.initialTaskStatus);
					System.out.println("");
					System.out.println("");

					if(crt.initialTaskStatus == TASK_STATUS.COMPLETED) {
						parse(crt.response);
					}
				}
			});
			
			
			String enterpriseGuid = "XXXX";
			String vsdUuid = "XXXXX";

			Date start = new SimpleDateFormat("yyy-MM-dd").parse("2010-01-01");
			Date end = new Date();
			
			Application app = getVsdChangedRequestApplication(profile, enterpriseGuid, VetDocumentStatus.CONFIRMED, 0L, 1000L, start, end);
			srv.addApplicationToList(app, UUID.randomUUID().toString());
			srv.execute();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void saveXML(String obj, String filename) {
		String path = "c:\\temp\\vetis\\";
		try {
			FileWriter writer = new FileWriter(path.concat(filename));
			writer.write(obj);
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void parse(ReceiveApplicationResultResponse response) {
		try {
			Application app = response.getApplication();
			Object obj = ((JAXBElement)app.getResult().getAny()).getValue();
			
			if(obj instanceof GetVetDocumentListResponse) {
				GetVetDocumentListResponse resp = (GetVetDocumentListResponse)obj;
				if(resp.getVetDocumentList().getCount() > 0) {
					for(VetDocument vd : resp.getVetDocumentList().getVetDocument()) {
						System.out.println("Found: " + vd.getUuid());
					}
				}
			}				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static Application getVsdRequestApplication(Profile profile, String enterpriseGuid, VetDocumentStatus status, Long offset, Long count, Date startDate, Date endDate) {
		try {
			ListOptions options = new ListOptions();
			options.setCount(BigInteger.valueOf(count));
			options.setOffset(BigInteger.valueOf(offset));

			GetVetDocumentListRequest req = new GetVetDocumentListRequest();
			req.setListOptions(options);
			req.setEnterpriseGuid(enterpriseGuid);
			User user = new User();
			user.setLogin(profile.initiator);
			req.setInitiator(user);

			String localTransactionID = UUID.randomUUID().toString();
			req.setLocalTransactionId(localTransactionID);
			req.setVetDocumentType(VetDocumentType.INCOMING);
			
			if (status != null) {
				req.setVetDocumentStatus(status);
			}

			if (startDate != null && endDate != null) {
				DateInterval interval = new DateInterval();
				XMLGregorianCalendar startXml = DatatypeFactory.newInstance().newXMLGregorianCalendar(new DateTime(startDate).toGregorianCalendar());
				interval.setBeginDate(startXml);
				interval.setEndDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(new DateTime(endDate).toGregorianCalendar()));
				req.setIssueDateInterval(interval);
			}

			ApplicationDataWrapper dw = new ApplicationDataWrapper();
			dw.setAny(req);
			Application app = new Application();
			app.setData(dw);
			app.setServiceId("mercury-g2b.service:2.1");
			app.setIssuerId(profile.issuerId);
			app.setIssueDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar()));

			return app;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
	
	public static Application getVsdChangedRequestApplication(Profile profile, String enterpriseGuid, VetDocumentStatus status, Long offset, Long count, Date startDate, Date endDate) {
		try {
			ListOptions options = new ListOptions();
			options.setCount(BigInteger.valueOf(count));
			options.setOffset(BigInteger.valueOf(offset));

			GetVetDocumentChangesListRequest req = new GetVetDocumentChangesListRequest();
			req.setListOptions(options);
			req.setEnterpriseGuid(enterpriseGuid);
			User user = new User();
			user.setLogin(profile.initiator);
			req.setInitiator(user);

			String localTransactionID = UUID.randomUUID().toString();
			req.setLocalTransactionId(localTransactionID);
			req.setVetDocumentType(VetDocumentType.INCOMING);
			
			if (status != null) {
				req.setVetDocumentStatus(status);
			}

			if (startDate != null && endDate != null) {
				DateInterval interval = new DateInterval();
				XMLGregorianCalendar startXml = DatatypeFactory.newInstance().newXMLGregorianCalendar(new DateTime(startDate).toGregorianCalendar());
				interval.setBeginDate(startXml);
				interval.setEndDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(new DateTime(endDate).toGregorianCalendar()));
				req.setUpdateDateInterval(interval);
			}

			ApplicationDataWrapper dw = new ApplicationDataWrapper();
			dw.setAny(req);
			Application app = new Application();
			app.setData(dw);
			app.setServiceId("mercury-g2b.service:2.1");
			app.setIssuerId(profile.issuerId);
			app.setIssueDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar()));

			return app;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public static Application getVsdByGuidRequestApplication(Profile profile, String enterpriseGuid, String vsdUuid) {
		try {

			GetVetDocumentByUuidRequest req = new GetVetDocumentByUuidRequest();
			User user = new User();
			user.setLogin(profile.initiator);
			req.setInitiator(user);
			req.setEnterpriseGuid(enterpriseGuid);
			req.setUuid(vsdUuid);
			
			String localTransactionID = UUID.randomUUID().toString();
			req.setLocalTransactionId(localTransactionID);

			ApplicationDataWrapper dw = new ApplicationDataWrapper();
			dw.setAny(req);
			Application app = new Application();
			app.setData(dw);
			app.setServiceId("mercury-g2b.service:2.1");
			app.setIssuerId(profile.issuerId);
			app.setIssueDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar()));

			return app;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

}
