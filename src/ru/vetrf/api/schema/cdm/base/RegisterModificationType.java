
package ru.vetrf.api.schema.cdm.base;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegisterModificationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RegisterModificationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CREATE"/>
 *     &lt;enumeration value="FIND_OR_CREATE"/>
 *     &lt;enumeration value="UPDATE"/>
 *     &lt;enumeration value="DELETE"/>
 *     &lt;enumeration value="MERGE"/>
 *     &lt;enumeration value="ATTACH"/>
 *     &lt;enumeration value="SPLIT"/>
 *     &lt;enumeration value="FORK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RegisterModificationType")
@XmlEnum
public enum RegisterModificationType {


    /**
     * Добавление новой записи.
     * 
     */
    CREATE,

    /**
     * Поиск существующей или добавление новой записи. [CREATE IF NOT EXISTS]
     *                
     * 
     */
    FIND_OR_CREATE,

    /**
     * Внесение изменений в существующую запись.
     * 
     */
    UPDATE,

    /**
     * Удаление существующей записи.
     * 
     */
    DELETE,

    /**
     * Объединение двух или нескольких записей.
     * 
     */
    MERGE,

    /**
     * Присоединение одной или нескольких записе к другой.
     * 
     */
    ATTACH,

    /**
     * Разделение записи на две и более.
     * 
     */
    SPLIT,

    /**
     * Отделение одной и более записей от существующей.
     * 
     */
    FORK;

    public String value() {
        return name();
    }

    public static RegisterModificationType fromValue(String v) {
        return valueOf(v);
    }

}
