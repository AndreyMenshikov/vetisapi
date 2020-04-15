
package ru.vetrf.api.schema.cdm.mercury.vet_document.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ru.vetrf.api.schema.cdm.dictionary.v2.DocumentNature;


/**
 * Сведения о контроле партии.
 * 
 * <p>Java class for DeliveryFactList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryFactList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vetCertificatePresence" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}DocumentNature"/>
 *         &lt;element name="docInspection" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}DeliveryInspection"/>
 *         &lt;element name="vetInspection" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}DeliveryInspection"/>
 *         &lt;element name="decision" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}DeliveryDecision"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryFactList", propOrder = {
    "vetCertificatePresence",
    "docInspection",
    "vetInspection",
    "decision"
})
public class DeliveryFactList {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DocumentNature vetCertificatePresence;
    @XmlElement(required = true)
    protected DeliveryInspection docInspection;
    @XmlElement(required = true)
    protected DeliveryInspection vetInspection;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DeliveryDecision decision;

    /**
     * Gets the value of the vetCertificatePresence property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentNature }
     *     
     */
    public DocumentNature getVetCertificatePresence() {
        return vetCertificatePresence;
    }

    /**
     * Sets the value of the vetCertificatePresence property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentNature }
     *     
     */
    public void setVetCertificatePresence(DocumentNature value) {
        this.vetCertificatePresence = value;
    }

    /**
     * Gets the value of the docInspection property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryInspection }
     *     
     */
    public DeliveryInspection getDocInspection() {
        return docInspection;
    }

    /**
     * Sets the value of the docInspection property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryInspection }
     *     
     */
    public void setDocInspection(DeliveryInspection value) {
        this.docInspection = value;
    }

    /**
     * Gets the value of the vetInspection property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryInspection }
     *     
     */
    public DeliveryInspection getVetInspection() {
        return vetInspection;
    }

    /**
     * Sets the value of the vetInspection property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryInspection }
     *     
     */
    public void setVetInspection(DeliveryInspection value) {
        this.vetInspection = value;
    }

    /**
     * Gets the value of the decision property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryDecision }
     *     
     */
    public DeliveryDecision getDecision() {
        return decision;
    }

    /**
     * Sets the value of the decision property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryDecision }
     *     
     */
    public void setDecision(DeliveryDecision value) {
        this.decision = value;
    }

}
