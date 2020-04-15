
package ru.vetrf.api.schema.cdm.mercury.vet_document.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Тип, описывающий транспортную партию груза.
 * 
 * <p>Java class for Consignment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Consignment">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}Batch">
 *       &lt;sequence>
 *         &lt;element name="sourceStockEntry" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}StockEntry" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="partOf" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Consignment", propOrder = {
    "sourceStockEntry"
})
public class Consignment
    extends Batch
{

    protected StockEntry sourceStockEntry;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "partOf")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object partOf;

    /**
     * Gets the value of the sourceStockEntry property.
     * 
     * @return
     *     possible object is
     *     {@link StockEntry }
     *     
     */
    public StockEntry getSourceStockEntry() {
        return sourceStockEntry;
    }

    /**
     * Sets the value of the sourceStockEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link StockEntry }
     *     
     */
    public void setSourceStockEntry(StockEntry value) {
        this.sourceStockEntry = value;
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

    /**
     * Gets the value of the partOf property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPartOf() {
        return partOf;
    }

    /**
     * Sets the value of the partOf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPartOf(Object value) {
        this.partOf = value;
    }

}
