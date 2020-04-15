
package ru.vetrf.api.schema.cdm.mercury.vet_document.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VetDocumentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VetDocumentType">
 *   &lt;restriction base="{http://api.vetrf.ru/schema/cdm/base}String255">
 *     &lt;enumeration value="TRANSPORT"/>
 *     &lt;enumeration value="PRODUCTIVE"/>
 *     &lt;enumeration value="RETURNABLE"/>
 *     &lt;enumeration value="INCOMING"/>
 *     &lt;enumeration value="OUTGOING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VetDocumentType")
@XmlEnum
public enum VetDocumentType {


    /**
     * Транспортный
     * 
     */
    TRANSPORT,

    /**
     * Производственный
     * 
     */
    PRODUCTIVE,

    /**
     * Возвратный
     * 
     */
    RETURNABLE,

    /**
     * Входящий
     * 
     */
    INCOMING,

    /**
     * Исходящий
     * 
     */
    OUTGOING;

    public String value() {
        return name();
    }

    public static VetDocumentType fromValue(String v) {
        return valueOf(v);
    }

}
