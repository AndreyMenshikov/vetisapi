
package ru.vetrf.api.schema.cdm.mercury.vet_document.v2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import ru.vetrf.api.schema.cdm.base.DateInterval;
import ru.vetrf.api.schema.cdm.dictionary.v2.BusinessMember;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.vetrf.api.schema.cdm.mercury.vet_document.v2 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _StockEntry_QNAME = new QName("http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2", "stockEntry");
    private final static QName _StockEntryList_QNAME = new QName("http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2", "stockEntryList");
    private final static QName _AuthorityList_QNAME = new QName("http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2", "authorityList");
    private final static QName _User_QNAME = new QName("http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2", "user");
    private final static QName _IssueDateInterval_QNAME = new QName("http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2", "issueDateInterval");
    private final static QName _VetDocumentType_QNAME = new QName("http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2", "vetDocumentType");
    private final static QName _R13NRouteSection_QNAME = new QName("http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2", "r13nRouteSection");
    private final static QName _StockEntryUuid_QNAME = new QName("http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2", "stockEntryUuid");
    private final static QName _DeliveryParticipant_QNAME = new QName("http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2", "deliveryParticipant");
    private final static QName _VetDocumentStatus_QNAME = new QName("http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2", "vetDocumentStatus");
    private final static QName _UserList_QNAME = new QName("http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2", "userList");
    private final static QName _ReferencedDocument_QNAME = new QName("http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2", "referencedDocument");
    private final static QName _VetDocumentList_QNAME = new QName("http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2", "vetDocumentList");
    private final static QName _StockEntryEventList_QNAME = new QName("http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2", "stockEntryEventList");
    private final static QName _VetDocument_QNAME = new QName("http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2", "vetDocument");
    private final static QName _ShipmentRoute_QNAME = new QName("http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2", "shipmentRoute");
    private final static QName _VetDocumentUuid_QNAME = new QName("http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2", "vetDocumentUuid");
    private final static QName _Consignor_QNAME = new QName("http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2", "consignor");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.vetrf.api.schema.cdm.mercury.vet_document.v2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BEActivityLocationsModificationOperation }
     * 
     */
    public BEActivityLocationsModificationOperation createBEActivityLocationsModificationOperation() {
        return new BEActivityLocationsModificationOperation();
    }

    /**
     * Create an instance of {@link VetDocumentList }
     * 
     */
    public VetDocumentList createVetDocumentList() {
        return new VetDocumentList();
    }

    /**
     * Create an instance of {@link StockEntryEventList }
     * 
     */
    public StockEntryEventList createStockEntryEventList() {
        return new StockEntryEventList();
    }

    /**
     * Create an instance of {@link RouteSectionR13NRules }
     * 
     */
    public RouteSectionR13NRules createRouteSectionR13NRules() {
        return new RouteSectionR13NRules();
    }

    /**
     * Create an instance of {@link ReferencedDocument }
     * 
     */
    public ReferencedDocument createReferencedDocument() {
        return new ReferencedDocument();
    }

    /**
     * Create an instance of {@link ShipmentRoute }
     * 
     */
    public ShipmentRoute createShipmentRoute() {
        return new ShipmentRoute();
    }

    /**
     * Create an instance of {@link AuthorityList }
     * 
     */
    public AuthorityList createAuthorityList() {
        return new AuthorityList();
    }

    /**
     * Create an instance of {@link UserList }
     * 
     */
    public UserList createUserList() {
        return new UserList();
    }

    /**
     * Create an instance of {@link StockEntryList }
     * 
     */
    public StockEntryList createStockEntryList() {
        return new StockEntryList();
    }

    /**
     * Create an instance of {@link VetDocument }
     * 
     */
    public VetDocument createVetDocument() {
        return new VetDocument();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link StockEntry }
     * 
     */
    public StockEntry createStockEntry() {
        return new StockEntry();
    }

    /**
     * Create an instance of {@link DeliveryInspection }
     * 
     */
    public DeliveryInspection createDeliveryInspection() {
        return new DeliveryInspection();
    }

    /**
     * Create an instance of {@link QuarantineEvent }
     * 
     */
    public QuarantineEvent createQuarantineEvent() {
        return new QuarantineEvent();
    }

    /**
     * Create an instance of {@link BatchExtraInfo }
     * 
     */
    public BatchExtraInfo createBatchExtraInfo() {
        return new BatchExtraInfo();
    }

    /**
     * Create an instance of {@link Document }
     * 
     */
    public Document createDocument() {
        return new Document();
    }

    /**
     * Create an instance of {@link ProductiveBatch }
     * 
     */
    public ProductiveBatch createProductiveBatch() {
        return new ProductiveBatch();
    }

    /**
     * Create an instance of {@link GoodsDate }
     * 
     */
    public GoodsDate createGoodsDate() {
        return new GoodsDate();
    }

    /**
     * Create an instance of {@link StockEntrySearchPattern }
     * 
     */
    public StockEntrySearchPattern createStockEntrySearchPattern() {
        return new StockEntrySearchPattern();
    }

    /**
     * Create an instance of {@link TransportInfo }
     * 
     */
    public TransportInfo createTransportInfo() {
        return new TransportInfo();
    }

    /**
     * Create an instance of {@link DiscrepancyReport }
     * 
     */
    public DiscrepancyReport createDiscrepancyReport() {
        return new DiscrepancyReport();
    }

    /**
     * Create an instance of {@link WorkingArea }
     * 
     */
    public WorkingArea createWorkingArea() {
        return new WorkingArea();
    }

    /**
     * Create an instance of {@link Citizenship }
     * 
     */
    public Citizenship createCitizenship() {
        return new Citizenship();
    }

    /**
     * Create an instance of {@link MergeStockEntriesOperation }
     * 
     */
    public MergeStockEntriesOperation createMergeStockEntriesOperation() {
        return new MergeStockEntriesOperation();
    }

    /**
     * Create an instance of {@link RawBatch }
     * 
     */
    public RawBatch createRawBatch() {
        return new RawBatch();
    }

    /**
     * Create an instance of {@link TransportNumber }
     * 
     */
    public TransportNumber createTransportNumber() {
        return new TransportNumber();
    }

    /**
     * Create an instance of {@link LaboratoryResearchEvent }
     * 
     */
    public LaboratoryResearchEvent createLaboratoryResearchEvent() {
        return new LaboratoryResearchEvent();
    }

    /**
     * Create an instance of {@link CertifiedBatch }
     * 
     */
    public CertifiedBatch createCertifiedBatch() {
        return new CertifiedBatch();
    }

    /**
     * Create an instance of {@link ConsignmentDocumentList }
     * 
     */
    public ConsignmentDocumentList createConsignmentDocumentList() {
        return new ConsignmentDocumentList();
    }

    /**
     * Create an instance of {@link ShipmentRoutePoint }
     * 
     */
    public ShipmentRoutePoint createShipmentRoutePoint() {
        return new ShipmentRoutePoint();
    }

    /**
     * Create an instance of {@link RegionalizationClause }
     * 
     */
    public RegionalizationClause createRegionalizationClause() {
        return new RegionalizationClause();
    }

    /**
     * Create an instance of {@link UserAuthority }
     * 
     */
    public UserAuthority createUserAuthority() {
        return new UserAuthority();
    }

    /**
     * Create an instance of {@link WorkingAreaList }
     * 
     */
    public WorkingAreaList createWorkingAreaList() {
        return new WorkingAreaList();
    }

    /**
     * Create an instance of {@link VetDocumentStatusChange }
     * 
     */
    public VetDocumentStatusChange createVetDocumentStatusChange() {
        return new VetDocumentStatusChange();
    }

    /**
     * Create an instance of {@link PSLModificationOperation }
     * 
     */
    public PSLModificationOperation createPSLModificationOperation() {
        return new PSLModificationOperation();
    }

    /**
     * Create an instance of {@link ENTModificationOperation }
     * 
     */
    public ENTModificationOperation createENTModificationOperation() {
        return new ENTModificationOperation();
    }

    /**
     * Create an instance of {@link StockDiscrepancy }
     * 
     */
    public StockDiscrepancy createStockDiscrepancy() {
        return new StockDiscrepancy();
    }

    /**
     * Create an instance of {@link Consignment }
     * 
     */
    public Consignment createConsignment() {
        return new Consignment();
    }

    /**
     * Create an instance of {@link VeterinaryEvent }
     * 
     */
    public VeterinaryEvent createVeterinaryEvent() {
        return new VeterinaryEvent();
    }

    /**
     * Create an instance of {@link ProcessingProcedure }
     * 
     */
    public ProcessingProcedure createProcessingProcedure() {
        return new ProcessingProcedure();
    }

    /**
     * Create an instance of {@link Waybill }
     * 
     */
    public Waybill createWaybill() {
        return new Waybill();
    }

    /**
     * Create an instance of {@link AnimalMedicationEvent }
     * 
     */
    public AnimalMedicationEvent createAnimalMedicationEvent() {
        return new AnimalMedicationEvent();
    }

    /**
     * Create an instance of {@link BatchOrigin }
     * 
     */
    public BatchOrigin createBatchOrigin() {
        return new BatchOrigin();
    }

    /**
     * Create an instance of {@link DeliveryFactList }
     * 
     */
    public DeliveryFactList createDeliveryFactList() {
        return new DeliveryFactList();
    }

    /**
     * Create an instance of {@link CertifiedConsignment }
     * 
     */
    public CertifiedConsignment createCertifiedConsignment() {
        return new CertifiedConsignment();
    }

    /**
     * Create an instance of {@link Batch }
     * 
     */
    public Batch createBatch() {
        return new Batch();
    }

    /**
     * Create an instance of {@link DiscrepancyReason }
     * 
     */
    public DiscrepancyReason createDiscrepancyReason() {
        return new DiscrepancyReason();
    }

    /**
     * Create an instance of {@link BEModificationOperation }
     * 
     */
    public BEModificationOperation createBEModificationOperation() {
        return new BEModificationOperation();
    }

    /**
     * Create an instance of {@link VeterinaryAuthentication }
     * 
     */
    public VeterinaryAuthentication createVeterinaryAuthentication() {
        return new VeterinaryAuthentication();
    }

    /**
     * Create an instance of {@link ProductionOperation }
     * 
     */
    public ProductionOperation createProductionOperation() {
        return new ProductionOperation();
    }

    /**
     * Create an instance of {@link Delivery }
     * 
     */
    public Delivery createDelivery() {
        return new Delivery();
    }

    /**
     * Create an instance of {@link BEActivityLocationsModificationOperation.ActivityLocation }
     * 
     */
    public BEActivityLocationsModificationOperation.ActivityLocation createBEActivityLocationsModificationOperationActivityLocation() {
        return new BEActivityLocationsModificationOperation.ActivityLocation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StockEntry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2", name = "stockEntry")
    public JAXBElement<StockEntry> createStockEntry(StockEntry value) {
        return new JAXBElement<StockEntry>(_StockEntry_QNAME, StockEntry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StockEntryList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2", name = "stockEntryList")
    public JAXBElement<StockEntryList> createStockEntryList(StockEntryList value) {
        return new JAXBElement<StockEntryList>(_StockEntryList_QNAME, StockEntryList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthorityList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2", name = "authorityList")
    public JAXBElement<AuthorityList> createAuthorityList(AuthorityList value) {
        return new JAXBElement<AuthorityList>(_AuthorityList_QNAME, AuthorityList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2", name = "user")
    public JAXBElement<User> createUser(User value) {
        return new JAXBElement<User>(_User_QNAME, User.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateInterval }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2", name = "issueDateInterval")
    public JAXBElement<DateInterval> createIssueDateInterval(DateInterval value) {
        return new JAXBElement<DateInterval>(_IssueDateInterval_QNAME, DateInterval.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VetDocumentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2", name = "vetDocumentType")
    public JAXBElement<VetDocumentType> createVetDocumentType(VetDocumentType value) {
        return new JAXBElement<VetDocumentType>(_VetDocumentType_QNAME, VetDocumentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteSectionR13NRules }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2", name = "r13nRouteSection")
    public JAXBElement<RouteSectionR13NRules> createR13NRouteSection(RouteSectionR13NRules value) {
        return new JAXBElement<RouteSectionR13NRules>(_R13NRouteSection_QNAME, RouteSectionR13NRules.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2", name = "stockEntryUuid")
    public JAXBElement<String> createStockEntryUuid(String value) {
        return new JAXBElement<String>(_StockEntryUuid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessMember }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2", name = "deliveryParticipant")
    public JAXBElement<BusinessMember> createDeliveryParticipant(BusinessMember value) {
        return new JAXBElement<BusinessMember>(_DeliveryParticipant_QNAME, BusinessMember.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VetDocumentStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2", name = "vetDocumentStatus")
    public JAXBElement<VetDocumentStatus> createVetDocumentStatus(VetDocumentStatus value) {
        return new JAXBElement<VetDocumentStatus>(_VetDocumentStatus_QNAME, VetDocumentStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2", name = "userList")
    public JAXBElement<UserList> createUserList(UserList value) {
        return new JAXBElement<UserList>(_UserList_QNAME, UserList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferencedDocument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2", name = "referencedDocument")
    public JAXBElement<ReferencedDocument> createReferencedDocument(ReferencedDocument value) {
        return new JAXBElement<ReferencedDocument>(_ReferencedDocument_QNAME, ReferencedDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VetDocumentList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2", name = "vetDocumentList")
    public JAXBElement<VetDocumentList> createVetDocumentList(VetDocumentList value) {
        return new JAXBElement<VetDocumentList>(_VetDocumentList_QNAME, VetDocumentList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StockEntryEventList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2", name = "stockEntryEventList")
    public JAXBElement<StockEntryEventList> createStockEntryEventList(StockEntryEventList value) {
        return new JAXBElement<StockEntryEventList>(_StockEntryEventList_QNAME, StockEntryEventList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VetDocument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2", name = "vetDocument")
    public JAXBElement<VetDocument> createVetDocument(VetDocument value) {
        return new JAXBElement<VetDocument>(_VetDocument_QNAME, VetDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipmentRoute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2", name = "shipmentRoute")
    public JAXBElement<ShipmentRoute> createShipmentRoute(ShipmentRoute value) {
        return new JAXBElement<ShipmentRoute>(_ShipmentRoute_QNAME, ShipmentRoute.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2", name = "vetDocumentUuid")
    public JAXBElement<String> createVetDocumentUuid(String value) {
        return new JAXBElement<String>(_VetDocumentUuid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessMember }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2", name = "consignor")
    public JAXBElement<BusinessMember> createConsignor(BusinessMember value) {
        return new JAXBElement<BusinessMember>(_Consignor_QNAME, BusinessMember.class, null, value);
    }

}
