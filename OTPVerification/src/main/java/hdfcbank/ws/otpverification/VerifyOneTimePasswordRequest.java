//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.05.04 at 10:51:23 AM IST 
//


package hdfcbank.ws.otpverification;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arg0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="bankCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="channel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="serviceCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="userReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="transactingPartyCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="userReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="transactionBranch" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="arg1"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="callerId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="instanceId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="linkData" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="messageHash" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="refNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="authenticationsAllowed" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="expiryMin" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="maxAttempts" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="passwordCategory" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="passwordMask" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="passwordLength" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="forceNew" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="fillerField5" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="fillerField4" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="fillerField3" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="fillerField2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="fillerField1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="customerMobileNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="customerEmailId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "arg0",
    "arg1"
})
@XmlRootElement(name = "verifyOneTimePasswordRequest")
public class VerifyOneTimePasswordRequest {

    @XmlElement(required = true)
    protected VerifyOneTimePasswordRequest.Arg0 arg0;
    @XmlElement(required = true)
    protected VerifyOneTimePasswordRequest.Arg1 arg1;

    /**
     * Gets the value of the arg0 property.
     * 
     * @return
     *     possible object is
     *     {@link VerifyOneTimePasswordRequest.Arg0 }
     *     
     */
    public VerifyOneTimePasswordRequest.Arg0 getArg0() {
        return arg0;
    }

    /**
     * Sets the value of the arg0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerifyOneTimePasswordRequest.Arg0 }
     *     
     */
    public void setArg0(VerifyOneTimePasswordRequest.Arg0 value) {
        this.arg0 = value;
    }

    /**
     * Gets the value of the arg1 property.
     * 
     * @return
     *     possible object is
     *     {@link VerifyOneTimePasswordRequest.Arg1 }
     *     
     */
    public VerifyOneTimePasswordRequest.Arg1 getArg1() {
        return arg1;
    }

    /**
     * Sets the value of the arg1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerifyOneTimePasswordRequest.Arg1 }
     *     
     */
    public void setArg1(VerifyOneTimePasswordRequest.Arg1 value) {
        this.arg1 = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="bankCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="channel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="serviceCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="userReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="transactingPartyCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="userReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="transactionBranch" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "content"
    })
    public static class Arg0 {

        @XmlElementRefs({
            @XmlElementRef(name = "bankCode", namespace = "http://hdfcbank/ws/OTPVerification", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "channel", namespace = "http://hdfcbank/ws/OTPVerification", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "serviceCode", namespace = "http://hdfcbank/ws/OTPVerification", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "userReferenceNumber", namespace = "http://hdfcbank/ws/OTPVerification", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "transactingPartyCode", namespace = "http://hdfcbank/ws/OTPVerification", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "transactionBranch", namespace = "http://hdfcbank/ws/OTPVerification", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "userId", namespace = "http://hdfcbank/ws/OTPVerification", type = JAXBElement.class, required = false)
        })
        protected List<JAXBElement<String>> content;

        /**
         * Gets the rest of the content model. 
         * 
         * <p>
         * You are getting this "catch-all" property because of the following reason: 
         * The field name "UserReferenceNumber" is used by two different parts of a schema. See: 
         * line 14 of file:/C:/Users/naval/Documents/Workspace1/OTPVerification.zip_expanded/OTPVerification/src/main/resources/otpVerification.xsd
         * line 12 of file:/C:/Users/naval/Documents/Workspace1/OTPVerification.zip_expanded/OTPVerification/src/main/resources/otpVerification.xsd
         * <p>
         * To get rid of this property, apply a property customization to one 
         * of both of the following declarations to change their names: 
         * Gets the value of the content property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the content property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * 
         * 
         */
        public List<JAXBElement<String>> getContent() {
            if (content == null) {
                content = new ArrayList<JAXBElement<String>>();
            }
            return this.content;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="callerId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="instanceId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="linkData" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="messageHash" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="refNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="authenticationsAllowed" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="expiryMin" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="maxAttempts" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="passwordCategory" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="passwordMask" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="passwordLength" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="forceNew" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="fillerField5" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="fillerField4" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="fillerField3" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="fillerField2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="fillerField1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="customerMobileNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="customerEmailId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "callerId",
        "instanceId",
        "linkData",
        "messageHash",
        "refNo",
        "authenticationsAllowed",
        "expiryMin",
        "maxAttempts",
        "passwordCategory",
        "passwordMask",
        "passwordLength",
        "forceNew",
        "fillerField5",
        "fillerField4",
        "fillerField3",
        "fillerField2",
        "fillerField1",
        "customerMobileNo",
        "customerEmailId"
    })
    public static class Arg1 {

        @XmlElement(required = true)
        protected String callerId;
        @XmlElement(required = true)
        protected String instanceId;
        @XmlElement(required = true)
        protected String linkData;
        @XmlElement(required = true)
        protected String messageHash;
        @XmlElement(required = true)
        protected String refNo;
        @XmlElement(required = true)
        protected String authenticationsAllowed;
        protected int expiryMin;
        protected int maxAttempts;
        @XmlElement(required = true)
        protected String passwordCategory;
        @XmlElement(required = true)
        protected String passwordMask;
        protected int passwordLength;
        @XmlElement(required = true)
        protected String forceNew;
        @XmlElement(required = true)
        protected String fillerField5;
        @XmlElement(required = true)
        protected String fillerField4;
        @XmlElement(required = true)
        protected String fillerField3;
        @XmlElement(required = true)
        protected String fillerField2;
        @XmlElement(required = true)
        protected String fillerField1;
        @XmlElement(required = true)
        protected String customerMobileNo;
        @XmlElement(required = true)
        protected String customerEmailId;

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
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAuthenticationsAllowed() {
            return authenticationsAllowed;
        }

        /**
         * Sets the value of the authenticationsAllowed property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAuthenticationsAllowed(String value) {
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
         * Gets the value of the forceNew property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getForceNew() {
            return forceNew;
        }

        /**
         * Sets the value of the forceNew property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setForceNew(String value) {
            this.forceNew = value;
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
         * Gets the value of the fillerField1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFillerField1() {
            return fillerField1;
        }

        /**
         * Sets the value of the fillerField1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFillerField1(String value) {
            this.fillerField1 = value;
        }

        /**
         * Gets the value of the customerMobileNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCustomerMobileNo() {
            return customerMobileNo;
        }

        /**
         * Sets the value of the customerMobileNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCustomerMobileNo(String value) {
            this.customerMobileNo = value;
        }

        /**
         * Gets the value of the customerEmailId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCustomerEmailId() {
            return customerEmailId;
        }

        /**
         * Sets the value of the customerEmailId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCustomerEmailId(String value) {
            this.customerEmailId = value;
        }

    }

}
