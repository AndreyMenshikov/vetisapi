
package ru.vetrf.api.schema.cdm.mercury.vet_document.v2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import ru.vetrf.api.schema.cdm.base.GenericEntity;
import ru.vetrf.api.schema.cdm.dictionary.v2.Enterprise;
import ru.vetrf.api.schema.cdm.dictionary.v2.Location;


/**
 * Сведения о точке маршрута
 * 
 * <p>Java class for ShipmentRoutePoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentRoutePoint">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/base}GenericEntity">
 *       &lt;sequence>
 *         &lt;element name="sqnId" type="{http://api.vetrf.ru/schema/cdm/base}SequenceNumber" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="location" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}Location" minOccurs="0"/>
 *           &lt;element name="enterprise" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}Enterprise" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="transshipment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="nextTransport" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}TransportInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentRoutePoint", propOrder = {
    "sqnId",
    "location",
    "enterprise",
    "transshipment",
    "nextTransport"
})
public class ShipmentRoutePoint
    extends GenericEntity
{

    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger sqnId;
    protected Location location;
    protected Enterprise enterprise;
    protected Boolean transshipment;
    protected TransportInfo nextTransport;

    /**
     * Gets the value of the sqnId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSqnId() {
        return sqnId;
    }

    /**
     * Sets the value of the sqnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSqnId(BigInteger value) {
        this.sqnId = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setLocation(Location value) {
        this.location = value;
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

    /**
     * Gets the value of the transshipment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTransshipment() {
        return transshipment;
    }

    /**
     * Sets the value of the transshipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTransshipment(Boolean value) {
        this.transshipment = value;
    }

    /**
     * Gets the value of the nextTransport property.
     * 
     * @return
     *     possible object is
     *     {@link TransportInfo }
     *     
     */
    public TransportInfo getNextTransport() {
        return nextTransport;
    }

    /**
     * Sets the value of the nextTransport property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportInfo }
     *     
     */
    public void setNextTransport(TransportInfo value) {
        this.nextTransport = value;
    }

}
