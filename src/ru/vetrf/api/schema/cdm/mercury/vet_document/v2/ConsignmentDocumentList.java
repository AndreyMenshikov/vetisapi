
package ru.vetrf.api.schema.cdm.mercury.vet_document.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Пакет сопроводительных документов
 * 
 * <p>Java class for ConsignmentDocumentList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsignmentDocumentList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="waybill" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}Waybill" minOccurs="0"/>
 *         &lt;element name="vetCertificate" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}VetDocument" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="relatedDocument" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}ReferencedDocument" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsignmentDocumentList", propOrder = {
    "waybill",
    "vetCertificate",
    "relatedDocument"
})
public class ConsignmentDocumentList {

    protected Waybill waybill;
    protected List<VetDocument> vetCertificate;
    protected List<ReferencedDocument> relatedDocument;

    /**
     * Gets the value of the waybill property.
     * 
     * @return
     *     possible object is
     *     {@link Waybill }
     *     
     */
    public Waybill getWaybill() {
        return waybill;
    }

    /**
     * Sets the value of the waybill property.
     * 
     * @param value
     *     allowed object is
     *     {@link Waybill }
     *     
     */
    public void setWaybill(Waybill value) {
        this.waybill = value;
    }

    /**
     * Gets the value of the vetCertificate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vetCertificate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVetCertificate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VetDocument }
     * 
     * 
     */
    public List<VetDocument> getVetCertificate() {
        if (vetCertificate == null) {
            vetCertificate = new ArrayList<VetDocument>();
        }
        return this.vetCertificate;
    }

    /**
     * Gets the value of the relatedDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferencedDocument }
     * 
     * 
     */
    public List<ReferencedDocument> getRelatedDocument() {
        if (relatedDocument == null) {
            relatedDocument = new ArrayList<ReferencedDocument>();
        }
        return this.relatedDocument;
    }

}
