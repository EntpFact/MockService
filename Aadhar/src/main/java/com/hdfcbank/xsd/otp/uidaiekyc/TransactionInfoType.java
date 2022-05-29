//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.05.25 at 01:34:11 PM IST 
//


package com.hdfcbank.xsd.otp.uidaiekyc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Pan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Proc_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransmDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Stan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Local_Trans_Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Local_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Mcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Pan_entry_mode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Pos_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AcqId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CA_Tid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CA_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CA_TA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionInfoType", propOrder = {
    "pan",
    "procCode",
    "transmDate",
    "stan",
    "localTransTime",
    "localDate",
    "mcc",
    "panEntryMode",
    "posCode",
    "acqId",
    "rrn",
    "caTid",
    "caid",
    "cata"
})
public class TransactionInfoType {

    @XmlElement(name = "Pan")
    protected String pan;
    @XmlElement(name = "Proc_Code")
    protected String procCode;
    @XmlElement(name = "TransmDate")
    protected String transmDate;
    @XmlElement(name = "Stan")
    protected String stan;
    @XmlElement(name = "Local_Trans_Time")
    protected String localTransTime;
    @XmlElement(name = "Local_date")
    protected String localDate;
    @XmlElement(name = "Mcc")
    protected String mcc;
    @XmlElement(name = "Pan_entry_mode")
    protected String panEntryMode;
    @XmlElement(name = "Pos_code")
    protected String posCode;
    @XmlElement(name = "AcqId")
    protected String acqId;
    @XmlElement(name = "RRN")
    protected String rrn;
    @XmlElement(name = "CA_Tid")
    protected String caTid;
    @XmlElement(name = "CA_ID")
    protected String caid;
    @XmlElement(name = "CA_TA")
    protected String cata;

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
     * Gets the value of the procCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcCode() {
        return procCode;
    }

    /**
     * Sets the value of the procCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcCode(String value) {
        this.procCode = value;
    }

    /**
     * Gets the value of the transmDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransmDate() {
        return transmDate;
    }

    /**
     * Sets the value of the transmDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransmDate(String value) {
        this.transmDate = value;
    }

    /**
     * Gets the value of the stan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStan() {
        return stan;
    }

    /**
     * Sets the value of the stan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStan(String value) {
        this.stan = value;
    }

    /**
     * Gets the value of the localTransTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalTransTime() {
        return localTransTime;
    }

    /**
     * Sets the value of the localTransTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalTransTime(String value) {
        this.localTransTime = value;
    }

    /**
     * Gets the value of the localDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalDate() {
        return localDate;
    }

    /**
     * Sets the value of the localDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalDate(String value) {
        this.localDate = value;
    }

    /**
     * Gets the value of the mcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMcc() {
        return mcc;
    }

    /**
     * Sets the value of the mcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMcc(String value) {
        this.mcc = value;
    }

    /**
     * Gets the value of the panEntryMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPanEntryMode() {
        return panEntryMode;
    }

    /**
     * Sets the value of the panEntryMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPanEntryMode(String value) {
        this.panEntryMode = value;
    }

    /**
     * Gets the value of the posCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosCode() {
        return posCode;
    }

    /**
     * Sets the value of the posCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosCode(String value) {
        this.posCode = value;
    }

    /**
     * Gets the value of the acqId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcqId() {
        return acqId;
    }

    /**
     * Sets the value of the acqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcqId(String value) {
        this.acqId = value;
    }

    /**
     * Gets the value of the rrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRRN() {
        return rrn;
    }

    /**
     * Sets the value of the rrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRRN(String value) {
        this.rrn = value;
    }

    /**
     * Gets the value of the caTid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCATid() {
        return caTid;
    }

    /**
     * Sets the value of the caTid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCATid(String value) {
        this.caTid = value;
    }

    /**
     * Gets the value of the caid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAID() {
        return caid;
    }

    /**
     * Sets the value of the caid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAID(String value) {
        this.caid = value;
    }

    /**
     * Gets the value of the cata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCATA() {
        return cata;
    }

    /**
     * Sets the value of the cata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCATA(String value) {
        this.cata = value;
    }

}
