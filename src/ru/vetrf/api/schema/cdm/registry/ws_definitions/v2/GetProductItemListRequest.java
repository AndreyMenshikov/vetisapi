
package ru.vetrf.api.schema.cdm.registry.ws_definitions.v2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ru.vetrf.api.schema.cdm.base.ListOptions;
import ru.vetrf.api.schema.cdm.dictionary.v2.BusinessEntity;
import ru.vetrf.api.schema.cdm.dictionary.v2.BusinessMember;
import ru.vetrf.api.schema.cdm.dictionary.v2.Enterprise;
import ru.vetrf.api.schema.cdm.dictionary.v2.Product;
import ru.vetrf.api.schema.cdm.dictionary.v2.SubProduct;


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
 *         &lt;element ref="{http://api.vetrf.ru/schema/cdm/dictionary/v2}productType" minOccurs="0"/>
 *         &lt;element ref="{http://api.vetrf.ru/schema/cdm/dictionary/v2}product" minOccurs="0"/>
 *         &lt;element ref="{http://api.vetrf.ru/schema/cdm/dictionary/v2}subProduct" minOccurs="0"/>
 *         &lt;element ref="{http://api.vetrf.ru/schema/cdm/dictionary/v2}businessEntity" minOccurs="0"/>
 *         &lt;element ref="{http://api.vetrf.ru/schema/cdm/dictionary/v2}enterprise" minOccurs="0"/>
 *         &lt;element ref="{http://api.vetrf.ru/schema/cdm/dictionary/v2}producer" minOccurs="0"/>
 *         &lt;element ref="{http://api.vetrf.ru/schema/cdm/dictionary/v2}globalID" minOccurs="0"/>
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
    "productType",
    "product",
    "subProduct",
    "businessEntity",
    "enterprise",
    "producer",
    "globalID"
})
@XmlRootElement(name = "getProductItemListRequest")
public class GetProductItemListRequest {

    @XmlElement(namespace = "http://api.vetrf.ru/schema/cdm/base")
    protected ListOptions listOptions;
    @XmlElement(namespace = "http://api.vetrf.ru/schema/cdm/dictionary/v2")
    protected BigInteger productType;
    @XmlElement(namespace = "http://api.vetrf.ru/schema/cdm/dictionary/v2")
    protected Product product;
    @XmlElement(namespace = "http://api.vetrf.ru/schema/cdm/dictionary/v2")
    protected SubProduct subProduct;
    @XmlElement(namespace = "http://api.vetrf.ru/schema/cdm/dictionary/v2")
    protected BusinessEntity businessEntity;
    @XmlElement(namespace = "http://api.vetrf.ru/schema/cdm/dictionary/v2")
    protected Enterprise enterprise;
    @XmlElement(namespace = "http://api.vetrf.ru/schema/cdm/dictionary/v2")
    protected BusinessMember producer;
    @XmlElement(namespace = "http://api.vetrf.ru/schema/cdm/dictionary/v2")
    protected String globalID;

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
     * Идентификатор вида продукции, по которому будет осуществлен поиск.
     *                   
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProductType(BigInteger value) {
        this.productType = value;
    }

    /**
     * Идентификатор вида продукции, по которому будет осуществлен поиск.
     *                   
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     */
    public Product getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setProduct(Product value) {
        this.product = value;
    }

    /**
     * Идентификатор вида продукции, по которому будет осуществлен поиск.
     *                   
     * 
     * @return
     *     possible object is
     *     {@link SubProduct }
     *     
     */
    public SubProduct getSubProduct() {
        return subProduct;
    }

    /**
     * Sets the value of the subProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubProduct }
     *     
     */
    public void setSubProduct(SubProduct value) {
        this.subProduct = value;
    }

    /**
     * Идентификатор хозяйствующего субъекта, справочник которого запрашивается.
     *                      В результирующий список попадут все публичные записи справочника хозяйствующего субъекта.
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
     *                      Вместо этого используйте поле producer/enterprise.
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

    /**
     * Global Trade Identification Number (GTIN) -
     *                      уникальный идентификационный номер продукции производителя.
     *                   
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalID() {
        return globalID;
    }

    /**
     * Sets the value of the globalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalID(String value) {
        this.globalID = value;
    }

}
