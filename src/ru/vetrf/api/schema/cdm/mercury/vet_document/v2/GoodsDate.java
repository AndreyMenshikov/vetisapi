
package ru.vetrf.api.schema.cdm.mercury.vet_document.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import ru.vetrf.api.schema.cdm.dictionary.v2.ComplexDate;


/**
 * С версии 2.0 указание даты строкой (элемент informalDate) в запросах не допускается.
 *             В ответах сервиса дата строкой может присутствовать для старых вет.сертификатов/записей складского журнала.
 *          
 * 
 * <p>Java class for GoodsDate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GoodsDate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="firstDate" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}ComplexDate" minOccurs="0"/>
 *         &lt;element name="secondDate" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}ComplexDate" minOccurs="0"/>
 *         &lt;element name="informalDate" type="{http://api.vetrf.ru/schema/cdm/base}String255" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GoodsDate", propOrder = {
    "firstDate",
    "secondDate",
    "informalDate"
})
public class GoodsDate {

    protected ComplexDate firstDate;
    protected ComplexDate secondDate;
    protected String informalDate;

    /**
     * Gets the value of the firstDate property.
     * 
     * @return
     *     possible object is
     *     {@link ComplexDate }
     *     
     */
    public ComplexDate getFirstDate() {
        return firstDate;
    }

    /**
     * Sets the value of the firstDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexDate }
     *     
     */
    public void setFirstDate(ComplexDate value) {
        this.firstDate = value;
    }

    /**
     * Gets the value of the secondDate property.
     * 
     * @return
     *     possible object is
     *     {@link ComplexDate }
     *     
     */
    public ComplexDate getSecondDate() {
        return secondDate;
    }

    /**
     * Sets the value of the secondDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexDate }
     *     
     */
    public void setSecondDate(ComplexDate value) {
        this.secondDate = value;
    }

    /**
     * Gets the value of the informalDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformalDate() {
        return informalDate;
    }

    /**
     * Sets the value of the informalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformalDate(String value) {
        this.informalDate = value;
    }

}
