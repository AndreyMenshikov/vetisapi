
package ru.vetrf.api.schema.cdm.registry.ws_definitions.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ru.vetrf.api.schema.cdm.base.DateInterval;
import ru.vetrf.api.schema.cdm.base.ListOptions;
import ru.vetrf.api.schema.cdm.dictionary.v2.BusinessEntity;
import ru.vetrf.api.schema.cdm.dictionary.v2.BusinessMember;
import ru.vetrf.api.schema.cdm.dictionary.v2.Enterprise;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://api.vetrf.ru/schema/cdm/base}listOptions" minOccurs="0"/>
 *         &lt;element ref="{http://api.vetrf.ru/schema/cdm/base}updateDateInterval"/>
 *         &lt;element ref="{http://api.vetrf.ru/schema/cdm/dictionary/v2}businessEntity" minOccurs="0"/>
 *         &lt;element ref="{http://api.vetrf.ru/schema/cdm/dictionary/v2}enterprise" minOccurs="0"/>
 *         &lt;element ref="{http://api.vetrf.ru/schema/cdm/dictionary/v2}producer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "listOptions",
    "updateDateInterval",
    "businessEntity",
    "enterprise",
    "producer"
})
@XmlRootElement(name = "getProductItemChangesListRequest")
public class GetProductItemChangesListRequest {

    @XmlElement(namespace = "http://api.vetrf.ru/schema/cdm/base")
    protected ListOptions listOptions;
    @XmlElement(namespace = "http://api.vetrf.ru/schema/cdm/base", required = true)
    protected DateInterval updateDateInterval;
    @XmlElement(namespace = "http://api.vetrf.ru/schema/cdm/dictionary/v2")
    protected BusinessEntity businessEntity;
    @XmlElement(namespace = "http://api.vetrf.ru/schema/cdm/dictionary/v2")
    protected Enterprise enterprise;
    @XmlElement(namespace = "http://api.vetrf.ru/schema/cdm/dictionary/v2")
    protected BusinessMember producer;

    /**
     * Параметры запрашиваемого списка.
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
     * Интервал времени обновления. В список попадают
     *                      все записи, дата обновлений которых попадает в указанный интервал.
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
     * Идентификатор хозяйствующего субъекта, справочник которого запрашивается.
     *                   
     * 
     * @return
     *     possible object is
     *     {@link BusinessEntity }
     *     
     */
    public BusinessEntity getBusinessEntity() {
        return businessEntity;
    }

    /**
     * Sets the value of the businessEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessEntity }
     *     
     */
    public void setBusinessEntity(BusinessEntity value) {
        this.businessEntity = value;
    }

    /**
     * [DEPRECATED] Идентификатор предприятия-производителя продукции.
     *                      Вместо этого используйте producer/enterprise.
     *                   
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
     * Производитель продукции.
     *                      Поиск может осуществляться по ХС-производителю и/или площадке, на которой выпускается продукция:
     *                      поля producer/businessEntity/guid и producer/enterprise/guid соответственно.
     *                   
     * 
     * @return
     *     possible object is
     *     {@link BusinessMember }
     *     
     */
    public BusinessMember getProducer() {
        return producer;
    }

    /**
     * Sets the value of the producer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessMember }
     *     
     */
    public void setProducer(BusinessMember value) {
        this.producer = value;
    }

}
