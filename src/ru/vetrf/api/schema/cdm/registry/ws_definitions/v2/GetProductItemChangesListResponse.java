
package ru.vetrf.api.schema.cdm.registry.ws_definitions.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ru.vetrf.api.schema.cdm.dictionary.v2.ProductItemList;


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
 *         &lt;element ref="{http://api.vetrf.ru/schema/cdm/dictionary/v2}productItemList" minOccurs="0"/>
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
    "productItemList"
})
@XmlRootElement(name = "getProductItemChangesListResponse")
public class GetProductItemChangesListResponse {

    @XmlElement(namespace = "http://api.vetrf.ru/schema/cdm/dictionary/v2")
    protected ProductItemList productItemList;

    /**
     * Список записей типов наименований продукции.
     *                   
     * 
     * @return
     *     possible object is
     *     {@link ProductItemList }
     *     
     */
    public ProductItemList getProductItemList() {
        return productItemList;
    }

    /**
     * Sets the value of the productItemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductItemList }
     *     
     */
    public void setProductItemList(ProductItemList value) {
        this.productItemList = value;
    }

}
