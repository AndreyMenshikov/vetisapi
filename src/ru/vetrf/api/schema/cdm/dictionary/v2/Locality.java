
package ru.vetrf.api.schema.cdm.dictionary.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип населенного пункта (город, поселок, деревня и прочие).
 * 
 * <p>Java class for Locality complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Locality">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/dictionary/v2}AddressObjectView">
 *       &lt;sequence>
 *         &lt;element name="regionGuid" type="{http://api.vetrf.ru/schema/cdm/base}UUID" minOccurs="0"/>
 *         &lt;element name="districtGuid" type="{http://api.vetrf.ru/schema/cdm/base}UUID" minOccurs="0"/>
 *         &lt;element name="cityGuid" type="{http://api.vetrf.ru/schema/cdm/base}UUID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Locality", propOrder = {
    "regionGuid",
    "districtGuid",
    "cityGuid"
})
public class Locality
    extends AddressObjectView
{

    protected String regionGuid;
    protected String districtGuid;
    protected String cityGuid;

    /**
     * Gets the value of the regionGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionGuid() {
        return regionGuid;
    }

    /**
     * Sets the value of the regionGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionGuid(String value) {
        this.regionGuid = value;
    }

    /**
     * Gets the value of the districtGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrictGuid() {
        return districtGuid;
    }

    /**
     * Sets the value of the districtGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrictGuid(String value) {
        this.districtGuid = value;
    }

    /**
     * Gets the value of the cityGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityGuid() {
        return cityGuid;
    }

    /**
     * Sets the value of the cityGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityGuid(String value) {
        this.cityGuid = value;
    }

}
