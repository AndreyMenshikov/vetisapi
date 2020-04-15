
package ru.vetrf.api.schema.cdm.base;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import ru.vetrf.api.schema.cdm.dictionary.v2.ActivityLocationList;
import ru.vetrf.api.schema.cdm.dictionary.v2.AnimalDiseaseList;
import ru.vetrf.api.schema.cdm.dictionary.v2.BusinessEntityList;
import ru.vetrf.api.schema.cdm.dictionary.v2.CountryList;
import ru.vetrf.api.schema.cdm.dictionary.v2.DistrictList;
import ru.vetrf.api.schema.cdm.dictionary.v2.EnterpriseActivityList;
import ru.vetrf.api.schema.cdm.dictionary.v2.EnterpriseList;
import ru.vetrf.api.schema.cdm.dictionary.v2.LocalityList;
import ru.vetrf.api.schema.cdm.dictionary.v2.ProductItemList;
import ru.vetrf.api.schema.cdm.dictionary.v2.ProductList;
import ru.vetrf.api.schema.cdm.dictionary.v2.PurposeList;
import ru.vetrf.api.schema.cdm.dictionary.v2.RegionList;
import ru.vetrf.api.schema.cdm.dictionary.v2.RegionalizationConditionList;
import ru.vetrf.api.schema.cdm.dictionary.v2.RegionalizationRegionStatusList;
import ru.vetrf.api.schema.cdm.dictionary.v2.RegionalizationShippingRuleList;
import ru.vetrf.api.schema.cdm.dictionary.v2.ResearchMethodList;
import ru.vetrf.api.schema.cdm.dictionary.v2.StreetList;
import ru.vetrf.api.schema.cdm.dictionary.v2.SubProductList;
import ru.vetrf.api.schema.cdm.dictionary.v2.UnitList;


/**
 * Базовый тип для описания списков сущностей.
 *          
 * 
 * <p>Java class for EntityList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="total" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="offset" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="hasMore" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityList")
@XmlSeeAlso({
    StreetList.class,
    ResearchMethodList.class,
    RegionalizationShippingRuleList.class,
    EnterpriseList.class,
    BusinessEntityList.class,
    RegionalizationConditionList.class,
    UnitList.class,
    SubProductList.class,
    AnimalDiseaseList.class,
    LocalityList.class,
    DistrictList.class,
    PurposeList.class,
    RegionList.class,
    ActivityLocationList.class,
    ProductList.class,
    RegionalizationRegionStatusList.class,
    ProductItemList.class,
    CountryList.class,
    EnterpriseActivityList.class
})
public class EntityList {

    @XmlAttribute(name = "count")
    protected Integer count;
    @XmlAttribute(name = "total")
    protected Long total;
    @XmlAttribute(name = "offset")
    protected Integer offset;
    @XmlAttribute(name = "hasMore")
    protected Boolean hasMore;

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCount(Integer value) {
        this.count = value;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotal(Long value) {
        this.total = value;
    }

    /**
     * Gets the value of the offset property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOffset(Integer value) {
        this.offset = value;
    }

    /**
     * Gets the value of the hasMore property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasMore() {
        return hasMore;
    }

    /**
     * Sets the value of the hasMore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasMore(Boolean value) {
        this.hasMore = value;
    }

}
