
package ru.vetrf.api.schema.cdm.mercury.vet_document.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Тип, описывающий производственную операцию.
 * 
 * <p>Java class for ProductionOperation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductionOperation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="operationId" type="{http://api.vetrf.ru/schema/cdm/base}Identifier" minOccurs="0"/>
 *         &lt;element name="rawBatch" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}RawBatch" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productiveBatch" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}ProductiveBatch" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="finalizeOperation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="appliedProcess" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}ProcessingProcedure" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductionOperation", propOrder = {
    "operationId",
    "rawBatch",
    "productiveBatch",
    "finalizeOperation",
    "appliedProcess"
})
public class ProductionOperation {

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String operationId;
    protected List<RawBatch> rawBatch;
    protected List<ProductiveBatch> productiveBatch;
    protected Boolean finalizeOperation;
    protected List<ProcessingProcedure> appliedProcess;

    /**
     * Gets the value of the operationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationId() {
        return operationId;
    }

    /**
     * Sets the value of the operationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationId(String value) {
        this.operationId = value;
    }

    /**
     * Gets the value of the rawBatch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rawBatch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRawBatch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RawBatch }
     * 
     * 
     */
    public List<RawBatch> getRawBatch() {
        if (rawBatch == null) {
            rawBatch = new ArrayList<RawBatch>();
        }
        return this.rawBatch;
    }

    /**
     * Gets the value of the productiveBatch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productiveBatch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductiveBatch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductiveBatch }
     * 
     * 
     */
    public List<ProductiveBatch> getProductiveBatch() {
        if (productiveBatch == null) {
            productiveBatch = new ArrayList<ProductiveBatch>();
        }
        return this.productiveBatch;
    }

    /**
     * Gets the value of the finalizeOperation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFinalizeOperation() {
        return finalizeOperation;
    }

    /**
     * Sets the value of the finalizeOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFinalizeOperation(Boolean value) {
        this.finalizeOperation = value;
    }

    /**
     * Gets the value of the appliedProcess property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appliedProcess property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppliedProcess().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcessingProcedure }
     * 
     * 
     */
    public List<ProcessingProcedure> getAppliedProcess() {
        if (appliedProcess == null) {
            appliedProcess = new ArrayList<ProcessingProcedure>();
        }
        return this.appliedProcess;
    }

}
