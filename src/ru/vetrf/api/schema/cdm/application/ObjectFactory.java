
package ru.vetrf.api.schema.cdm.application;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.vetrf.api.schema.cdm.application package. 
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

    private final static QName _Application_QNAME = new QName("http://api.vetrf.ru/schema/cdm/application", "application");
    private final static QName _ApplicationResultData_QNAME = new QName("http://api.vetrf.ru/schema/cdm/application", "applicationResultData");
    private final static QName _ApplicationData_QNAME = new QName("http://api.vetrf.ru/schema/cdm/application", "applicationData");
    private final static QName _ErrorList_QNAME = new QName("http://api.vetrf.ru/schema/cdm/application", "errorList");
    private final static QName _BusinessError_QNAME = new QName("http://api.vetrf.ru/schema/cdm/application", "businessError");
    private final static QName _Binary_QNAME = new QName("http://api.vetrf.ru/schema/cdm/application", "binary");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.vetrf.api.schema.cdm.application
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Application }
     * 
     */
    public Application createApplication() {
        return new Application();
    }

    /**
     * Create an instance of {@link BusinessError }
     * 
     */
    public BusinessError createBusinessError() {
        return new BusinessError();
    }

    /**
     * Create an instance of {@link BusinessErrorList }
     * 
     */
    public BusinessErrorList createBusinessErrorList() {
        return new BusinessErrorList();
    }

    /**
     * Create an instance of {@link ApplicationDataWrapper }
     * 
     */
    public ApplicationDataWrapper createApplicationDataWrapper() {
        return new ApplicationDataWrapper();
    }

    /**
     * Create an instance of {@link ApplicationResultWrapper }
     * 
     */
    public ApplicationResultWrapper createApplicationResultWrapper() {
        return new ApplicationResultWrapper();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Application }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.vetrf.ru/schema/cdm/application", name = "application")
    public JAXBElement<Application> createApplication(Application value) {
        return new JAXBElement<Application>(_Application_QNAME, Application.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApplicationResultData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.vetrf.ru/schema/cdm/application", name = "applicationResultData")
    public JAXBElement<ApplicationResultData> createApplicationResultData(ApplicationResultData value) {
        return new JAXBElement<ApplicationResultData>(_ApplicationResultData_QNAME, ApplicationResultData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApplicationData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.vetrf.ru/schema/cdm/application", name = "applicationData")
    public JAXBElement<ApplicationData> createApplicationData(ApplicationData value) {
        return new JAXBElement<ApplicationData>(_ApplicationData_QNAME, ApplicationData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessErrorList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.vetrf.ru/schema/cdm/application", name = "errorList")
    public JAXBElement<BusinessErrorList> createErrorList(BusinessErrorList value) {
        return new JAXBElement<BusinessErrorList>(_ErrorList_QNAME, BusinessErrorList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.vetrf.ru/schema/cdm/application", name = "businessError")
    public JAXBElement<BusinessError> createBusinessError(BusinessError value) {
        return new JAXBElement<BusinessError>(_BusinessError_QNAME, BusinessError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.vetrf.ru/schema/cdm/application", name = "binary")
    public JAXBElement<byte[]> createBinary(byte[] value) {
        return new JAXBElement<byte[]>(_Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

}
