
package ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.vetrf.api.schema.cdm.application.ApplicationResultData;
import ru.vetrf.api.schema.cdm.mercury.vet_document.v2.VetDocumentList;


/**
 * Результат заявки на получение списка ветсертификатов.
 * 
 * <p>Java class for GetVetDocumentListResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetVetDocumentListResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/application}ApplicationResultData">
 *       &lt;sequence>
 *         &lt;element ref="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}vetDocumentList"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetVetDocumentListResponse", propOrder = {
    "vetDocumentList"
})
public class GetVetDocumentListResponse
    extends ApplicationResultData
{

    @XmlElement(namespace = "http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2", required = true)
    protected VetDocumentList vetDocumentList;

    /**
     * Список записей.
     * 
     * @return
     *     possible object is
     *     {@link VetDocumentList }
     *     
     */
    public VetDocumentList getVetDocumentList() {
        return vetDocumentList;
    }

    /**
     * Sets the value of the vetDocumentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link VetDocumentList }
     *     
     */
    public void setVetDocumentList(VetDocumentList value) {
        this.vetDocumentList = value;
    }

}
