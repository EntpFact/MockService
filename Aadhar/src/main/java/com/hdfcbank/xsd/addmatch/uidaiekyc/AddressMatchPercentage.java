//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.06.28 at 12:56:42 PM IST 
//


package com.hdfcbank.xsd.addmatch.uidaiekyc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressMatchPercentage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressMatchPercentage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="srcName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="trgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="srcAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="trgAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="srcEquality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="trgEquality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="srcPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="trgPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressMatchPercentage", propOrder = {
    "srcName",
    "trgName",
    "srcAddress",
    "trgAddress",
    "srcEquality",
    "trgEquality",
    "srcPhone",
    "trgPhone"
})
public class AddressMatchPercentage {

    protected String srcName;
    protected String trgName;
    protected String srcAddress;
    protected String trgAddress;
    protected String srcEquality;
    protected String trgEquality;
    protected String srcPhone;
    protected String trgPhone;

    /**
     * Gets the value of the srcName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrcName() {
        return srcName;
    }

    /**
     * Sets the value of the srcName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrcName(String value) {
        this.srcName = value;
    }

    /**
     * Gets the value of the trgName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrgName() {
        return trgName;
    }

    /**
     * Sets the value of the trgName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrgName(String value) {
        this.trgName = value;
    }

    /**
     * Gets the value of the srcAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrcAddress() {
        return srcAddress;
    }

    /**
     * Sets the value of the srcAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrcAddress(String value) {
        this.srcAddress = value;
    }

    /**
     * Gets the value of the trgAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrgAddress() {
        return trgAddress;
    }

    /**
     * Sets the value of the trgAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrgAddress(String value) {
        this.trgAddress = value;
    }

    /**
     * Gets the value of the srcEquality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrcEquality() {
        return srcEquality;
    }

    /**
     * Sets the value of the srcEquality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrcEquality(String value) {
        this.srcEquality = value;
    }

    /**
     * Gets the value of the trgEquality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrgEquality() {
        return trgEquality;
    }

    /**
     * Sets the value of the trgEquality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrgEquality(String value) {
        this.trgEquality = value;
    }

    /**
     * Gets the value of the srcPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrcPhone() {
        return srcPhone;
    }

    /**
     * Sets the value of the srcPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrcPhone(String value) {
        this.srcPhone = value;
    }

    /**
     * Gets the value of the trgPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrgPhone() {
        return trgPhone;
    }

    /**
     * Sets the value of the trgPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrgPhone(String value) {
        this.trgPhone = value;
    }

}