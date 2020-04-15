
package ru.vetrf.api.schema.cdm.dictionary.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип района региона (обычно второй уровень в
 *             адресной структуре).
 *          
 * 
 * <p>Java class for District complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="District">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/dictionary/v2}AddressObjectView">
 *       &lt;sequence>
 *         &lt;element name="regionGuid" type="{http://api.vetrf.ru/schema/cdm/base}UUID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "District", propOrder = {
    "regionGuid"
})
public class District
    extends AddressObjectView
{

    protected String regionGuid;

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

}
