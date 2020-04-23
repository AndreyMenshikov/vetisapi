package ru.vsdmobile.samples;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.UUID;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import ru.vetrf.api.schema.cdm.application.Application;
import ru.vetrf.api.schema.cdm.application.ApplicationDataWrapper;
import ru.vetrf.api.schema.cdm.application.ws_definitions.ReceiveApplicationResultResponse;
import ru.vetrf.api.schema.cdm.dictionary.v2.BusinessEntity;
import ru.vetrf.api.schema.cdm.dictionary.v2.BusinessMember;
import ru.vetrf.api.schema.cdm.dictionary.v2.Enterprise;
import ru.vetrf.api.schema.cdm.dictionary.v2.ProductItem;
import ru.vetrf.api.schema.cdm.dictionary.v2.Purpose;
import ru.vetrf.api.schema.cdm.dictionary.v2.RegionalizationCondition;
import ru.vetrf.api.schema.cdm.dictionary.v2.RegionalizationConditionGroup;
import ru.vetrf.api.schema.cdm.dictionary.v2.RegionalizationRequirement;
import ru.vetrf.api.schema.cdm.dictionary.v2.RegionalizationShippingRule;
import ru.vetrf.api.schema.cdm.dictionary.v2.ResearchResult;
import ru.vetrf.api.schema.cdm.dictionary.v2.SubProduct;
import ru.vetrf.api.schema.cdm.dictionary.v2.TransportationStorageType;
import ru.vetrf.api.schema.cdm.dictionary.v2.Unit;
import ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2.CheckShipmentRegionalizationRequest;
import ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2.CheckShipmentRegionalizationResponse;
import ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2.PrepareOutgoingConsignmentRequest;
import ru.vetrf.api.schema.cdm.mercury.vet_document.v2.Consignment;
import ru.vetrf.api.schema.cdm.mercury.vet_document.v2.ConsignmentDocumentList;
import ru.vetrf.api.schema.cdm.mercury.vet_document.v2.Delivery;
import ru.vetrf.api.schema.cdm.mercury.vet_document.v2.ReferencedDocument;
import ru.vetrf.api.schema.cdm.mercury.vet_document.v2.RegionalizationClause;
import ru.vetrf.api.schema.cdm.mercury.vet_document.v2.RouteSectionR13NRules;
import ru.vetrf.api.schema.cdm.mercury.vet_document.v2.ShipmentRoute;
import ru.vetrf.api.schema.cdm.mercury.vet_document.v2.ShipmentRoutePoint;
import ru.vetrf.api.schema.cdm.mercury.vet_document.v2.StockEntry;
import ru.vetrf.api.schema.cdm.mercury.vet_document.v2.TransportInfo;
import ru.vetrf.api.schema.cdm.mercury.vet_document.v2.TransportNumber;
import ru.vetrf.api.schema.cdm.mercury.vet_document.v2.User;
import ru.vetrf.api.schema.cdm.mercury.vet_document.v2.VetDocument;
import ru.vetrf.api.schema.cdm.mercury.vet_document.v2.VeterinaryAuthentication;
import ru.vetrf.api.schema.cdm.mercury.vet_document.v2.Waybill;
import ru.vsdmobile.Profile;
import ru.vsdmobile.RequestTask;
import ru.vsdmobile.TASK_STATUS;
import ru.vsdmobile.VetisApplicationService;
import ru.vsdmobile.VetisApplicationService.IApplicationServiceEvents;

public class SendVetDocsForTest {
	private final Profile profile;
	private final DeliveryParams params;
	private final IApplicationServiceEvents callbacks;
	
	public SendVetDocsForTest(Profile profile, DeliveryParams params, IApplicationServiceEvents callbacks) {
		this.profile = profile;
		this.params = params;
		this.callbacks = callbacks;
	}
	
	public void startSendingVSDs() {		
		// Проверяется вид продукции, а не сама номенклатура. 
		checkR13n(params.subProductGuid, new IApplicationServiceEvents() {

			@Override
			public void onRequestCompleted(RequestTask crt) {
				callbacks.onRequestCompleted(crt);
				if(crt.initialTaskStatus == TASK_STATUS.COMPLETED) {
					List<RegionalizationCondition> list = parseR13nReques(crt.response);
					prepareAndSendVsds(list, 10);
				}
			}
		});
	}

