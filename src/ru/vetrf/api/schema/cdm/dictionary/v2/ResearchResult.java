
package ru.vetrf.api.schema.cdm.dictionary.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResearchResult.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResearchResult">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="UNDEFINED"/>
 *     &lt;enumeration value="POSITIVE"/>
 *     &lt;enumeration value="NEGATIVE"/>
 *     &lt;enumeration value="UNFULFILLED"/>
 *     &lt;enumeration value="VSERAW"/>
 *     &lt;enumeration value="VSEFULL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResearchResult")
@XmlEnum
public enum ResearchResult {


    /**
     * Результат неизвестен
     * 
     */
    UNKNOWN,

    /**
     * Результат невозможно определить (не нормируется)
     * 
     */
    UNDEFINED,

    /**
     * Положительный результат
     * 
     */
    POSITIVE,

    /**
     * Отрицательный результат
     * 
     */
    NEGATIVE,

    /**
     * Не проводилось
     * 
     */
    UNFULFILLED,

    /**
     * ВСЭ подвергнуто сырьё, из которого произведена продукция
     * 
     */
    VSERAW,

    /**
     * Продукция подвергнута ВСЭ в полном объеме
     * 
     */
    VSEFULL;

    public String value() {
        return name();
    }

    public static ResearchResult fromValue(String v) {
        return valueOf(v);
    }

}
