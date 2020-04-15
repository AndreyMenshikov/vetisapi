
package ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.vetrf.api.schema.cdm.application.ApplicationResultData;
import ru.vetrf.api.schema.cdm.mercury.vet_document.v2.StockEntryList;


/**
 * Результат заявки на объединение записей журнала продукции.
 * 
 * <p>Java class for MergeStockEntriesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MergeStockEntriesResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/application}ApplicationResultData">
 *       &lt;sequence>
 *         &lt;element name="stockEntryList" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}StockEntryList"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MergeStockEntriesResponse", propOrder = {
    "stockEntryList"
})
public class MergeStockEntriesResponse
    extends ApplicationResultData
{

    @XmlElement(required = true)
    protected StockEntryList stockEntryList;

    /**
     * Gets the value of the stockEntryList property.
     * 
     * @return
     *     possible object is
     *     {@link StockEntryList }
     *     
     */
    public StockEntryList getStockEntryList() {
        return stockEntryList;
    }

    /**
     * Sets the value of the stockEntryList property.
     * 
     * @param value
     *     allowed object is
     *     {@link StockEntryList }
     *     
     */
    public void setStockEntryList(StockEntryList value) {
        this.stockEntryList = value;
    }

}
