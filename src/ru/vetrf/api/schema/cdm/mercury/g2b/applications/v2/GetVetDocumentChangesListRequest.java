
package ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ru.vetrf.api.schema.cdm.base.DateInterval;
import ru.vetrf.api.schema.cdm.base.ListOptions;
import ru.vetrf.api.schema.cdm.mercury.vet_document.v2.VetDocumentStatus;
import ru.vetrf.api.schema.cdm.mercury.vet_document.v2.VetDocumentType;


/**
 * Заявка на получение списка версий, созданных или измененных за указанный интервал дат.
 *          
 * 
 * <p>Java class for GetVetDocumentChangesListRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetVetDocumentChangesListRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/mercury/g2b/applications/v2}MercuryApplicationRequest">
 *       &lt;sequence>
 *         &lt;element ref="{http://api.vetrf.ru/schema/cdm/base}listOptions" minOccurs="0"/>
 *         &lt;element ref="{http://api.vetrf.ru/schema/cdm/base}updateDateInterval"/>
 *         &lt;element ref="{http://api.vetrf.ru/schema/cdm/dictionary/v2}enterpriseGuid"/>
 *         &lt;element ref="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}vetDocumentType" minOccurs="0"/>
 *         &lt;element ref="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}vetDocumentStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetVetDocumentChangesListRequest", propOrder = {
    "listOptions",
    "updateDateInterval",
    "enterpriseGuid",
    "vetDocumentType",
    "vetDocumentStatus"
})
public class GetVetDocumentChangesListRequest
    extends MercuryApplicationRequest
{

    @XmlElement(namespace = "http://api.vetrf.ru/schema/cdm/base")
    protected ListOptions listOptions;
    @XmlElement(namespace = "http://api.vetrf.ru/schema/cdm/base", required = true)
    protected DateInterval updateDateInterval;
    @XmlElement(namespace = "http://api.vetrf.ru/schema/cdm/dictionary/v2", required = true)
    protected String enterpriseGuid;
    @XmlElement(namespace = "http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2")
    @XmlSchemaType(name = "string")
    protected VetDocumentType vetDocumentType;
    @XmlElement(namespace = "http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2")
    @XmlSchemaType(name = "string")
    protected VetDocumentStatus vetDocumentStatus;

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
     * 
     *                         Интервал времени обновления. В список попадают все записи, дата обновлений которых
     *                         попадает в указанный интервал.
     *                      
     * 
     * @return
     *     possible object is
     *     {@link DateInterval }
     *     
     */
    public DateInterval getUpdateDateInterval() {
        return updateDateInterval;
    }

    /**
     * Sets the value of the updateDateInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateInterval }
     *     
     */
    public void setUpdateDateInterval(DateInterval value) {
        this.updateDateInterval = value;
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
     * Тип ветсертификата.
     * 
     * @return
     *     possible object is
     *     {@link VetDocumentType }
     *     
     */
    public VetDocumentType getVetDocumentType() {
        return vetDocumentType;
    }

    /**
     * Sets the value of the vetDocumentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link VetDocumentType }
     *     
     */
    public void setVetDocumentType(VetDocumentType value) {
        this.vetDocumentType = value;
    }

    /**
     * Статус ветсертификата.
     * 
     * @return
     *     possible object is
     *     {@link VetDocumentStatus }
     *     
     */
    public VetDocumentStatus getVetDocumentStatus() {
        return vetDocumentStatus;
    }

    /**
     * Sets the value of the vetDocumentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link VetDocumentStatus }
     *     
     */
    public void setVetDocumentStatus(VetDocumentStatus value) {
        this.vetDocumentStatus = value;
    }

}
