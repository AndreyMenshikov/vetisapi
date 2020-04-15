
package ru.vetrf.api.schema.cdm.mercury.vet_document.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.vetrf.api.schema.cdm.dictionary.v2.RegionalizationCondition;


/**
 * Подтверждение соблюдения условия перемещения продукции
 * 
 * <p>Java class for RegionalizationClause complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegionalizationClause">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="condition" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}RegionalizationCondition"/>
 *         &lt;element name="text" type="{http://api.vetrf.ru/schema/cdm/base}Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegionalizationClause", propOrder = {
    "condition",
    "text"
})
public class RegionalizationClause {

    @XmlElement(required = true)
    protected RegionalizationCondition condition;
    protected String text;

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link RegionalizationCondition }
     *     
     */
    public RegionalizationCondition getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionalizationCondition }
     *     
     */
    public void setCondition(RegionalizationCondition value) {
        this.condition = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

}
