
package ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.vetrf.api.schema.cdm.mercury.vet_document.v2.User;


/**
 * Заявка на аннулирование ветеринарного сертификата.
 * 
 * <p>Java class for WithdrawVetDocumentRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WithdrawVetDocumentRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/mercury/g2b/applications/v2}MercuryApplicationRequest">
 *       &lt;sequence>
 *         &lt;element name="vetDocumentId" type="{http://api.vetrf.ru/schema/cdm/base}UUID"/>
 *         &lt;element name="withdrawReason" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}VetDocumentStatusChangeReason"/>
 *         &lt;element name="withdrawDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="specifiedPerson" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}User" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WithdrawVetDocumentRequest", propOrder = {
    "vetDocumentId",
    "withdrawReason",
    "withdrawDate",
    "specifiedPerson"
})
public class WithdrawVetDocumentRequest
    extends MercuryApplicationRequest
{

    @XmlElement(required = true)
    protected String vetDocumentId;
    @XmlElement(required = true)
    protected String withdrawReason;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar withdrawDate;
    protected User specifiedPerson;

    /**
     * Gets the value of the vetDocumentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVetDocumentId() {
        return vetDocumentId;
    }

    /**
     * Sets the value of the vetDocumentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVetDocumentId(String value) {
        this.vetDocumentId = value;
    }

    /**
     * Gets the value of the withdrawReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWithdrawReason() {
        return withdrawReason;
    }

    /**
     * Sets the value of the withdrawReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWithdrawReason(String value) {
        this.withdrawReason = value;
    }

    /**
     * Gets the value of the withdrawDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWithdrawDate() {
        return withdrawDate;
    }

    /**
     * Sets the value of the withdrawDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWithdrawDate(XMLGregorianCalendar value) {
        this.withdrawDate = value;
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

}
