
package ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import ru.vetrf.api.schema.cdm.application.ApplicationResultData;
import ru.vetrf.api.schema.cdm.mercury.vet_document.v2.StockEntryList;
import ru.vetrf.api.schema.cdm.mercury.vet_document.v2.VetDocument;


/**
 * Результат заявки на оформление производственной партии.
 * 
 * <p>Java class for RegisterProductionOperationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegisterProductionOperationResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/application}ApplicationResultData">
 *       &lt;sequence>
 *         &lt;element name="stockEntryList" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}StockEntryList" minOccurs="0"/>
 *         &lt;element name="vetDocument" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}VetDocument" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisterProductionOperationResponse", propOrder = {
    "stockEntryList",
    "vetDocument"
})
public class RegisterProductionOperationResponse
    extends ApplicationResultData
{

    protected StockEntryList stockEntryList;
    protected List<VetDocument> vetDocument;

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

}
