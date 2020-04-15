
package ru.vetrf.api.schema.cdm.mercury.vet_document.v2;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import ru.vetrf.api.schema.cdm.dictionary.v2.PackageList;
import ru.vetrf.api.schema.cdm.dictionary.v2.Unit;


/**
 * Тип, описывающий сырьё для производственной партии.
 * 
 * <p>Java class for RawBatch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RawBatch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sourceStockEntry" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}StockEntry" minOccurs="0"/>
 *         &lt;element name="volume" type="{http://api.vetrf.ru/schema/cdm/base}Decimal" minOccurs="0"/>
 *         &lt;element name="unit" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}Unit" minOccurs="0"/>
 *         &lt;element name="packageList" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}PackageList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RawBatch", propOrder = {
    "sourceStockEntry",
    "volume",
    "unit",
    "packageList"
})
public class RawBatch {

    protected StockEntry sourceStockEntry;
    protected BigDecimal volume;
    protected Unit unit;
    protected PackageList packageList;

    /**
     * Gets the value of the sourceStockEntry property.
     * 
     * @return
     *     possible object is
     *     {@link StockEntry }
     *     
     */
    public StockEntry getSourceStockEntry() {
        return sourceStockEntry;
    }

    /**
     * Sets the value of the sourceStockEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link StockEntry }
     *     
     */
    public void setSourceStockEntry(StockEntry value) {
        this.sourceStockEntry = value;
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

}
