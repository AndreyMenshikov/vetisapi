package ru.vsdmobile.samples;

import java.io.FileWriter;
import java.math.BigInteger;

import javax.xml.ws.BindingProvider;

import ru.vetrf.api.schema.cdm.base.ListOptions;
import ru.vetrf.api.schema.cdm.dictionary.v2.BusinessEntity;
import ru.vetrf.api.schema.cdm.registry.dictionary.service.v2.DictionaryServiceBindingQSService;
import ru.vetrf.api.schema.cdm.registry.dictionary.service.v2.DictionaryServicePortType;
import ru.vetrf.api.schema.cdm.registry.enterprise.service.v2.EnterpriseServiceBindingQSService;
import ru.vetrf.api.schema.cdm.registry.enterprise.service.v2.EnterpriseServicePortType;
import ru.vetrf.api.schema.cdm.registry.ikar.service.v2.IkarServiceBindingQSService;
import ru.vetrf.api.schema.cdm.registry.ikar.service.v2.IkarServicePortType;
import ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetAllCountryListRequest;
import ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetAllCountryListResponse;
import ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetBusinessEntityByGuidRequest;
import ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetBusinessEntityByGuidResponse;
import ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetDistrictListByRegionRequest;
import ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetDistrictListByRegionResponse;
import ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetEnterpriseByGuidRequest;
import ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetEnterpriseByGuidResponse;
import ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetLocalityListByRegionRequest;
import ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetLocalityListByRegionResponse;
import ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetPurposeListRequest;
import ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetPurposeListResponse;
import ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetRegionListByCountryRequest;
import ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetRegionListByCountryResponse;
import ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetUnitListRequest;
import ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetUnitListResponse;
import ru.vsdmobile.Profile;
import ru.vsdmobile.Runner;

public class RegistryRequestor {

	static{
        System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
        System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
        System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
        System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
        System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dumpTreshold", "999999");
    }
	
	public static void main(String[] args) {
		// geographicRequest();
		// businessEntityRequest();
		registryRequest();
	}

	private static void registryRequest() {
		try {
			EnterpriseServiceBindingQSService service = new EnterpriseServiceBindingQSService();
			Profile profile = ProfileFactory.getYourProfile();

			EnterpriseServicePortType port = service.getEnterpriseServiceBindingQSPort();
			BindingProvider prov = (BindingProvider)port;
			prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, profile.login);
			prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, profile.password);

			ListOptions options = new ListOptions();
			options.setCount(BigInteger.valueOf(1000));
			options.setOffset(BigInteger.valueOf(0));

			String guid = "0418-3274-838C-411A-BFD8-04F3-E163-6602".toLowerCase();
			GetEnterpriseByGuidRequest ent1 = new GetEnterpriseByGuidRequest();
			ent1.setGuid(guid);
			GetEnterpriseByGuidResponse ent1resp = port.getEnterpriseByGuid(ent1);
			Runner.printXML(ent1resp);

		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	private static void unitRequest() {
		try {
			Profile profile = ProfileFactory.getYourProfile();
			DictionaryServiceBindingQSService service = new DictionaryServiceBindingQSService();

			DictionaryServicePortType port = service.getDictionaryServiceBindingQSPort();
			BindingProvider prov = (BindingProvider)port;
			prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, profile.login);
			prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, profile.password);

			ListOptions options = new ListOptions();
			options.setCount(BigInteger.valueOf(1000));
			options.setOffset(BigInteger.valueOf(0));

			GetUnitListRequest request = new GetUnitListRequest();
			request.setListOptions(options);
			GetUnitListResponse resp = port.getUnitList(request);
			Runner.printXML(resp, "units.xml");

		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	private static void purposeRequest() {
		try {
			Profile profile = ProfileFactory.getYourProfile();
			DictionaryServiceBindingQSService service = new DictionaryServiceBindingQSService();

			DictionaryServicePortType port = service.getDictionaryServiceBindingQSPort();
			BindingProvider prov = (BindingProvider)port;
			prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, profile.login);
			prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, profile.password);

			ListOptions options = new ListOptions();
			options.setCount(BigInteger.valueOf(1000));
			options.setOffset(BigInteger.valueOf(0));

			GetPurposeListRequest request = new GetPurposeListRequest();
			request.setListOptions(options);
			GetPurposeListResponse resp = port.getPurposeList(request);
			Runner.printXML(resp, "purposes.xml");

		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	private static void businessEntityRequest() {
		try {
			EnterpriseServiceBindingQSService service = new EnterpriseServiceBindingQSService();
			Profile profile = ProfileFactory.getYourProfile();

			EnterpriseServicePortType port = service.getEnterpriseServiceBindingQSPort();
			BindingProvider prov = (BindingProvider)port;
			prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, profile.login);
			prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, profile.password);

			ListOptions options = new ListOptions();
			options.setCount(BigInteger.valueOf(1000));
			options.setOffset(BigInteger.valueOf(0));

			BusinessEntity filter = new BusinessEntity();
	        filter.setInn("XXXXXXXX");


			GetBusinessEntityByGuidRequest req = new GetBusinessEntityByGuidRequest();
			req.setGuid("XXXXXXX");
			GetBusinessEntityByGuidResponse resp = port.getBusinessEntityByGuid(req);
			Runner.printXML(resp, "bizent.xml");

		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	private static void geographicRequest() {
		try {
			IkarServiceBindingQSService ikar = new IkarServiceBindingQSService();
			Profile profile = ProfileFactory.getYourProfile();

			IkarServicePortType port = ikar.getIkarServiceBindingQSPort();
			BindingProvider prov = (BindingProvider)port;
			prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, profile.login);
			prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, profile.password);

			GetAllCountryListRequest request = new GetAllCountryListRequest();

			ListOptions options = new ListOptions();
			options.setCount(BigInteger.valueOf(1000));
			options.setOffset(BigInteger.valueOf(0));
			request.setListOptions(options);

			GetAllCountryListResponse result = port.getAllCountryList(request);

			FileWriter writer = new FileWriter("countries.xml");
			Runner.printXML(result, writer);
			writer.close();

			GetRegionListByCountryRequest regionRequest = new GetRegionListByCountryRequest();
			regionRequest.setListOptions(options);
			regionRequest.setCountryGuid("74a3cbb1-56fa-94f3-ab3f-e8db4940d96b");

			GetRegionListByCountryResponse regions = port.getRegionListByCountry(regionRequest);
			FileWriter regionWriter = new FileWriter("russianRegions.xml");
			Runner.printXML(regions, regionWriter);
			regionWriter.close();

			GetDistrictListByRegionRequest districtRequest = new GetDistrictListByRegionRequest();
			districtRequest.setListOptions(options);
			districtRequest.setRegionGuid("92b30014-4d52-4e2e-892d-928142b924bf");

			GetDistrictListByRegionResponse districtResult = port.getDistrictListByRegion(districtRequest);
			FileWriter districtWriter = new FileWriter("sverdlovskDistricts.xml");
			Runner.printXML(districtResult, districtWriter);
			districtWriter.close();

			GetLocalityListByRegionRequest localityRequest = new GetLocalityListByRegionRequest();
			localityRequest.setListOptions(options);
			localityRequest.setRegionGuid("92b30014-4d52-4e2e-892d-928142b924bf");

			GetLocalityListByRegionResponse localityResult = port.getLocalityListByRegion(localityRequest);
			FileWriter localityWriter = new FileWriter("sverdlovskLocality.xml");
			Runner.printXML(localityResult, localityWriter);
			localityWriter.close();


		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
