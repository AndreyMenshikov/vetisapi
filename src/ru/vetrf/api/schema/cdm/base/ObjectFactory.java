
package ru.vetrf.api.schema.cdm.base;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.vetrf.api.schema.cdm.base package. 
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

    private final static QName _ListOptions_QNAME = new QName("http://api.vetrf.ru/schema/cdm/base", "listOptions");
    private final static QName _Uuid_QNAME = new QName("http://api.vetrf.ru/schema/cdm/base", "uuid");
    private final static QName _Guid_QNAME = new QName("http://api.vetrf.ru/schema/cdm/base", "guid");
    private final static QName _UpdateDateInterval_QNAME = new QName("http://api.vetrf.ru/schema/cdm/base", "updateDateInterval");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.vetrf.api.schema.cdm.base
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FaultInfo }
     * 
     */
    public FaultInfo createFaultInfo() {
        return new FaultInfo();
    }

    /**
     * Create an instance of {@link ListOptions }
     * 
     */
    public ListOptions createListOptions() {
        return new ListOptions();
    }

    /**
     * Create an instance of {@link DateInterval }
     * 
     */
    public DateInterval createDateInterval() {
        return new DateInterval();
    }

    /**
     * Create an instance of {@link EntityList }
     * 
     */
    public EntityList createEntityList() {
        return new EntityList();
    }

    /**
     * Create an instance of {@link Error }
     * 
     */
    public Error createError() {
        return new Error();
    }

    /**
     * Create an instance of {@link GenericEntity }
     * 
     */
    public GenericEntity createGenericEntity() {
        return new GenericEntity();
    }

    /**
     * Create an instance of {@link GenericVersioningEntity }
     * 
     */
    public GenericVersioningEntity createGenericVersioningEntity() {
        return new GenericVersioningEntity();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.vetrf.ru/schema/cdm/base", name = "listOptions")
    public JAXBElement<ListOptions> createListOptions(ListOptions value) {
        return new JAXBElement<ListOptions>(_ListOptions_QNAME, ListOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.vetrf.ru/schema/cdm/base", name = "uuid")
    public JAXBElement<String> createUuid(String value) {
        return new JAXBElement<String>(_Uuid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.vetrf.ru/schema/cdm/base", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateInterval }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.vetrf.ru/schema/cdm/base", name = "updateDateInterval")
    public JAXBElement<DateInterval> createUpdateDateInterval(DateInterval value) {
        return new JAXBElement<DateInterval>(_UpdateDateInterval_QNAME, DateInterval.class, null, value);
    }

}
