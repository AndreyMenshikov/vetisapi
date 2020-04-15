
package ru.vetrf.api.schema.cdm.mercury.vet_document.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VetDocumentStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VetDocumentStatus">
 *   &lt;restriction base="{http://api.vetrf.ru/schema/cdm/base}String255">
 *     &lt;enumeration value="CREATED"/>
 *     &lt;enumeration value="CONFIRMED"/>
 *     &lt;enumeration value="WITHDRAWN"/>
 *     &lt;enumeration value="UTILIZED"/>
 *     &lt;enumeration value="FINALIZED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VetDocumentStatus")
@XmlEnum
public enum VetDocumentStatus {


    /**
     * Создан. Неоформленный проект сертификата
     * 
     */
    CREATED,

    /**
     * Оформлен. Действующий сертификат, по которому разрешено совершать транзакцию с
     *                   грузом.
     *                
     * 
     */
    CONFIRMED,

    /**
     * Аннулирован. Не действующий более сертификат.
     * 
     */
    WITHDRAWN,

    /**
     * Погашен. Действующий сертификат, по которому транзакция уже была совершена.
     *                
     * 
     */
    UTILIZED,

    /**
     * Закрыт. Действующий производственный сертификат.
     *                   Статус проставляется при завершении производственной смены, изменение финализированного вет.сертификата не допускается.
     *                   Статус `FINALIZED` не используется в атрибуте `vetDStatus` сертификата, признак того, что производственный сертификат финализирован
     *                   определяется логическим атрибутом `finalized` сертификата. При этом сертификат всегда находится в статусе `CONFIRMED`.
     *                
     * 
     */
    FINALIZED;

    public String value() {
        return name();
    }

    public static VetDocumentStatus fromValue(String v) {
        return valueOf(v);
    }

}
