
package ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.vetrf.api.schema.cdm.dictionary.v2.Enterprise;
import ru.vetrf.api.schema.cdm.mercury.vet_document.v2.MergeStockEntriesOperation;


/**
 * Заявка на объединение записей журнала продукции.
 * 
 * <p>Java class for MergeStockEntriesRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MergeStockEntriesRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/mercury/g2b/applications/v2}MercuryApplicationRequest">
 *       &lt;sequence>
 *         &lt;element name="enterprise" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}Enterprise"/>
 *         &lt;element name="mergeOperation" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}MergeStockEntriesOperation"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MergeStockEntriesRequest", propOrder = {
    "enterprise",
    "mergeOperation"
})
public class MergeStockEntriesRequest
    extends MercuryApplicationRequest
{

    @XmlElement(required = true)
    protected Enterprise enterprise;
    @XmlElement(required = true)
    protected MergeStockEntriesOperation mergeOperation;

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
     * Gets the value of the mergeOperation property.
     * 
     * @return
     *     possible object is
     *     {@link MergeStockEntriesOperation }
     *     
     */
    public MergeStockEntriesOperation getMergeOperation() {
        return mergeOperation;
    }

    /**
     * Sets the value of the mergeOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MergeStockEntriesOperation }
     *     
     */
    public void setMergeOperation(MergeStockEntriesOperation value) {
        this.mergeOperation = value;
    }

}
