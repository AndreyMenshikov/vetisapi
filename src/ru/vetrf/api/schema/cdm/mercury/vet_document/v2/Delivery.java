
package ru.vetrf.api.schema.cdm.mercury.vet_document.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.vetrf.api.schema.cdm.base.GenericEntity;
import ru.vetrf.api.schema.cdm.dictionary.v2.BusinessEntity;
import ru.vetrf.api.schema.cdm.dictionary.v2.BusinessMember;
import ru.vetrf.api.schema.cdm.dictionary.v2.TransportationStorageType;


/**
 * Тип, описывающий поставку.
 * 
 * <p>Java class for Delivery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Delivery">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/base}GenericEntity">
 *       &lt;sequence>
 *         &lt;element name="deliveryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="consignor" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}BusinessMember" minOccurs="0"/>
 *         &lt;element name="consignee" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}BusinessMember" minOccurs="0"/>
 *         &lt;element name="consignment" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}Consignment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="broker" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}BusinessEntity" minOccurs="0"/>
 *         &lt;element name="transportInfo" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}TransportInfo" minOccurs="0"/>
 *         &lt;element name="transportStorageType" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}TransportationStorageType" minOccurs="0"/>
 *         &lt;element name="shipmentRoute" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}ShipmentRoute" minOccurs="0"/>
 *         &lt;element name="accompanyingForms" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}ConsignmentDocumentList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Delivery", propOrder = {
    "deliveryDate",
    "consignor",
    "consignee",
    "consignment",
    "broker",
    "transportInfo",
    "transportStorageType",
    "shipmentRoute",
    "accompanyingForms"
})
public class Delivery
    extends GenericEntity
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deliveryDate;
    protected BusinessMember consignor;
    protected BusinessMember consignee;
    protected List<Consignment> consignment;
    protected BusinessEntity broker;
    protected TransportInfo transportInfo;
    @XmlSchemaType(name = "string")
    protected TransportationStorageType transportStorageType;
    protected ShipmentRoute shipmentRoute;
    protected ConsignmentDocumentList accompanyingForms;

    /**
     * Gets the value of the deliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * Sets the value of the deliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeliveryDate(XMLGregorianCalendar value) {
        this.deliveryDate = value;
    }

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
     * Gets the value of the consignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Consignment }
     * 
     * 
     */
    public List<Consignment> getConsignment() {
        if (consignment == null) {
            consignment = new ArrayList<Consignment>();
        }
        return this.consignment;
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

    /**
     * Gets the value of the accompanyingForms property.
     * 
     * @return
     *     possible object is
     *     {@link ConsignmentDocumentList }
     *     
     */
    public ConsignmentDocumentList getAccompanyingForms() {
        return accompanyingForms;
    }

    /**
     * Sets the value of the accompanyingForms property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsignmentDocumentList }
     *     
     */
    public void setAccompanyingForms(ConsignmentDocumentList value) {
        this.accompanyingForms = value;
    }

}
