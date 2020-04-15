
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
 * Статус регионализации
 * 
 * <p>Java class for RegionalizationRegionStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegionalizationRegionStatus">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/base}GenericVersioningEntity">
 *       &lt;sequence>
 *         &lt;element name="referenceNumber" type="{http://api.vetrf.ru/schema/cdm/base}Identifier" minOccurs="0"/>
 *         &lt;element name="r13nZone" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}Area" minOccurs="0"/>
 *         &lt;element name="excludedR13nZone" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}Area" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="r13nStatus" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}RegionalizationStatus" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegionalizationRegionStatus", propOrder = {
    "referenceNumber",
    "r13NZone",
    "excludedR13NZone",
    "r13NStatus"
})
public class RegionalizationRegionStatus
    extends GenericVersioningEntity
{

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String referenceNumber;
    @XmlElement(name = "r13nZone")
    protected Area r13NZone;
    @XmlElement(name = "excludedR13nZone")
    protected List<Area> excludedR13NZone;
    @XmlElement(name = "r13nStatus")
    protected List<RegionalizationStatus> r13NStatus;

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
     * Gets the value of the r13NZone property.
     * 
     * @return
     *     possible object is
     *     {@link Area }
     *     
     */
    public Area getR13NZone() {
        return r13NZone;
    }

    /**
     * Sets the value of the r13NZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Area }
     *     
     */
    public void setR13NZone(Area value) {
        this.r13NZone = value;
    }

    /**
     * Gets the value of the excludedR13NZone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the excludedR13NZone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExcludedR13NZone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Area }
     * 
     * 
     */
    public List<Area> getExcludedR13NZone() {
        if (excludedR13NZone == null) {
            excludedR13NZone = new ArrayList<Area>();
        }
        return this.excludedR13NZone;
    }

    /**
     * Gets the value of the r13NStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the r13NStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getR13NStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegionalizationStatus }
     * 
     * 
     */
    public List<RegionalizationStatus> getR13NStatus() {
        if (r13NStatus == null) {
            r13NStatus = new ArrayList<RegionalizationStatus>();
        }
        return this.r13NStatus;
    }

}
