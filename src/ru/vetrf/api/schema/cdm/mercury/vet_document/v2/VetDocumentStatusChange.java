
package ru.vetrf.api.schema.cdm.mercury.vet_document.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Сведения об изменении статуса ветеринарного документа
 * 
 * <p>Java class for VetDocumentStatusChange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VetDocumentStatusChange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}VetDocumentStatus"/>
 *         &lt;element name="specifiedPerson" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}User"/>
 *         &lt;element name="actualDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="reason" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}VetDocumentStatusChangeReason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VetDocumentStatusChange", propOrder = {
    "status",
    "specifiedPerson",
    "actualDateTime",
    "reason"
})
public class VetDocumentStatusChange {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected VetDocumentStatus status;
    @XmlElement(required = true)
    protected User specifiedPerson;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualDateTime;
    protected String reason;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link VetDocumentStatus }
     *     
     */
    public VetDocumentStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link VetDocumentStatus }
     *     
     */
    public void setStatus(VetDocumentStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the specifiedPerson property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getSpecifiedPerson() {
        return specifiedPerson;
    }

    /**
     * Sets the value of the specifiedPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setSpecifiedPerson(User value) {
        this.specifiedPerson = value;
    }

    /**
     * Gets the value of the actualDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualDateTime() {
        return actualDateTime;
    }

    /**
     * Sets the value of the actualDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualDateTime(XMLGregorianCalendar value) {
        this.actualDateTime = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

}
