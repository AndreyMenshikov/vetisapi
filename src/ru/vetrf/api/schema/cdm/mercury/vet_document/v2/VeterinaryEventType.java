
package ru.vetrf.api.schema.cdm.mercury.vet_document.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VeterinaryEventType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VeterinaryEventType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UND"/>
 *     &lt;enumeration value="LBR"/>
 *     &lt;enumeration value="VSE"/>
 *     &lt;enumeration value="IMM"/>
 *     &lt;enumeration value="MED"/>
 *     &lt;enumeration value="QRT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VeterinaryEventType")
@XmlEnum
public enum VeterinaryEventType {


    /**
     * Не определен
     * 
     */
    UND,

    /**
     * Лабораторные исследования
     * 
     */
    LBR,

    /**
     * Ветеринарно-санитарная экспертиза
     * 
     */
    VSE,

    /**
     * Иммунизация живого животного
     * 
     */
    IMM,

    /**
     * Обработка живого животного
     * 
     */
    MED,

    /**
     * Карантин
     * 
     */
    QRT;

    public String value() {
        return name();
    }

    public static VeterinaryEventType fromValue(String v) {
        return valueOf(v);
    }

}
