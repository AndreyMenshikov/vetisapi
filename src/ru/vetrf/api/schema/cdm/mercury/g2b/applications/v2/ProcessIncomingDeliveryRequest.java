
package ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.vetrf.api.schema.cdm.mercury.vet_document.v2.Delivery;
import ru.vetrf.api.schema.cdm.mercury.vet_document.v2.DeliveryFactList;


/**
 * Заявка на оформление входящей поставки.
 *             Предназначена для пакетного гашения электронных ВСД в случае полной приёмки или полного возврата,
 *             не предусматривающих создание акта расхождений.
 *             Максимальное допустимое количество входящих ВСД (партий) в запросе -- 50 (уточнить значение).
 *          
 * 
 * <p>Java class for ProcessIncomingDeliveryRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessIncomingDeliveryRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/mercury/g2b/applications/v2}MercuryApplicationRequest">
 *       &lt;sequence>
 *         &lt;element name="delivery" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}Delivery"/>
 *         &lt;element name="deliveryFacts" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}DeliveryFactList"/>
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
@XmlType(name = "ProcessIncomingDeliveryRequest", propOrder = {
    "delivery",
    "deliveryFacts",
    "returnedDelivery"
})
public class ProcessIncomingDeliveryRequest
    extends MercuryApplicationRequest
{

    @XmlElement(required = true)
    protected Delivery delivery;
    @XmlElement(required = true)
    protected DeliveryFactList deliveryFacts;
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
