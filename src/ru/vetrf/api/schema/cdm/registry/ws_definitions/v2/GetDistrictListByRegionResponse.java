
package ru.vetrf.api.schema.cdm.registry.ws_definitions.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ru.vetrf.api.schema.cdm.dictionary.v2.DistrictList;


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
 *         &lt;element ref="{http://api.vetrf.ru/schema/cdm/dictionary/v2}districtList"/>
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
    "districtList"
})
@XmlRootElement(name = "getDistrictListByRegionResponse")
public class GetDistrictListByRegionResponse {

    @XmlElement(namespace = "http://api.vetrf.ru/schema/cdm/dictionary/v2", required = true)
    protected DistrictList districtList;

    /**
     * Список районов указанного региона в заданном
     *                      формате.
     *                   
     * 
     * @return
     *     possible object is
     *     {@link DistrictList }
     *     
     */
    public DistrictList getDistrictList() {
        return districtList;
    }

    /**
     * Sets the value of the districtList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistrictList }
     *     
     */
    public void setDistrictList(DistrictList value) {
        this.districtList = value;
    }

}
