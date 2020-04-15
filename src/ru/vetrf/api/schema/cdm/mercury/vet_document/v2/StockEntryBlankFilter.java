
package ru.vetrf.api.schema.cdm.mercury.vet_document.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StockEntryBlankFilter.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StockEntryBlankFilter">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALL"/>
 *     &lt;enumeration value="BLANK"/>
 *     &lt;enumeration value="NOT_BLANK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StockEntryBlankFilter")
@XmlEnum
public enum StockEntryBlankFilter {


    /**
     * Все записи журнала, вне зависимости от объёма.
     * 
     */
    ALL,

    /**
     * Записи журнала с нулевым объёмом.
     * 
     */
    BLANK,

    /**
     * Записи журнала с ненулевым объёмом.
     * 
     */
    NOT_BLANK;

    public String value() {
        return name();
    }

    public static StockEntryBlankFilter fromValue(String v) {
        return valueOf(v);
    }

}
