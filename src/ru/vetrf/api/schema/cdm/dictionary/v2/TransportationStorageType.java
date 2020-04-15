
package ru.vetrf.api.schema.cdm.dictionary.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransportationStorageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransportationStorageType">
 *   &lt;restriction base="{http://api.vetrf.ru/schema/cdm/base}String255">
 *     &lt;enumeration value="FROZEN"/>
 *     &lt;enumeration value="CHILLED"/>
 *     &lt;enumeration value="COOLED"/>
 *     &lt;enumeration value="VENTILATED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransportationStorageType")
@XmlEnum
public enum TransportationStorageType {


    /**
     * Замороженный тип перевозки
     * 
     */
    FROZEN,

    /**
     * Охлажденный тип перевозки
     * 
     */
    CHILLED,

    /**
     * Охлаждаемый тип перевозки
     * 
     */
    COOLED,

    /**
     * Вентилируемый тип перевозки
     * 
     */
    VENTILATED;

    public String value() {
        return name();
    }

    public static TransportationStorageType fromValue(String v) {
        return valueOf(v);
    }

}
