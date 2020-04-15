
package ru.vetrf.api.schema.cdm.mercury.vet_document.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import ru.vetrf.api.schema.cdm.base.EntityList;


/**
 * Тип, описывающий список ВСД.
 * 
 * <p>Java class for VetDocumentList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VetDocumentList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/base}EntityList">
 *       &lt;sequence>
 *         &lt;element name="vetDocument" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}VetDocument" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VetDocumentList", propOrder = {
    "vetDocument"
})
public class VetDocumentList
    extends EntityList
{

    protected List<VetDocument> vetDocument;

    /**
     * Gets the value of the vetDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vetDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVetDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VetDocument }
     * 
     * 
     */
    public List<VetDocument> getVetDocument() {
        if (vetDocument == null) {
            vetDocument = new ArrayList<VetDocument>();
        }
        return this.vetDocument;
    }

}
