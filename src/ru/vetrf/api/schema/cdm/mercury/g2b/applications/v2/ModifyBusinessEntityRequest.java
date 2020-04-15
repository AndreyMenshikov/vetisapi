
package ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.vetrf.api.schema.cdm.mercury.vet_document.v2.BEModificationOperation;


/**
 * Заявка на внесение изменений в реестр ХС.
 * 
 * <p>Java class for ModifyBusinessEntityRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModifyBusinessEntityRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/mercury/g2b/applications/v2}MercuryApplicationRequest">
 *       &lt;sequence>
 *         &lt;element name="modificationOperation" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}BEModificationOperation"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyBusinessEntityRequest", propOrder = {
    "modificationOperation"
})
public class ModifyBusinessEntityRequest
    extends MercuryApplicationRequest
{

    @XmlElement(required = true)
    protected BEModificationOperation modificationOperation;

    /**
     * Gets the value of the modificationOperation property.
     * 
     * @return
     *     possible object is
     *     {@link BEModificationOperation }
     *     
     */
    public BEModificationOperation getModificationOperation() {
        return modificationOperation;
    }

    /**
     * Sets the value of the modificationOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEModificationOperation }
     *     
     */
    public void setModificationOperation(BEModificationOperation value) {
        this.modificationOperation = value;
    }

}
