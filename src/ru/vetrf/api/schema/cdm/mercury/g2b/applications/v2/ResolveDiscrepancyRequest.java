
package ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.vetrf.api.schema.cdm.dictionary.v2.Enterprise;
import ru.vetrf.api.schema.cdm.mercury.vet_document.v2.DiscrepancyReport;
import ru.vetrf.api.schema.cdm.mercury.vet_document.v2.StockDiscrepancy;
import ru.vetrf.api.schema.cdm.mercury.vet_document.v2.User;


/**
 * Заявка на регистрацию несоответствий в записях складского журнала,
 *             выявленных в результате инвентаризации.
 *          
 * 
 * <p>Java class for ResolveDiscrepancyRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResolveDiscrepancyRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/mercury/g2b/applications/v2}MercuryApplicationRequest">
 *       &lt;sequence>
 *         &lt;element name="enterprise" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}Enterprise"/>
 *         &lt;element name="inventoryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="responsible" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}User"/>
 *         &lt;element name="stockDiscrepancy" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}StockDiscrepancy" maxOccurs="unbounded"/>
 *         &lt;element name="discrepancyReport" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}DiscrepancyReport" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResolveDiscrepancyRequest", propOrder = {
    "enterprise",
    "inventoryDate",
    "responsible",
    "stockDiscrepancy",
    "discrepancyReport"
})
public class ResolveDiscrepancyRequest
    extends MercuryApplicationRequest
{

    @XmlElement(required = true)
    protected Enterprise enterprise;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inventoryDate;
    @XmlElement(required = true)
    protected User responsible;
    @XmlElement(required = true)
    protected List<StockDiscrepancy> stockDiscrepancy;
    @XmlElement(required = true)
    protected List<DiscrepancyReport> discrepancyReport;

    /**
     * Gets the value of the enterprise property.
     * 
     * @return
     *     possible object is
     *     {@link Enterprise }
     *     
     */
    public Enterprise getEnterprise() {
        return enterprise;
    }

    /**
     * Sets the value of the enterprise property.
     * 
     * @param value
     *     allowed object is
     *     {@link Enterprise }
     *     
     */
    public void setEnterprise(Enterprise value) {
        this.enterprise = value;
    }

    /**
     * Gets the value of the inventoryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInventoryDate() {
        return inventoryDate;
    }

    /**
     * Sets the value of the inventoryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInventoryDate(XMLGregorianCalendar value) {
        this.inventoryDate = value;
    }

    /**
     * Gets the value of the responsible property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getResponsible() {
        return responsible;
    }

    /**
     * Sets the value of the responsible property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setResponsible(User value) {
        this.responsible = value;
    }

    /**
     * Gets the value of the stockDiscrepancy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stockDiscrepancy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStockDiscrepancy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StockDiscrepancy }
     * 
     * 
     */
    public List<StockDiscrepancy> getStockDiscrepancy() {
        if (stockDiscrepancy == null) {
            stockDiscrepancy = new ArrayList<StockDiscrepancy>();
        }
        return this.stockDiscrepancy;
    }

    /**
     * Gets the value of the discrepancyReport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discrepancyReport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscrepancyReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiscrepancyReport }
     * 
     * 
     */
    public List<DiscrepancyReport> getDiscrepancyReport() {
        if (discrepancyReport == null) {
            discrepancyReport = new ArrayList<DiscrepancyReport>();
        }
        return this.discrepancyReport;
    }

}
