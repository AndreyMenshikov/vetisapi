
package ru.vetrf.api.schema.cdm.base.ws_definitions;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import ru.vetrf.api.schema.cdm.base.FaultInfo;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.vetrf.api.schema.cdm.base.ws_definitions package. 
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

    private final static QName _RequestRejectedFault_QNAME = new QName("http://api.vetrf.ru/schema/cdm/base/ws-definitions", "requestRejectedFault");
    private final static QName _InternalServiceFault_QNAME = new QName("http://api.vetrf.ru/schema/cdm/base/ws-definitions", "internalServiceFault");
    private final static QName _IncorrectRequestFault_QNAME = new QName("http://api.vetrf.ru/schema/cdm/base/ws-definitions", "incorrectRequestFault");
    private final static QName _AccessDeniedFault_QNAME = new QName("http://api.vetrf.ru/schema/cdm/base/ws-definitions", "accessDeniedFault");
    private final static QName _OffsetOutOfRangeFault_QNAME = new QName("http://api.vetrf.ru/schema/cdm/base/ws-definitions", "offsetOutOfRangeFault");
    private final static QName _EntityNotFoundFault_QNAME = new QName("http://api.vetrf.ru/schema/cdm/base/ws-definitions", "entityNotFoundFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.vetrf.api.schema.cdm.base.ws_definitions
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.vetrf.ru/schema/cdm/base/ws-definitions", name = "requestRejectedFault")
    public JAXBElement<FaultInfo> createRequestRejectedFault(FaultInfo value) {
        return new JAXBElement<FaultInfo>(_RequestRejectedFault_QNAME, FaultInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.vetrf.ru/schema/cdm/base/ws-definitions", name = "internalServiceFault")
    public JAXBElement<FaultInfo> createInternalServiceFault(FaultInfo value) {
        return new JAXBElement<FaultInfo>(_InternalServiceFault_QNAME, FaultInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.vetrf.ru/schema/cdm/base/ws-definitions", name = "incorrectRequestFault")
    public JAXBElement<FaultInfo> createIncorrectRequestFault(FaultInfo value) {
        return new JAXBElement<FaultInfo>(_IncorrectRequestFault_QNAME, FaultInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.vetrf.ru/schema/cdm/base/ws-definitions", name = "accessDeniedFault")
    public JAXBElement<FaultInfo> createAccessDeniedFault(FaultInfo value) {
        return new JAXBElement<FaultInfo>(_AccessDeniedFault_QNAME, FaultInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.vetrf.ru/schema/cdm/base/ws-definitions", name = "offsetOutOfRangeFault")
    public JAXBElement<FaultInfo> createOffsetOutOfRangeFault(FaultInfo value) {
        return new JAXBElement<FaultInfo>(_OffsetOutOfRangeFault_QNAME, FaultInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.vetrf.ru/schema/cdm/base/ws-definitions", name = "entityNotFoundFault")
    public JAXBElement<FaultInfo> createEntityNotFoundFault(FaultInfo value) {
        return new JAXBElement<FaultInfo>(_EntityNotFoundFault_QNAME, FaultInfo.class, null, value);
    }

}
