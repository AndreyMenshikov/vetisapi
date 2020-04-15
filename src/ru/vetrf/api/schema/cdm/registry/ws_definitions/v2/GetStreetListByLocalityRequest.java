
package ru.vetrf.api.schema.cdm.registry.ws_definitions.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ru.vetrf.api.schema.cdm.base.ListOptions;


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
 *         &lt;element ref="{http://api.vetrf.ru/schema/cdm/dictionary/v2}localityGuid"/>
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
    "localityGuid"
})
@XmlRootElement(name = "getStreetListByLocalityRequest")
public class GetStreetListByLocalityRequest {

    @XmlElement(namespace = "http://api.vetrf.ru/schema/cdm/base")
    protected ListOptions listOptions;
    @XmlElement(namespace = "http://api.vetrf.ru/schema/cdm/dictionary/v2", required = true)
    protected String localityGuid;

    /**
     * Параметры запрашиваемого списка.
     *                   
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
     * Глобальный идентификатор населенного пункта, для которой
     *                      запрашивается список улиц.
     *                   
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
