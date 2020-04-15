
package ru.vetrf.api.schema.cdm.application;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContentEncoding.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContentEncoding">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="plain"/>
 *     &lt;enumeration value="gzip"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContentEncoding")
@XmlEnum
public enum ContentEncoding {

    @XmlEnumValue("plain")
    PLAIN("plain"),
    @XmlEnumValue("gzip")
    GZIP("gzip");
    private final String value;

    ContentEncoding(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContentEncoding fromValue(String v) {
        for (ContentEncoding c: ContentEncoding.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
