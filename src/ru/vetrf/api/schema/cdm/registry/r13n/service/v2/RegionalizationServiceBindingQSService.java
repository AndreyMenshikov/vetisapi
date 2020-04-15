
package ru.vetrf.api.schema.cdm.registry.r13n.service.v2;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "RegionalizationServiceBindingQSService", targetNamespace = "http://api.vetrf.ru/schema/cdm/registry/r13n/service/v2", wsdlLocation = "http://api.vetrf.ru/schema/platform/services/2.1-RC-last/RegionalizationService_v2.1_production.wsdl")
public class RegionalizationServiceBindingQSService
    extends Service
{

    private final static URL REGIONALIZATIONSERVICEBINDINGQSSERVICE_WSDL_LOCATION;
    private final static WebServiceException REGIONALIZATIONSERVICEBINDINGQSSERVICE_EXCEPTION;
    private final static QName REGIONALIZATIONSERVICEBINDINGQSSERVICE_QNAME = new QName("http://api.vetrf.ru/schema/cdm/registry/r13n/service/v2", "RegionalizationServiceBindingQSService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://api.vetrf.ru/schema/platform/services/2.1-RC-last/RegionalizationService_v2.1_production.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        REGIONALIZATIONSERVICEBINDINGQSSERVICE_WSDL_LOCATION = url;
        REGIONALIZATIONSERVICEBINDINGQSSERVICE_EXCEPTION = e;
    }

    public RegionalizationServiceBindingQSService() {
        super(__getWsdlLocation(), REGIONALIZATIONSERVICEBINDINGQSSERVICE_QNAME);
    }

    public RegionalizationServiceBindingQSService(WebServiceFeature... features) {
        super(__getWsdlLocation(), REGIONALIZATIONSERVICEBINDINGQSSERVICE_QNAME, features);
    }

    public RegionalizationServiceBindingQSService(URL wsdlLocation) {
        super(wsdlLocation, REGIONALIZATIONSERVICEBINDINGQSSERVICE_QNAME);
    }

    public RegionalizationServiceBindingQSService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, REGIONALIZATIONSERVICEBINDINGQSSERVICE_QNAME, features);
    }

    public RegionalizationServiceBindingQSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RegionalizationServiceBindingQSService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns RegionalizationServicePortType
     */
    @WebEndpoint(name = "RegionalizationServiceBindingQSPort")
    public RegionalizationServicePortType getRegionalizationServiceBindingQSPort() {
        return super.getPort(new QName("http://api.vetrf.ru/schema/cdm/registry/r13n/service/v2", "RegionalizationServiceBindingQSPort"), RegionalizationServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RegionalizationServicePortType
     */
    @WebEndpoint(name = "RegionalizationServiceBindingQSPort")
    public RegionalizationServicePortType getRegionalizationServiceBindingQSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://api.vetrf.ru/schema/cdm/registry/r13n/service/v2", "RegionalizationServiceBindingQSPort"), RegionalizationServicePortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (REGIONALIZATIONSERVICEBINDINGQSSERVICE_EXCEPTION!= null) {
            throw REGIONALIZATIONSERVICEBINDINGQSSERVICE_EXCEPTION;
        }
        return REGIONALIZATIONSERVICEBINDINGQSSERVICE_WSDL_LOCATION;
    }

}
