
package ru.vetrf.api.schema.cdm.registry.ws_definitions.v2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ru.vetrf.api.schema.cdm.base.ListOptions;
import ru.vetrf.api.schema.cdm.dictionary.v2.Enterprise;


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
 *         &lt;element ref="{http://api.vetrf.ru/schema/cdm/dictionary/v2}enterpriseGroup" minOccurs="0"/>
 *         &lt;element ref="{http://api.vetrf.ru/schema/cdm/dictionary/v2}enterprise" minOccurs="0"/>
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
    "enterpriseGroup",
    "enterprise"
})
@XmlRootElement(name = "getForeignEnterpriseListRequest")
public class GetForeignEnterpriseListRequest {

    @XmlElement(namespace = "http://api.vetrf.ru/schema/cdm/base")
    protected ListOptions listOptions;
    @XmlElement(namespace = "http://api.vetrf.ru/schema/cdm/dictionary/v2")
    protected BigInteger enterpriseGroup;
    @XmlElement(namespace = "http://api.vetrf.ru/schema/cdm/dictionary/v2")
    protected Enterprise enterprise;

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
     * Параметр запроса предприятий.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEnterpriseGroup() {
        return enterpriseGroup;
    }

    /**
     * Sets the value of the enterpriseGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEnterpriseGroup(BigInteger value) {
        this.enterpriseGroup = value;
    }

    /**
     * Параметр запроса предприятий.
     * 
     * @return
     *     possible object is
     *     {@link Enterprise }
     *     
     */
    public Enterprise getEnterprise() {
        return enterprise;
    }

    /**
     * Sets the value of the enterprise property.
     * 
     * @param value
     *     allowed object is
     *     {@link Enterprise }
     *     
     */
    public void setEnterprise(Enterprise value) {
        this.enterprise = value;
    }

}
