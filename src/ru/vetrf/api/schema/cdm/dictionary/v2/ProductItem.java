
package ru.vetrf.api.schema.cdm.dictionary.v2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import ru.vetrf.api.schema.cdm.base.GenericVersioningEntity;


/**
 * Тип, описывающий cведения о наименовании продукции в соответствии с номенклатурой производителя.
 *             ProductItem – наименование продукции, выпускаемое ХС-производителем (BusinessEntity) на одной или нескольких площадках (Enterprise).
 *             Для ProductItem должен быть указан ХС-собственник торговой марки (ТМ). По умолчанию, им является ХС-производитель.
 *             Если одно наименование продукции (ТМ) производится одним ХС-производителем на нескольких площадках,
 *             в реестре должна быть зарегистрирована строго одна запись.
 *             Если одно наименование продукции (ТМ), принадлежащее одному ХС-собственнику ТМ, производится несколькими ХС-производителями,
 *             в реестре должно быть зарегистрировано несколько записей по одной на каждого ХС-производителя.
 *          
 * 
 * <p>Java class for ProductItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/base}GenericVersioningEntity">
 *       &lt;sequence>
 *         &lt;element name="globalID" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}GTINType" minOccurs="0"/>
 *         &lt;element name="name" type="{http://api.vetrf.ru/schema/cdm/base}String255" minOccurs="0"/>
 *         &lt;element name="code" type="{http://api.vetrf.ru/schema/cdm/base}String255" minOccurs="0"/>
 *         &lt;element name="productType" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}ProductType" minOccurs="0"/>
 *         &lt;element name="product" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}Product" minOccurs="0"/>
 *         &lt;element name="subProduct" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}SubProduct" minOccurs="0"/>
 *         &lt;element name="correspondsToGost" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="gost" type="{http://api.vetrf.ru/schema/cdm/base}String255" minOccurs="0"/>
 *         &lt;element name="producer" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}BusinessEntity" minOccurs="0"/>
 *         &lt;element name="tmOwner" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}BusinessEntity" minOccurs="0"/>
 *         &lt;element name="producing" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}ProductItemProducing" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="packaging" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}Packaging" minOccurs="0"/>
 *         &lt;element name="isPublic" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductItem", propOrder = {
    "globalID",
    "name",
    "code",
    "productType",
    "product",
    "subProduct",
    "correspondsToGost",
    "gost",
    "producer",
    "tmOwner",
    "producing",
    "packaging",
    "isPublic"
})
public class ProductItem
    extends GenericVersioningEntity
{

    protected String globalID;
    protected String name;
    protected String code;
    protected BigInteger productType;
    protected Product product;
    protected SubProduct subProduct;
    protected Boolean correspondsToGost;
    protected String gost;
    protected BusinessEntity producer;
    protected BusinessEntity tmOwner;
    protected List<ProductItemProducing> producing;
    protected Packaging packaging;
    protected Boolean isPublic;

    /**
     * Gets the value of the globalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalID() {
        return globalID;
    }

    /**
     * Sets the value of the globalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalID(String value) {
        this.globalID = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

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
     * Gets the value of the correspondsToGost property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCorrespondsToGost() {
        return correspondsToGost;
    }

    /**
     * Sets the value of the correspondsToGost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCorrespondsToGost(Boolean value) {
        this.correspondsToGost = value;
    }

    /**
     * Gets the value of the gost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGost() {
        return gost;
    }

    /**
     * Sets the value of the gost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGost(String value) {
        this.gost = value;
    }

    /**
     * Gets the value of the producer property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessEntity }
     *     
     */
    public BusinessEntity getProducer() {
        return producer;
    }

    /**
     * Sets the value of the producer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessEntity }
     *     
     */
    public void setProducer(BusinessEntity value) {
        this.producer = value;
    }

    /**
     * Gets the value of the tmOwner property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessEntity }
     *     
     */
    public BusinessEntity getTmOwner() {
        return tmOwner;
    }

    /**
     * Sets the value of the tmOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessEntity }
     *     
     */
    public void setTmOwner(BusinessEntity value) {
        this.tmOwner = value;
    }

    /**
     * Gets the value of the producing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the producing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProducing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductItemProducing }
     * 
     * 
     */
    public List<ProductItemProducing> getProducing() {
        if (producing == null) {
            producing = new ArrayList<ProductItemProducing>();
        }
        return this.producing;
    }

    /**
     * Gets the value of the packaging property.
     * 
     * @return
     *     possible object is
     *     {@link Packaging }
     *     
     */
    public Packaging getPackaging() {
        return packaging;
    }

    /**
     * Sets the value of the packaging property.
     * 
     * @param value
     *     allowed object is
     *     {@link Packaging }
     *     
     */
    public void setPackaging(Packaging value) {
        this.packaging = value;
    }

    /**
     * Gets the value of the isPublic property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPublic() {
        return isPublic;
    }

    /**
     * Sets the value of the isPublic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPublic(Boolean value) {
        this.isPublic = value;
    }

}
