
package proxy;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAdminToken complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="getAdminToken">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="adminUsername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="adminPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAdminToken", propOrder = {
    "adminUsername",
    "adminPassword"
})
public class GetAdminToken {

    protected String adminUsername;
    protected String adminPassword;

    /**
     * Gets the value of the adminUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminUsername() {
        return adminUsername;
    }

    /**
     * Sets the value of the adminUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminUsername(String value) {
        this.adminUsername = value;
    }

    /**
     * Gets the value of the adminPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminPassword() {
        return adminPassword;
    }

    /**
     * Sets the value of the adminPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminPassword(String value) {
        this.adminPassword = value;
    }

}
