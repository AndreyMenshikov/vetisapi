
package ru.vetrf.api.schema.cdm.application;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApplicationStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ApplicationStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACCEPTED"/>
 *     &lt;enumeration value="IN_PROCESS"/>
 *     &lt;enumeration value="COMPLETED"/>
 *     &lt;enumeration value="REJECTED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ApplicationStatus")
@XmlEnum
public enum ApplicationStatus {

    ACCEPTED,
    IN_PROCESS,
    COMPLETED,
    REJECTED;

    public String value() {
        return name();
    }

    public static ApplicationStatus fromValue(String v) {
        return valueOf(v);
    }

}
