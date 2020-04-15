package ru.vsdmobile.readers;

import java.math.BigInteger;

import javax.xml.ws.BindingProvider;

import ru.vetrf.api.schema.cdm.base.ListOptions;
import ru.vetrf.api.schema.cdm.registry.ikar.service.v2.IkarServiceBindingQSService;
import ru.vetrf.api.schema.cdm.registry.ikar.service.v2.IkarServicePortType;
import ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetDistrictListByRegionRequest;
import ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetDistrictListByRegionResponse;
import ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetLocalityListByDistrictRequest;
import ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetLocalityListByDistrictResponse;
import ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetLocalityListByRegionRequest;
import ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetLocalityListByRegionResponse;
import ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetRegionListByCountryRequest;
import ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetRegionListByCountryResponse;
import ru.vsdmobile.Profile;
import ru.vsdmobile.TestServerLocation;

public class GeographicReader {

	public static void main(String[] args) {
		//new LocalityReader().readDistricts("b8837188-39ee-4ff9-bc91-fcc9ed451bb3");
		//new GeographicReader().readLocalities("7377639c-b2ff-408f-963b-954208ffc891");
	}

	
	public GetRegionListByCountryResponse readRegions(Profile profile) {
		try {
			ListOptions options = new ListOptions();
			options.setCount(BigInteger.valueOf(1000));
			options.setOffset(BigInteger.valueOf(0));

			GetRegionListByCountryRequest regionRequest = new GetRegionListByCountryRequest();
			regionRequest.setListOptions(options);
			// Ищем только по России
			regionRequest.setCountryGuid("74a3cbb1-56fa-94f3-ab3f-e8db4940d96b");

			GetRegionListByCountryResponse regions = getPort(profile).getRegionListByCountry(regionRequest);
			return regions;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public GetLocalityListByDistrictResponse readLocalities(Profile profile, String districtGuid) {
		try {
			ListOptions options = new ListOptions();
			options.setCount(BigInteger.valueOf(1000));
			options.setOffset(BigInteger.valueOf(0));

			GetLocalityListByDistrictRequest localityRequest = new GetLocalityListByDistrictRequest();
			localityRequest.setListOptions(options);
			localityRequest.setDistrictGuid(districtGuid);

			GetLocalityListByDistrictResponse localityResult = getPort(profile).getLocalityListByDistrict(localityRequest);
			return localityResult;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public GetDistrictListByRegionResponse readDistricts(Profile profile, String regionGuid) {
		try {
			ListOptions options = new ListOptions();
			options.setCount(BigInteger.valueOf(1000));
			options.setOffset(BigInteger.valueOf(0));

			GetDistrictListByRegionRequest districtsRequest = new GetDistrictListByRegionRequest(); 
			districtsRequest.setListOptions(options);
			districtsRequest.setRegionGuid(regionGuid);

			GetDistrictListByRegionResponse districtsResult = getPort(profile).getDistrictListByRegion(districtsRequest);
			return districtsResult;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public GetLocalityListByRegionResponse readLocalitiesByRegion(Profile profile, String regionGuid) {
		try {
			ListOptions options = new ListOptions();
			options.setCount(BigInteger.valueOf(1000));
			options.setOffset(BigInteger.valueOf(0));

			GetLocalityListByRegionRequest localityRequest = new GetLocalityListByRegionRequest();
			localityRequest.setListOptions(options);
			localityRequest.setRegionGuid(regionGuid);

			GetLocalityListByRegionResponse localityResult = getPort(profile).getLocalityListByRegion(localityRequest);
			
			return localityResult;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}


	private IkarServicePortType getPort(Profile profile) {
		IkarServiceBindingQSService ikar = profile.useProductiveServer ? 
				new IkarServiceBindingQSService() :
				new IkarServiceBindingQSService(TestServerLocation.getIkarWsdlLocation());

		IkarServicePortType port = ikar.getIkarServiceBindingQSPort();
		BindingProvider prov = (BindingProvider) port;
		prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, profile.login);
		prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, profile.password);
		return port;
	}
}
