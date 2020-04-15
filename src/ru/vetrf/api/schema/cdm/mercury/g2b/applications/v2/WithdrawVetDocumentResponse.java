
package ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import ru.vetrf.api.schema.cdm.application.ApplicationResultData;
import ru.vetrf.api.schema.cdm.mercury.vet_document.v2.StockEntry;
import ru.vetrf.api.schema.cdm.mercury.vet_document.v2.VetDocument;


/**
 * Результат заявки на аннулирование ветеринарного сертификата.
 * 
 * <p>Java class for WithdrawVetDocumentResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WithdrawVetDocumentResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/application}ApplicationResultData">
 *       &lt;sequence>
 *         &lt;element name="vetDocument" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}VetDocument" minOccurs="0"/>
 *         &lt;element name="stockEntry" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}StockEntry" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WithdrawVetDocumentResponse", propOrder = {
    "vetDocument",
    "stockEntry"
})
public class WithdrawVetDocumentResponse
    extends ApplicationResultData
{

    protected VetDocument vetDocument;
    protected List<StockEntry> stockEntry;

    /**
     * Gets the value of the vetDocument property.
     * 
     * @return
     *     possible object is
     *     {@link VetDocument }
     *     
     */
    public VetDocument getVetDocument() {
        return vetDocument;
    }

    /**
     * Sets the value of the vetDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link VetDocument }
     *     
     */
    public void setVetDocument(VetDocument value) {
        this.vetDocument = value;
    }

    /**
     * Gets the value of the stockEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stockEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStockEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StockEntry }
     * 
     * 
     */
    public List<StockEntry> getStockEntry() {
        if (stockEntry == null) {
            stockEntry = new ArrayList<StockEntry>();
        }
        return this.stockEntry;
    }

}
