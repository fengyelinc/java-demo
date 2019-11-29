
package com.example.webservicedemo.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.webservicedemo.service package. 
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

    private final static QName _SayNameResponse_QNAME = new QName("http://service.webservicedemo.example.com", "SayNameResponse");
    private final static QName _SayName_QNAME = new QName("http://service.webservicedemo.example.com", "SayName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.webservicedemo.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SayNameResponse }
     * 
     */
    public SayNameResponse createSayNameResponse() {
        return new SayNameResponse();
    }

    /**
     * Create an instance of {@link SayName }
     * 
     */
    public SayName createSayName() {
        return new SayName();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservicedemo.example.com", name = "SayNameResponse")
    public JAXBElement<SayNameResponse> createSayNameResponse(SayNameResponse value) {
        return new JAXBElement<SayNameResponse>(_SayNameResponse_QNAME, SayNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservicedemo.example.com", name = "SayName")
    public JAXBElement<SayName> createSayName(SayName value) {
        return new JAXBElement<SayName>(_SayName_QNAME, SayName.class, null, value);
    }

}
