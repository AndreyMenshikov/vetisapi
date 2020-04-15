
package ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ru.vetrf.api.schema.cdm.mercury.vet_document.v2.BEActivityLocationsModificationOperation;


/**
 * Заявка на изменение списка мест осуществления деятельности хозяйствующего субъекта.
 *          
 * 
 * <p>Java class for ModifyActivityLocationsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModifyActivityLocationsRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/mercury/g2b/applications/v2}MercuryApplicationRequest">
 *       &lt;sequence>
 *         &lt;element name="modificationOperation" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}BEActivityLocationsModificationOperation"/>
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
@XmlType(name = "ModifyActivityLocationsRequest", propOrder = {
    "modificationOperation"
})
public class ModifyActivityLocationsRequest
    extends MercuryApplicationRequest
{

    @XmlElement(required = true)
    protected BEActivityLocationsModificationOperation modificationOperation;

    /**
     * Gets the value of the modificationOperation property.
     * 
     * @return
     *     possible object is
     *     {@link BEActivityLocationsModificationOperation }
     *     
     */
    public BEActivityLocationsModificationOperation getModificationOperation() {
        return modificationOperation;
    }

    /**
     * Sets the value of the modificationOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BEActivityLocationsModificationOperation }
     *     
     */
    public void setModificationOperation(BEActivityLocationsModificationOperation value) {
        this.modificationOperation = value;
    }

}
