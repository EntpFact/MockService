//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.06.27 at 09:57:19 AM IST 
//


package com.hdfcbank.xsd.multibureau;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for soaStandard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="soaStandard"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="service_user" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="service_password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="consumer_name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="unique_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="time_stamp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "soaStandard", propOrder = {
    "serviceUser",
    "servicePassword",
    "consumerName",
    "uniqueId",
    "timeStamp"
})
public class SoaStandard {

    @XmlElement(name = "service_user", required = true)
    protected String serviceUser;
    @XmlElement(name = "service_password")
    protected String servicePassword;
    @XmlElement(name = "consumer_name", required = true)
    protected String consumerName;
    @XmlElement(name = "unique_id")
    protected String uniqueId;
    @XmlElement(name = "time_stamp", required = true)
    protected String timeStamp;

    /**
     * Gets the value of the serviceUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceUser() {
        return serviceUser;
    }

    /**
     * Sets the value of the serviceUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceUser(String value) {
        this.serviceUser = value;
    }

    /**
     * Gets the value of the servicePassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicePassword() {
        return servicePassword;
    }

    /**
     * Sets the value of the servicePassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicePassword(String value) {
        this.servicePassword = value;
    }

    /**
     * Gets the value of the consumerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerName() {
        return consumerName;
    }

    /**
     * Sets the value of the consumerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerName(String value) {
        this.consumerName = value;
    }

    /**
     * Gets the value of the uniqueId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueId() {
        return uniqueId;
    }

    /**
     * Sets the value of the uniqueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueId(String value) {
        this.uniqueId = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeStamp(String value) {
        this.timeStamp = value;
    }

}
