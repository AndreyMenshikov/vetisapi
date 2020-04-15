package ru.vsdmobile.readers;

import java.math.BigInteger;

import javax.xml.ws.BindingProvider;

import ru.vetrf.api.schema.cdm.base.ListOptions;
import ru.vetrf.api.schema.cdm.registry.product.service.v2.ProductServiceBindingQSService;
import ru.vetrf.api.schema.cdm.registry.product.service.v2.ProductServicePortType;
import ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetProductByTypeListRequest;
import ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetProductByTypeListResponse;
import ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetSubProductByProductListRequest;
import ru.vetrf.api.schema.cdm.registry.ws_definitions.v2.GetSubProductByProductListResponse;
import ru.vsdmobile.Profile;
import ru.vsdmobile.Runner;
import ru.vsdmobile.TestServerLocation;

public class ProductServiceReader {
	
	public void getSubproduct(Profile profile, String productGuid) {
		try {
			ListOptions options = new ListOptions();
			options.setCount(BigInteger.valueOf(1000));
			options.setOffset(BigInteger.valueOf(0));
			
			GetSubProductByProductListRequest req = new GetSubProductByProductListRequest();
			req.setProductGuid(productGuid);
			req.setListOptions(options);
			
			ProductServicePortType port = getPort(profile);
			
			GetSubProductByProductListResponse resp = port.getSubProductByProductList(req);
			
			Runner.printXML(resp);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void getProductByType(Profile profile, int productType) {
		try {
			ListOptions options = new ListOptions();
			options.setCount(BigInteger.valueOf(1000));
			options.setOffset(BigInteger.valueOf(0));
			
			GetProductByTypeListRequest req = new GetProductByTypeListRequest();
			req.setListOptions(options);
			req.setProductType(BigInteger.valueOf(productType));
			
			ProductServicePortType port = getPort(profile);
			
			GetProductByTypeListResponse resp = port.getProductByTypeList(req);
			
			Runner.printXML(resp);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	
	private ProductServicePortType getPort(Profile profile) {
		ProductServiceBindingQSService srv = profile.useProductiveServer ? 
				new ProductServiceBindingQSService() :
				new ProductServiceBindingQSService(TestServerLocation.getProductWsdlLocation());

				ProductServicePortType port = srv.getProductServiceBindingQSPort();
		BindingProvider prov = (BindingProvider) port;
		prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, profile.login);
		prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, profile.password);
		return port;
	}

}
