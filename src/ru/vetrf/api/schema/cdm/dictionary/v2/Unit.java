
package ru.vetrf.api.schema.cdm.dictionary.v2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import ru.vetrf.api.schema.cdm.base.GenericVersioningEntity;


/**
 * Тип, описывающий единицу измерения.
 * 
 * <p>Java class for Unit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Unit">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/base}GenericVersioningEntity">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://api.vetrf.ru/schema/cdm/base}String255" minOccurs="0"/>
 *         &lt;element name="fullName" type="{http://api.vetrf.ru/schema/cdm/base}String255" minOccurs="0"/>
 *         &lt;element name="commonUnitGuid" type="{http://api.vetrf.ru/schema/cdm/base}UUID" minOccurs="0"/>
 *         &lt;element name="factor" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Unit", propOrder = {
    "name",
    "fullName",
    "commonUnitGuid",
    "factor"
})
public class Unit
    extends GenericVersioningEntity
{

    protected String name;
    protected String fullName;
    protected String commonUnitGuid;
    protected BigInteger factor;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the commonUnitGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommonUnitGuid() {
        return commonUnitGuid;
    }

    /**
     * Sets the value of the commonUnitGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommonUnitGuid(String value) {
        this.commonUnitGuid = value;
    }

    /**
     * Gets the value of the factor property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFactor() {
        return factor;
    }

    /**
     * Sets the value of the factor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFactor(BigInteger value) {
        this.factor = value;
    }

}
