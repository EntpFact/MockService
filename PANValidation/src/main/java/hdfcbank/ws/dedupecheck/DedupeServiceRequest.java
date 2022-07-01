//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.07.01 at 12:37:40 PM IST 
//


package hdfcbank.ws.dedupecheck;

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
 *         &lt;element name="HeaderInfo" type="{http://hdfcbank/ws/DedupeCheck}HeaderInfoType"/&gt;
 *         &lt;element name="EnquiryInfo" type="{http://hdfcbank/ws/DedupeCheck}EnquiryInfoType" minOccurs="0"/&gt;
 *         &lt;element name="soaStandard" type="{http://hdfcbank/ws/DedupeCheck}soaStandard" minOccurs="0"/&gt;
 *         &lt;element name="soaFillers" type="{http://hdfcbank/ws/DedupeCheck}soaFillers" minOccurs="0"/&gt;
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
    "headerInfo",
    "enquiryInfo",
    "soaStandard",
    "soaFillers"
})
@XmlRootElement(name = "DedupeServiceRequest")
public class DedupeServiceRequest {

    @XmlElement(name = "HeaderInfo", required = true)
    protected HeaderInfoType headerInfo;
    @XmlElement(name = "EnquiryInfo")
    protected EnquiryInfoType enquiryInfo;
    protected SoaStandard soaStandard;
    protected SoaFillers soaFillers;

    /**
     * Gets the value of the headerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderInfoType }
     *     
     */
    public HeaderInfoType getHeaderInfo() {
        return headerInfo;
    }

    /**
     * Sets the value of the headerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderInfoType }
     *     
     */
    public void setHeaderInfo(HeaderInfoType value) {
        this.headerInfo = value;
    }

    /**
     * Gets the value of the enquiryInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EnquiryInfoType }
     *     
     */
    public EnquiryInfoType getEnquiryInfo() {
        return enquiryInfo;
    }

    /**
     * Sets the value of the enquiryInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnquiryInfoType }
     *     
     */
    public void setEnquiryInfo(EnquiryInfoType value) {
        this.enquiryInfo = value;
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
