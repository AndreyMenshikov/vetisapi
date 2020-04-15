
package ru.vetrf.api.schema.cdm.registry.ws_definitions.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ru.vetrf.api.schema.cdm.dictionary.v2.RegionalizationShippingRuleList;


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
 *         &lt;element ref="{http://api.vetrf.ru/schema/cdm/dictionary/v2}r13nShippingRuleList"/>
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
    "r13NShippingRuleList"
})
@XmlRootElement(name = "getActualR13nShippingRuleListResponse")
public class GetActualR13NShippingRuleListResponse {

    @XmlElement(name = "r13nShippingRuleList", namespace = "http://api.vetrf.ru/schema/cdm/dictionary/v2", required = true)
    protected RegionalizationShippingRuleList r13NShippingRuleList;

    /**
     * Список правил перемещения груза (регионализация).
     * 
     * @return
     *     possible object is
     *     {@link RegionalizationShippingRuleList }
     *     
     */
    public RegionalizationShippingRuleList getR13NShippingRuleList() {
        return r13NShippingRuleList;
    }

    /**
     * Sets the value of the r13NShippingRuleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionalizationShippingRuleList }
     *     
     */
    public void setR13NShippingRuleList(RegionalizationShippingRuleList value) {
        this.r13NShippingRuleList = value;
    }

}
