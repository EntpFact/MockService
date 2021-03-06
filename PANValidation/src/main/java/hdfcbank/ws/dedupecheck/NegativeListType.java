//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.07.01 at 12:37:40 PM IST 
//


package hdfcbank.ws.dedupecheck;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NegativeListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NegativeListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NegativeList" type="{http://hdfcbank/ws/DedupeCheck}MatchValueType"/&gt;
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Mobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Pan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ResiPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Filler1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Filler2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Filler3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Filler4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Filler5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Filler6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Filler7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Filler8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Filler9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Filler10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NegativeListType", propOrder = {
    "negativeList",
    "id",
    "firstName",
    "middleName",
    "lastName",
    "dob",
    "address",
    "mobile",
    "pan",
    "resiPhone",
    "remarks",
    "source",
    "filler1",
    "filler2",
    "filler3",
    "filler4",
    "filler5",
    "filler6",
    "filler7",
    "filler8",
    "filler9",
    "filler10"
})
public class NegativeListType {

    @XmlElement(name = "NegativeList", required = true)
    protected MatchValueType negativeList;
    @XmlElement(name = "ID")
    protected String id;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "DOB")
    protected String dob;
    @XmlElement(name = "Address")
    protected String address;
    @XmlElement(name = "Mobile")
    protected String mobile;
    @XmlElement(name = "Pan")
    protected String pan;
    @XmlElement(name = "ResiPhone")
    protected String resiPhone;
    @XmlElement(name = "Remarks")
    protected String remarks;
    @XmlElement(name = "Source")
    protected String source;
    @XmlElement(name = "Filler1")
    protected String filler1;
    @XmlElement(name = "Filler2")
    protected String filler2;
    @XmlElement(name = "Filler3")
    protected String filler3;
    @XmlElement(name = "Filler4")
    protected String filler4;
    @XmlElement(name = "Filler5")
    protected String filler5;
    @XmlElement(name = "Filler6")
    protected String filler6;
    @XmlElement(name = "Filler7")
    protected String filler7;
    @XmlElement(name = "Filler8")
    protected String filler8;
    @XmlElement(name = "Filler9")
    protected String filler9;
    @XmlElement(name = "Filler10")
    protected String filler10;

    /**
     * Gets the value of the negativeList property.
     * 
     * @return
     *     possible object is
     *     {@link MatchValueType }
     *     
     */
    public MatchValueType getNegativeList() {
        return negativeList;
    }

    /**
     * Sets the value of the negativeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchValueType }
     *     
     */
    public void setNegativeList(MatchValueType value) {
        this.negativeList = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the dob property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOB() {
        return dob;
    }

    /**
     * Sets the value of the dob property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOB(String value) {
        this.dob = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the mobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * Sets the value of the mobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile(String value) {
        this.mobile = value;
    }

    /**
     * Gets the value of the pan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPan() {
        return pan;
    }

    /**
     * Sets the value of the pan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPan(String value) {
        this.pan = value;
    }

    /**
     * Gets the value of the resiPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResiPhone() {
        return resiPhone;
    }

    /**
     * Sets the value of the resiPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResiPhone(String value) {
        this.resiPhone = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the filler1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiller1() {
        return filler1;
    }

    /**
     * Sets the value of the filler1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiller1(String value) {
        this.filler1 = value;
    }

    /**
     * Gets the value of the filler2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiller2() {
        return filler2;
    }

    /**
     * Sets the value of the filler2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiller2(String value) {
        this.filler2 = value;
    }

    /**
     * Gets the value of the filler3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiller3() {
        return filler3;
    }

    /**
     * Sets the value of the filler3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiller3(String value) {
        this.filler3 = value;
    }

    /**
     * Gets the value of the filler4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiller4() {
        return filler4;
    }

    /**
     * Sets the value of the filler4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiller4(String value) {
        this.filler4 = value;
    }

    /**
     * Gets the value of the filler5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiller5() {
        return filler5;
    }

    /**
     * Sets the value of the filler5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiller5(String value) {
        this.filler5 = value;
    }

    /**
     * Gets the value of the filler6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiller6() {
        return filler6;
    }

    /**
     * Sets the value of the filler6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiller6(String value) {
        this.filler6 = value;
    }

    /**
     * Gets the value of the filler7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiller7() {
        return filler7;
    }

    /**
     * Sets the value of the filler7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiller7(String value) {
        this.filler7 = value;
    }

    /**
     * Gets the value of the filler8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiller8() {
        return filler8;
    }

    /**
     * Sets the value of the filler8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiller8(String value) {
        this.filler8 = value;
    }

    /**
     * Gets the value of the filler9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiller9() {
        return filler9;
    }

    /**
     * Sets the value of the filler9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiller9(String value) {
        this.filler9 = value;
    }

    /**
     * Gets the value of the filler10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiller10() {
        return filler10;
    }

    /**
     * Sets the value of the filler10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiller10(String value) {
        this.filler10 = value;
    }

}
