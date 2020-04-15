
package ru.vetrf.api.schema.cdm.mercury.vet_document.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип, описывающий список пунктов перегрузки груза.
 * 
 * <p>Java class for ShipmentRoute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentRoute">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="routePoint" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}ShipmentRoutePoint" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentRoute", propOrder = {
    "routePoint"
})
public class ShipmentRoute {

    protected List<ShipmentRoutePoint> routePoint;

    /**
     * Gets the value of the routePoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routePoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoutePoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentRoutePoint }
     * 
     * 
     */
    public List<ShipmentRoutePoint> getRoutePoint() {
        if (routePoint == null) {
            routePoint = new ArrayList<ShipmentRoutePoint>();
        }
        return this.routePoint;
    }

}
