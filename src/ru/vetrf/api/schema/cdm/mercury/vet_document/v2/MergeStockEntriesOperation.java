
package ru.vetrf.api.schema.cdm.mercury.vet_document.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ru.vetrf.api.schema.cdm.base.RegisterModificationType;


/**
 * Тип, описывающий производственную операцию.
 * 
 * <p>Java class for MergeStockEntriesOperation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MergeStockEntriesOperation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://api.vetrf.ru/schema/cdm/base}RegisterModificationType" minOccurs="0"/>
 *         &lt;element name="sourceStockEntry" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}StockEntry" maxOccurs="unbounded" minOccurs="2"/>
 *         &lt;element name="resultStockEntry" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}StockEntry" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MergeStockEntriesOperation", propOrder = {
    "type",
    "sourceStockEntry",
    "resultStockEntry"
})
public class MergeStockEntriesOperation {

    @XmlSchemaType(name = "string")
    protected RegisterModificationType type;
    @XmlElement(required = true)
    protected List<StockEntry> sourceStockEntry;
    protected List<StockEntry> resultStockEntry;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterModificationType }
     *     
     */
    public RegisterModificationType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterModificationType }
     *     
     */
    public void setType(RegisterModificationType value) {
        this.type = value;
    }

    /**
     * Gets the value of the sourceStockEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceStockEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceStockEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StockEntry }
     * 
     * 
     */
    public List<StockEntry> getSourceStockEntry() {
        if (sourceStockEntry == null) {
            sourceStockEntry = new ArrayList<StockEntry>();
        }
        return this.sourceStockEntry;
    }

    /**
     * Gets the value of the resultStockEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resultStockEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResultStockEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StockEntry }
     * 
     * 
     */
    public List<StockEntry> getResultStockEntry() {
        if (resultStockEntry == null) {
            resultStockEntry = new ArrayList<StockEntry>();
        }
        return this.resultStockEntry;
    }

}
