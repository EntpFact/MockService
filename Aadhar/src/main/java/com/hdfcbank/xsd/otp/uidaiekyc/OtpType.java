//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.06.28 at 12:56:42 PM IST 
//


package com.hdfcbank.xsd.otp.uidaiekyc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for otpType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="otpType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OTPOption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "otpType", propOrder = {
    "otpOption"
})
public class OtpType {

    @XmlElement(name = "OTPOption")
    protected String otpOption;

    /**
     * Gets the value of the otpOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOTPOption() {
        return otpOption;
    }

    /**
     * Sets the value of the otpOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOTPOption(String value) {
        this.otpOption = value;
    }

}
