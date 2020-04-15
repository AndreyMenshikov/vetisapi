
package ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ru.vetrf.api.schema.cdm.mercury.vet_document.v2.ENTModificationOperation;


/**
 * Заявка на внесение изменений в реестр предприятий.
 * 
 * <p>Java class for ModifyEnterpriseRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModifyEnterpriseRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/mercury/g2b/applications/v2}MercuryApplicationRequest">
 *       &lt;sequence>
 *         &lt;element name="modificationOperation" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}ENTModificationOperation"/>
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
@XmlType(name = "ModifyEnterpriseRequest", propOrder = {
    "modificationOperation"
})
public class ModifyEnterpriseRequest
    extends MercuryApplicationRequest
{

    @XmlElement(required = true)
    protected ENTModificationOperation modificationOperation;

    /**
     * Gets the value of the modificationOperation property.
     * 
     * @return
     *     possible object is
     *     {@link ENTModificationOperation }
     *     
     */
    public ENTModificationOperation getModificationOperation() {
        return modificationOperation;
    }

    /**
     * Sets the value of the modificationOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENTModificationOperation }
     *     
     */
    public void setModificationOperation(ENTModificationOperation value) {
        this.modificationOperation = value;
    }

}
