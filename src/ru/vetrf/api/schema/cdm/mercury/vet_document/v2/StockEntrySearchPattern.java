
package ru.vetrf.api.schema.cdm.mercury.vet_document.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ru.vetrf.api.schema.cdm.base.DateInterval;


/**
 * <p>Java class for StockEntrySearchPattern complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StockEntrySearchPattern">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}StockEntry">
 *       &lt;sequence>
 *         &lt;element name="blankFilter" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}StockEntryBlankFilter" minOccurs="0"/>
 *         &lt;element name="receiptDateInterval" type="{http://api.vetrf.ru/schema/cdm/base}DateInterval" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StockEntrySearchPattern", propOrder = {
    "blankFilter",
    "receiptDateInterval"
})
public class StockEntrySearchPattern
    extends StockEntry
{

    @XmlSchemaType(name = "string")
    protected StockEntryBlankFilter blankFilter;
    protected DateInterval receiptDateInterval;

    /**
     * Gets the value of the blankFilter property.
     * 
     * @return
     *     possible object is
     *     {@link StockEntryBlankFilter }
     *     
     */
    public StockEntryBlankFilter getBlankFilter() {
        return blankFilter;
    }

    /**
     * Sets the value of the blankFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link StockEntryBlankFilter }
     *     
     */
    public void setBlankFilter(StockEntryBlankFilter value) {
        this.blankFilter = value;
    }

    /**
     * Gets the value of the receiptDateInterval property.
     * 
     * @return
     *     possible object is
     *     {@link DateInterval }
     *     
     */
    public DateInterval getReceiptDateInterval() {
        return receiptDateInterval;
    }

    /**
     * Sets the value of the receiptDateInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateInterval }
     *     
     */
    public void setReceiptDateInterval(DateInterval value) {
        this.receiptDateInterval = value;
    }

}
