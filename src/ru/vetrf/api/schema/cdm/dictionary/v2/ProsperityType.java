
package ru.vetrf.api.schema.cdm.dictionary.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProsperityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProsperityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="UNDEFINED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="SAFE"/>
 *     &lt;enumeration value="UNSAFE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProsperityType")
@XmlEnum
public enum ProsperityType {


    /**
     * Неопределенный (не определялся)
     * 
     */
    UNDEFINED,

    /**
     * Неидентифицированный/неизвестный (статус невозможно определить)
     * 
     */
    UNKNOWN,

    /**
     * Благополучный
     * 
     */
    SAFE,

    /**
     * Неблагополучный
     * 
     */
    UNSAFE;

    public String value() {
        return name();
    }

    public static ProsperityType fromValue(String v) {
        return valueOf(v);
    }

}
