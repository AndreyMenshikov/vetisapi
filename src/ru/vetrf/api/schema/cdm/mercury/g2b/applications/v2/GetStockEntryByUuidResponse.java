
package ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.vetrf.api.schema.cdm.application.ApplicationResultData;
import ru.vetrf.api.schema.cdm.mercury.vet_document.v2.StockEntry;


/**
 * Результат заявки на получение версии записи по идентификатору.
 * 
 * <p>Java class for GetStockEntryByUuidResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetStockEntryByUuidResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/application}ApplicationResultData">
 *       &lt;sequence>
 *         &lt;element ref="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}stockEntry"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetStockEntryByUuidResponse", propOrder = {
    "stockEntry"
})
public class GetStockEntryByUuidResponse
    extends ApplicationResultData
{

    @XmlElement(namespace = "http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2", required = true)
    protected StockEntry stockEntry;

    /**
     * Запись журнала продукции.
     * 
     * @return
     *     possible object is
     *     {@link StockEntry }
     *     
     */
    public StockEntry getStockEntry() {
        return stockEntry;
    }

    /**
     * Sets the value of the stockEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link StockEntry }
     *     
     */
    public void setStockEntry(StockEntry value) {
        this.stockEntry = value;
    }

}
