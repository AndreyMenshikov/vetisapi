package ru.vsdmobile.samples;

public class DeliveryParams{
	public String consignorBusinessEntityGuid;
	public String consignorEnterpriseGuid;
	public String consigneeBusinessEntityGuid;
	public String consigneeEnterpriseGuid;
	public String productItemGuid;
	
	/**
	 * Вид продукции
	 */
	public String subProductGuid;
	public long volume;
	public String unitGuid;
	public String stockEntryGuid;
	public String vehicleNumber;
	public String waybillIssueSeries;
	public String waybillIssueNumber;
	public String refDocIssueNumber;
	public String refDocIssueSeries;
	public String purpIssueSeries;
	public String purpIssuerNumber;
}