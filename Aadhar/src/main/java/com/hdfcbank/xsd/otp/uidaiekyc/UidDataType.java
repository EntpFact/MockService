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
 * <p>Java class for UidDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UidDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UID_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OPT_Send_Response" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UidDataType", propOrder = {
    "uidno",
    "optSendResponse"
})
public class UidDataType {

    @XmlElement(name = "UID_NO")
    protected String uidno;
    @XmlElement(name = "OPT_Send_Response")
    protected String optSendResponse;

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
     * Gets the value of the optSendResponse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPTSendResponse() {
        return optSendResponse;
    }

    /**
     * Sets the value of the optSendResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPTSendResponse(String value) {
        this.optSendResponse = value;
    }

}