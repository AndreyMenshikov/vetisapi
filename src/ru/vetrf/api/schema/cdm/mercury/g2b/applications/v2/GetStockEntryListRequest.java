
package ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.vetrf.api.schema.cdm.base.ListOptions;
import ru.vetrf.api.schema.cdm.mercury.vet_document.v2.StockEntrySearchPattern;


/**
 * Заявка на получение списка актуальных записей журнала.
 * 
 * <p>Java class for GetStockEntryListRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetStockEntryListRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/mercury/g2b/applications/v2}MercuryApplicationRequest">
 *       &lt;sequence>
 *         &lt;element ref="{http://api.vetrf.ru/schema/cdm/base}listOptions" minOccurs="0"/>
 *         &lt;element ref="{http://api.vetrf.ru/schema/cdm/dictionary/v2}enterpriseGuid"/>
 *         &lt;element name="searchPattern" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}StockEntrySearchPattern" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetStockEntryListRequest", propOrder = {
    "listOptions",
    "enterpriseGuid",
    "searchPattern"
})
public class GetStockEntryListRequest
    extends MercuryApplicationRequest
{

    @XmlElement(namespace = "http://api.vetrf.ru/schema/cdm/base")
    protected ListOptions listOptions;
    @XmlElement(namespace = "http://api.vetrf.ru/schema/cdm/dictionary/v2", required = true)
    protected String enterpriseGuid;
    protected StockEntrySearchPattern searchPattern;

    /**
     * 
     *                         Параметры запрашиваемого списка.
     *                      
     * 
     * @return
     *     possible object is
     *     {@link ListOptions }
     *     
     */
    public ListOptions getListOptions() {
        return listOptions;
    }

    /**
     * Sets the value of the listOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOptions }
     *     
     */
    public void setListOptions(ListOptions value) {
        this.listOptions = value;
    }

    /**
     * Идентификатор предприятия, по которому производится поиск записей.
     *                      
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnterpriseGuid() {
        return enterpriseGuid;
    }

    /**
     * Sets the value of the enterpriseGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnterpriseGuid(String value) {
        this.enterpriseGuid = value;
    }

    /**
     * Gets the value of the searchPattern property.
     * 
     * @return
     *     possible object is
     *     {@link StockEntrySearchPattern }
     *     
     */
    public StockEntrySearchPattern getSearchPattern() {
        return searchPattern;
    }

    /**
     * Sets the value of the searchPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link StockEntrySearchPattern }
     *     
     */
    public void setSearchPattern(StockEntrySearchPattern value) {
        this.searchPattern = value;
    }

}
