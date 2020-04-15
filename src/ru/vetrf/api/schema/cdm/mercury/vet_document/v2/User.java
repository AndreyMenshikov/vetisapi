
package ru.vetrf.api.schema.cdm.mercury.vet_document.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.vetrf.api.schema.cdm.base.GenericEntity;
import ru.vetrf.api.schema.cdm.dictionary.v2.BusinessEntity;
import ru.vetrf.api.schema.cdm.dictionary.v2.Organization;


/**
 * Тип, описывающий пользователя организации/учреждения.
 * 
 * <p>Java class for User complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="User">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/base}GenericEntity">
 *       &lt;sequence>
 *         &lt;element name="login" type="{http://www.w3.org/2001/XMLSchema}NCName" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://api.vetrf.ru/schema/cdm/base}String255" minOccurs="0"/>
 *         &lt;element name="middleName" type="{http://api.vetrf.ru/schema/cdm/base}String255" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://api.vetrf.ru/schema/cdm/base}String255" minOccurs="0"/>
 *         &lt;element name="fio" type="{http://api.vetrf.ru/schema/cdm/base}String255" minOccurs="0"/>
 *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="identity" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}Document" minOccurs="0"/>
 *         &lt;element name="citizenship" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}Citizenship" minOccurs="0"/>
 *         &lt;element name="snils" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}SNILSType" minOccurs="0"/>
 *         &lt;element name="phone" type="{http://api.vetrf.ru/schema/cdm/base}String255" minOccurs="0"/>
 *         &lt;element name="workPhone" type="{http://api.vetrf.ru/schema/cdm/base}String255" minOccurs="0"/>
 *         &lt;element name="email" type="{http://api.vetrf.ru/schema/cdm/base}String255" minOccurs="0"/>
 *         &lt;element name="workEmail" type="{http://api.vetrf.ru/schema/cdm/base}String255" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="organization" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}Organization" minOccurs="0"/>
 *           &lt;element name="businessEntity" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}BusinessEntity" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="post" type="{http://api.vetrf.ru/schema/cdm/base}String255" minOccurs="0"/>
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="nonExpired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="nonLocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="authorityList" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}AuthorityList" minOccurs="0"/>
 *         &lt;element name="workingAreaList" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}WorkingAreaList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "User", propOrder = {
    "login",
    "firstName",
    "middleName",
    "lastName",
    "fio",
    "birthDate",
    "identity",
    "citizenship",
    "snils",
    "phone",
    "workPhone",
    "email",
    "workEmail",
    "organization",
    "businessEntity",
    "post",
    "enabled",
    "nonExpired",
    "nonLocked",
    "authorityList",
    "workingAreaList"
})
public class User
    extends GenericEntity
{

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String login;
    protected String firstName;
    protected String middleName;
    protected String lastName;
    protected String fio;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthDate;
    protected Document identity;
    protected Citizenship citizenship;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String snils;
    protected String phone;
    protected String workPhone;
    protected String email;
    protected String workEmail;
    protected Organization organization;
    protected BusinessEntity businessEntity;
    protected String post;
    protected Boolean enabled;
    protected Boolean nonExpired;
    protected Boolean nonLocked;
    protected AuthorityList authorityList;
    protected WorkingAreaList workingAreaList;

    /**
     * Gets the value of the login property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogin() {
        return login;
    }

    /**
     * Sets the value of the login property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogin(String value) {
        this.login = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
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
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDate(XMLGregorianCalendar value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the identity property.
     * 
     * @return
     *     possible object is
     *     {@link Document }
     *     
     */
    public Document getIdentity() {
        return identity;
    }

    /**
     * Sets the value of the identity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Document }
     *     
     */
    public void setIdentity(Document value) {
        this.identity = value;
    }

    /**
     * Gets the value of the citizenship property.
     * 
     * @return
     *     possible object is
     *     {@link Citizenship }
     *     
     */
    public Citizenship getCitizenship() {
        return citizenship;
    }

    /**
     * Sets the value of the citizenship property.
     * 
     * @param value
     *     allowed object is
     *     {@link Citizenship }
     *     
     */
    public void setCitizenship(Citizenship value) {
        this.citizenship = value;
    }

    /**
     * Gets the value of the snils property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnils() {
        return snils;
    }

    /**
     * Sets the value of the snils property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnils(String value) {
        this.snils = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the workPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkPhone() {
        return workPhone;
    }

    /**
     * Sets the value of the workPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkPhone(String value) {
        this.workPhone = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the workEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkEmail() {
        return workEmail;
    }

    /**
     * Sets the value of the workEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkEmail(String value) {
        this.workEmail = value;
    }

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link Organization }
     *     
     */
    public Organization getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organization }
     *     
     */
    public void setOrganization(Organization value) {
        this.organization = value;
    }

    /**
     * Gets the value of the businessEntity property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessEntity }
     *     
     */
    public BusinessEntity getBusinessEntity() {
        return businessEntity;
    }

    /**
     * Sets the value of the businessEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessEntity }
     *     
     */
    public void setBusinessEntity(BusinessEntity value) {
        this.businessEntity = value;
    }

    /**
     * Gets the value of the post property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPost() {
        return post;
    }

    /**
     * Sets the value of the post property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPost(String value) {
        this.post = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnabled(Boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the nonExpired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonExpired() {
        return nonExpired;
    }

    /**
     * Sets the value of the nonExpired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNonExpired(Boolean value) {
        this.nonExpired = value;
    }

    /**
     * Gets the value of the nonLocked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonLocked() {
        return nonLocked;
    }

    /**
     * Sets the value of the nonLocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNonLocked(Boolean value) {
        this.nonLocked = value;
    }

    /**
     * Gets the value of the authorityList property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorityList }
     *     
     */
    public AuthorityList getAuthorityList() {
        return authorityList;
    }

    /**
     * Sets the value of the authorityList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorityList }
     *     
     */
    public void setAuthorityList(AuthorityList value) {
        this.authorityList = value;
    }

    /**
     * Gets the value of the workingAreaList property.
     * 
     * @return
     *     possible object is
     *     {@link WorkingAreaList }
     *     
     */
    public WorkingAreaList getWorkingAreaList() {
        return workingAreaList;
    }

    /**
     * Sets the value of the workingAreaList property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkingAreaList }
     *     
     */
    public void setWorkingAreaList(WorkingAreaList value) {
        this.workingAreaList = value;
    }

}
