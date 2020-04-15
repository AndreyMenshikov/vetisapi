
package ru.vetrf.api.schema.cdm.dictionary.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import ru.vetrf.api.schema.cdm.base.EntityList;


/**
 * Тип-обертка для списка населенных пунктов.
 *          
 * 
 * <p>Java class for LocalityList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocalityList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/base}EntityList">
 *       &lt;sequence>
 *         &lt;element name="locality" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}Locality" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalityList", propOrder = {
    "locality"
})
public class LocalityList
    extends EntityList
{

    protected List<Locality> locality;

    /**
     * Gets the value of the locality property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locality property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocality().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Locality }
     * 
     * 
     */
    public List<Locality> getLocality() {
        if (locality == null) {
            locality = new ArrayList<Locality>();
        }
        return this.locality;
    }

}
