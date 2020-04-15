
package ru.vetrf.api.schema.cdm.mercury.vet_document.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VetDocumentForm.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VetDocumentForm">
 *   &lt;restriction base="{http://api.vetrf.ru/schema/cdm/base}String255">
 *     &lt;enumeration value="CERTCU1"/>
 *     &lt;enumeration value="LIC1"/>
 *     &lt;enumeration value="CERTCU2"/>
 *     &lt;enumeration value="LIC2"/>
 *     &lt;enumeration value="CERTCU3"/>
 *     &lt;enumeration value="LIC3"/>
 *     &lt;enumeration value="NOTE4"/>
 *     &lt;enumeration value="CERT5I"/>
 *     &lt;enumeration value="CERT61"/>
 *     &lt;enumeration value="CERT62"/>
 *     &lt;enumeration value="CERT63"/>
 *     &lt;enumeration value="PRODUCTIVE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VetDocumentForm")
@XmlEnum
public enum VetDocumentForm {


    /**
     * Форма 1 ветеринарного сертификата ТС
     * 
     */
    @XmlEnumValue("CERTCU1")
    CERTCU_1("CERTCU1"),

    /**
     * Форма 1 ветеринарного свидетельства
     * 
     */
    @XmlEnumValue("LIC1")
    LIC_1("LIC1"),

    /**
     * Форма 2 ветеринарного сертификата ТС
     * 
     */
    @XmlEnumValue("CERTCU2")
    CERTCU_2("CERTCU2"),

    /**
     * Форма 2 ветеринарного свидетельства
     * 
     */
    @XmlEnumValue("LIC2")
    LIC_2("LIC2"),

    /**
     * Форма 3 ветеринарного сертификата ТС
     * 
     */
    @XmlEnumValue("CERTCU3")
    CERTCU_3("CERTCU3"),

    /**
     * Форма 3 ветеринарного свидетельства
     * 
     */
    @XmlEnumValue("LIC3")
    LIC_3("LIC3"),

    /**
     * Форма 4 ветеринарной справки
     * 
     */
    @XmlEnumValue("NOTE4")
    NOTE_4("NOTE4"),

    /**
     * Форма 5i ветеринарного сертификата
     * 
     */
    @XmlEnumValue("CERT5I")
    CERT_5_I("CERT5I"),

    /**
     * Форма 6.1 ветеринарного сертификата
     * 
     */
    @XmlEnumValue("CERT61")
    CERT_61("CERT61"),

    /**
     * Форма 6.2 ветеринарного сертификата
     * 
     */
    @XmlEnumValue("CERT62")
    CERT_62("CERT62"),

    /**
     * Форма 6.3 ветеринарного сертификата
     * 
     */
    @XmlEnumValue("CERT63")
    CERT_63("CERT63"),

    /**
     * Форма производственного ветеринарного сертификата
     * 
     */
    PRODUCTIVE("PRODUCTIVE");
    private final String value;

    VetDocumentForm(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VetDocumentForm fromValue(String v) {
        for (VetDocumentForm c: VetDocumentForm.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
