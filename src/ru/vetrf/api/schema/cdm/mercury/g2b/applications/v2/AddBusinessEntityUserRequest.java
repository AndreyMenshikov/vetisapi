
package ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.vetrf.api.schema.cdm.mercury.vet_document.v2.User;


/**
 * Запрос на регистрацию/привязку пользователя(ей) хозяйствующего субъекта.
 *             Если пользователь с указанным uuid, login, passport или snils уже зарегистрирован и ФИО совпадает,
 *             он будет прикреплен к ХС-заявителю (если зарегистрированный пользователь не привязан к ХС-заявителю).
 *             Профиль пользователя при этом обновлен не будет.
 *             Если ФИО не совпадает или пользователь уже привязан к ХС-заявителю -- пользователь зарегистрирован/привязан не будет.
 *             Иначе регистрируется новый пользователь при условии заполнения обязательных сведений.
 *             За один запрос можно зарегистрировать/привязать не более N пользователей.
 *             Для вновь регистрируемых пользователей и существующих пользователей, для которых выполняется привязка к ХС-заявителю,
 *             будут установлены права и зоны ответственности, указанные в запросе.
 *          
 * 
 * <p>Java class for AddBusinessEntityUserRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddBusinessEntityUserRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/mercury/g2b/applications/v2}MercuryApplicationRequest">
 *       &lt;sequence>
 *         &lt;element ref="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}user" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddBusinessEntityUserRequest", propOrder = {
    "user"
})
public class AddBusinessEntityUserRequest
    extends MercuryApplicationRequest
{

    @XmlElement(namespace = "http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2", required = true)
    protected List<User> user;

    /**
     * Сведения о регистрируемом пользователе.Gets the value of the user property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the user property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUser().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link User }
     * 
     * 
     */
    public List<User> getUser() {
        if (user == null) {
            user = new ArrayList<User>();
        }
        return this.user;
    }

}
