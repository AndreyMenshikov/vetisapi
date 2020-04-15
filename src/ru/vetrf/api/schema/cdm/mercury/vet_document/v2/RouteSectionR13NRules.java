
package ru.vetrf.api.schema.cdm.mercury.vet_document.v2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ru.vetrf.api.schema.cdm.dictionary.v2.RegionalizationShippingRule;


/**
 * Правила перемещения партии согласно регионализации между двух точек маршрута.
 *          
 * 
 * <p>Java class for RouteSectionR13nRules complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RouteSectionR13nRules">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sqnId" type="{http://api.vetrf.ru/schema/cdm/base}SequenceNumber" minOccurs="0"/>
 *         &lt;element name="appliedR13nRule" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}RegionalizationShippingRule" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteSectionR13nRules", propOrder = {
    "sqnId",
    "appliedR13NRule"
})
public class RouteSectionR13NRules {

    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger sqnId;
    @XmlElement(name = "appliedR13nRule")
    protected List<RegionalizationShippingRule> appliedR13NRule;

    /**
     * Gets the value of the sqnId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSqnId() {
        return sqnId;
    }

    /**
     * Sets the value of the sqnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSqnId(BigInteger value) {
        this.sqnId = value;
    }

    /**
     * Gets the value of the appliedR13NRule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appliedR13NRule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppliedR13NRule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegionalizationShippingRule }
     * 
     * 
     */
    public List<RegionalizationShippingRule> getAppliedR13NRule() {
        if (appliedR13NRule == null) {
            appliedR13NRule = new ArrayList<RegionalizationShippingRule>();
        }
        return this.appliedR13NRule;
    }

}
