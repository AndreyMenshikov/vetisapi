
package ru.vetrf.api.schema.cdm.dictionary.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductMarkingClass.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductMarkingClass">
 *   &lt;restriction base="{http://api.vetrf.ru/schema/cdm/base}String255">
 *     &lt;enumeration value="UNDEFINED"/>
 *     &lt;enumeration value="BN"/>
 *     &lt;enumeration value="SSCC"/>
 *     &lt;enumeration value="EAN8"/>
 *     &lt;enumeration value="EAN13"/>
 *     &lt;enumeration value="EAN128"/>
 *     &lt;enumeration value="BUNDLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProductMarkingClass")
@XmlEnum
public enum ProductMarkingClass {


    /**
     * Класс неопределен.
     * 
     */
    UNDEFINED("UNDEFINED"),

    /**
     * Номер производственной партии.
     * 
     */
    BN("BN"),

    /**
     * SSCC-код.
     * 
     */
    SSCC("SSCC"),

    /**
     * Маркировка в соответствии с EAN-8.
     * 
     */
    @XmlEnumValue("EAN8")
    EAN_8("EAN8"),

    /**
     * Маркировка в соответствии с EAN-13.
     * 
     */
    @XmlEnumValue("EAN13")
    EAN_13("EAN13"),

    /**
     * Маркировка в соответствии с EAN-128.
     * 
     */
    @XmlEnumValue("EAN128")
    EAN_128("EAN128"),

    /**
     * Маркировка вышестоящей групповой упаковки, например, паллеты.
     *                   Может использоваться для поиска группы вет.сертификатов для партий, находящихся на данной паллете.
     *                
     * 
     */
    BUNDLE("BUNDLE");
    private final String value;

    ProductMarkingClass(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProductMarkingClass fromValue(String v) {
        for (ProductMarkingClass c: ProductMarkingClass.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
