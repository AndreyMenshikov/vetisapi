
package ru.vetrf.api.schema.cdm.mercury.vet_document.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Ветеринарный сопроводительный документ.
 * 
 * <p>Java class for VetDocument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VetDocument">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}Document">
 *       &lt;sequence>
 *         &lt;element name="vetDForm" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}VetDocumentForm" minOccurs="0"/>
 *         &lt;element name="vetDType" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}VetDocumentType" minOccurs="0"/>
 *         &lt;element name="vetDStatus" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}VetDocumentStatus" minOccurs="0"/>
 *         &lt;element name="finalized" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="lastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="certifiedBatch" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}CertifiedBatch" minOccurs="0"/>
 *           &lt;element name="certifiedConsignment" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}CertifiedConsignment" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="authentication" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}VeterinaryAuthentication" minOccurs="0"/>
 *         &lt;element name="precedingVetDocuments" type="{http://api.vetrf.ru/schema/cdm/base}String255" minOccurs="0"/>
 *         &lt;element name="referencedDocument" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}ReferencedDocument" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="statusChange" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}VetDocumentStatusChange" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VetDocument", propOrder = {
    "vetDForm",
    "vetDType",
    "vetDStatus",
    "finalized",
    "lastUpdateDate",
    "certifiedBatch",
    "certifiedConsignment",
    "authentication",
    "precedingVetDocuments",
    "referencedDocument",
    "statusChange"
})
public class VetDocument
    extends Document
{

    @XmlSchemaType(name = "string")
    protected VetDocumentForm vetDForm;
    @XmlSchemaType(name = "string")
    protected VetDocumentType vetDType;
    @XmlSchemaType(name = "string")
    protected VetDocumentStatus vetDStatus;
    protected Boolean finalized;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdateDate;
    protected CertifiedBatch certifiedBatch;
    protected CertifiedConsignment certifiedConsignment;
    protected VeterinaryAuthentication authentication;
    protected String precedingVetDocuments;
    protected List<ReferencedDocument> referencedDocument;
    protected List<VetDocumentStatusChange> statusChange;

    /**
     * Gets the value of the vetDForm property.
     * 
     * @return
     *     possible object is
     *     {@link VetDocumentForm }
     *     
     */
    public VetDocumentForm getVetDForm() {
        return vetDForm;
    }

    /**
     * Sets the value of the vetDForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link VetDocumentForm }
     *     
     */
    public void setVetDForm(VetDocumentForm value) {
        this.vetDForm = value;
    }

    /**
     * Gets the value of the vetDType property.
     * 
     * @return
     *     possible object is
     *     {@link VetDocumentType }
     *     
     */
    public VetDocumentType getVetDType() {
        return vetDType;
    }

    /**
     * Sets the value of the vetDType property.
     * 
     * @param value
     *     allowed object is
     *     {@link VetDocumentType }
     *     
     */
    public void setVetDType(VetDocumentType value) {
        this.vetDType = value;
    }

    /**
     * Gets the value of the vetDStatus property.
     * 
     * @return
     *     possible object is
     *     {@link VetDocumentStatus }
     *     
     */
    public VetDocumentStatus getVetDStatus() {
        return vetDStatus;
    }

    /**
     * Sets the value of the vetDStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link VetDocumentStatus }
     *     
     */
    public void setVetDStatus(VetDocumentStatus value) {
        this.vetDStatus = value;
    }

    /**
     * Gets the value of the finalized property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFinalized() {
        return finalized;
    }

    /**
     * Sets the value of the finalized property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFinalized(Boolean value) {
        this.finalized = value;
    }

    /**
     * Gets the value of the lastUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * Sets the value of the lastUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdateDate(XMLGregorianCalendar value) {
        this.lastUpdateDate = value;
    }

    /**
     * Gets the value of the certifiedBatch property.
     * 
     * @return
     *     possible object is
     *     {@link CertifiedBatch }
     *     
     */
    public CertifiedBatch getCertifiedBatch() {
        return certifiedBatch;
    }

    /**
     * Sets the value of the certifiedBatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertifiedBatch }
     *     
     */
    public void setCertifiedBatch(CertifiedBatch value) {
        this.certifiedBatch = value;
    }

    /**
     * Gets the value of the certifiedConsignment property.
     * 
     * @return
     *     possible object is
     *     {@link CertifiedConsignment }
     *     
     */
    public CertifiedConsignment getCertifiedConsignment() {
        return certifiedConsignment;
    }

    /**
     * Sets the value of the certifiedConsignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertifiedConsignment }
     *     
     */
    public void setCertifiedConsignment(CertifiedConsignment value) {
        this.certifiedConsignment = value;
    }

    /**
     * Gets the value of the authentication property.
     * 
     * @return
     *     possible object is
     *     {@link VeterinaryAuthentication }
     *     
     */
    public VeterinaryAuthentication getAuthentication() {
        return authentication;
    }

    /**
     * Sets the value of the authentication property.
     * 
     * @param value
     *     allowed object is
     *     {@link VeterinaryAuthentication }
     *     
     */
    public void setAuthentication(VeterinaryAuthentication value) {
        this.authentication = value;
    }

    /**
     * Gets the value of the precedingVetDocuments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecedingVetDocuments() {
        return precedingVetDocuments;
    }

    /**
     * Sets the value of the precedingVetDocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecedingVetDocuments(String value) {
        this.precedingVetDocuments = value;
    }

    /**
     * Gets the value of the referencedDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referencedDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferencedDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferencedDocument }
     * 
     * 
     */
    public List<ReferencedDocument> getReferencedDocument() {
        if (referencedDocument == null) {
            referencedDocument = new ArrayList<ReferencedDocument>();
        }
        return this.referencedDocument;
    }

    /**
     * Gets the value of the statusChange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statusChange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusChange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VetDocumentStatusChange }
     * 
     * 
     */
    public List<VetDocumentStatusChange> getStatusChange() {
        if (statusChange == null) {
            statusChange = new ArrayList<VetDocumentStatusChange>();
        }
        return this.statusChange;
    }

}
