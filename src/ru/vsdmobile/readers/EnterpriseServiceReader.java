package ru.vsdmobile.readers;

import java.math.BigInteger;
import java.util.List;

import javax.xml.ws.BindingProvider;

import ru.vetrf.api.schema.cdm.base.ListOptions;
import ru.vetrf.api.schema.cdm.dictionary.v2.BusinessEntity;
import ru.vetrf.api.schema.cdm.registry.enterprise.service.v2.EnterpriseServiceBindingQSService;
import ru.vetrf.api.schema.cdm.registry.enterprise.service.v2.EnterpriseServicePortType;
import ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetBusinessEntityByGuidRequest;
import ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetBusinessEntityByGuidResponse;
import ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetBusinessEntityListRequest;
import ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetBusinessEntityListResponse;
import ru.vsdmobile.Profile;
import ru.vsdmobile.TestServerLocation;

public class EnterpriseServiceReader {
	public BusinessEntity getBusinessEntityByGuid(Profile profile, String issuerId) {
		try {
			EnterpriseServicePortType port = getPort(profile); 

			ListOptions options = new ListOptions();
			options.setCount(BigInteger.valueOf(1000));
			options.setOffset(BigInteger.valueOf(0));

			//BusinessEntity filter = new BusinessEntity();
	        //filter.setInn("6659210699");
	        //filter.setInn("6319220322");
	        //filter.setGuid(issuerId);


			GetBusinessEntityByGuidRequest req = new GetBusinessEntityByGuidRequest();
			req.setGuid(issuerId);
			GetBusinessEntityByGuidResponse resp = port.getBusinessEntityByGuid(req);
			
			BusinessEntity be = resp.getBusinessEntity();
			
			return be;

		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<BusinessEntity> getBusinessEntityByInn(Profile profile, String inn) {
		try {
			EnterpriseServicePortType port = getPort(profile); 

			ListOptions options = new ListOptions();
			options.setCount(BigInteger.valueOf(1000));
			options.setOffset(BigInteger.valueOf(0));

			BusinessEntity filter = new BusinessEntity();
	        filter.setInn(inn);

	        GetBusinessEntityListRequest req = new GetBusinessEntityListRequest();
	        req.setBusinessEntity(filter);
	        req.setListOptions(options);

			GetBusinessEntityListResponse resp = port.getBusinessEntityList(req);
			
			if(resp.getBusinessEntityList().getCount() > 0) {
				return resp.getBusinessEntityList().getBusinessEntity();
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	private EnterpriseServicePortType getPort(Profile profile) {
		EnterpriseServiceBindingQSService srv = profile.useProductiveServer ? 
				new EnterpriseServiceBindingQSService() :
				new EnterpriseServiceBindingQSService(TestServerLocation.getEnterpriseWsdlLocation());

				EnterpriseServicePortType port = srv.getEnterpriseServiceBindingQSPort();
		BindingProvider prov = (BindingProvider) port;
		prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, profile.login);
		prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, profile.password);
		return port;
	}


}
