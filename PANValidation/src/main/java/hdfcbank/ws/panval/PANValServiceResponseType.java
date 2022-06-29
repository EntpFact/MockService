//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.06.27 at 09:57:19 AM IST 
//


package hdfcbank.ws.panval;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PANValServiceResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PANValServiceResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Return_Code" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="Return_Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PAN_Details" type="{http://hdfcbank/ws/PANVal}PAN_DETAILS_TYPE" maxOccurs="5" minOccurs="0"/&gt;
 *         &lt;element name="ResponseTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Filler1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Filler2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Filler3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Filler4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Filler5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PANValServiceResponseType", propOrder = {
    "returnCode",
    "returnDescription",
    "panDetails",
    "responseTime",
    "filler1",
    "filler2",
    "filler3",
    "filler4",
    "filler5"
})
public class PANValServiceResponseType {

    @XmlElement(name = "Return_Code", required = true)
    protected BigInteger returnCode;
    @XmlElement(name = "Return_Description", required = true)
    protected String returnDescription;
    @XmlElement(name = "PAN_Details")
    protected List<PANDETAILSTYPE> panDetails;
    @XmlElement(name = "ResponseTime", required = true)
    protected String responseTime;
    @XmlElement(name = "Filler1")
    protected String filler1;
    @XmlElement(name = "Filler2")
    protected String filler2;
    @XmlElement(name = "Filler3")
    protected String filler3;
    @XmlElement(name = "Filler4")
    protected String filler4;
    @XmlElement(name = "Filler5")
    protected String filler5;

    /**
     * Gets the value of the returnCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReturnCode() {
        return returnCode;
    }

    /**
     * Sets the value of the returnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReturnCode(BigInteger value) {
        this.returnCode = value;
    }

    /**
     * Gets the value of the returnDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnDescription() {
        return returnDescription;
    }

    /**
     * Sets the value of the returnDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnDescription(String value) {
        this.returnDescription = value;
    }

    /**
     * Gets the value of the panDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the panDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPANDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PANDETAILSTYPE }
     * 
     * 
     */
    public List<PANDETAILSTYPE> getPANDetails() {
        if (panDetails == null) {
            panDetails = new ArrayList<PANDETAILSTYPE>();
        }
        return this.panDetails;
    }

    /**
     * Gets the value of the responseTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseTime() {
        return responseTime;
    }

    /**
     * Sets the value of the responseTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseTime(String value) {
        this.responseTime = value;
    }

    /**
     * Gets the value of the filler1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiller1() {
        return filler1;
    }

    /**
     * Sets the value of the filler1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiller1(String value) {
        this.filler1 = value;
    }

    /**
     * Gets the value of the filler2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiller2() {
        return filler2;
    }

    /**
     * Sets the value of the filler2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiller2(String value) {
        this.filler2 = value;
    }

    /**
     * Gets the value of the filler3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiller3() {
        return filler3;
    }

    /**
     * Sets the value of the filler3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiller3(String value) {
        this.filler3 = value;
    }

    /**
     * Gets the value of the filler4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiller4() {
        return filler4;
    }

    /**
     * Sets the value of the filler4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiller4(String value) {
        this.filler4 = value;
    }

    /**
     * Gets the value of the filler5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiller5() {
        return filler5;
    }

    /**
     * Sets the value of the filler5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiller5(String value) {
        this.filler5 = value;
    }

}
