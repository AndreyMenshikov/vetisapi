package ru.vsdmobile;

import java.math.BigInteger;
import java.util.GregorianCalendar;
import java.util.UUID;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import ru.vetrf.api.schema.cdm.application.Application;
import ru.vetrf.api.schema.cdm.application.ApplicationDataWrapper;
import ru.vetrf.api.schema.cdm.base.RegisterModificationType;
import ru.vetrf.api.schema.cdm.dictionary.v2.Address;
import ru.vetrf.api.schema.cdm.dictionary.v2.BusinessEntity;
import ru.vetrf.api.schema.cdm.dictionary.v2.Country;
import ru.vetrf.api.schema.cdm.dictionary.v2.Enterprise;
import ru.vetrf.api.schema.cdm.dictionary.v2.EnterpriseActivity;
import ru.vetrf.api.schema.cdm.dictionary.v2.EnterpriseActivityList;
import ru.vetrf.api.schema.cdm.dictionary.v2.EnterpriseList;
import ru.vetrf.api.schema.cdm.dictionary.v2.EnterpriseOfficialRegistration;
import ru.vetrf.api.schema.cdm.dictionary.v2.Locality;
import ru.vetrf.api.schema.cdm.dictionary.v2.Region;
import ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2.MercuryApplicationRequest;
import ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2.ModifyActivityLocationsRequest;
import ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2.ModifyEnterpriseRequest;
import ru.vetrf.api.schema.cdm.mercury.vet_document.v2.BEActivityLocationsModificationOperation;
import ru.vetrf.api.schema.cdm.mercury.vet_document.v2.BEActivityLocationsModificationOperation.ActivityLocation;
import ru.vetrf.api.schema.cdm.mercury.vet_document.v2.ENTModificationOperation;
import ru.vetrf.api.schema.cdm.mercury.vet_document.v2.User;
import ru.vsdmobile.VetisApplicationService.IApplicationServiceEvents;
import ru.vsdmobile.lightobjects.EnterpriseLight;
import ru.vsdmobile.readers.EnterpriseServiceReader;

public class EnterpriseOperations {
	
	public void changeLink(Profile profile, BusinessEntity entity, Enterprise enterprise, RegisterModificationType type, IApplicationServiceEvents eventHandler) {
		ModifyActivityLocationsRequest req = new ModifyActivityLocationsRequest();
		
		User initiator = new User();
		initiator.setLogin(profile.initiator);
		req.setInitiator(initiator);
		req.setLocalTransactionId(UUID.randomUUID().toString());

		BEActivityLocationsModificationOperation value = new BEActivityLocationsModificationOperation();
		value.setBusinessEntity(entity);
		value.setType(type);
		ActivityLocation actloc = new ActivityLocation();
		actloc.setEnterprise(enterprise);
		
		value.getActivityLocation().add(actloc);
		req.setModificationOperation(value);
		
		sendrequest(profile, eventHandler, req);
	}
	
	public void createEnterprise(Profile profile, EnterpriseLight entLight, IApplicationServiceEvents eventHandler) {
		ModifyEnterpriseRequest req = createEnterpriseModificationRequest(profile, entLight);
		sendrequest(profile, eventHandler, req);
	}

	private ModifyEnterpriseRequest createEnterpriseModificationRequest(Profile profile, EnterpriseLight e) {

		ModifyEnterpriseRequest req = new ModifyEnterpriseRequest();

		User initiator = new User();
		initiator.setLogin(profile.initiator);
		req.setInitiator(initiator);
		req.setLocalTransactionId(UUID.randomUUID().toString());

		ENTModificationOperation oper = new ENTModificationOperation();
		Enterprise ent = new Enterprise();
		Address addr = new Address();
		Country country = new Country();
		country.setGuid("74a3cbb1-56fa-94f3-ab3f-e8db4940d96b");
		addr.setCountry(country);
		Region reg = new Region();
		reg.setGuid(e.regionGuid);
		addr.setRegion(reg);
		addr.setAddressView(e.addressView);

		Locality locality = new Locality();
		locality.setGuid(e.localityGuid);
		addr.setLocality(locality);

		ent.setAddress(addr);
		EnterpriseActivity activity = new EnterpriseActivity();
		activity.setName(e.activityName);
		ent.setActivityList(new EnterpriseActivityList());
		ent.getActivityList().getActivity().add(activity);
		
		//EnterpriseOfficialRegistration ofreg = new EnterpriseOfficialRegistration();

		//BusinessEntity registrar = new EnterpriseServiceReader().getBusinessEntityByGuid(profile, profile.issuerId); 
				//new BusinessEntity();
		//registrar.setGuid(profile.issuerId);
		//registrar.setInn("6659210699");
		//ofreg.setKpp(e.kpp);
		//ofreg.setBusinessEntity(registrar);
		//ent.getOfficialRegistration().add(ofreg);

		ent.setName(e.name);
		ent.setType(BigInteger.valueOf(1));

		BusinessEntity owner = new BusinessEntity();
		owner.setGuid(profile.issuerId);
		ent.setOwner(owner);

		EnterpriseList reslist = new EnterpriseList();
		reslist.getEnterprise().add(ent);
		oper.setResultingList(reslist);
		oper.setType(RegisterModificationType.CREATE);
		oper.setReason(e.reasonOfModification);

		req.setModificationOperation(oper);

		// Runner.printXML(req);
		return req;
	}

	private void sendrequest(Profile profile, IApplicationServiceEvents eventHandler, MercuryApplicationRequest request) {
		
		ApplicationDataWrapper dw = new ApplicationDataWrapper();
		dw.setAny(request);
		Application app = new Application();
		app.setData(dw);
		app.setServiceId("mercury-g2b.service:2.1");
		app.setIssuerId(profile.issuerId);
		app.setIssueDate(getNewDate());

		VetisApplicationService srv = new VetisApplicationService(profile, eventHandler);
		srv.addApplicationToList(app, UUID.randomUUID().toString());

		srv.execute();
	}

	private XMLGregorianCalendar getNewDate() {
		try {
			return DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar());
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}
		return null;
	}

}
