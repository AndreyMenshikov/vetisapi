
package ru.vetrf.api.schema.cdm.mercury.vet_document.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Список мероприятий с партией продукции.
 * 
 * <p>Java class for StockEntryEventList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StockEntryEventList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="laboratoryResearch" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}LaboratoryResearchEvent" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="quarantine" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}QuarantineEvent" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="immunization" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}AnimalMedicationEvent" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="veterinaryEvent" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}VeterinaryEvent" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StockEntryEventList", propOrder = {
    "laboratoryResearch",
    "quarantine",
    "immunization",
    "veterinaryEvent"
})
public class StockEntryEventList {

    protected List<LaboratoryResearchEvent> laboratoryResearch;
    protected List<QuarantineEvent> quarantine;
    protected List<AnimalMedicationEvent> immunization;
    protected List<VeterinaryEvent> veterinaryEvent;

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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quarantine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuarantine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuarantineEvent }
     * 
     * 
     */
    public List<QuarantineEvent> getQuarantine() {
        if (quarantine == null) {
            quarantine = new ArrayList<QuarantineEvent>();
        }
        return this.quarantine;
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

}
