
package ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.vetrf.api.schema.cdm.dictionary.v2.Enterprise;
import ru.vetrf.api.schema.cdm.mercury.vet_document.v2.ProductionOperation;
import ru.vetrf.api.schema.cdm.mercury.vet_document.v2.VetDocument;


/**
 * 
 *             Заявка на оформление производственной партии. Заявка поддерживает оформление "незавершенного" производства.
 *          
 * 
 * <p>Java class for RegisterProductionOperationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegisterProductionOperationRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/mercury/g2b/applications/v2}MercuryApplicationRequest">
 *       &lt;sequence>
 *         &lt;element name="enterprise" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}Enterprise"/>
 *         &lt;element name="productionOperation" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}ProductionOperation"/>
 *         &lt;element name="vetDocument" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}VetDocument" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisterProductionOperationRequest", propOrder = {
    "enterprise",
    "productionOperation",
    "vetDocument"
})
public class RegisterProductionOperationRequest
    extends MercuryApplicationRequest
{

    @XmlElement(required = true)
    protected Enterprise enterprise;
    @XmlElement(required = true)
    protected ProductionOperation productionOperation;
    protected List<VetDocument> vetDocument;

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
     * Gets the value of the productionOperation property.
     * 
     * @return
     *     possible object is
     *     {@link ProductionOperation }
     *     
     */
    public ProductionOperation getProductionOperation() {
        return productionOperation;
    }

    /**
     * Sets the value of the productionOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductionOperation }
     *     
     */
    public void setProductionOperation(ProductionOperation value) {
        this.productionOperation = value;
    }

    /**
     * Gets the value of the vetDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vetDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVetDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VetDocument }
     * 
     * 
     */
    public List<VetDocument> getVetDocument() {
        if (vetDocument == null) {
            vetDocument = new ArrayList<VetDocument>();
        }
        return this.vetDocument;
    }

}
