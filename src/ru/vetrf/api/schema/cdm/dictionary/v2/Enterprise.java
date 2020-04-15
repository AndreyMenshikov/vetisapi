
package ru.vetrf.api.schema.cdm.dictionary.v2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ru.vetrf.api.schema.cdm.base.GenericVersioningEntity;


/**
 * Тип, описывающий предприятие.
 *          
 * 
 * <p>Java class for Enterprise complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Enterprise">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/base}GenericVersioningEntity">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://api.vetrf.ru/schema/cdm/base}String255" minOccurs="0"/>
 *         &lt;element name="englishName" type="{http://api.vetrf.ru/schema/cdm/base}String255" minOccurs="0"/>
 *         &lt;element name="type" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}EnterpriseType" minOccurs="0"/>
 *         &lt;element name="numberList" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}EnterpriseNumberList" minOccurs="0"/>
 *         &lt;element name="address" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}Address" minOccurs="0"/>
 *         &lt;element name="activityList" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}EnterpriseActivityList" minOccurs="0"/>
 *         &lt;element name="owner" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}BusinessEntity" minOccurs="0"/>
 *         &lt;element name="officialRegistration" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}EnterpriseOfficialRegistration" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="registryStatus" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}EnterpriseStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Enterprise", propOrder = {
    "name",
    "englishName",
    "type",
    "numberList",
    "address",
    "activityList",
    "owner",
    "officialRegistration",
    "registryStatus"
})
public class Enterprise
    extends GenericVersioningEntity
{

    protected String name;
    protected String englishName;
    protected BigInteger type;
    protected EnterpriseNumberList numberList;
    protected Address address;
    protected EnterpriseActivityList activityList;
    protected BusinessEntity owner;
    protected List<EnterpriseOfficialRegistration> officialRegistration;
    @XmlSchemaType(name = "token")
    protected EnterpriseStatus registryStatus;

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
     * Gets the value of the englishName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnglishName() {
        return englishName;
    }

    /**
     * Sets the value of the englishName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnglishName(String value) {
        this.englishName = value;
    }

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
     * Gets the value of the numberList property.
     * 
     * @return
     *     possible object is
     *     {@link EnterpriseNumberList }
     *     
     */
    public EnterpriseNumberList getNumberList() {
        return numberList;
    }

    /**
     * Sets the value of the numberList property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnterpriseNumberList }
     *     
     */
    public void setNumberList(EnterpriseNumberList value) {
        this.numberList = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the activityList property.
     * 
     * @return
     *     possible object is
     *     {@link EnterpriseActivityList }
     *     
     */
    public EnterpriseActivityList getActivityList() {
        return activityList;
    }

    /**
     * Sets the value of the activityList property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnterpriseActivityList }
     *     
     */
    public void setActivityList(EnterpriseActivityList value) {
        this.activityList = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessEntity }
     *     
     */
    public BusinessEntity getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessEntity }
     *     
     */
    public void setOwner(BusinessEntity value) {
        this.owner = value;
    }

    /**
     * Gets the value of the officialRegistration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the officialRegistration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfficialRegistration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnterpriseOfficialRegistration }
     * 
     * 
     */
    public List<EnterpriseOfficialRegistration> getOfficialRegistration() {
        if (officialRegistration == null) {
            officialRegistration = new ArrayList<EnterpriseOfficialRegistration>();
        }
        return this.officialRegistration;
    }

    /**
     * Gets the value of the registryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link EnterpriseStatus }
     *     
     */
    public EnterpriseStatus getRegistryStatus() {
        return registryStatus;
    }

    /**
     * Sets the value of the registryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnterpriseStatus }
     *     
     */
    public void setRegistryStatus(EnterpriseStatus value) {
        this.registryStatus = value;
    }

}
