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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SummaryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FactivaMatch" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NeglistMatch" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MatchCombination" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Factiva" type="{http://hdfcbank/ws/DedupeCheck}MatchValueType"/&gt;
 *         &lt;element name="NegativeList" type="{http://hdfcbank/ws/DedupeCheck}MatchValueType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SummaryType", propOrder = {
    "factivaMatch",
    "neglistMatch",
    "matchCombination",
    "factiva",
    "negativeList"
})
public class SummaryType {

    @XmlElement(name = "FactivaMatch", required = true)
    protected String factivaMatch;
    @XmlElement(name = "NeglistMatch", required = true)
    protected String neglistMatch;
    @XmlElement(name = "MatchCombination", required = true)
    protected String matchCombination;
    @XmlElement(name = "Factiva", required = true)
    protected MatchValueType factiva;
    @XmlElement(name = "NegativeList", required = true)
    protected MatchValueType negativeList;

    /**
     * Gets the value of the factivaMatch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFactivaMatch() {
        return factivaMatch;
    }

    /**
     * Sets the value of the factivaMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFactivaMatch(String value) {
        this.factivaMatch = value;
    }

    /**
     * Gets the value of the neglistMatch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNeglistMatch() {
        return neglistMatch;
    }

    /**
     * Sets the value of the neglistMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNeglistMatch(String value) {
        this.neglistMatch = value;
    }

    /**
     * Gets the value of the matchCombination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchCombination() {
        return matchCombination;
    }

    /**
     * Sets the value of the matchCombination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchCombination(String value) {
        this.matchCombination = value;
    }

    /**
     * Gets the value of the factiva property.
     * 
     * @return
     *     possible object is
     *     {@link MatchValueType }
     *     
     */
    public MatchValueType getFactiva() {
        return factiva;
    }

    /**
     * Sets the value of the factiva property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchValueType }
     *     
     */
    public void setFactiva(MatchValueType value) {
        this.factiva = value;
    }

    /**
     * Gets the value of the negativeList property.
     * 
     * @return
     *     possible object is
     *     {@link MatchValueType }
     *     
     */
    public MatchValueType getNegativeList() {
        return negativeList;
    }

    /**
     * Sets the value of the negativeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchValueType }
     *     
     */
    public void setNegativeList(MatchValueType value) {
        this.negativeList = value;
    }

}
