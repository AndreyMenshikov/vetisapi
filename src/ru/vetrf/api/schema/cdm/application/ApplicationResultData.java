
package ru.vetrf.api.schema.cdm.application;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2.AddBusinessEntityUserResponse;
import ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2.CheckShipmentRegionalizationResponse;
import ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2.GetApplicableUserAuthorityListResponse;
import ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2.GetBusinessEntityUserListResponse;
import ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2.GetBusinessEntityUserResponse;
import ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2.GetStockEntryByGuidResponse;
import ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2.GetStockEntryByUuidResponse;
import ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2.GetStockEntryChangesListResponse;
import ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2.GetStockEntryListResponse;
import ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2.GetStockEntryVersionListResponse;
import ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2.GetVetDocumentByUuidResponse;
import ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2.GetVetDocumentChangesListResponse;
import ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2.GetVetDocumentListResponse;
import ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2.MergeStockEntriesResponse;
import ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2.ModifyActivityLocationsResponse;
import ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2.ModifyBusinessEntityResponse;
import ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2.ModifyEnterpriseResponse;
import ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2.ModifyProducerStockListResponse;
import ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2.PrepareOutgoingConsignmentResponse;
import ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2.ProcessIncomingConsignmentResponse;
import ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2.ProcessIncomingDeliveryResponse;
import ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2.RegisterProductionOperationResponse;
import ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2.ResolveDiscrepancyResponse;
import ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2.UnbindBusinessEntityUserResponse;
import ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2.UpdateTransportMovementDetailsResponse;
import ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2.UpdateUserAuthoritiesResponse;
import ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2.UpdateUserWorkingAreasResponse;
import ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2.UpdateVeterinaryEventsResponse;
import ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2.WithdrawVetDocumentResponse;


/**
 * <p>Java class for ApplicationResultData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplicationResultData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationResultData")
@XmlSeeAlso({
    UpdateVeterinaryEventsResponse.class,
    GetVetDocumentListResponse.class,
    GetStockEntryChangesListResponse.class,
    CheckShipmentRegionalizationResponse.class,
    GetVetDocumentChangesListResponse.class,
    WithdrawVetDocumentResponse.class,
    GetBusinessEntityUserResponse.class,
    PrepareOutgoingConsignmentResponse.class,
    UnbindBusinessEntityUserResponse.class,
    ResolveDiscrepancyResponse.class,
    GetVetDocumentByUuidResponse.class,
    ModifyEnterpriseResponse.class,
    ModifyProducerStockListResponse.class,
    ModifyBusinessEntityResponse.class,
    RegisterProductionOperationResponse.class,
    GetApplicableUserAuthorityListResponse.class,
    AddBusinessEntityUserResponse.class,
    ProcessIncomingDeliveryResponse.class,
    MergeStockEntriesResponse.class,
    GetStockEntryVersionListResponse.class,
    ProcessIncomingConsignmentResponse.class,
    ModifyActivityLocationsResponse.class,
    UpdateUserWorkingAreasResponse.class,
    GetStockEntryByGuidResponse.class,
    UpdateTransportMovementDetailsResponse.class,
    GetStockEntryByUuidResponse.class,
    GetStockEntryListResponse.class,
    UpdateUserAuthoritiesResponse.class,
    GetBusinessEntityUserListResponse.class
})
public abstract class ApplicationResultData {


}
