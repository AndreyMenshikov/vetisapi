
package ru.vetrf.api.schema.cdm.mercury.vet_document.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ru.vetrf.api.schema.cdm.base.RegisterModificationType;
import ru.vetrf.api.schema.cdm.dictionary.v2.BusinessEntityList;


/**
 * Операция внесения изменений в реестр ХС.
 * 
 * <p>Java class for BEModificationOperation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BEModificationOperation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://api.vetrf.ru/schema/cdm/base}RegisterModificationType"/>
 *         &lt;element name="affectedList" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}BusinessEntityList" minOccurs="0"/>
 *         &lt;element name="resultingList" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}BusinessEntityList" minOccurs="0"/>
 *         &lt;element name="reason" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}BEModificationReason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BEModificationOperation", propOrder = {
    "type",
    "affectedList",
    "resultingList",
    "reason"
})
public class BEModificationOperation {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected RegisterModificationType type;
    protected BusinessEntityList affectedList;
    protected BusinessEntityList resultingList;
    protected String reason;

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
     * Gets the value of the affectedList property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessEntityList }
     *     
     */
    public BusinessEntityList getAffectedList() {
        return affectedList;
    }

    /**
     * Sets the value of the affectedList property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessEntityList }
     *     
     */
    public void setAffectedList(BusinessEntityList value) {
        this.affectedList = value;
    }

    /**
     * Gets the value of the resultingList property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessEntityList }
     *     
     */
    public BusinessEntityList getResultingList() {
        return resultingList;
    }

    /**
     * Sets the value of the resultingList property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessEntityList }
     *     
     */
    public void setResultingList(BusinessEntityList value) {
        this.resultingList = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

}
