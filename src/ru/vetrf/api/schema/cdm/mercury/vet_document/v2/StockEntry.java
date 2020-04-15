
package ru.vetrf.api.schema.cdm.mercury.vet_document.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import ru.vetrf.api.schema.cdm.base.GenericVersioningEntity;


/**
 * Тип, описывающий cведения о записи журнала продукции.
 * 
 * <p>Java class for StockEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StockEntry">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/base}GenericVersioningEntity">
 *       &lt;sequence>
 *         &lt;element name="entryNumber" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}StockEntryNumber" minOccurs="0"/>
 *         &lt;element name="batch" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}Batch" minOccurs="0"/>
 *         &lt;element name="vetDocument" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}VetDocument" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="vetEventList" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}StockEntryEventList" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="qualifier" type="{http://api.vetrf.ru/schema/cdm/base}Identifier" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StockEntry", propOrder = {
    "entryNumber",
    "batch",
    "vetDocument",
    "vetEventList"
})
@XmlSeeAlso({
    StockEntrySearchPattern.class
})
public class StockEntry
    extends GenericVersioningEntity
{

    protected String entryNumber;
    protected Batch batch;
    protected List<VetDocument> vetDocument;
    protected StockEntryEventList vetEventList;
    @XmlAttribute(name = "qualifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String qualifier;

    /**
     * Gets the value of the entryNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryNumber() {
        return entryNumber;
    }

    /**
     * Sets the value of the entryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryNumber(String value) {
        this.entryNumber = value;
    }

    /**
     * Gets the value of the batch property.
     * 
     * @return
     *     possible object is
     *     {@link Batch }
     *     
     */
    public Batch getBatch() {
        return batch;
    }

    /**
     * Sets the value of the batch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Batch }
     *     
     */
    public void setBatch(Batch value) {
        this.batch = value;
    }

    /**
     * Gets the value of the vetDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vetDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVetDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VetDocument }
     * 
     * 
     */
    public List<VetDocument> getVetDocument() {
        if (vetDocument == null) {
            vetDocument = new ArrayList<VetDocument>();
        }
        return this.vetDocument;
    }

    /**
     * Gets the value of the vetEventList property.
     * 
     * @return
     *     possible object is
     *     {@link StockEntryEventList }
     *     
     */
    public StockEntryEventList getVetEventList() {
        return vetEventList;
    }

    /**
     * Sets the value of the vetEventList property.
     * 
     * @param value
     *     allowed object is
     *     {@link StockEntryEventList }
     *     
     */
    public void setVetEventList(StockEntryEventList value) {
        this.vetEventList = value;
    }

    /**
     * Gets the value of the qualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualifier() {
        return qualifier;
    }

    /**
     * Sets the value of the qualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualifier(String value) {
        this.qualifier = value;
    }

}
