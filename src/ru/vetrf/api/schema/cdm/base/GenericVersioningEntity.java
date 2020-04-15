
package ru.vetrf.api.schema.cdm.base;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.vetrf.api.schema.cdm.dictionary.v2.AddressObjectView;
import ru.vetrf.api.schema.cdm.dictionary.v2.AnimalDisease;
import ru.vetrf.api.schema.cdm.dictionary.v2.BusinessEntity;
import ru.vetrf.api.schema.cdm.dictionary.v2.Country;
import ru.vetrf.api.schema.cdm.dictionary.v2.Enterprise;
import ru.vetrf.api.schema.cdm.dictionary.v2.FederalDistrict;
import ru.vetrf.api.schema.cdm.dictionary.v2.Indicator;
import ru.vetrf.api.schema.cdm.dictionary.v2.PackingType;
import ru.vetrf.api.schema.cdm.dictionary.v2.Product;
import ru.vetrf.api.schema.cdm.dictionary.v2.ProductItem;
import ru.vetrf.api.schema.cdm.dictionary.v2.Purpose;
import ru.vetrf.api.schema.cdm.dictionary.v2.RegionalizationCondition;
import ru.vetrf.api.schema.cdm.dictionary.v2.RegionalizationRegionStatus;
import ru.vetrf.api.schema.cdm.dictionary.v2.RegionalizationShippingRule;
import ru.vetrf.api.schema.cdm.dictionary.v2.ResearchMethod;
import ru.vetrf.api.schema.cdm.dictionary.v2.SubProduct;
import ru.vetrf.api.schema.cdm.dictionary.v2.Unit;


/**
 * Тип, базовый для сущностей, поддерживающих версии.
 *          
 * 
 * <p>Java class for GenericVersioningEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenericVersioningEntity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/base}GenericEntity">
 *       &lt;sequence>
 *         &lt;element name="guid" type="{http://api.vetrf.ru/schema/cdm/base}UUID" minOccurs="0"/>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="last" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="status" type="{http://api.vetrf.ru/schema/cdm/base}VersionStatus" minOccurs="0"/>
 *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="updateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="previous" type="{http://api.vetrf.ru/schema/cdm/base}UUID" minOccurs="0"/>
 *         &lt;element name="next" type="{http://api.vetrf.ru/schema/cdm/base}UUID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericVersioningEntity", propOrder = {
    "guid",
    "active",
    "last",
    "status",
    "createDate",
    "updateDate",
    "previous",
    "next"
})
@XmlSeeAlso({
    Enterprise.class,
    Purpose.class,
    SubProduct.class,
    ResearchMethod.class,
    Product.class,
    BusinessEntity.class,
    AnimalDisease.class,
    Country.class,
    ProductItem.class,
    Unit.class,
    PackingType.class,
    RegionalizationRegionStatus.class,
    RegionalizationCondition.class,
    AddressObjectView.class,
    FederalDistrict.class,
    Indicator.class,
    RegionalizationShippingRule.class
})
public class GenericVersioningEntity
    extends GenericEntity
{

    protected String guid;
    protected Boolean active;
    protected Boolean last;
    protected BigInteger status;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateDate;
    protected String previous;
    protected String next;

    /**
     * Gets the value of the guid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuid() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuid(String value) {
        this.guid = value;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the last property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLast() {
        return last;
    }

    /**
     * Sets the value of the last property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLast(Boolean value) {
        this.last = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStatus(BigInteger value) {
        this.status = value;
    }

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDate(XMLGregorianCalendar value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the updateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateDate() {
        return updateDate;
    }

    /**
     * Sets the value of the updateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateDate(XMLGregorianCalendar value) {
        this.updateDate = value;
    }

    /**
     * Gets the value of the previous property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrevious() {
        return previous;
    }

    /**
     * Sets the value of the previous property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrevious(String value) {
        this.previous = value;
    }

    /**
     * Gets the value of the next property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNext() {
        return next;
    }

    /**
     * Sets the value of the next property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNext(String value) {
        this.next = value;
    }

}