	protected void prepareAndSendVsds(List<RegionalizationCondition> list, int count) {
		sendVsds(list, count, new IApplicationServiceEvents() {

			@Override
			public void onRequestCompleted(RequestTask crt) {
				callbacks.onRequestCompleted(crt);
				if(crt.initialTaskStatus == TASK_STATUS.COMPLETED) {
					parse(crt.response);
				}
			}
		});
	}
	
	protected void parse(ReceiveApplicationResultResponse response) {
		// TODO Auto-generated method stub
	}

	private void checkR13n(String productItemGuid, IApplicationServiceEvents events) {
		
		CheckShipmentRegionalizationRequest req = new CheckShipmentRegionalizationRequest();
        User user = new User();
        user.setLogin(profile.initiator);
		req.setInitiator(user);
		
		req.setLocalTransactionId(VSDUtils.genRnd(VSDUtils.RTYPE.BOTH, 10));

		SubProduct cType = new SubProduct();
		cType.setGuid(productItemGuid);
		req.getCargoType().add(cType);
		
		ShipmentRoute route = new ShipmentRoute();
		ShipmentRoutePoint rp1 = new ShipmentRoutePoint();
		Enterprise entFrom = new Enterprise();
		entFrom.setGuid(params.consignorEnterpriseGuid);
		rp1.setEnterprise(entFrom);
		rp1.setSqnId(BigInteger.valueOf(1));
		route.getRoutePoint().add(rp1);
		
		ShipmentRoutePoint rp2 = new ShipmentRoutePoint();
		Enterprise entTo = new Enterprise();
		entTo.setGuid(params.consigneeEnterpriseGuid);
		rp2.setEnterprise(entTo);
		rp2.setSqnId(BigInteger.valueOf(2));
		route.getRoutePoint().add(rp2);
		req.setShipmentRoute(route);
		
		ApplicationDataWrapper dw = new ApplicationDataWrapper();
		dw.setAny(req);
		Application app = new Application();
		app.setData(dw);
		app.setServiceId("mercury-g2b.service:2.1");
		app.setIssuerId(profile.issuerId);
		app.setIssueDate(getNewDate());

		VetisApplicationService srv = new VetisApplicationService(profile, events);

		srv.addApplicationToList(app, UUID.randomUUID().toString());
		srv.execute();
	}

