
package ru.vetrf.api.schema.cdm.mercury.vet_document.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryInspectionResult.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeliveryInspectionResult">
 *   &lt;restriction base="{http://api.vetrf.ru/schema/cdm/base}String255">
 *     &lt;enumeration value="CORRESPONDS"/>
 *     &lt;enumeration value="MISMATCH"/>
 *     &lt;enumeration value="UNSUPERVISED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeliveryInspectionResult")
@XmlEnum
public enum DeliveryInspectionResult {


    /**
     * Груз соответствует сведениям, заявленным в документах.
     * 
     */
    CORRESPONDS,

    /**
     * Груз отличается от сведений, указанных в сопроводительных документах.
     *                
     * 
     */
    MISMATCH,

    /**
     * Контроль не проводился.
     * 
     */
    UNSUPERVISED;

    public String value() {
        return name();
    }

    public static DeliveryInspectionResult fromValue(String v) {
        return valueOf(v);
    }

}
