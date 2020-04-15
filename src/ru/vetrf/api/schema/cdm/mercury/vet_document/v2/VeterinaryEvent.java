
package ru.vetrf.api.schema.cdm.mercury.vet_document.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.vetrf.api.schema.cdm.dictionary.v2.Enterprise;
import ru.vetrf.api.schema.cdm.dictionary.v2.Location;
import ru.vetrf.api.schema.cdm.dictionary.v2.Organization;


/**
 * Некое событие или мероприятие, ассоциированное с партией продукции (или ЖЖ).
 *             Например, лабораторное исследование, ВСЭ, произведенная обработка или иммунизация животного и т.д.
 *          
 * 
 * <p>Java class for VeterinaryEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VeterinaryEvent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://api.vetrf.ru/schema/cdm/base}Identifier" minOccurs="0"/>
 *         &lt;element name="name" type="{http://api.vetrf.ru/schema/cdm/base}String255" minOccurs="0"/>
 *         &lt;element name="type" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}VeterinaryEventType" minOccurs="0"/>
 *         &lt;element name="actualDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="location" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}Location" minOccurs="0"/>
 *           &lt;element name="enterprise" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}Enterprise" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="operator" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}Organization" minOccurs="0"/>
 *         &lt;element name="referencedDocument" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}Document" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="notes" type="{http://api.vetrf.ru/schema/cdm/base}Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VeterinaryEvent", propOrder = {
    "id",
    "name",
    "type",
    "actualDateTime",
    "location",
    "enterprise",
    "operator",
    "referencedDocument",
    "notes"
})
@XmlSeeAlso({
    QuarantineEvent.class,
    LaboratoryResearchEvent.class,
    AnimalMedicationEvent.class
})
public class VeterinaryEvent {

    @XmlElement(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String id;
    protected String name;
    @XmlSchemaType(name = "string")
    protected VeterinaryEventType type;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualDateTime;
    protected Location location;
    protected Enterprise enterprise;
    protected Organization operator;
    protected List<Document> referencedDocument;
    protected String notes;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link VeterinaryEventType }
     *     
     */
    public VeterinaryEventType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link VeterinaryEventType }
     *     
     */
    public void setType(VeterinaryEventType value) {
        this.type = value;
    }

    /**
     * Gets the value of the actualDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualDateTime() {
        return actualDateTime;
    }

    /**
     * Sets the value of the actualDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualDateTime(XMLGregorianCalendar value) {
        this.actualDateTime = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setLocation(Location value) {
        this.location = value;
    }

    /**
     * Gets the value of the enterprise property.
     * 
     * @return
     *     possible object is
     *     {@link Enterprise }
     *     
     */
    public Enterprise getEnterprise() {
        return enterprise;
    }

    /**
     * Sets the value of the enterprise property.
     * 
     * @param value
     *     allowed object is
     *     {@link Enterprise }
     *     
     */
    public void setEnterprise(Enterprise value) {
        this.enterprise = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link Organization }
     *     
     */
    public Organization getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organization }
     *     
     */
    public void setOperator(Organization value) {
        this.operator = value;
    }

    /**
     * Gets the value of the referencedDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referencedDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferencedDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Document }
     * 
     * 
     */
    public List<Document> getReferencedDocument() {
        if (referencedDocument == null) {
            referencedDocument = new ArrayList<Document>();
        }
        return this.referencedDocument;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

}
