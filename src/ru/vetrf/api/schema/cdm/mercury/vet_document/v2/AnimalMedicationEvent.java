
package ru.vetrf.api.schema.cdm.mercury.vet_document.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.vetrf.api.schema.cdm.dictionary.v2.AnimalDisease;
import ru.vetrf.api.schema.cdm.dictionary.v2.MedicinalDrug;


/**
 * Сведения об обработке/иммунизации живого животного.
 * 
 * <p>Java class for AnimalMedicationEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnimalMedicationEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}VeterinaryEvent">
 *       &lt;sequence>
 *         &lt;element name="disease" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}AnimalDisease" minOccurs="0"/>
 *         &lt;element name="medicinalDrug" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}MedicinalDrug" minOccurs="0"/>
 *         &lt;element name="effectiveBeforeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnimalMedicationEvent", propOrder = {
    "disease",
    "medicinalDrug",
    "effectiveBeforeDate"
})
public class AnimalMedicationEvent
    extends VeterinaryEvent
{

    protected AnimalDisease disease;
    protected MedicinalDrug medicinalDrug;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effectiveBeforeDate;

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
     * Gets the value of the medicinalDrug property.
     * 
     * @return
     *     possible object is
     *     {@link MedicinalDrug }
     *     
     */
    public MedicinalDrug getMedicinalDrug() {
        return medicinalDrug;
    }

    /**
     * Sets the value of the medicinalDrug property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicinalDrug }
     *     
     */
    public void setMedicinalDrug(MedicinalDrug value) {
        this.medicinalDrug = value;
    }

    /**
     * Gets the value of the effectiveBeforeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveBeforeDate() {
        return effectiveBeforeDate;
    }

    /**
     * Sets the value of the effectiveBeforeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveBeforeDate(XMLGregorianCalendar value) {
        this.effectiveBeforeDate = value;
    }

}
