
package ru.vetrf.api.schema.cdm.registry.ws_definitions.v2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ru.vetrf.api.schema.cdm.base.ListOptions;
import ru.vetrf.api.schema.cdm.dictionary.v2.AnimalDisease;
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
 *         &lt;element ref="{http://api.vetrf.ru/schema/cdm/dictionary/v2}disease"/>
 *         &lt;element ref="{http://api.vetrf.ru/schema/cdm/dictionary/v2}productType" minOccurs="0"/>
 *         &lt;element ref="{http://api.vetrf.ru/schema/cdm/dictionary/v2}product" minOccurs="0"/>
 *         &lt;element ref="{http://api.vetrf.ru/schema/cdm/dictionary/v2}subProduct" minOccurs="0"/>
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
    "disease",
    "productType",
    "product",
    "subProduct"
})
@XmlRootElement(name = "getActualR13nShippingRuleListRequest")
public class GetActualR13NShippingRuleListRequest {

    @XmlElement(namespace = "http://api.vetrf.ru/schema/cdm/base")
    protected ListOptions listOptions;
    @XmlElement(namespace = "http://api.vetrf.ru/schema/cdm/dictionary/v2", required = true)
    protected AnimalDisease disease;
    @XmlElement(namespace = "http://api.vetrf.ru/schema/cdm/dictionary/v2")
    protected BigInteger productType;
    @XmlElement(namespace = "http://api.vetrf.ru/schema/cdm/dictionary/v2")
    protected Product product;
    @XmlElement(namespace = "http://api.vetrf.ru/schema/cdm/dictionary/v2")
    protected SubProduct subProduct;

    /**
     * Параметры запрашиваемого списка.
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
     * Заболевание, по которому запрашиваются статусы регионов.
     * 
     * @return
     *     possible object is
     *     {@link AnimalDisease }
     *     
     */
    public AnimalDisease getDisease() {
        return disease;
    }

    /**
     * Sets the value of the disease property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalDisease }
     *     
     */
    public void setDisease(AnimalDisease value) {
        this.disease = value;
    }

    /**
     * (Опционально) Ветеринарная категория груза (тип продукции), для которой запрашиваются правила перемещения.
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
     * (Опционально) Ветеринарная категория груза (продукция), для которой запрашиваются правила перемещения.
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
     * (Опционально) Ветеринарная категория груза (вид продукции), для которой запрашиваются правила перемещения.
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

}
