
package ru.vetrf.api.schema.cdm.mercury.vet_document.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ru.vetrf.api.schema.cdm.base.RegisterModificationType;
import ru.vetrf.api.schema.cdm.dictionary.v2.BusinessEntity;
import ru.vetrf.api.schema.cdm.dictionary.v2.Enterprise;


/**
 * Операция изменения связи между хозяйствующим субъектом и предприятиями.
 * 
 * <p>Java class for BEActivityLocationsModificationOperation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BEActivityLocationsModificationOperation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://api.vetrf.ru/schema/cdm/base}RegisterModificationType"/>
 *         &lt;element name="businessEntity" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}BusinessEntity"/>
 *         &lt;element name="activityLocation" maxOccurs="unbounded">
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
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BEActivityLocationsModificationOperation", propOrder = {
    "type",
    "businessEntity",
    "activityLocation"
})
public class BEActivityLocationsModificationOperation {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected RegisterModificationType type;
    @XmlElement(required = true)
    protected BusinessEntity businessEntity;
    @XmlElement(required = true)
    protected List<BEActivityLocationsModificationOperation.ActivityLocation> activityLocation;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterModificationType }
     *     
     */
    public RegisterModificationType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterModificationType }
     *     
     */
    public void setType(RegisterModificationType value) {
        this.type = value;
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
     * {@link BEActivityLocationsModificationOperation.ActivityLocation }
     * 
     * 
     */
    public List<BEActivityLocationsModificationOperation.ActivityLocation> getActivityLocation() {
        if (activityLocation == null) {
            activityLocation = new ArrayList<BEActivityLocationsModificationOperation.ActivityLocation>();
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
