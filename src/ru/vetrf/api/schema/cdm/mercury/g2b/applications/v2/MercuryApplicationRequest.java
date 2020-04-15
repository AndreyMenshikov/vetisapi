
package ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import ru.vetrf.api.schema.cdm.application.ApplicationData;
import ru.vetrf.api.schema.cdm.mercury.vet_document.v2.User;


/**
 * <p>Java class for MercuryApplicationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MercuryApplicationRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/application}ApplicationData">
 *       &lt;sequence>
 *         &lt;element name="localTransactionId" type="{http://api.vetrf.ru/schema/cdm/base}Identifier"/>
 *         &lt;element name="initiator" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}User"/>
 *         &lt;element name="sessionToken" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}OTPToken" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MercuryApplicationRequest", propOrder = {
    "localTransactionId",
    "initiator",
    "sessionToken"
})
@XmlSeeAlso({
    ModifyActivityLocationsRequest.class,
    GetStockEntryListRequest.class,
    UpdateUserAuthoritiesRequest.class,
    ResolveDiscrepancyRequest.class,
    GetVetDocumentListRequest.class,
    RegisterProductionOperationRequest.class,
    GetStockEntryByUuidRequest.class,
    CheckShipmentRegionalizationRequest.class,
    GetApplicableUserAuthorityListRequest.class,
    UpdateUserWorkingAreasRequest.class,
    GetStockEntryByGuidRequest.class,
    GetBusinessEntityUserRequest.class,
    UpdateTransportMovementDetailsRequest.class,
    ProcessIncomingConsignmentRequest.class,
    ModifyBusinessEntityRequest.class,
    GetVetDocumentByUuidRequest.class,
    UnbindBusinessEntityUserRequest.class,
    PrepareOutgoingConsignmentRequest.class,
    MergeStockEntriesRequest.class,
    ModifyEnterpriseRequest.class,
    ModifyProducerStockListRequest.class,
    GetVetDocumentChangesListRequest.class,
    UpdateVeterinaryEventsRequest.class,
    GetStockEntryVersionListRequest.class,
    GetStockEntryChangesListRequest.class,
    WithdrawVetDocumentRequest.class,
    GetBusinessEntityUserListRequest.class,
    ProcessIncomingDeliveryRequest.class,
    AddBusinessEntityUserRequest.class
})
public class MercuryApplicationRequest
    extends ApplicationData
{

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String localTransactionId;
    @XmlElement(required = true)
    protected User initiator;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String sessionToken;

    /**
     * Gets the value of the localTransactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalTransactionId() {
        return localTransactionId;
    }

    /**
     * Sets the value of the localTransactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalTransactionId(String value) {
        this.localTransactionId = value;
    }

    /**
     * Gets the value of the initiator property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getInitiator() {
        return initiator;
    }

    /**
     * Sets the value of the initiator property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setInitiator(User value) {
        this.initiator = value;
    }

    /**
     * Gets the value of the sessionToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionToken() {
        return sessionToken;
    }

    /**
     * Sets the value of the sessionToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionToken(String value) {
        this.sessionToken = value;
    }

}
