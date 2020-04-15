
package ru.vetrf.api.schema.cdm.mercury.vet_document.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ru.vetrf.api.schema.cdm.base.RegisterModificationType;
import ru.vetrf.api.schema.cdm.dictionary.v2.ProductItemList;


/**
 * Операция внесения изменений в реестр наименований продукции производителя.
 *          
 * 
 * <p>Java class for PSLModificationOperation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PSLModificationOperation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://api.vetrf.ru/schema/cdm/base}RegisterModificationType"/>
 *         &lt;element name="affectedList" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}ProductItemList" minOccurs="0"/>
 *         &lt;element name="resultingList" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}ProductItemList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PSLModificationOperation", propOrder = {
    "type",
    "affectedList",
    "resultingList"
})
public class PSLModificationOperation {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected RegisterModificationType type;
    protected ProductItemList affectedList;
    protected ProductItemList resultingList;

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
     *     {@link ProductItemList }
     *     
     */
    public ProductItemList getAffectedList() {
        return affectedList;
    }

    /**
     * Sets the value of the affectedList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductItemList }
     *     
     */
    public void setAffectedList(ProductItemList value) {
        this.affectedList = value;
    }

    /**
     * Gets the value of the resultingList property.
     * 
     * @return
     *     possible object is
     *     {@link ProductItemList }
     *     
     */
    public ProductItemList getResultingList() {
        return resultingList;
    }

    /**
     * Sets the value of the resultingList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductItemList }
     *     
     */
    public void setResultingList(ProductItemList value) {
        this.resultingList = value;
    }

}
