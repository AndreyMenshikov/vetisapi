
package ru.vetrf.api.schema.cdm.mercury.vet_document.v2;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import ru.vetrf.api.schema.cdm.dictionary.v2.BusinessEntity;
import ru.vetrf.api.schema.cdm.dictionary.v2.PackageList;
import ru.vetrf.api.schema.cdm.dictionary.v2.Product;
import ru.vetrf.api.schema.cdm.dictionary.v2.ProductItem;
import ru.vetrf.api.schema.cdm.dictionary.v2.SubProduct;
import ru.vetrf.api.schema.cdm.dictionary.v2.Unit;


/**
 * Тип, описывающий партию груза.
 * 
 * <p>Java class for Batch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Batch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productType" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}ProductType" minOccurs="0"/>
 *         &lt;element name="product" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}Product" minOccurs="0"/>
 *         &lt;element name="subProduct" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}SubProduct" minOccurs="0"/>
 *         &lt;element name="productItem" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}ProductItem" minOccurs="0"/>
 *         &lt;element name="volume" type="{http://api.vetrf.ru/schema/cdm/base}Decimal" minOccurs="0"/>
 *         &lt;element name="unit" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}Unit" minOccurs="0"/>
 *         &lt;element name="dateOfProduction" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}GoodsDate" minOccurs="0"/>
 *         &lt;element name="expiryDate" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}GoodsDate" minOccurs="0"/>
 *         &lt;element name="batchID" type="{http://api.vetrf.ru/schema/cdm/base}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="perishable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="origin" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}BatchOrigin" minOccurs="0"/>
 *         &lt;element name="lowGradeCargo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="packageList" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}PackageList" minOccurs="0"/>
 *         &lt;element name="owner" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}BusinessEntity" minOccurs="0"/>
 *         &lt;element name="applicableClassifications" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}BatchExtraInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Batch", propOrder = {
    "productType",
    "product",
    "subProduct",
    "productItem",
    "volume",
    "unit",
    "dateOfProduction",
    "expiryDate",
    "batchID",
    "perishable",
    "origin",
    "lowGradeCargo",
    "packageList",
    "owner",
    "applicableClassifications"
})
@XmlSeeAlso({
    ProductiveBatch.class,
    Consignment.class
})
public class Batch {

    protected BigInteger productType;
    protected Product product;
    protected SubProduct subProduct;
    protected ProductItem productItem;
    protected BigDecimal volume;
    protected Unit unit;
    protected GoodsDate dateOfProduction;
    protected GoodsDate expiryDate;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> batchID;
    protected Boolean perishable;
    protected BatchOrigin origin;
    protected Boolean lowGradeCargo;
    protected PackageList packageList;
    protected BusinessEntity owner;
    protected BatchExtraInfo applicableClassifications;

    /**
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProductType(BigInteger value) {
        this.productType = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     */
    public Product getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setProduct(Product value) {
        this.product = value;
    }

    /**
     * Gets the value of the subProduct property.
     * 
     * @return
     *     possible object is
     *     {@link SubProduct }
     *     
     */
    public SubProduct getSubProduct() {
        return subProduct;
    }

    /**
     * Sets the value of the subProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubProduct }
     *     
     */
    public void setSubProduct(SubProduct value) {
        this.subProduct = value;
    }

    /**
     * Gets the value of the productItem property.
     * 
     * @return
     *     possible object is
     *     {@link ProductItem }
     *     
     */
    public ProductItem getProductItem() {
        return productItem;
    }

    /**
     * Sets the value of the productItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductItem }
     *     
     */
    public void setProductItem(ProductItem value) {
        this.productItem = value;
    }

    /**
     * Gets the value of the volume property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVolume(BigDecimal value) {
        this.volume = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link Unit }
     *     
     */
    public Unit getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Unit }
     *     
     */
    public void setUnit(Unit value) {
        this.unit = value;
    }

    /**
     * Gets the value of the dateOfProduction property.
     * 
     * @return
     *     possible object is
     *     {@link GoodsDate }
     *     
     */
    public GoodsDate getDateOfProduction() {
        return dateOfProduction;
    }

    /**
     * Sets the value of the dateOfProduction property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoodsDate }
     *     
     */
    public void setDateOfProduction(GoodsDate value) {
        this.dateOfProduction = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link GoodsDate }
     *     
     */
    public GoodsDate getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoodsDate }
     *     
     */
    public void setExpiryDate(GoodsDate value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the batchID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the batchID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBatchID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBatchID() {
        if (batchID == null) {
            batchID = new ArrayList<String>();
        }
        return this.batchID;
    }

    /**
     * Gets the value of the perishable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPerishable() {
        return perishable;
    }

    /**
     * Sets the value of the perishable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPerishable(Boolean value) {
        this.perishable = value;
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link BatchOrigin }
     *     
     */
    public BatchOrigin getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchOrigin }
     *     
     */
    public void setOrigin(BatchOrigin value) {
        this.origin = value;
    }

    /**
     * Gets the value of the lowGradeCargo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLowGradeCargo() {
        return lowGradeCargo;
    }

    /**
     * Sets the value of the lowGradeCargo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLowGradeCargo(Boolean value) {
        this.lowGradeCargo = value;
    }

    /**
     * Gets the value of the packageList property.
     * 
     * @return
     *     possible object is
     *     {@link PackageList }
     *     
     */
    public PackageList getPackageList() {
        return packageList;
    }

    /**
     * Sets the value of the packageList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageList }
     *     
     */
    public void setPackageList(PackageList value) {
        this.packageList = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessEntity }
     *     
     */
    public BusinessEntity getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessEntity }
     *     
     */
    public void setOwner(BusinessEntity value) {
        this.owner = value;
    }

    /**
     * Gets the value of the applicableClassifications property.
     * 
     * @return
     *     possible object is
     *     {@link BatchExtraInfo }
     *     
     */
    public BatchExtraInfo getApplicableClassifications() {
        return applicableClassifications;
    }

    /**
     * Sets the value of the applicableClassifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchExtraInfo }
     *     
     */
    public void setApplicableClassifications(BatchExtraInfo value) {
        this.applicableClassifications = value;
    }

}
