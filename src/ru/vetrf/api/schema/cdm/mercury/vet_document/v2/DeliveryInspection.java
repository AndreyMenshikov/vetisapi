
package ru.vetrf.api.schema.cdm.mercury.vet_document.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Контроль поставки (документарный, ветеринарный)
 * 
 * <p>Java class for DeliveryInspection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryInspection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="responsible" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}User" minOccurs="0"/>
 *         &lt;element name="result" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}DeliveryInspectionResult"/>
 *         &lt;element name="info" type="{http://api.vetrf.ru/schema/cdm/base}Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryInspection", propOrder = {
    "responsible",
    "result",
    "info"
})
public class DeliveryInspection {

    protected User responsible;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DeliveryInspectionResult result;
    protected String info;

    /**
     * Gets the value of the responsible property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getResponsible() {
        return responsible;
    }

    /**
     * Sets the value of the responsible property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setResponsible(User value) {
        this.responsible = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryInspectionResult }
     *     
     */
    public DeliveryInspectionResult getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryInspectionResult }
     *     
     */
    public void setResult(DeliveryInspectionResult value) {
        this.result = value;
    }

    /**
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfo(String value) {
        this.info = value;
    }

}
