
package ru.vetrf.api.schema.cdm.dictionary.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Address complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Address">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="country" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}Country" minOccurs="0"/>
 *         &lt;element name="federalDistrict" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}FederalDistrict" minOccurs="0"/>
 *         &lt;element name="region" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}Region" minOccurs="0"/>
 *         &lt;element name="district" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}District" minOccurs="0"/>
 *         &lt;element name="locality" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}Locality" minOccurs="0"/>
 *         &lt;element name="subLocality" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}Locality" minOccurs="0"/>
 *         &lt;element name="street" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}Street" minOccurs="0"/>
 *         &lt;element name="house" type="{http://api.vetrf.ru/schema/cdm/base}String255" minOccurs="0"/>
 *         &lt;element name="building" type="{http://api.vetrf.ru/schema/cdm/base}String255" minOccurs="0"/>
 *         &lt;element name="room" type="{http://api.vetrf.ru/schema/cdm/base}String255" minOccurs="0"/>
 *         &lt;element name="postIndex" type="{http://api.vetrf.ru/schema/cdm/base}String255" minOccurs="0"/>
 *         &lt;element name="postBox" type="{http://api.vetrf.ru/schema/cdm/base}String255" minOccurs="0"/>
 *         &lt;element name="additionalInfo" type="{http://api.vetrf.ru/schema/cdm/base}NText" minOccurs="0"/>
 *         &lt;element name="addressView" type="{http://api.vetrf.ru/schema/cdm/base}NText" minOccurs="0"/>
 *         &lt;element name="enAddressView" type="{http://api.vetrf.ru/schema/cdm/base}NText" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Address", propOrder = {
    "country",
    "federalDistrict",
    "region",
    "district",
    "locality",
    "subLocality",
    "street",
    "house",
    "building",
    "room",
    "postIndex",
    "postBox",
    "additionalInfo",
    "addressView",
    "enAddressView"
})
@XmlSeeAlso({
    Area.class
})
public class Address {

    protected Country country;
    protected FederalDistrict federalDistrict;
    protected Region region;
    protected District district;
    protected Locality locality;
    protected Locality subLocality;
    protected Street street;
    protected String house;
    protected String building;
    protected String room;
    protected String postIndex;
    protected String postBox;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String additionalInfo;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String addressView;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String enAddressView;

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link Country }
     *     
     */
    public Country getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link Country }
     *     
     */
    public void setCountry(Country value) {
        this.country = value;
    }

    /**
     * Gets the value of the federalDistrict property.
     * 
     * @return
     *     possible object is
     *     {@link FederalDistrict }
     *     
     */
    public FederalDistrict getFederalDistrict() {
        return federalDistrict;
    }

    /**
     * Sets the value of the federalDistrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link FederalDistrict }
     *     
     */
    public void setFederalDistrict(FederalDistrict value) {
        this.federalDistrict = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link Region }
     *     
     */
    public Region getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link Region }
     *     
     */
    public void setRegion(Region value) {
        this.region = value;
    }

    /**
     * Gets the value of the district property.
     * 
     * @return
     *     possible object is
     *     {@link District }
     *     
     */
    public District getDistrict() {
        return district;
    }

    /**
     * Sets the value of the district property.
     * 
     * @param value
     *     allowed object is
     *     {@link District }
     *     
     */
    public void setDistrict(District value) {
        this.district = value;
    }

    /**
     * Gets the value of the locality property.
     * 
     * @return
     *     possible object is
     *     {@link Locality }
     *     
     */
    public Locality getLocality() {
        return locality;
    }

    /**
     * Sets the value of the locality property.
     * 
     * @param value
     *     allowed object is
     *     {@link Locality }
     *     
     */
    public void setLocality(Locality value) {
        this.locality = value;
    }

    /**
     * Gets the value of the subLocality property.
     * 
     * @return
     *     possible object is
     *     {@link Locality }
     *     
     */
    public Locality getSubLocality() {
        return subLocality;
    }

    /**
     * Sets the value of the subLocality property.
     * 
     * @param value
     *     allowed object is
     *     {@link Locality }
     *     
     */
    public void setSubLocality(Locality value) {
        this.subLocality = value;
    }

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link Street }
     *     
     */
    public Street getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link Street }
     *     
     */
    public void setStreet(Street value) {
        this.street = value;
    }

    /**
     * Gets the value of the house property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouse() {
        return house;
    }

    /**
     * Sets the value of the house property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouse(String value) {
        this.house = value;
    }

    /**
     * Gets the value of the building property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuilding() {
        return building;
    }

    /**
     * Sets the value of the building property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuilding(String value) {
        this.building = value;
    }

    /**
     * Gets the value of the room property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoom() {
        return room;
    }

    /**
     * Sets the value of the room property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoom(String value) {
        this.room = value;
    }

    /**
     * Gets the value of the postIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostIndex() {
        return postIndex;
    }

    /**
     * Sets the value of the postIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostIndex(String value) {
        this.postIndex = value;
    }

    /**
     * Gets the value of the postBox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostBox() {
        return postBox;
    }

    /**
     * Sets the value of the postBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostBox(String value) {
        this.postBox = value;
    }

    /**
     * Gets the value of the additionalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Sets the value of the additionalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInfo(String value) {
        this.additionalInfo = value;
    }

    /**
     * Gets the value of the addressView property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressView() {
        return addressView;
    }

    /**
     * Sets the value of the addressView property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressView(String value) {
        this.addressView = value;
    }

    /**
     * Gets the value of the enAddressView property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnAddressView() {
        return enAddressView;
    }

    /**
     * Sets the value of the enAddressView property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnAddressView(String value) {
        this.enAddressView = value;
    }

}
