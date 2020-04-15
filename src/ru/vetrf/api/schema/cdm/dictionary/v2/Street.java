
package ru.vetrf.api.schema.cdm.dictionary.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип улицы.
 * 
 * <p>Java class for Street complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Street">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/dictionary/v2}AddressObjectView">
 *       &lt;sequence>
 *         &lt;element name="localityGuid" type="{http://api.vetrf.ru/schema/cdm/base}UUID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Street", propOrder = {
    "localityGuid"
})
public class Street
    extends AddressObjectView
{

    protected String localityGuid;

    /**
     * Gets the value of the localityGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalityGuid() {
        return localityGuid;
    }

    /**
     * Sets the value of the localityGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalityGuid(String value) {
        this.localityGuid = value;
    }

}
