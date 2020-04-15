
package ru.vetrf.api.schema.cdm.registry.ws_definitions.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ru.vetrf.api.schema.cdm.dictionary.v2.AnimalDiseaseList;


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
 *         &lt;element ref="{http://api.vetrf.ru/schema/cdm/dictionary/v2}diseaseList"/>
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
    "diseaseList"
})
@XmlRootElement(name = "getDiseaseListResponse")
public class GetDiseaseListResponse {

    @XmlElement(namespace = "http://api.vetrf.ru/schema/cdm/dictionary/v2", required = true)
    protected AnimalDiseaseList diseaseList;

    /**
     * Список заболеваний.
     * 
     * @return
     *     possible object is
     *     {@link AnimalDiseaseList }
     *     
     */
    public AnimalDiseaseList getDiseaseList() {
        return diseaseList;
    }

    /**
     * Sets the value of the diseaseList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalDiseaseList }
     *     
     */
    public void setDiseaseList(AnimalDiseaseList value) {
        this.diseaseList = value;
    }

}
