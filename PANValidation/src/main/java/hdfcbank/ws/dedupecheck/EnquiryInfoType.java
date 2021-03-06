//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.07.01 at 12:37:40 PM IST 
//


package hdfcbank.ws.dedupecheck;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnquiryInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnquiryInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Addresses" type="{http://hdfcbank/ws/DedupeCheck}AddressesType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DateOfBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmailId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MobileNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LandPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PanNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SOAFiller" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnquiryInfoType", propOrder = {
    "customerName",
    "addresses",
    "dateOfBirth",
    "emailId",
    "mobileNo",
    "landPhone",
    "panNo",
    "uid",
    "soaFiller"
})
public class EnquiryInfoType {

    @XmlElement(name = "CustomerName")
    protected String customerName;
    @XmlElement(name = "Addresses")
    protected List<AddressesType> addresses;
    @XmlElement(name = "DateOfBirth")
    protected String dateOfBirth;
    @XmlElement(name = "EmailId")
    protected String emailId;
    @XmlElement(name = "MobileNo")
    protected String mobileNo;
    @XmlElement(name = "LandPhone")
    protected String landPhone;
    @XmlElement(name = "PanNo")
    protected String panNo;
    @XmlElement(name = "UID")
    protected String uid;
    @XmlElement(name = "SOAFiller")
    protected String soaFiller;

    /**
     * Gets the value of the customerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Gets the value of the addresses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addresses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddresses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressesType }
     * 
     * 
     */
    public List<AddressesType> getAddresses() {
        if (addresses == null) {
            addresses = new ArrayList<AddressesType>();
        }
        return this.addresses;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfBirth(String value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the emailId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailId() {
        return emailId;
    }

    /**
     * Sets the value of the emailId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailId(String value) {
        this.emailId = value;
    }

    /**
     * Gets the value of the mobileNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileNo() {
        return mobileNo;
    }

    /**
     * Sets the value of the mobileNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileNo(String value) {
        this.mobileNo = value;
    }

    /**
     * Gets the value of the landPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandPhone() {
        return landPhone;
    }

    /**
     * Sets the value of the landPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandPhone(String value) {
        this.landPhone = value;
    }

    /**
     * Gets the value of the panNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPanNo() {
        return panNo;
    }

    /**
     * Sets the value of the panNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPanNo(String value) {
        this.panNo = value;
    }

    /**
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUID() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUID(String value) {
        this.uid = value;
    }

    /**
     * Gets the value of the soaFiller property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOAFiller() {
        return soaFiller;
    }

    /**
     * Sets the value of the soaFiller property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOAFiller(String value) {
        this.soaFiller = value;
    }

}
