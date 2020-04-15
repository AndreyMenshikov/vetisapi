
package ru.vetrf.api.schema.cdm.registry.ws_definitions.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ru.vetrf.api.schema.cdm.dictionary.v2.BusinessMember;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://api.vetrf.ru/schema/cdm/dictionary/v2}businessMember"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "businessMember"
})
@XmlRootElement(name = "getBusinessMemberByGLNResponse")
public class GetBusinessMemberByGLNResponse {

    @XmlElement(namespace = "http://api.vetrf.ru/schema/cdm/dictionary/v2", required = true)
    protected BusinessMember businessMember;

    /**
     * Запись ХС.
     * 
     * @return
     *     possible object is
     *     {@link BusinessMember }
     *     
     */
    public BusinessMember getBusinessMember() {
        return businessMember;
    }

    /**
     * Sets the value of the businessMember property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessMember }
     *     
     */
    public void setBusinessMember(BusinessMember value) {
        this.businessMember = value;
    }

}
