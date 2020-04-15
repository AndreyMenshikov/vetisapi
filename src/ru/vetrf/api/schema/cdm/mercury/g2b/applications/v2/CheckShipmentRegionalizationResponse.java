
package ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ru.vetrf.api.schema.cdm.application.ApplicationResultData;
import ru.vetrf.api.schema.cdm.mercury.vet_document.v2.RouteSectionR13NRules;


/**
 * Результат проверки правил регионализации.
 * 
 * <p>Java class for CheckShipmentRegionalizationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckShipmentRegionalizationResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/application}ApplicationResultData">
 *       &lt;sequence>
 *         &lt;element ref="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}r13nRouteSection" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "CheckShipmentRegionalizationResponse", propOrder = {
    "r13NRouteSection"
})
public class CheckShipmentRegionalizationResponse
    extends ApplicationResultData
{

    @XmlElement(name = "r13nRouteSection", namespace = "http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2")
    protected List<RouteSectionR13NRules> r13NRouteSection;

    /**
     * Описание правил перемещения продукции.
     *                         Количество элементов `r13nRouteSection` в ответе соответствует количеству отрезков маршрута.
     *                         Атрибут `r13nRouteSection/sqnId` равен номеру отрезка, нумерация начинается с единицы.
     *                         Количество элементов `r13nRouteSection/appliedR13nRule` соответствует
     *                         количеству категорий груза (элемент `cargoType`) в запросе.
     *                      Gets the value of the r13NRouteSection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the r13NRouteSection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getR13NRouteSection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RouteSectionR13NRules }
     * 
     * 
     */
    public List<RouteSectionR13NRules> getR13NRouteSection() {
        if (r13NRouteSection == null) {
            r13NRouteSection = new ArrayList<RouteSectionR13NRules>();
        }
        return this.r13NRouteSection;
    }

}
