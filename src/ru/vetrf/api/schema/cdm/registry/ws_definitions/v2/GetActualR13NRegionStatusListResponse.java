
package ru.vetrf.api.schema.cdm.registry.ws_definitions.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ru.vetrf.api.schema.cdm.dictionary.v2.RegionalizationRegionStatusList;


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
 *         &lt;element ref="{http://api.vetrf.ru/schema/cdm/dictionary/v2}r13nRegionStatusList"/>
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
    "r13NRegionStatusList"
})
@XmlRootElement(name = "getActualR13nRegionStatusListResponse")
public class GetActualR13NRegionStatusListResponse {

    @XmlElement(name = "r13nRegionStatusList", namespace = "http://api.vetrf.ru/schema/cdm/dictionary/v2", required = true)
    protected RegionalizationRegionStatusList r13NRegionStatusList;

    /**
     * Список статусов региона (регионализация).
     * 
     * @return
     *     possible object is
     *     {@link RegionalizationRegionStatusList }
     *     
     */
    public RegionalizationRegionStatusList getR13NRegionStatusList() {
        return r13NRegionStatusList;
    }

    /**
     * Sets the value of the r13NRegionStatusList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionalizationRegionStatusList }
     *     
     */
    public void setR13NRegionStatusList(RegionalizationRegionStatusList value) {
        this.r13NRegionStatusList = value;
    }

}
