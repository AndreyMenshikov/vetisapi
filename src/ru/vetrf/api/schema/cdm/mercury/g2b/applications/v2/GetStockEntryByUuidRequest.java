
package ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Заявка на получение версии записи по идентификатору.
 * 
 * <p>Java class for GetStockEntryByUuidRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetStockEntryByUuidRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/mercury/g2b/applications/v2}MercuryApplicationRequest">
 *       &lt;sequence>
 *         &lt;element ref="{http://api.vetrf.ru/schema/cdm/base}uuid"/>
 *         &lt;element ref="{http://api.vetrf.ru/schema/cdm/dictionary/v2}enterpriseGuid"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetStockEntryByUuidRequest", propOrder = {
    "uuid",
    "enterpriseGuid"
})
public class GetStockEntryByUuidRequest
    extends MercuryApplicationRequest
{

    @XmlElement(namespace = "http://api.vetrf.ru/schema/cdm/base", required = true)
    protected String uuid;
    @XmlElement(namespace = "http://api.vetrf.ru/schema/cdm/dictionary/v2", required = true)
    protected String enterpriseGuid;

    /**
     * Идентификатор версии, по которому производится поиск.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

    /**
     * Идентификатор предприятия, по которому производится поиск записи.
     *                      
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnterpriseGuid() {
        return enterpriseGuid;
    }

    /**
     * Sets the value of the enterpriseGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnterpriseGuid(String value) {
        this.enterpriseGuid = value;
    }

}
