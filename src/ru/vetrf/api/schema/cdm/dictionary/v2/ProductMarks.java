
package ru.vetrf.api.schema.cdm.dictionary.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 *             Тип, описывающий список маркировок продукции.
 *             Под маркировкой понимается всё, что может быть физически нанесено на упаковку или непосредственно на продукцию.
 *             Для каждой маркировки может быть указан её тип (см. атрибут class), который также может определять формат маркировки.
 *             Список возможных типов см. в перечислении dt:ProductMarkingClass.
 *          
 * 
 * <p>Java class for ProductMarks complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductMarks">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://api.vetrf.ru/schema/cdm/base>String255">
 *       &lt;attribute name="class" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}ProductMarkingClass" default="UNDEFINED" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductMarks", propOrder = {
    "value"
})
public class ProductMarks {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "class")
    protected ProductMarkingClass clazz;

    /**
     * Строковый тип с ограничением максимальной длины.
     *          
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link ProductMarkingClass }
     *     
     */
    public ProductMarkingClass getClazz() {
        if (clazz == null) {
            return ProductMarkingClass.UNDEFINED;
        } else {
            return clazz;
        }
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductMarkingClass }
     *     
     */
    public void setClazz(ProductMarkingClass value) {
        this.clazz = value;
    }

}
