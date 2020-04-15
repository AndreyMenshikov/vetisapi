
package ru.vetrf.api.schema.cdm.mercury.vet_document.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ru.vetrf.api.schema.cdm.dictionary.v2.BusinessEntity;
import ru.vetrf.api.schema.cdm.dictionary.v2.BusinessMember;
import ru.vetrf.api.schema.cdm.dictionary.v2.TransportationStorageType;


/**
 * Товарно-транспортная накладная.
 * 
 * <p>Java class for Waybill complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Waybill">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}Document">
 *       &lt;sequence>
 *         &lt;element name="consignor" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}BusinessMember" minOccurs="0"/>
 *         &lt;element name="consignee" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}BusinessMember" minOccurs="0"/>
 *         &lt;element name="broker" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}BusinessEntity" minOccurs="0"/>
 *         &lt;element name="transportInfo" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}TransportInfo" minOccurs="0"/>
 *         &lt;element name="transportStorageType" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}TransportationStorageType" minOccurs="0"/>
 *         &lt;element name="shipmentRoute" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}ShipmentRoute" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Waybill", propOrder = {
    "consignor",
    "consignee",
    "broker",
    "transportInfo",
    "transportStorageType",
    "shipmentRoute"
})
public class Waybill
    extends Document
{

    protected BusinessMember consignor;
    protected BusinessMember consignee;
    protected BusinessEntity broker;
    protected TransportInfo transportInfo;
    @XmlSchemaType(name = "string")
    protected TransportationStorageType transportStorageType;
    protected ShipmentRoute shipmentRoute;

    /**
     * Gets the value of the consignor property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessMember }
     *     
     */
    public BusinessMember getConsignor() {
        return consignor;
    }

    /**
     * Sets the value of the consignor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessMember }
     *     
     */
    public void setConsignor(BusinessMember value) {
        this.consignor = value;
    }

    /**
     * Gets the value of the consignee property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessMember }
     *     
     */
    public BusinessMember getConsignee() {
        return consignee;
    }

    /**
     * Sets the value of the consignee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessMember }
     *     
     */
    public void setConsignee(BusinessMember value) {
        this.consignee = value;
    }

    /**
     * Gets the value of the broker property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessEntity }
     *     
     */
    public BusinessEntity getBroker() {
        return broker;
    }

    /**
     * Sets the value of the broker property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessEntity }
     *     
     */
    public void setBroker(BusinessEntity value) {
        this.broker = value;
    }

    /**
     * Gets the value of the transportInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TransportInfo }
     *     
     */
    public TransportInfo getTransportInfo() {
        return transportInfo;
    }

    /**
     * Sets the value of the transportInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportInfo }
     *     
     */
    public void setTransportInfo(TransportInfo value) {
        this.transportInfo = value;
    }

    /**
     * Gets the value of the transportStorageType property.
     * 
     * @return
     *     possible object is
     *     {@link TransportationStorageType }
     *     
     */
    public TransportationStorageType getTransportStorageType() {
        return transportStorageType;
    }

    /**
     * Sets the value of the transportStorageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportationStorageType }
     *     
     */
    public void setTransportStorageType(TransportationStorageType value) {
        this.transportStorageType = value;
    }

    /**
     * Gets the value of the shipmentRoute property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentRoute }
     *     
     */
    public ShipmentRoute getShipmentRoute() {
        return shipmentRoute;
    }

    /**
     * Sets the value of the shipmentRoute property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentRoute }
     *     
     */
    public void setShipmentRoute(ShipmentRoute value) {
        this.shipmentRoute = value;
    }

}
