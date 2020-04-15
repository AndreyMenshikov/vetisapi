
package ru.vetrf.api.schema.cdm.mercury.vet_document.v2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип, описывающий информацию о транспорте.
 * 
 * <p>Java class for TransportInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransportInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transportType" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}TransportType" minOccurs="0"/>
 *         &lt;element name="transportNumber" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}TransportNumber" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportInfo", propOrder = {
    "transportType",
    "transportNumber"
})
public class TransportInfo {

    protected BigInteger transportType;
    protected TransportNumber transportNumber;

    /**
     * Gets the value of the transportType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTransportType() {
        return transportType;
    }

    /**
     * Sets the value of the transportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTransportType(BigInteger value) {
        this.transportType = value;
    }

    /**
     * Gets the value of the transportNumber property.
     * 
     * @return
     *     possible object is
     *     {@link TransportNumber }
     *     
     */
    public TransportNumber getTransportNumber() {
        return transportNumber;
    }

    /**
     * Sets the value of the transportNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportNumber }
     *     
     */
    public void setTransportNumber(TransportNumber value) {
        this.transportNumber = value;
    }

}
