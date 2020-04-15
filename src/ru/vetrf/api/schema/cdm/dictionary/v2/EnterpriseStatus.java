
package ru.vetrf.api.schema.cdm.dictionary.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnterpriseStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnterpriseStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="UNVERIFIED"/>
 *     &lt;enumeration value="VERIFIED"/>
 *     &lt;enumeration value="CANCELED"/>
 *     &lt;enumeration value="DELETED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnterpriseStatus")
@XmlEnum
public enum EnterpriseStatus {


    /**
     * Не подтверджен (не в реестре).
     * 
     */
    UNVERIFIED,

    /**
     * Подтвержден (включен в реестр).
     * 
     */
    VERIFIED,

    /**
     * Исключен из реестра.
     * 
     */
    CANCELED,

    /**
     * Удален.
     * 
     */
    DELETED;

    public String value() {
        return name();
    }

    public static EnterpriseStatus fromValue(String v) {
        return valueOf(v);
    }

}
