
package ru.vetrf.api.schema.cdm.mercury.vet_document.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NonFoodProductSourceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NonFoodProductSourceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="CATTLE_SLAUGHTER"/>
 *     &lt;enumeration value="LOSS_OF_CATTLE"/>
 *     &lt;enumeration value="MANUFACTURED"/>
 *     &lt;enumeration value="MIXED"/>
 *     &lt;enumeration value="FROM_HEALTHY_ANIMALS"/>
 *     &lt;enumeration value="FROM_SICK_ANIMALS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NonFoodProductSourceType")
@XmlEnum
public enum NonFoodProductSourceType {


    /**
     * Боенское.
     * 
     */
    CATTLE_SLAUGHTER,

    /**
     * Палое.
     * 
     */
    LOSS_OF_CATTLE,

    /**
     * Промышленное.
     * 
     */
    MANUFACTURED,

    /**
     * Сборное.
     * 
     */
    MIXED,

    /**
     * Полученное от здоровых животных.
     * 
     */
    FROM_HEALTHY_ANIMALS,

    /**
     * Полученное от больных животных.
     * 
     */
    FROM_SICK_ANIMALS;

    public String value() {
        return name();
    }

    public static NonFoodProductSourceType fromValue(String v) {
        return valueOf(v);
    }

}