	protected List<RegionalizationCondition> parseR13nReques(ReceiveApplicationResultResponse response) {
		try {
			Application app = response.getApplication();
			Object obj = ((JAXBElement)app.getResult().getAny()).getValue();
			
			if(obj instanceof CheckShipmentRegionalizationResponse) {
				CheckShipmentRegionalizationResponse resp = (CheckShipmentRegionalizationResponse)obj;
				
				List<RegionalizationCondition> condList = new ArrayList<RegionalizationCondition>();
				
				for(RouteSectionR13NRules r : resp.getR13NRouteSection()) {
					for(RegionalizationShippingRule shr : r.getAppliedR13NRule()) {
						for(RegionalizationRequirement rrec : shr.getRequirement()) {
							for(RegionalizationConditionGroup rcg : rrec.getConditionGroup()) {
								for(RegionalizationCondition rc : rcg.getCondition()) {
									condList.add(rc);
								}
							}
						}
					}
				}

				return condList;
			}				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	private void sendVsds(List<RegionalizationCondition> condList, int count, IApplicationServiceEvents events) {
		Profile profile = ProfileFactory.getYourProfile();
		
		VetisApplicationService srv = new VetisApplicationService(profile, events);

		for(int i = 0; i < count; i++) {
			PrepareOutgoingConsignmentRequest req = createRequest(profile, params, condList);
			ApplicationDataWrapper dw = new ApplicationDataWrapper();
			dw.setAny(req);
			Application app = new Application();
			app.setData(dw);
			app.setServiceId("mercury-g2b.service:2.1");
			app.setIssuerId(profile.issuerId);
			app.setIssueDate(getNewDate());
			srv.addApplicationToList(app, UUID.randomUUID().toString());
		}

		srv.execute();
	}

	private PrepareOutgoingConsignmentRequest createRequest(Profile profile, DeliveryParams dp, List<RegionalizationCondition> condList) {
		PrepareOutgoingConsignmentRequest req = new PrepareOutgoingConsignmentRequest();
		
        User user = new User();
        user.setLogin(profile.initiator);
		req.setInitiator(user);

		Delivery del = new Delivery();

		XMLGregorianCalendar deldate = getNewDate();
		del.setDeliveryDate(deldate);

		del.setTransportStorageType(TransportationStorageType.COOLED);

		/**
		 * Отправитель
		 */
		BusinessMember consignor = new BusinessMember();
		BusinessEntity be = new BusinessEntity();
		be.setGuid(profile.issuerId);
		consignor.setBusinessEntity(be);

		Enterprise ent = new Enterprise();
		ent.setGuid(dp.consignorEnterpriseGuid);
		consignor.setEnterprise(ent);

		del.setConsignor(consignor);

		// Получатель
		BusinessMember consignee = new BusinessMember();
		BusinessEntity cbe = new BusinessEntity();
		cbe.setGuid(dp.consigneeBusinessEntityGuid);
		consignee.setBusinessEntity(cbe);

		Enterprise cent = new Enterprise();
		cent.setGuid(dp.consigneeEnterpriseGuid);
		consignee.setEnterprise(cent);

		del.setConsignee(consignee);

		Consignment cons = new Consignment();
		cons.setId("idvalue0");

		ProductItem pItem = new ProductItem();
		pItem.setGuid(dp.productItemGuid);

		cons.setProductItem(pItem);
		cons.setVolume(BigDecimal.valueOf(dp.volume));
		Unit unit = new Unit();
		unit.setGuid(dp.unitGuid);
		cons.setUnit(unit);

		StockEntry stock = new StockEntry();
		stock.setGuid(dp.stockEntryGuid);
		cons.setSourceStockEntry(stock);

		del.getConsignment().add(cons);

		TransportInfo tInfo = new TransportInfo();
		tInfo.setTransportType(BigInteger.valueOf(1));
		
		TransportNumber tNumber = new TransportNumber();
		tNumber.setVehicleNumber(dp.vehicleNumber);
		tInfo.setTransportNumber(tNumber);
		del.setTransportInfo(tInfo);
		ConsignmentDocumentList accForm = new ConsignmentDocumentList();

		Waybill wBill = new Waybill();
		wBill.setIssueSeries(dp.waybillIssueSeries);
		wBill.setIssueNumber(dp.waybillIssueNumber);
		wBill.setIssueDate(deldate);
		wBill.setType(BigInteger.valueOf(1));
		accForm.setWaybill(wBill);

		ReferencedDocument rDoc = new ReferencedDocument();
		rDoc.setFor(cons);
		rDoc.setIssueDate(deldate);
		rDoc.setIssueNumber(dp.refDocIssueNumber);
		rDoc.setIssueSeries(dp.refDocIssueSeries);
		rDoc.setType(BigInteger.valueOf(16));
		rDoc.setRelationshipType(BigInteger.valueOf(1));
		accForm.getRelatedDocument().add(rDoc);

		VetDocument vetDoc = new VetDocument();
		
		VeterinaryAuthentication auth = new VeterinaryAuthentication();
		auth.setCargoExpertized(ResearchResult.VSEFULL);
		auth.setLocationProsperity("Местность благополучна");
		Purpose purp = new Purpose();
		purp.setGuid("5b913350-e089-11e1-bcf3-b499babae7ea");
		auth.setPurpose(purp);
		for(RegionalizationCondition rc : condList) {
			RegionalizationClause r13 = new RegionalizationClause();
			r13.setCondition(rc);
			auth.getR13NClause().add(r13);
		}
		
		vetDoc.setAuthentication(auth);
		vetDoc.setFor(cons);
		vetDoc.setIssueSeries(dp.purpIssueSeries);
		vetDoc.setIssueNumber(dp.purpIssuerNumber);

		accForm.getVetCertificate().add(vetDoc);

		del.setAccompanyingForms(accForm);

		req.getDelivery().add(del);

		req.setLocalTransactionId(UUID.randomUUID().toString());


		return req;
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
