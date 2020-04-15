
package ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.vetrf.api.schema.cdm.mercury.vet_document.v2.Delivery;
import ru.vetrf.api.schema.cdm.mercury.vet_document.v2.DeliveryFactList;
import ru.vetrf.api.schema.cdm.mercury.vet_document.v2.DiscrepancyReport;


/**
 * Заявка на оформление входящей партии.
 * 
 * <p>Java class for ProcessIncomingConsignmentRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessIncomingConsignmentRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/mercury/g2b/applications/v2}MercuryApplicationRequest">
 *       &lt;sequence>
 *         &lt;element name="delivery" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}Delivery"/>
 *         &lt;element name="deliveryFacts" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}DeliveryFactList"/>
 *         &lt;element name="discrepancyReport" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}DiscrepancyReport" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="returnedDelivery" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}Delivery" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessIncomingConsignmentRequest", propOrder = {
    "delivery",
    "deliveryFacts",
    "discrepancyReport",
    "returnedDelivery"
})
public class ProcessIncomingConsignmentRequest
    extends MercuryApplicationRequest
{

    @XmlElement(required = true)
    protected Delivery delivery;
    @XmlElement(required = true)
    protected DeliveryFactList deliveryFacts;
    protected List<DiscrepancyReport> discrepancyReport;
    protected Delivery returnedDelivery;

    /**
     * Gets the value of the delivery property.
     * 
     * @return
     *     possible object is
     *     {@link Delivery }
     *     
     */
    public Delivery getDelivery() {
        return delivery;
    }

    /**
     * Sets the value of the delivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link Delivery }
     *     
     */
    public void setDelivery(Delivery value) {
        this.delivery = value;
    }

    /**
     * Gets the value of the deliveryFacts property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryFactList }
     *     
     */
    public DeliveryFactList getDeliveryFacts() {
        return deliveryFacts;
    }

    /**
     * Sets the value of the deliveryFacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryFactList }
     *     
     */
    public void setDeliveryFacts(DeliveryFactList value) {
        this.deliveryFacts = value;
    }

    /**
     * Gets the value of the discrepancyReport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discrepancyReport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscrepancyReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiscrepancyReport }
     * 
     * 
     */
    public List<DiscrepancyReport> getDiscrepancyReport() {
        if (discrepancyReport == null) {
            discrepancyReport = new ArrayList<DiscrepancyReport>();
        }
        return this.discrepancyReport;
    }

    /**
     * Gets the value of the returnedDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link Delivery }
     *     
     */
    public Delivery getReturnedDelivery() {
        return returnedDelivery;
    }

    /**
     * Sets the value of the returnedDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link Delivery }
     *     
     */
    public void setReturnedDelivery(Delivery value) {
        this.returnedDelivery = value;
    }

}
