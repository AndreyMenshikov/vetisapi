
package ru.vetrf.api.schema.cdm.mercury.vet_document.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import ru.vetrf.api.schema.cdm.dictionary.v2.AnimalDisease;
import ru.vetrf.api.schema.cdm.dictionary.v2.Indicator;
import ru.vetrf.api.schema.cdm.dictionary.v2.ResearchMethod;
import ru.vetrf.api.schema.cdm.dictionary.v2.ResearchResult;


/**
 * Лабораторное исследование. Исследование выполняется на конкретный показатель/заболевание в лаборатории.
 *          
 * 
 * <p>Java class for LaboratoryResearchEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LaboratoryResearchEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}VeterinaryEvent">
 *       &lt;sequence>
 *         &lt;element name="batchID" type="{http://api.vetrf.ru/schema/cdm/base}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="expertiseID" type="{http://api.vetrf.ru/schema/cdm/base}String255" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="indicator" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}Indicator" minOccurs="0"/>
 *           &lt;element name="disease" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}AnimalDisease" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="method" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}ResearchMethod" minOccurs="0"/>
 *         &lt;element name="result" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}ResearchResult" minOccurs="0"/>
 *         &lt;element name="conclusion" type="{http://api.vetrf.ru/schema/cdm/base}Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LaboratoryResearchEvent", propOrder = {
    "batchID",
    "expertiseID",
    "indicator",
    "disease",
    "method",
    "result",
    "conclusion"
})
public class LaboratoryResearchEvent
    extends VeterinaryEvent
{

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> batchID;
    protected String expertiseID;
    protected Indicator indicator;
    protected AnimalDisease disease;
    protected ResearchMethod method;
    @XmlSchemaType(name = "string")
    protected ResearchResult result;
    protected String conclusion;

    /**
     * Gets the value of the batchID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the batchID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBatchID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBatchID() {
        if (batchID == null) {
            batchID = new ArrayList<String>();
        }
        return this.batchID;
    }

    /**
     * Gets the value of the expertiseID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpertiseID() {
        return expertiseID;
    }

    /**
     * Sets the value of the expertiseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpertiseID(String value) {
        this.expertiseID = value;
    }

    /**
     * Gets the value of the indicator property.
     * 
     * @return
     *     possible object is
     *     {@link Indicator }
     *     
     */
    public Indicator getIndicator() {
        return indicator;
    }

    /**
     * Sets the value of the indicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Indicator }
     *     
     */
    public void setIndicator(Indicator value) {
        this.indicator = value;
    }

    /**
     * Gets the value of the disease property.
     * 
     * @return
     *     possible object is
     *     {@link AnimalDisease }
     *     
     */
    public AnimalDisease getDisease() {
        return disease;
    }

    /**
     * Sets the value of the disease property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalDisease }
     *     
     */
    public void setDisease(AnimalDisease value) {
        this.disease = value;
    }

    /**
     * Gets the value of the method property.
     * 
     * @return
     *     possible object is
     *     {@link ResearchMethod }
     *     
     */
    public ResearchMethod getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResearchMethod }
     *     
     */
    public void setMethod(ResearchMethod value) {
        this.method = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link ResearchResult }
     *     
     */
    public ResearchResult getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResearchResult }
     *     
     */
    public void setResult(ResearchResult value) {
        this.result = value;
    }

    /**
     * Gets the value of the conclusion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConclusion() {
        return conclusion;
    }

    /**
     * Sets the value of the conclusion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConclusion(String value) {
        this.conclusion = value;
    }

}
