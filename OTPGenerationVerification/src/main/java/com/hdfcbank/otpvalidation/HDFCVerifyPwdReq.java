//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.06.14 at 12:07:52 PM IST 
//


package com.hdfcbank.otpvalidation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HDFCVerifyPwdReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HDFCVerifyPwdReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="callerId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="instanceId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="linkData" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="messageHash" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="refNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="authenticationsAllowed" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="expiryMin" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="maxAttempts" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="passwordValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="passwordCategory" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="passwordLength" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="passwordMask" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fillerField2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fillerField3" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fillerField4" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fillerField5" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HDFCVerifyPwdReq", propOrder = {
    "callerId",
    "instanceId",
    "linkData",
    "messageHash",
    "refNo",
    "authenticationsAllowed",
    "expiryMin",
    "maxAttempts",
    "passwordValue",
    "passwordCategory",
    "passwordLength",
    "passwordMask",
    "fillerField2",
    "fillerField3",
    "fillerField4",
    "fillerField5"
})
public class HDFCVerifyPwdReq {

    @XmlElement(required = true, nillable = true)
    protected String callerId;
    @XmlElement(required = true, nillable = true)
    protected String instanceId;
    @XmlElement(required = true, nillable = true)
    protected String linkData;
    @XmlElement(required = true, nillable = true)
    protected String messageHash;
    @XmlElement(required = true, nillable = true)
    protected String refNo;
    protected int authenticationsAllowed;
    protected int expiryMin;
    protected int maxAttempts;
    @XmlElement(required = true, nillable = true)
    protected String passwordValue;
    @XmlElement(required = true, nillable = true)
    protected String passwordCategory;
    protected int passwordLength;
    @XmlElement(required = true, nillable = true)
    protected String passwordMask;
    @XmlElement(required = true, nillable = true)
    protected String fillerField2;
    @XmlElement(required = true, nillable = true)
    protected String fillerField3;
    @XmlElement(required = true, nillable = true)
    protected String fillerField4;
    @XmlElement(required = true, nillable = true)
    protected String fillerField5;

    /**
     * Gets the value of the callerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallerId() {
        return callerId;
    }

    /**
     * Sets the value of the callerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallerId(String value) {
        this.callerId = value;
    }

    /**
     * Gets the value of the instanceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * Sets the value of the instanceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstanceId(String value) {
        this.instanceId = value;
    }

    /**
     * Gets the value of the linkData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkData() {
        return linkData;
    }

    /**
     * Sets the value of the linkData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkData(String value) {
        this.linkData = value;
    }

    /**
     * Gets the value of the messageHash property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageHash() {
        return messageHash;
    }

    /**
     * Sets the value of the messageHash property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageHash(String value) {
        this.messageHash = value;
    }

    /**
     * Gets the value of the refNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefNo() {
        return refNo;
    }

    /**
     * Sets the value of the refNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefNo(String value) {
        this.refNo = value;
    }

    /**
     * Gets the value of the authenticationsAllowed property.
     * 
     */
    public int getAuthenticationsAllowed() {
        return authenticationsAllowed;
    }

    /**
     * Sets the value of the authenticationsAllowed property.
     * 
     */
    public void setAuthenticationsAllowed(int value) {
        this.authenticationsAllowed = value;
    }

    /**
     * Gets the value of the expiryMin property.
     * 
     */
    public int getExpiryMin() {
        return expiryMin;
    }

    /**
     * Sets the value of the expiryMin property.
     * 
     */
    public void setExpiryMin(int value) {
        this.expiryMin = value;
    }

    /**
     * Gets the value of the maxAttempts property.
     * 
     */
    public int getMaxAttempts() {
        return maxAttempts;
    }

    /**
     * Sets the value of the maxAttempts property.
     * 
     */
    public void setMaxAttempts(int value) {
        this.maxAttempts = value;
    }

    /**
     * Gets the value of the passwordValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasswordValue() {
        return passwordValue;
    }

    /**
     * Sets the value of the passwordValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasswordValue(String value) {
        this.passwordValue = value;
    }

    /**
     * Gets the value of the passwordCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasswordCategory() {
        return passwordCategory;
    }

    /**
     * Sets the value of the passwordCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasswordCategory(String value) {
        this.passwordCategory = value;
    }

    /**
     * Gets the value of the passwordLength property.
     * 
     */
    public int getPasswordLength() {
        return passwordLength;
    }

    /**
     * Sets the value of the passwordLength property.
     * 
     */
    public void setPasswordLength(int value) {
        this.passwordLength = value;
    }

    /**
     * Gets the value of the passwordMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasswordMask() {
        return passwordMask;
    }

    /**
     * Sets the value of the passwordMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasswordMask(String value) {
        this.passwordMask = value;
    }

    /**
     * Gets the value of the fillerField2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFillerField2() {
        return fillerField2;
    }

    /**
     * Sets the value of the fillerField2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFillerField2(String value) {
        this.fillerField2 = value;
    }

    /**
     * Gets the value of the fillerField3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFillerField3() {
        return fillerField3;
    }

    /**
     * Sets the value of the fillerField3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFillerField3(String value) {
        this.fillerField3 = value;
    }

    /**
     * Gets the value of the fillerField4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFillerField4() {
        return fillerField4;
    }

    /**
     * Sets the value of the fillerField4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFillerField4(String value) {
        this.fillerField4 = value;
    }

    /**
     * Gets the value of the fillerField5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFillerField5() {
        return fillerField5;
    }

    /**
     * Sets the value of the fillerField5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFillerField5(String value) {
        this.fillerField5 = value;
    }

}
