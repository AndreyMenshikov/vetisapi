
package ru.vetrf.api.schema.cdm.dictionary.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnterpriseRole.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnterpriseRole">
 *   &lt;restriction base="{http://api.vetrf.ru/schema/cdm/base}String255">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="PRODUCER"/>
 *     &lt;enumeration value="SLAUGHTER_HOUSE"/>
 *     &lt;enumeration value="CUTTING_PLANT"/>
 *     &lt;enumeration value="COLD_STORE"/>
 *     &lt;enumeration value="PACKAGING_PLANT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnterpriseRole")
@XmlEnum
public enum EnterpriseRole {


    /**
     * Роль не определена.
     * 
     */
    UNKNOWN,

    /**
     * Является производителем продукции (в том числе выращивание).
     * 
     */
    PRODUCER,

    /**
     * Бойня (мясокомбинат).
     * 
     */
    SLAUGHTER_HOUSE,

    /**
     * Разделочное предприятие.
     * 
     */
    CUTTING_PLANT,

    /**
     * Холодильник.
     * 
     */
    COLD_STORE,

    /**
     * Упаковочное предприятие.
     * 
     */
    PACKAGING_PLANT;

    public String value() {
        return name();
    }

    public static EnterpriseRole fromValue(String v) {
        return valueOf(v);
    }

}
