package ru.vsdmobile;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.ws.WebServiceException;

public class TestServerLocation {

    public static URL getEnterpriseWsdlLocation() {
        try {
            return new URL("http://api.vetrf.ru/schema/platform/services/2.1-RC-last/EnterpriseService_v2.1_pilot.wsdl");            
        } catch (MalformedURLException ex) {
            throw new WebServiceException(ex);
        }
    }
    
    public static URL getIkarWsdlLocation() {
        try {
            //return new URL("http://api.vetrf.ru/schema/platform/services/2.1-RC-last/IkarService_v2.1_production.wsdl");            
            return new URL("http://api.vetrf.ru/schema/platform/services/2.1-RC-last/IkarService_v2.1_pilot.wsdl");            
        } catch (MalformedURLException ex) {
            throw new WebServiceException(ex);
        }
    }

    public static URL getDictionaryWsdlLocation() {
        try {
            return new URL("http://api.vetrf.ru/schema/platform/services/2.1-RC-last/DictionaryService_v2.1_pilot.wsdl");            
        } catch (MalformedURLException ex) {
            throw new WebServiceException(ex);
        }
    }

    public static URL getProductWsdlLocation() {
        try {
            return new URL("http://api.vetrf.ru/schema/platform/services/2.1-RC-last/ProductService_v2.1_pilot.wsdl");            
        } catch (MalformedURLException ex) {
            throw new WebServiceException(ex);
        }
    }

    public static URL getRegionalizationWsdlLocation() {
        try {
            return new URL("http://api.vetrf.ru/schema/platform/services/2.1-RC-last/RegionalizationService_v2.1_pilot.wsdl");            
        } catch (MalformedURLException ex) {
            throw new WebServiceException(ex);
        }
    }

    public static URL getApplicationWsdlLocation() {
        try {
            return new URL("http://api.vetrf.ru/schema/platform/services/2.1-RC-last/ams-mercury-g2b.service_v2.1_pilot.wsdl");            
        } catch (MalformedURLException ex) {
            throw new WebServiceException(ex);
        }
    }
}
