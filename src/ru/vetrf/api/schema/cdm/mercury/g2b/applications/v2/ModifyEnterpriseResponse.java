
package ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import ru.vetrf.api.schema.cdm.application.ApplicationResultData;
import ru.vetrf.api.schema.cdm.dictionary.v2.Enterprise;


/**
 * Результат заявки на внесение изменений в реестр предприятий.
 * 
 * <p>Java class for ModifyEnterpriseResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModifyEnterpriseResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/application}ApplicationResultData">
 *       &lt;sequence>
 *         &lt;element name="enterprise" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}Enterprise" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyEnterpriseResponse", propOrder = {
    "enterprise"
})
public class ModifyEnterpriseResponse
    extends ApplicationResultData
{

    protected List<Enterprise> enterprise;

    /**
     * Gets the value of the enterprise property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enterprise property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnterprise().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Enterprise }
     * 
     * 
     */
    public List<Enterprise> getEnterprise() {
        if (enterprise == null) {
            enterprise = new ArrayList<Enterprise>();
        }
        return this.enterprise;
    }

}
