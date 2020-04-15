
package ru.vetrf.api.schema.cdm.dictionary.v2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.vetrf.api.schema.cdm.base.GenericVersioningEntity;


/**
 * Тип, описывающий ХС.
 * 
 * <p>Java class for BusinessEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessEntity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/base}GenericVersioningEntity">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}BusinessEntityType" minOccurs="0"/>
 *         &lt;element name="name" type="{http://api.vetrf.ru/schema/cdm/base}String255" minOccurs="0"/>
 *         &lt;element name="incorporationForm" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}IncorporationForm" minOccurs="0"/>
 *         &lt;element name="fullName" type="{http://api.vetrf.ru/schema/cdm/base}String255" minOccurs="0"/>
 *         &lt;element name="fio" type="{http://api.vetrf.ru/schema/cdm/base}String255" minOccurs="0"/>
 *         &lt;element name="passport" type="{http://api.vetrf.ru/schema/cdm/base}String255" minOccurs="0"/>
 *         &lt;element name="inn" type="{http://api.vetrf.ru/schema/cdm/base}String255" minOccurs="0"/>
 *         &lt;element name="kpp" type="{http://api.vetrf.ru/schema/cdm/base}String255" minOccurs="0"/>
 *         &lt;element name="ogrn" type="{http://api.vetrf.ru/schema/cdm/base}String255" minOccurs="0"/>
 *         &lt;element name="juridicalAddress" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}Address" minOccurs="0"/>
 *         &lt;element name="activityLocation" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="globalID" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}GLNType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="enterprise" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}Enterprise"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessEntity", propOrder = {
    "type",
    "name",
    "incorporationForm",
    "fullName",
    "fio",
    "passport",
    "inn",
    "kpp",
    "ogrn",
    "juridicalAddress",
    "activityLocation"
})
public class BusinessEntity
    extends GenericVersioningEntity
{

    protected BigInteger type;
    protected String name;
    protected IncorporationForm incorporationForm;
    protected String fullName;
    protected String fio;
    protected String passport;
    protected String inn;
    protected String kpp;
    protected String ogrn;
    protected Address juridicalAddress;
    protected List<BusinessEntity.ActivityLocation> activityLocation;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setType(BigInteger value) {
        this.type = value;
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
     * Gets the value of the incorporationForm property.
     * 
     * @return
     *     possible object is
     *     {@link IncorporationForm }
     *     
     */
    public IncorporationForm getIncorporationForm() {
        return incorporationForm;
    }

    /**
     * Sets the value of the incorporationForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncorporationForm }
     *     
     */
    public void setIncorporationForm(IncorporationForm value) {
        this.incorporationForm = value;
    }

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the fio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFio() {
        return fio;
    }

    /**
     * Sets the value of the fio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFio(String value) {
        this.fio = value;
    }

    /**
     * Gets the value of the passport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Sets the value of the passport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassport(String value) {
        this.passport = value;
    }

    /**
     * Gets the value of the inn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInn() {
        return inn;
    }

    /**
     * Sets the value of the inn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInn(String value) {
        this.inn = value;
    }

    /**
     * Gets the value of the kpp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKpp() {
        return kpp;
    }

    /**
     * Sets the value of the kpp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKpp(String value) {
        this.kpp = value;
    }

    /**
     * Gets the value of the ogrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOgrn() {
        return ogrn;
    }

    /**
     * Sets the value of the ogrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOgrn(String value) {
        this.ogrn = value;
    }

    /**
     * Gets the value of the juridicalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getJuridicalAddress() {
        return juridicalAddress;
    }

    /**
     * Sets the value of the juridicalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setJuridicalAddress(Address value) {
        this.juridicalAddress = value;
    }

    /**
     * Gets the value of the activityLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activityLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivityLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessEntity.ActivityLocation }
     * 
     * 
     */
    public List<BusinessEntity.ActivityLocation> getActivityLocation() {
        if (activityLocation == null) {
            activityLocation = new ArrayList<BusinessEntity.ActivityLocation>();
        }
        return this.activityLocation;
    }


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
     *         &lt;element name="globalID" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}GLNType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="enterprise" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}Enterprise"/>
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
        "globalID",
        "enterprise"
    })
    public static class ActivityLocation {

        protected List<String> globalID;
        @XmlElement(required = true)
        protected Enterprise enterprise;

        /**
         * Gets the value of the globalID property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the globalID property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGlobalID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getGlobalID() {
            if (globalID == null) {
                globalID = new ArrayList<String>();
            }
            return this.globalID;
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

    }

}
