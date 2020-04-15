
package ru.vetrf.api.schema.cdm.dictionary.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import ru.vetrf.api.schema.cdm.base.GenericVersioningEntity;


/**
 * Правило перемещения партии согласно регионализации
 * 
 * <p>Java class for RegionalizationShippingRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegionalizationShippingRule">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/base}GenericVersioningEntity">
 *       &lt;sequence>
 *         &lt;element name="referenceNumber" type="{http://api.vetrf.ru/schema/cdm/base}Identifier" minOccurs="0"/>
 *         &lt;element name="fromR13nStatus" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}RegionalizationStatus" minOccurs="0"/>
 *         &lt;element name="toR13nStatus" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}RegionalizationStatus" minOccurs="0"/>
 *         &lt;element name="cargoType" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}SubProduct" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="decision" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}RegionalizationDecision" minOccurs="0"/>
 *         &lt;element name="requirement" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}RegionalizationRequirement" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegionalizationShippingRule", propOrder = {
    "referenceNumber",
    "fromR13NStatus",
    "toR13NStatus",
    "cargoType",
    "decision",
    "requirement"
})
public class RegionalizationShippingRule
    extends GenericVersioningEntity
{

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String referenceNumber;
    @XmlElement(name = "fromR13nStatus")
    protected RegionalizationStatus fromR13NStatus;
    @XmlElement(name = "toR13nStatus")
    protected RegionalizationStatus toR13NStatus;
    protected List<SubProduct> cargoType;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String decision;
    protected List<RegionalizationRequirement> requirement;

    /**
     * Gets the value of the referenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceNumber() {
        return referenceNumber;
    }

    /**
     * Sets the value of the referenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceNumber(String value) {
        this.referenceNumber = value;
    }

    /**
     * Gets the value of the fromR13NStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RegionalizationStatus }
     *     
     */
    public RegionalizationStatus getFromR13NStatus() {
        return fromR13NStatus;
    }

    /**
     * Sets the value of the fromR13NStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionalizationStatus }
     *     
     */
    public void setFromR13NStatus(RegionalizationStatus value) {
        this.fromR13NStatus = value;
    }

    /**
     * Gets the value of the toR13NStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RegionalizationStatus }
     *     
     */
    public RegionalizationStatus getToR13NStatus() {
        return toR13NStatus;
    }

    /**
     * Sets the value of the toR13NStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionalizationStatus }
     *     
     */
    public void setToR13NStatus(RegionalizationStatus value) {
        this.toR13NStatus = value;
    }

    /**
     * Gets the value of the cargoType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cargoType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCargoType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubProduct }
     * 
     * 
     */
    public List<SubProduct> getCargoType() {
        if (cargoType == null) {
            cargoType = new ArrayList<SubProduct>();
        }
        return this.cargoType;
    }

    /**
     * Gets the value of the decision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecision() {
        return decision;
    }

    /**
     * Sets the value of the decision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecision(String value) {
        this.decision = value;
    }

    /**
     * Gets the value of the requirement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requirement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequirement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegionalizationRequirement }
     * 
     * 
     */
    public List<RegionalizationRequirement> getRequirement() {
        if (requirement == null) {
            requirement = new ArrayList<RegionalizationRequirement>();
        }
        return this.requirement;
    }

}
