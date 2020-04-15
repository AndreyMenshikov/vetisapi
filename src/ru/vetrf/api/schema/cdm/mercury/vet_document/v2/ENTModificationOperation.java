
package ru.vetrf.api.schema.cdm.mercury.vet_document.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ru.vetrf.api.schema.cdm.base.RegisterModificationType;
import ru.vetrf.api.schema.cdm.dictionary.v2.EnterpriseList;


/**
 * Операция внесения изменений в реестр предприятий.
 * 
 * <p>Java class for ENTModificationOperation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ENTModificationOperation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://api.vetrf.ru/schema/cdm/base}RegisterModificationType"/>
 *         &lt;element name="affectedList" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}EnterpriseList" minOccurs="0"/>
 *         &lt;element name="resultingList" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}EnterpriseList" minOccurs="0"/>
 *         &lt;element name="reason" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}ENTModificationReason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENTModificationOperation", propOrder = {
    "type",
    "affectedList",
    "resultingList",
    "reason"
})
public class ENTModificationOperation {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected RegisterModificationType type;
    protected EnterpriseList affectedList;
    protected EnterpriseList resultingList;
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
     *     {@link EnterpriseList }
     *     
     */
    public EnterpriseList getAffectedList() {
        return affectedList;
    }

    /**
     * Sets the value of the affectedList property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnterpriseList }
     *     
     */
    public void setAffectedList(EnterpriseList value) {
        this.affectedList = value;
    }

    /**
     * Gets the value of the resultingList property.
     * 
     * @return
     *     possible object is
     *     {@link EnterpriseList }
     *     
     */
    public EnterpriseList getResultingList() {
        return resultingList;
    }

    /**
     * Sets the value of the resultingList property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnterpriseList }
     *     
     */
    public void setResultingList(EnterpriseList value) {
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
