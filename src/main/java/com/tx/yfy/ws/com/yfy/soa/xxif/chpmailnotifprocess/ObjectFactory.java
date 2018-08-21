
package com.tx.yfy.ws.com.yfy.soa.xxif.chpmailnotifprocess;

import com.tx.yfy.ws.CHPMailNotificationRequestType;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.yfy.soa.xxif.chpmailnotifprocess package. 
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

    private final static QName _CHPMailNotificationRequest_QNAME = new QName("http://yfy.com/SOA/XXIF/CHPMailNotifProcess", "CHPMailNotificationRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.yfy.soa.xxif.chpmailnotifprocess
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CHPMailNotificationRequestType }
     * 
     */
    public CHPMailNotificationRequestType createCHPMailNotificationRequestType() {
        return new CHPMailNotificationRequestType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CHPMailNotificationRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://yfy.com/SOA/XXIF/CHPMailNotifProcess", name = "CHPMailNotificationRequest")
    public JAXBElement<CHPMailNotificationRequestType> createCHPMailNotificationRequest(CHPMailNotificationRequestType value) {
        return new JAXBElement<CHPMailNotificationRequestType>(_CHPMailNotificationRequest_QNAME, CHPMailNotificationRequestType.class, null, value);
    }

}
