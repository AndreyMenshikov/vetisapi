
package ru.vetrf.api.schema.cdm.mercury.vet_document.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ru.vetrf.api.schema.cdm.dictionary.v2.Purpose;
import ru.vetrf.api.schema.cdm.dictionary.v2.ResearchResult;


/**
 * Результаты осмотра/исследований партии. Заключение ветеринарного врача/специалиста.
 *          
 * 
 * <p>Java class for VeterinaryAuthentication complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VeterinaryAuthentication">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="purpose" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}Purpose" minOccurs="0"/>
 *         &lt;element name="cargoInspected" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cargoExpertized" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}ResearchResult" minOccurs="0"/>
 *         &lt;element name="locationProsperity" type="{http://api.vetrf.ru/schema/cdm/base}String255" minOccurs="0"/>
 *         &lt;element name="animalSpentPeriod" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}AnimalSpentPeriod" minOccurs="0"/>
 *         &lt;element name="monthsSpent" type="{http://api.vetrf.ru/schema/cdm/base}String255" minOccurs="0"/>
 *         &lt;element name="laboratoryResearch" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}LaboratoryResearchEvent" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="quarantine" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}QuarantineEvent" minOccurs="0"/>
 *         &lt;element name="immunization" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}AnimalMedicationEvent" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="veterinaryEvent" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}VeterinaryEvent" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="r13nClause" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}RegionalizationClause" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="specialMarks" type="{http://api.vetrf.ru/schema/cdm/base}Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VeterinaryAuthentication", propOrder = {
    "purpose",
    "cargoInspected",
    "cargoExpertized",
    "locationProsperity",
    "animalSpentPeriod",
    "monthsSpent",
    "laboratoryResearch",
    "quarantine",
    "immunization",
    "veterinaryEvent",
    "r13NClause",
    "specialMarks"
})
public class VeterinaryAuthentication {

    protected Purpose purpose;
    protected Boolean cargoInspected;
    @XmlSchemaType(name = "string")
    protected ResearchResult cargoExpertized;
    protected String locationProsperity;
    @XmlSchemaType(name = "string")
    protected AnimalSpentPeriod animalSpentPeriod;
    protected String monthsSpent;
    protected List<LaboratoryResearchEvent> laboratoryResearch;
    protected QuarantineEvent quarantine;
    protected List<AnimalMedicationEvent> immunization;
    protected List<VeterinaryEvent> veterinaryEvent;
    @XmlElement(name = "r13nClause")
    protected List<RegionalizationClause> r13NClause;
    protected String specialMarks;

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link Purpose }
     *     
     */
    public Purpose getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link Purpose }
     *     
     */
    public void setPurpose(Purpose value) {
        this.purpose = value;
    }

    /**
     * Gets the value of the cargoInspected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCargoInspected() {
        return cargoInspected;
    }

    /**
     * Sets the value of the cargoInspected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCargoInspected(Boolean value) {
        this.cargoInspected = value;
    }

    /**
     * Gets the value of the cargoExpertized property.
     * 
     * @return
     *     possible object is
     *     {@link ResearchResult }
     *     
     */
    public ResearchResult getCargoExpertized() {
        return cargoExpertized;
    }

    /**
     * Sets the value of the cargoExpertized property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResearchResult }
     *     
     */
    public void setCargoExpertized(ResearchResult value) {
        this.cargoExpertized = value;
    }

    /**
     * Gets the value of the locationProsperity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationProsperity() {
        return locationProsperity;
    }

    /**
     * Sets the value of the locationProsperity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationProsperity(String value) {
        this.locationProsperity = value;
    }

    /**
     * Gets the value of the animalSpentPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link AnimalSpentPeriod }
     *     
     */
    public AnimalSpentPeriod getAnimalSpentPeriod() {
        return animalSpentPeriod;
    }

    /**
     * Sets the value of the animalSpentPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalSpentPeriod }
     *     
     */
    public void setAnimalSpentPeriod(AnimalSpentPeriod value) {
        this.animalSpentPeriod = value;
    }

    /**
     * Gets the value of the monthsSpent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonthsSpent() {
        return monthsSpent;
    }

    /**
     * Sets the value of the monthsSpent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonthsSpent(String value) {
        this.monthsSpent = value;
    }

    /**
     * Gets the value of the laboratoryResearch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the laboratoryResearch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLaboratoryResearch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LaboratoryResearchEvent }
     * 
     * 
     */
    public List<LaboratoryResearchEvent> getLaboratoryResearch() {
        if (laboratoryResearch == null) {
            laboratoryResearch = new ArrayList<LaboratoryResearchEvent>();
        }
        return this.laboratoryResearch;
    }

    /**
     * Gets the value of the quarantine property.
     * 
     * @return
     *     possible object is
     *     {@link QuarantineEvent }
     *     
     */
    public QuarantineEvent getQuarantine() {
        return quarantine;
    }

    /**
     * Sets the value of the quarantine property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuarantineEvent }
     *     
     */
    public void setQuarantine(QuarantineEvent value) {
        this.quarantine = value;
    }

    /**
     * Gets the value of the immunization property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the immunization property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImmunization().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnimalMedicationEvent }
     * 
     * 
     */
    public List<AnimalMedicationEvent> getImmunization() {
        if (immunization == null) {
            immunization = new ArrayList<AnimalMedicationEvent>();
        }
        return this.immunization;
    }

    /**
     * Gets the value of the veterinaryEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the veterinaryEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVeterinaryEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VeterinaryEvent }
     * 
     * 
     */
    public List<VeterinaryEvent> getVeterinaryEvent() {
        if (veterinaryEvent == null) {
            veterinaryEvent = new ArrayList<VeterinaryEvent>();
        }
        return this.veterinaryEvent;
    }

    /**
     * Gets the value of the r13NClause property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the r13NClause property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getR13NClause().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegionalizationClause }
     * 
     * 
     */
    public List<RegionalizationClause> getR13NClause() {
        if (r13NClause == null) {
            r13NClause = new ArrayList<RegionalizationClause>();
        }
        return this.r13NClause;
    }

    /**
     * Gets the value of the specialMarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialMarks() {
        return specialMarks;
    }

    /**
     * Sets the value of the specialMarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialMarks(String value) {
        this.specialMarks = value;
    }

}
