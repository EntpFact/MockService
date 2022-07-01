//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.07.01 at 12:37:40 PM IST 
//


package com.hdfcbank.xsd.multibureau;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IdType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PAN-ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PAN-ISSUE-DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PAN-EXPIRATION-DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PASSPORT-ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PASSPORT-ISSUE-DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PASSPORT-EXPIRATION-DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VOTER-ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VOTER-ID-ISSUE-DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VOTER-ID-EXPIRATION-DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DRIVING-LICENSE-NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DRIVER-LICENSE-ISSUE-DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DRIVER-LICENSE-EXPIRATION-DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UID-NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UNIVERSAL-ID-ISSUE-DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UNIVERSAL-ID-EXPIRATION-DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RATION-CARD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RATION-CARD-ISSUE-DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RATION-CARD-EXPIRATION-DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ID-TYPE-1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ID-TYPE-1-VALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ID-TYPE-2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ID-TYPE-2-VALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdType", propOrder = {
    "panid",
    "panissuedate",
    "panexpirationdate",
    "passportid",
    "passportissuedate",
    "passportexpirationdate",
    "voterid",
    "voteridissuedate",
    "voteridexpirationdate",
    "drivinglicenseno",
    "driverlicenseissuedate",
    "driverlicenseexpirationdate",
    "uidno",
    "universalidissuedate",
    "universalidexpirationdate",
    "rationcard",
    "rationcardissuedate",
    "rationcardexpirationdate",
    "idtype1",
    "idtype1VALUE",
    "idtype2",
    "idtype2VALUE"
})
public class IdType {

    @XmlElement(name = "PAN-ID")
    protected String panid;
    @XmlElement(name = "PAN-ISSUE-DATE")
    protected String panissuedate;
    @XmlElement(name = "PAN-EXPIRATION-DATE")
    protected String panexpirationdate;
    @XmlElement(name = "PASSPORT-ID")
    protected String passportid;
    @XmlElement(name = "PASSPORT-ISSUE-DATE")
    protected String passportissuedate;
    @XmlElement(name = "PASSPORT-EXPIRATION-DATE")
    protected String passportexpirationdate;
    @XmlElement(name = "VOTER-ID")
    protected String voterid;
    @XmlElement(name = "VOTER-ID-ISSUE-DATE")
    protected String voteridissuedate;
    @XmlElement(name = "VOTER-ID-EXPIRATION-DATE")
    protected String voteridexpirationdate;
    @XmlElement(name = "DRIVING-LICENSE-NO")
    protected String drivinglicenseno;
    @XmlElement(name = "DRIVER-LICENSE-ISSUE-DATE")
    protected String driverlicenseissuedate;
    @XmlElement(name = "DRIVER-LICENSE-EXPIRATION-DATE")
    protected String driverlicenseexpirationdate;
    @XmlElement(name = "UID-NO")
    protected String uidno;
    @XmlElement(name = "UNIVERSAL-ID-ISSUE-DATE")
    protected String universalidissuedate;
    @XmlElement(name = "UNIVERSAL-ID-EXPIRATION-DATE")
    protected String universalidexpirationdate;
    @XmlElement(name = "RATION-CARD")
    protected String rationcard;
    @XmlElement(name = "RATION-CARD-ISSUE-DATE")
    protected String rationcardissuedate;
    @XmlElement(name = "RATION-CARD-EXPIRATION-DATE")
    protected String rationcardexpirationdate;
    @XmlElement(name = "ID-TYPE-1")
    protected String idtype1;
    @XmlElement(name = "ID-TYPE-1-VALUE")
    protected String idtype1VALUE;
    @XmlElement(name = "ID-TYPE-2")
    protected String idtype2;
    @XmlElement(name = "ID-TYPE-2-VALUE")
    protected String idtype2VALUE;

