
package ru.vetrf.api.schema.cdm.dictionary.v2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Поддерживается указание многоуровневой упаковки и маркировки партии продукции.
 *             Всего предусмотрено шесть уровней упаковки (см. тип dt:PackageLevelType).
 *             Количество единиц упаковки и маркировка партии указывается для каждой упаковки конкретного уровня отдельно.
 *             На каждом уровне может быть произвольное количество типов упаковки, в том числе и ни одного,
 *             т.е. какого-то уровня упаковки в описании партии продукции может не быть.
 *             Если уровень упаковки однозначно определить не получается, например, груз перевозится в потребительской упаковке,
 *             т.е. эта упаковка в то же время может считаться и транспортной, то рекомендуется указывать наименьший уровень,
 *             т.е. для примера выше, упаковка будет отнесена к потребительскому уровню.
 *             Уровнь и тип упаковки обязательны для указания. Количество единиц упаковки может быть не указано.
 *             В то же время, для корректного оформления ветеринарного сертификата, рекомендуется указывать количество единиц упаковки,
 *             в которой перевозится продукция. Важно, что количество мест в транспортной партии будет определено
 *             как сумма всех упаковок на последнем/максимальном уровне, который указан в описании партии.
 *             Примеры описания упаковки для различных типов продукции и вариантов перевозки представлены в справочной системе.
 *          
 * 
 * <p>Java class for Package complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Package">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="level" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}PackageLevelType"/>
 *         &lt;element name="packingType" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}PackingType"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="productMarks" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}ProductMarks" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Package", propOrder = {
    "level",
    "packingType",
    "quantity",
    "productMarks"
})
public class Package {

    @XmlElement(required = true)
    protected BigInteger level;
    @XmlElement(required = true)
    protected PackingType packingType;
    protected BigInteger quantity;
    protected List<ProductMarks> productMarks;

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLevel(BigInteger value) {
        this.level = value;
    }

    /**
     * Gets the value of the packingType property.
     * 
     * @return
     *     possible object is
     *     {@link PackingType }
     *     
     */
    public PackingType getPackingType() {
        return packingType;
    }

    /**
     * Sets the value of the packingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackingType }
     *     
     */
    public void setPackingType(PackingType value) {
        this.packingType = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantity(BigInteger value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the productMarks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productMarks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductMarks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductMarks }
     * 
     * 
     */
    public List<ProductMarks> getProductMarks() {
        if (productMarks == null) {
            productMarks = new ArrayList<ProductMarks>();
        }
        return this.productMarks;
    }

}
