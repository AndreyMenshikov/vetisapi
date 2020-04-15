
package ru.vetrf.api.schema.cdm.dictionary.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import ru.vetrf.api.schema.cdm.base.EntityList;


/**
 * Тип-обертка для списка районов.
 *          
 * 
 * <p>Java class for DistrictList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DistrictList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/base}EntityList">
 *       &lt;sequence>
 *         &lt;element name="district" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}District" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistrictList", propOrder = {
    "district"
})
public class DistrictList
    extends EntityList
{

    protected List<District> district;

    /**
     * Gets the value of the district property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the district property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistrict().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link District }
     * 
     * 
     */
    public List<District> getDistrict() {
        if (district == null) {
            district = new ArrayList<District>();
        }
        return this.district;
    }

}
