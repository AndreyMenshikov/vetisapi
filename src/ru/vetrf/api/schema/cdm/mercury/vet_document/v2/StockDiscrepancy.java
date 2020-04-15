
package ru.vetrf.api.schema.cdm.mercury.vet_document.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Операция внесения изменений в реестр предприятий.
 * 
 * <p>Java class for StockDiscrepancy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StockDiscrepancy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="affectedList" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}StockEntryList" minOccurs="0"/>
 *         &lt;element name="resultingList" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}StockEntryList" minOccurs="0"/>
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StockDiscrepancy", propOrder = {
    "affectedList",
    "resultingList",
    "reason"
})
public class StockDiscrepancy {

    protected StockEntryList affectedList;
    protected StockEntryList resultingList;
    protected String reason;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the affectedList property.
     * 
     * @return
     *     possible object is
     *     {@link StockEntryList }
     *     
     */
    public StockEntryList getAffectedList() {
        return affectedList;
    }

    /**
     * Sets the value of the affectedList property.
     * 
     * @param value
     *     allowed object is
     *     {@link StockEntryList }
     *     
     */
    public void setAffectedList(StockEntryList value) {
        this.affectedList = value;
    }

    /**
     * Gets the value of the resultingList property.
     * 
     * @return
     *     possible object is
     *     {@link StockEntryList }
     *     
     */
    public StockEntryList getResultingList() {
        return resultingList;
    }

    /**
     * Sets the value of the resultingList property.
     * 
     * @param value
     *     allowed object is
     *     {@link StockEntryList }
     *     
     */
    public void setResultingList(StockEntryList value) {
        this.resultingList = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
