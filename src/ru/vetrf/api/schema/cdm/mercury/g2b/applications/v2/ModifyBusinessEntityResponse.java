
package ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import ru.vetrf.api.schema.cdm.application.ApplicationResultData;
import ru.vetrf.api.schema.cdm.dictionary.v2.BusinessEntity;


/**
 * Результат заявки на внесение изменений в реестр ХС.
 * 
 * <p>Java class for ModifyBusinessEntityResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModifyBusinessEntityResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/application}ApplicationResultData">
 *       &lt;sequence>
 *         &lt;element name="businessEntity" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}BusinessEntity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyBusinessEntityResponse", propOrder = {
    "businessEntity"
})
public class ModifyBusinessEntityResponse
    extends ApplicationResultData
{

    protected List<BusinessEntity> businessEntity;

    /**
     * Gets the value of the businessEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessEntity }
     * 
     * 
     */
    public List<BusinessEntity> getBusinessEntity() {
        if (businessEntity == null) {
            businessEntity = new ArrayList<BusinessEntity>();
        }
        return this.businessEntity;
    }

}
