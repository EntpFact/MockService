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
 *         &lt;element name="CommunicationParam" type="{multibureau.xsd.hdfcbank.com}CommunicationParamType"/&gt;
 *         &lt;element name="REQUEST" type="{multibureau.xsd.hdfcbank.com}RequestType"/&gt;
 *         &lt;element name="soaStandard" type="{multibureau.xsd.hdfcbank.com}soaStandard" minOccurs="0"/&gt;
 *         &lt;element name="soaFillers" type="{multibureau.xsd.hdfcbank.com}soaFillers" minOccurs="0"/&gt;
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
    "communicationParam",
    "request",
    "soaStandard",
    "soaFillers"
})
@XmlRootElement(name = "MultiBureauServiceRequest")
public class MultiBureauServiceRequest {

    @XmlElement(name = "CommunicationParam", required = true)
    protected CommunicationParamType communicationParam;
    @XmlElement(name = "REQUEST", required = true)
    protected RequestType request;
    protected SoaStandard soaStandard;
    protected SoaFillers soaFillers;

    /**
     * Gets the value of the communicationParam property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationParamType }
     *     
     */
    public CommunicationParamType getCommunicationParam() {
        return communicationParam;
    }

    /**
     * Sets the value of the communicationParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationParamType }
     *     
     */
    public void setCommunicationParam(CommunicationParamType value) {
        this.communicationParam = value;
    }

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link RequestType }
     *     
     */
    public RequestType getREQUEST() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestType }
     *     
     */
    public void setREQUEST(RequestType value) {
        this.request = value;
    }

    /**
     * Gets the value of the soaStandard property.
     * 
     * @return
     *     possible object is
     *     {@link SoaStandard }
     *     
     */
    public SoaStandard getSoaStandard() {
        return soaStandard;
    }

    /**
     * Sets the value of the soaStandard property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoaStandard }
     *     
     */
    public void setSoaStandard(SoaStandard value) {
        this.soaStandard = value;
    }

    /**
     * Gets the value of the soaFillers property.
     * 
     * @return
     *     possible object is
     *     {@link SoaFillers }
     *     
     */
    public SoaFillers getSoaFillers() {
        return soaFillers;
    }

    /**
     * Sets the value of the soaFillers property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoaFillers }
     *     
     */
    public void setSoaFillers(SoaFillers value) {
        this.soaFillers = value;
    }

}
