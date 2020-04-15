
package ru.vetrf.api.schema.cdm.mercury.vet_document.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryDecision.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeliveryDecision">
 *   &lt;restriction base="{http://api.vetrf.ru/schema/cdm/base}String255">
 *     &lt;enumeration value="ACCEPT_ALL"/>
 *     &lt;enumeration value="PARTIALLY"/>
 *     &lt;enumeration value="RETURN_ALL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeliveryDecision")
@XmlEnum
public enum DeliveryDecision {


    /**
     * Принять всю поставку.
     * 
     */
    ACCEPT_ALL,

    /**
     * Принять часть груза, на оставшуюся оформить возврат.
     * 
     */
    PARTIALLY,

    /**
     * Оформить возврат на всю поставку.
     * 
     */
    RETURN_ALL;

    public String value() {
        return name();
    }

    public static DeliveryDecision fromValue(String v) {
        return valueOf(v);
    }

}
