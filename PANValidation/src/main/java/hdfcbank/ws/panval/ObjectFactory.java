//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.05.30 at 12:22:39 AM IST 
//


package hdfcbank.ws.panval;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the hdfcbank.ws.panval package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PANValServiceResponse_QNAME = new QName("http://hdfcbank/ws/PANVal", "PANValServiceResponse");
    private final static QName _PANValServiceRequest_QNAME = new QName("http://hdfcbank/ws/PANVal", "PANValServiceRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: hdfcbank.ws.panval
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PANValServiceResponseType }
     * 
     */
    public PANValServiceResponseType createPANValServiceResponseType() {
        return new PANValServiceResponseType();
    }

    /**
     * Create an instance of {@link PANValServiceRequestType }
     * 
     */
    public PANValServiceRequestType createPANValServiceRequestType() {
        return new PANValServiceRequestType();
    }

    /**
     * Create an instance of {@link PANDETAILSTYPE }
     * 
     */
    public PANDETAILSTYPE createPANDETAILSTYPE() {
        return new PANDETAILSTYPE();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PANValServiceResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PANValServiceResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://hdfcbank/ws/PANVal", name = "PANValServiceResponse")
    public JAXBElement<PANValServiceResponseType> createPANValServiceResponse(PANValServiceResponseType value) {
        return new JAXBElement<PANValServiceResponseType>(_PANValServiceResponse_QNAME, PANValServiceResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PANValServiceRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PANValServiceRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://hdfcbank/ws/PANVal", name = "PANValServiceRequest")
    public JAXBElement<PANValServiceRequestType> createPANValServiceRequest(PANValServiceRequestType value) {
        return new JAXBElement<PANValServiceRequestType>(_PANValServiceRequest_QNAME, PANValServiceRequestType.class, null, value);
    }

}
