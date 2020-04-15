
package ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.vetrf.api.schema.cdm.application.ApplicationResultData;
import ru.vetrf.api.schema.cdm.dictionary.v2.ProductItemList;


/**
 * Результат заявки на изменение реестра наименований продукции предприятия-производителя.
 *          
 * 
 * <p>Java class for ModifyProducerStockListResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModifyProducerStockListResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/application}ApplicationResultData">
 *       &lt;sequence>
 *         &lt;element name="productItemList" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}ProductItemList"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyProducerStockListResponse", propOrder = {
    "productItemList"
})
public class ModifyProducerStockListResponse
    extends ApplicationResultData
{

    @XmlElement(required = true)
    protected ProductItemList productItemList;

    /**
     * Gets the value of the productItemList property.
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
