
package ru.vetrf.api.schema.cdm.registry.ws_definitions.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ru.vetrf.api.schema.cdm.base.ListOptions;
import ru.vetrf.api.schema.cdm.dictionary.v2.AnimalDisease;
import ru.vetrf.api.schema.cdm.dictionary.v2.Area;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://api.vetrf.ru/schema/cdm/base}listOptions" minOccurs="0"/>
 *         &lt;element ref="{http://api.vetrf.ru/schema/cdm/dictionary/v2}disease"/>
 *         &lt;element ref="{http://api.vetrf.ru/schema/cdm/dictionary/v2}r13nZone" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "listOptions",
    "disease",
    "r13NZone"
})
@XmlRootElement(name = "getActualR13nRegionStatusListRequest")
public class GetActualR13NRegionStatusListRequest {

    @XmlElement(namespace = "http://api.vetrf.ru/schema/cdm/base")
    protected ListOptions listOptions;
    @XmlElement(namespace = "http://api.vetrf.ru/schema/cdm/dictionary/v2", required = true)
    protected AnimalDisease disease;
    @XmlElement(name = "r13nZone", namespace = "http://api.vetrf.ru/schema/cdm/dictionary/v2")
    protected Area r13NZone;

    /**
     * Параметры запрашиваемого списка.
     * 
     * @return
     *     possible object is
     *     {@link ListOptions }
     *     
     */
    public ListOptions getListOptions() {
        return listOptions;
    }

    /**
     * Sets the value of the listOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOptions }
     *     
     */
    public void setListOptions(ListOptions value) {
        this.listOptions = value;
    }

    /**
     * Заболевание, по которому запрашиваются статусы регионов.
     *                   
     * 
     * @return
     *     possible object is
     *     {@link AnimalDisease }
     *     
     */
    public AnimalDisease getDisease() {
        return disease;
    }

    /**
     * Sets the value of the disease property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalDisease }
     *     
     */
    public void setDisease(AnimalDisease value) {
        this.disease = value;
    }

    /**
     * (Опционально) Регион, по которому запрашиваются статусы.
     * 
     * @return
     *     possible object is
     *     {@link Area }
     *     
     */
    public Area getR13NZone() {
        return r13NZone;
    }

    /**
     * Sets the value of the r13NZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Area }
     *     
     */
    public void setR13NZone(Area value) {
        this.r13NZone = value;
    }

}
