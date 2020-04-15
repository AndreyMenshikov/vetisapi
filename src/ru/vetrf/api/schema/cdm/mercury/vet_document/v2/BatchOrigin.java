
package ru.vetrf.api.schema.cdm.mercury.vet_document.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import ru.vetrf.api.schema.cdm.dictionary.v2.Country;
import ru.vetrf.api.schema.cdm.dictionary.v2.Producer;
import ru.vetrf.api.schema.cdm.dictionary.v2.ProductItem;


/**
 * Сведения о происхождении партии продукции.
 * 
 * <p>Java class for BatchOrigin complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatchOrigin">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productItem" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}ProductItem" minOccurs="0"/>
 *         &lt;element name="country" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}Country" minOccurs="0"/>
 *         &lt;element name="producer" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}Producer" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchOrigin", propOrder = {
    "productItem",
    "country",
    "producer"
})
public class BatchOrigin {

    protected ProductItem productItem;
    protected Country country;
    protected List<Producer> producer;

    /**
     * Gets the value of the productItem property.
     * 
     * @return
     *     possible object is
     *     {@link ProductItem }
     *     
     */
    public ProductItem getProductItem() {
        return productItem;
    }

    /**
     * Sets the value of the productItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductItem }
     *     
     */
    public void setProductItem(ProductItem value) {
        this.productItem = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link Country }
     *     
     */
    public Country getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link Country }
     *     
     */
    public void setCountry(Country value) {
        this.country = value;
    }

    /**
     * Gets the value of the producer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the producer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProducer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Producer }
     * 
     * 
     */
    public List<Producer> getProducer() {
        if (producer == null) {
            producer = new ArrayList<Producer>();
        }
        return this.producer;
    }

}
