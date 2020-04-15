
package ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ru.vetrf.api.schema.cdm.base.DateInterval;
import ru.vetrf.api.schema.cdm.base.ListOptions;
import ru.vetrf.api.schema.cdm.dictionary.v2.BusinessMember;
import ru.vetrf.api.schema.cdm.mercury.vet_document.v2.ReferencedDocument;
import ru.vetrf.api.schema.cdm.mercury.vet_document.v2.VetDocumentStatus;
import ru.vetrf.api.schema.cdm.mercury.vet_document.v2.VetDocumentType;


/**
 * Заявка на получение списка записей ветсертификатов.
 * 
 * <p>Java class for GetVetDocumentListRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetVetDocumentListRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/mercury/g2b/applications/v2}MercuryApplicationRequest">
 *       &lt;sequence>
 *         &lt;element ref="{http://api.vetrf.ru/schema/cdm/base}listOptions" minOccurs="0"/>
 *         &lt;element ref="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}vetDocumentType" minOccurs="0"/>
 *         &lt;element ref="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}vetDocumentStatus" minOccurs="0"/>
 *         &lt;element ref="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}issueDateInterval" minOccurs="0"/>
 *         &lt;element ref="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}consignor" minOccurs="0"/>
 *         &lt;element ref="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}referencedDocument" minOccurs="0"/>
 *         &lt;element ref="{http://api.vetrf.ru/schema/cdm/dictionary/v2}enterpriseGuid"/>
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
@XmlType(name = "GetVetDocumentListRequest", propOrder = {
    "listOptions",
    "vetDocumentType",
    "vetDocumentStatus",
    "issueDateInterval",
    "consignor",
    "referencedDocument",
    "enterpriseGuid"
})
public class GetVetDocumentListRequest
    extends MercuryApplicationRequest
{

    @XmlElement(namespace = "http://api.vetrf.ru/schema/cdm/base")
    protected ListOptions listOptions;
    @XmlElement(namespace = "http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2")
    @XmlSchemaType(name = "string")
    protected VetDocumentType vetDocumentType;
    @XmlElement(namespace = "http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2")
    @XmlSchemaType(name = "string")
    protected VetDocumentStatus vetDocumentStatus;
    @XmlElement(namespace = "http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2")
    protected DateInterval issueDateInterval;
    @XmlElement(namespace = "http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2")
    protected BusinessMember consignor;
    @XmlElement(namespace = "http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2")
    protected ReferencedDocument referencedDocument;
    @XmlElement(namespace = "http://api.vetrf.ru/schema/cdm/dictionary/v2", required = true)
    protected String enterpriseGuid;

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

    /**
     * Период дат оформления документа.
     *                         Соответствует полю issueDate документа в результирующем списке.
     *                         Максимальная длина интервала -- 31 день.
     *                      
     * 
     * @return
     *     possible object is
     *     {@link DateInterval }
     *     
     */
    public DateInterval getIssueDateInterval() {
        return issueDateInterval;
    }

    /**
     * Sets the value of the issueDateInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateInterval }
     *     
     */
    public void setIssueDateInterval(DateInterval value) {
        this.issueDateInterval = value;
    }

    /**
     * Отправитель для транспортного ВСД.
     *                         Фильтрация осуществляется по глобальному идентификатору ХС (consignor/businessEntity/guid)
     *                         и площадки (consignor/enterprise/guid).
     *                         Если производится поиск по производственным документам (установлен фильтр vetDocumentType = PRODUCTIVE),
     *                         поле consignor игнорируется.
     *                      
     * 
     * @return
     *     possible object is
     *     {@link BusinessMember }
     *     
     */
    public BusinessMember getConsignor() {
        return consignor;
    }

    /**
     * Sets the value of the consignor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessMember }
     *     
     */
    public void setConsignor(BusinessMember value) {
        this.consignor = value;
    }

    /**
     * Связанный документ.
     *                         Поддерживается поиск по связанным документам с отношением (relationshipType) равным 1 и 6,
     *                         поддерживаемые типы документов: 1-5 (транспортный документ).
     *                         Для документа обязательными к заполнению являются поля тип (type), номер (issueNumber) и дата (issueDate).
     *                         При поиске по связанному документу обязательно заполнение фильтра vetDocumentType.
     *                      
     * 
     * @return
     *     possible object is
     *     {@link ReferencedDocument }
     *     
     */
    public ReferencedDocument getReferencedDocument() {
        return referencedDocument;
    }

    /**
     * Sets the value of the referencedDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencedDocument }
     *     
     */
    public void setReferencedDocument(ReferencedDocument value) {
        this.referencedDocument = value;
    }

    /**
     * Идентификатор предприятия, по которому производится поиск записей.
     *                         В результирующий список попадут (в общем случае, если не установлено других критериев отбора):
     *                         1) Транспортные ВСД, для которых ХС-отправитель соответствует заявителю (issuer), предприятие-отправитель -- указанному идентификатору (enterpriseGuid).
     *                         2) Транспортные ВСД, для которых ХС-получатель соответствует заявителю (issuer), предприятие-получатель -- указанному идентификатору (enterpriseGuid).
     *                         3) Производственные ВСД, для которых ХС-производитель соответствует заявителю (issuer), предприятие-производитель -- указанному идентификатору (enterpriseGuid).
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

}
