
package ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.vetrf.api.schema.cdm.application.ApplicationResultData;
import ru.vetrf.api.schema.cdm.mercury.vet_document.v2.VetDocument;


/**
 * Результат заявки на получение записи вет. сертификата по идентификатору.
 *          
 * 
 * <p>Java class for GetVetDocumentByUuidResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetVetDocumentByUuidResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/application}ApplicationResultData">
 *       &lt;sequence>
 *         &lt;element ref="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}vetDocument"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetVetDocumentByUuidResponse", propOrder = {
    "vetDocument"
})
public class GetVetDocumentByUuidResponse
    extends ApplicationResultData
{

    @XmlElement(namespace = "http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2", required = true)
    protected VetDocument vetDocument;

    /**
     * Ветеринарный сертификат.
     * 
     * @return
     *     possible object is
     *     {@link VetDocument }
     *     
     */
    public VetDocument getVetDocument() {
        return vetDocument;
    }

    /**
     * Sets the value of the vetDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link VetDocument }
     *     
     */
    public void setVetDocument(VetDocument value) {
        this.vetDocument = value;
    }

}
