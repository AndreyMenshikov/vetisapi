
package ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ru.vetrf.api.schema.cdm.dictionary.v2.SubProduct;
import ru.vetrf.api.schema.cdm.mercury.vet_document.v2.ShipmentRoute;


/**
 * Заявка на проверку правил регионализации для определенной категории груза и маршрута следования.
 *          
 * 
 * <p>Java class for CheckShipmentRegionalizationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckShipmentRegionalizationRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/mercury/g2b/applications/v2}MercuryApplicationRequest">
 *       &lt;sequence>
 *         &lt;element ref="{http://api.vetrf.ru/schema/cdm/dictionary/v2}cargoType" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}shipmentRoute"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckShipmentRegionalizationRequest", propOrder = {
    "cargoType",
    "shipmentRoute"
})
public class CheckShipmentRegionalizationRequest
    extends MercuryApplicationRequest
{

    @XmlElement(namespace = "http://api.vetrf.ru/schema/cdm/dictionary/v2", required = true)
    protected List<SubProduct> cargoType;
    @XmlElement(namespace = "http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2", required = true)
    protected ShipmentRoute shipmentRoute;

    /**
     * Категория груза, для которой запрашиваются правила перемещения по маршруту.
     *                      Gets the value of the cargoType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cargoType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCargoType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubProduct }
     * 
     * 
     */
    public List<SubProduct> getCargoType() {
        if (cargoType == null) {
            cargoType = new ArrayList<SubProduct>();
        }
        return this.cargoType;
    }

    /**
     * Маршрут следования груза. В отличие от маршрута следования,
     *                         который указывается в транспортном сертификате и в запросе на оформление исходящей партии,
     *                         `shipmentRoute` здесь должен включать точку отправления и точку назначения.
     *                         Для каждой точки маршрута обязательно должен быть заполнен адрес:
     *                         элементы `shipmentRoute/routePoint/location/address` и `shipmentRoute/routePoint/enterprise/address`.
     *                         Только в этом случае проверка правил перемещения (регионализация) даст корректный результат.
     *                      
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
