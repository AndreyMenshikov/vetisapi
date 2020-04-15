
package ru.vetrf.api.schema.cdm.dictionary.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentNature.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DocumentNature">
 *   &lt;restriction base="{http://api.vetrf.ru/schema/cdm/base}String255">
 *     &lt;enumeration value="ELECTRONIC"/>
 *     &lt;enumeration value="PAPER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DocumentNature")
@XmlEnum
public enum DocumentNature {


    /**
     * Электронный документ
     * 
     */
    ELECTRONIC,

    /**
     * Бумажный документ
     * 
     */
    PAPER;

    public String value() {
        return name();
    }

    public static DocumentNature fromValue(String v) {
        return valueOf(v);
    }

}
