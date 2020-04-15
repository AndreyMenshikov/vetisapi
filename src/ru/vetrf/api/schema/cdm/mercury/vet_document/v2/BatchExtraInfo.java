
package ru.vetrf.api.schema.cdm.mercury.vet_document.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Дополнительные сведения о партии продукции.
 * 
 * <p>Java class for BatchExtraInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatchExtraInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nonFoodSource" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}NonFoodProductSourceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchExtraInfo", propOrder = {
    "nonFoodSource"
})
public class BatchExtraInfo {

    @XmlSchemaType(name = "token")
    protected NonFoodProductSourceType nonFoodSource;

    /**
     * Gets the value of the nonFoodSource property.
     * 
     * @return
     *     possible object is
     *     {@link NonFoodProductSourceType }
     *     
     */
    public NonFoodProductSourceType getNonFoodSource() {
        return nonFoodSource;
    }

    /**
     * Sets the value of the nonFoodSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonFoodProductSourceType }
     *     
     */
    public void setNonFoodSource(NonFoodProductSourceType value) {
        this.nonFoodSource = value;
    }

}
