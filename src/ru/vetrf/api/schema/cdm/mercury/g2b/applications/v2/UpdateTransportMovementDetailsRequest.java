
package ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.vetrf.api.schema.cdm.dictionary.v2.BusinessMember;
import ru.vetrf.api.schema.cdm.mercury.vet_document.v2.ShipmentRoute;


/**
 * Заявка на изменение сведений о транспортных средствах, осуществляющих доставку
 *             сертифицированной партии. Поддерживается уполномоченное выполнение.
 *          
 * 
 * <p>Java class for UpdateTransportMovementDetailsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateTransportMovementDetailsRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/mercury/g2b/applications/v2}MercuryApplicationRequest">
 *       &lt;sequence>
 *         &lt;element ref="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}deliveryParticipant"/>
 *         &lt;element ref="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}vetDocumentUuid" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}shipmentRoute"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateTransportMovementDetailsRequest", propOrder = {
    "deliveryParticipant",
    "vetDocumentUuid",
    "shipmentRoute"
})
public class UpdateTransportMovementDetailsRequest
    extends MercuryApplicationRequest
{

    @XmlElement(namespace = "http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2", required = true)
    protected BusinessMember deliveryParticipant;
    @XmlElement(namespace = "http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2", required = true)
    protected List<String> vetDocumentUuid;
    @XmlElement(namespace = "http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2", required = true)
    protected ShipmentRoute shipmentRoute;

    /**
     * Грузополучатель или грузоотправитель,
     *                         осуществляющий изменение параметров маршрута.
     * 
     * @return
     *     possible object is
     *     {@link BusinessMember }
     *     
     */
    public BusinessMember getDeliveryParticipant() {
        return deliveryParticipant;
    }

    /**
     * Sets the value of the deliveryParticipant property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessMember }
     *     
     */
    public void setDeliveryParticipant(BusinessMember value) {
        this.deliveryParticipant = value;
    }

    /**
     * Идентификатор транспортного вет.сертификата.
     *                         Может быть указано более одного сертификата на партии, оформленные строго в одной поставк
     *                         в адрес одного получателя.
     *                      Gets the value of the vetDocumentUuid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vetDocumentUuid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVetDocumentUuid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVetDocumentUuid() {
        if (vetDocumentUuid == null) {
            vetDocumentUuid = new ArrayList<String>();
        }
        return this.vetDocumentUuid;
    }

    /**
     * Маршрут следования. Указывается список точек перегрузки и сведения о транспорте.
     *                         Для точки перегрузки должен быть указан её идентификатор (uuid).
     *                         В запросе на изменение могут участвовать только точки маршрута,
     *                         для которых установлен флаг transshipment (точка перегрузки).
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
