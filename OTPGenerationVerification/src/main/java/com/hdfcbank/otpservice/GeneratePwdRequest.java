//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.06.10 at 09:09:59 AM IST 
//


package com.hdfcbank.otpservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="HDFCGenPwdReq" type="{http://www.hdfcbank.com/OTPService/}HDFCGenPwdReq"/&gt;
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
    "hdfcGenPwdReq"
})
@XmlRootElement(name = "generatePwdRequest")
public class GeneratePwdRequest {

    @XmlElement(name = "HDFCGenPwdReq", required = true)
    protected HDFCGenPwdReq hdfcGenPwdReq;

    /**
     * Gets the value of the hdfcGenPwdReq property.
     * 
     * @return
     *     possible object is
     *     {@link HDFCGenPwdReq }
     *     
     */
    public HDFCGenPwdReq getHDFCGenPwdReq() {
        return hdfcGenPwdReq;
    }

    /**
     * Sets the value of the hdfcGenPwdReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link HDFCGenPwdReq }
     *     
     */
    public void setHDFCGenPwdReq(HDFCGenPwdReq value) {
        this.hdfcGenPwdReq = value;
    }

}