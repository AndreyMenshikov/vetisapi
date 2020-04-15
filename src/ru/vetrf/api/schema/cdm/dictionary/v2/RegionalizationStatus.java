
package ru.vetrf.api.schema.cdm.dictionary.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Статус региона в соответствии с регионализацией
 * 
 * <p>Java class for RegionalizationStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegionalizationStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="relatedDisease" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}AnimalDisease"/>
 *         &lt;element name="prosperity" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}ProsperityType"/>
 *         &lt;element name="vaccination" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}VaccinationType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegionalizationStatus", propOrder = {
    "relatedDisease",
    "prosperity",
    "vaccination"
})
public class RegionalizationStatus {

    @XmlElement(required = true)
    protected AnimalDisease relatedDisease;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected ProsperityType prosperity;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected VaccinationType vaccination;

    /**
     * Gets the value of the relatedDisease property.
     * 
     * @return
     *     possible object is
     *     {@link AnimalDisease }
     *     
     */
    public AnimalDisease getRelatedDisease() {
        return relatedDisease;
    }

    /**
     * Sets the value of the relatedDisease property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalDisease }
     *     
     */
    public void setRelatedDisease(AnimalDisease value) {
        this.relatedDisease = value;
    }

    /**
     * Gets the value of the prosperity property.
     * 
     * @return
     *     possible object is
     *     {@link ProsperityType }
     *     
     */
    public ProsperityType getProsperity() {
        return prosperity;
    }

    /**
     * Sets the value of the prosperity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProsperityType }
     *     
     */
    public void setProsperity(ProsperityType value) {
        this.prosperity = value;
    }

    /**
     * Gets the value of the vaccination property.
     * 
     * @return
     *     possible object is
     *     {@link VaccinationType }
     *     
     */
    public VaccinationType getVaccination() {
        return vaccination;
    }

    /**
     * Sets the value of the vaccination property.
     * 
     * @param value
     *     allowed object is
     *     {@link VaccinationType }
     *     
     */
    public void setVaccination(VaccinationType value) {
        this.vaccination = value;
    }

}
