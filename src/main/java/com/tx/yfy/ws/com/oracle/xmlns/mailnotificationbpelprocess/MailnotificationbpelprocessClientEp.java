package com.tx.yfy.ws.com.oracle.xmlns.mailnotificationbpelprocess;

//import com.tx.yfy.ws.MailNotificationBPELProcess;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2018-07-31T18:04:09.347+08:00
 * Generated source version: 3.2.1
 * 
 */
@WebServiceClient(name = "mailnotificationbpelprocess_client_ep", 
                  wsdlLocation = "http://erpsoa01t.yfy.corp:7004/soa-infra/services/YFYP/EmailUtils/mailnotificationbpelprocess_client_ep?wsdl",
                  targetNamespace = "http://xmlns.oracle.com/YFY_CHP_SOA/UTL_CHP_EmailNotificationService/MailNotificationBPELProcess") 
public class MailnotificationbpelprocessClientEp extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://xmlns.oracle.com/YFY_CHP_SOA/UTL_CHP_EmailNotificationService/MailNotificationBPELProcess", "mailnotificationbpelprocess_client_ep");
    public final static QName MailNotificationBPELProcessPt = new QName("http://xmlns.oracle.com/YFY_CHP_SOA/UTL_CHP_EmailNotificationService/MailNotificationBPELProcess", "MailNotificationBPELProcess_pt");
    static {
        URL url = null;
        try {
            url = new URL("http://erpsoa01t.yfy.corp:7004/soa-infra/services/YFYP/EmailUtils/mailnotificationbpelprocess_client_ep?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(MailnotificationbpelprocessClientEp.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://erpsoa01t.yfy.corp:7004/soa-infra/services/YFYP/EmailUtils/mailnotificationbpelprocess_client_ep?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public MailnotificationbpelprocessClientEp(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public MailnotificationbpelprocessClientEp(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MailnotificationbpelprocessClientEp() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public MailnotificationbpelprocessClientEp(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public MailnotificationbpelprocessClientEp(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public MailnotificationbpelprocessClientEp(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns MailNotificationBPELProcess
     */
    @WebEndpoint(name = "MailNotificationBPELProcess_pt")
    public MailNotificationBPELProcess getMailNotificationBPELProcessPt() {
        return super.getPort(MailNotificationBPELProcessPt, MailNotificationBPELProcess.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MailNotificationBPELProcess
     */
    @WebEndpoint(name = "MailNotificationBPELProcess_pt")
    public MailNotificationBPELProcess getMailNotificationBPELProcessPt(WebServiceFeature... features) {
        return super.getPort(MailNotificationBPELProcessPt,MailNotificationBPELProcess.class, features);
    }

}