    /**
     * Gets the value of the panid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPANID() {
        return panid;
    }

    /**
     * Sets the value of the panid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPANID(String value) {
        this.panid = value;
    }

    /**
     * Gets the value of the panissuedate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPANISSUEDATE() {
        return panissuedate;
    }

    /**
     * Sets the value of the panissuedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPANISSUEDATE(String value) {
        this.panissuedate = value;
    }

    /**
     * Gets the value of the panexpirationdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPANEXPIRATIONDATE() {
        return panexpirationdate;
    }

    /**
     * Sets the value of the panexpirationdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPANEXPIRATIONDATE(String value) {
        this.panexpirationdate = value;
    }

    /**
     * Gets the value of the passportid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPASSPORTID() {
        return passportid;
    }

    /**
     * Sets the value of the passportid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPASSPORTID(String value) {
        this.passportid = value;
    }

    /**
     * Gets the value of the passportissuedate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPASSPORTISSUEDATE() {
        return passportissuedate;
    }

    /**
     * Sets the value of the passportissuedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPASSPORTISSUEDATE(String value) {
        this.passportissuedate = value;
    }

    /**
     * Gets the value of the passportexpirationdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPASSPORTEXPIRATIONDATE() {
        return passportexpirationdate;
    }

    /**
     * Sets the value of the passportexpirationdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPASSPORTEXPIRATIONDATE(String value) {
        this.passportexpirationdate = value;
    }

    /**
     * Gets the value of the voterid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVOTERID() {
        return voterid;
    }

    /**
     * Sets the value of the voterid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVOTERID(String value) {
        this.voterid = value;
    }

    /**
     * Gets the value of the voteridissuedate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVOTERIDISSUEDATE() {
        return voteridissuedate;
    }

    /**
     * Sets the value of the voteridissuedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVOTERIDISSUEDATE(String value) {
        this.voteridissuedate = value;
    }

    /**
     * Gets the value of the voteridexpirationdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVOTERIDEXPIRATIONDATE() {
        return voteridexpirationdate;
    }

    /**
     * Sets the value of the voteridexpirationdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVOTERIDEXPIRATIONDATE(String value) {
        this.voteridexpirationdate = value;
    }

    /**
     * Gets the value of the drivinglicenseno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDRIVINGLICENSENO() {
        return drivinglicenseno;
    }

    /**
     * Sets the value of the drivinglicenseno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDRIVINGLICENSENO(String value) {
        this.drivinglicenseno = value;
    }

    /**
     * Gets the value of the driverlicenseissuedate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDRIVERLICENSEISSUEDATE() {
        return driverlicenseissuedate;
    }

    /**
     * Sets the value of the driverlicenseissuedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDRIVERLICENSEISSUEDATE(String value) {
        this.driverlicenseissuedate = value;
    }

    /**
     * Gets the value of the driverlicenseexpirationdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDRIVERLICENSEEXPIRATIONDATE() {
        return driverlicenseexpirationdate;
    }

    /**
     * Sets the value of the driverlicenseexpirationdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDRIVERLICENSEEXPIRATIONDATE(String value) {
        this.driverlicenseexpirationdate = value;
    }

    /**
     * Gets the value of the uidno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUIDNO() {
        return uidno;
    }

    /**
     * Sets the value of the uidno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUIDNO(String value) {
        this.uidno = value;
    }

    /**
     * Gets the value of the universalidissuedate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNIVERSALIDISSUEDATE() {
        return universalidissuedate;
    }

    /**
     * Sets the value of the universalidissuedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNIVERSALIDISSUEDATE(String value) {
        this.universalidissuedate = value;
    }

    /**
     * Gets the value of the universalidexpirationdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNIVERSALIDEXPIRATIONDATE() {
        return universalidexpirationdate;
    }

    /**
     * Sets the value of the universalidexpirationdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNIVERSALIDEXPIRATIONDATE(String value) {
        this.universalidexpirationdate = value;
    }

    /**
     * Gets the value of the rationcard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRATIONCARD() {
        return rationcard;
    }

    /**
     * Sets the value of the rationcard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRATIONCARD(String value) {
        this.rationcard = value;
    }

    /**
     * Gets the value of the rationcardissuedate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRATIONCARDISSUEDATE() {
        return rationcardissuedate;
    }

    /**
     * Sets the value of the rationcardissuedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRATIONCARDISSUEDATE(String value) {
        this.rationcardissuedate = value;
    }

    /**
     * Gets the value of the rationcardexpirationdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRATIONCARDEXPIRATIONDATE() {
        return rationcardexpirationdate;
    }

    /**
     * Sets the value of the rationcardexpirationdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRATIONCARDEXPIRATIONDATE(String value) {
        this.rationcardexpirationdate = value;
    }

    /**
     * Gets the value of the idtype1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDTYPE1() {
        return idtype1;
    }

    /**
     * Sets the value of the idtype1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDTYPE1(String value) {
        this.idtype1 = value;
    }

    /**
     * Gets the value of the idtype1VALUE property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDTYPE1VALUE() {
        return idtype1VALUE;
    }

    /**
     * Sets the value of the idtype1VALUE property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDTYPE1VALUE(String value) {
        this.idtype1VALUE = value;
    }

    /**
     * Gets the value of the idtype2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDTYPE2() {
        return idtype2;
    }

    /**
     * Sets the value of the idtype2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDTYPE2(String value) {
        this.idtype2 = value;
    }

    /**
     * Gets the value of the idtype2VALUE property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDTYPE2VALUE() {
        return idtype2VALUE;
    }

    /**
     * Sets the value of the idtype2VALUE property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDTYPE2VALUE(String value) {
        this.idtype2VALUE = value;
    }

}
