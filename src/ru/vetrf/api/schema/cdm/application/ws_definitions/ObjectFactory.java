
package ru.vetrf.api.schema.cdm.application.ws_definitions;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import ru.vetrf.api.schema.cdm.base.FaultInfo;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.vetrf.api.schema.cdm.application.ws_definitions package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UnsupportedApplicationDataTypeFault_QNAME = new QName("http://api.vetrf.ru/schema/cdm/application/ws-definitions", "unsupportedApplicationDataTypeFault");
    private final static QName _UnknownServiceIdFault_QNAME = new QName("http://api.vetrf.ru/schema/cdm/application/ws-definitions", "unknownServiceIdFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.vetrf.api.schema.cdm.application.ws_definitions
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReceiveApplicationResultRequest }
     * 
     */
    public ReceiveApplicationResultRequest createReceiveApplicationResultRequest() {
        return new ReceiveApplicationResultRequest();
    }

    /**
     * Create an instance of {@link SubmitApplicationResponse }
     * 
     */
    public SubmitApplicationResponse createSubmitApplicationResponse() {
        return new SubmitApplicationResponse();
    }

    /**
     * Create an instance of {@link ReceiveApplicationResultResponse }
     * 
     */
    public ReceiveApplicationResultResponse createReceiveApplicationResultResponse() {
        return new ReceiveApplicationResultResponse();
    }

    /**
     * Create an instance of {@link SubmitApplicationRequest }
     * 
     */
    public SubmitApplicationRequest createSubmitApplicationRequest() {
        return new SubmitApplicationRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.vetrf.ru/schema/cdm/application/ws-definitions", name = "unsupportedApplicationDataTypeFault")
    public JAXBElement<FaultInfo> createUnsupportedApplicationDataTypeFault(FaultInfo value) {
        return new JAXBElement<FaultInfo>(_UnsupportedApplicationDataTypeFault_QNAME, FaultInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.vetrf.ru/schema/cdm/application/ws-definitions", name = "unknownServiceIdFault")
    public JAXBElement<FaultInfo> createUnknownServiceIdFault(FaultInfo value) {
        return new JAXBElement<FaultInfo>(_UnknownServiceIdFault_QNAME, FaultInfo.class, null, value);
    }

}
