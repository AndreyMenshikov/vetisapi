
package ru.vetrf.api.schema.cdm.registry.ws_definitions.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ru.vetrf.api.schema.cdm.dictionary.v2.ResearchMethod;


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
 *         &lt;element ref="{http://api.vetrf.ru/schema/cdm/dictionary/v2}researchMethod"/>
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
    "researchMethod"
})
@XmlRootElement(name = "getResearchMethodByGuidResponse")
public class GetResearchMethodByGuidResponse {

    @XmlElement(namespace = "http://api.vetrf.ru/schema/cdm/dictionary/v2", required = true)
    protected ResearchMethod researchMethod;

    /**
     * Найденная по глобальному идентификатору запись метода исследований.
     *                   
     * 
     * @return
     *     possible object is
     *     {@link ResearchMethod }
     *     
     */
    public ResearchMethod getResearchMethod() {
        return researchMethod;
    }

    /**
     * Sets the value of the researchMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResearchMethod }
     *     
     */
    public void setResearchMethod(ResearchMethod value) {
        this.researchMethod = value;
    }

}
