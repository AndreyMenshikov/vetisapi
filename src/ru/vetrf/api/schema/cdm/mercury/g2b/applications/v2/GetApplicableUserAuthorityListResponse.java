
package ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.vetrf.api.schema.cdm.application.ApplicationResultData;
import ru.vetrf.api.schema.cdm.mercury.vet_document.v2.AuthorityList;


/**
 * Ответ на получение списка доступных ролей.
 * 
 * <p>Java class for GetApplicableUserAuthorityListResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetApplicableUserAuthorityListResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/application}ApplicationResultData">
 *       &lt;sequence>
 *         &lt;element ref="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}authorityList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetApplicableUserAuthorityListResponse", propOrder = {
    "authorityList"
})
public class GetApplicableUserAuthorityListResponse
    extends ApplicationResultData
{

    @XmlElement(namespace = "http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2")
    protected AuthorityList authorityList;

    /**
     * Список доступных ролей пользователя ХС.
     * 
     * @return
     *     possible object is
     *     {@link AuthorityList }
     *     
     */
    public AuthorityList getAuthorityList() {
        return authorityList;
    }

    /**
     * Sets the value of the authorityList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorityList }
     *     
     */
    public void setAuthorityList(AuthorityList value) {
        this.authorityList = value;
    }

}
