//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.07.01 at 12:37:40 PM IST 
//


package com.hdfcbank.xsd.multibureau;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcknowledgementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcknowledgementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HEADER" type="{multibureau.xsd.hdfcbank.com}AckHeaderType" minOccurs="0"/&gt;
 *         &lt;element name="ACKNOWLEDGEMENT-ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WARNINGS" type="{multibureau.xsd.hdfcbank.com}WarningsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ERRORS" type="{multibureau.xsd.hdfcbank.com}ErrorsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcknowledgementType", propOrder = {
    "header",
    "acknowledgementid",
    "status",
    "warnings",
    "errors"
})
public class AcknowledgementType {

    @XmlElement(name = "HEADER")
    protected AckHeaderType header;
    @XmlElement(name = "ACKNOWLEDGEMENT-ID")
    protected String acknowledgementid;
    @XmlElement(name = "STATUS")
    protected String status;
    @XmlElement(name = "WARNINGS")
    protected List<WarningsType> warnings;
    @XmlElement(name = "ERRORS")
    protected List<ErrorsType> errors;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link AckHeaderType }
     *     
     */
    public AckHeaderType getHEADER() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link AckHeaderType }
     *     
     */
    public void setHEADER(AckHeaderType value) {
        this.header = value;
    }

    /**
     * Gets the value of the acknowledgementid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACKNOWLEDGEMENTID() {
        return acknowledgementid;
    }

    /**
     * Sets the value of the acknowledgementid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACKNOWLEDGEMENTID(String value) {
        this.acknowledgementid = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATUS(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the warnings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warnings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWARNINGS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WarningsType }
     * 
     * 
     */
    public List<WarningsType> getWARNINGS() {
        if (warnings == null) {
            warnings = new ArrayList<WarningsType>();
        }
        return this.warnings;
    }

    /**
     * Gets the value of the errors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getERRORS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorsType }
     * 
     * 
     */
    public List<ErrorsType> getERRORS() {
        if (errors == null) {
            errors = new ArrayList<ErrorsType>();
        }
        return this.errors;
    }

}