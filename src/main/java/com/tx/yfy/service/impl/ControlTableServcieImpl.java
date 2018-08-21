package com.tx.yfy.service.impl;

        import com.tx.yfy.dataobject .ControlTable;
        import com.tx.yfy.repository.ControlTableRepository;
        import com.tx.yfy.service.ControlTableService;

        import com.tx.yfy.ws.CHPMailNotificationRequestType;
        import com.tx.yfy.ws.com.oracle.xmlns.mailnotificationbpelprocess.MailNotificationBPELProcess;
        import com.tx.yfy.ws.com.oracle.xmlns.mailnotificationbpelprocess.MailnotificationbpelprocessClientEp;
        import org.apache.axis.client.Call;
        import org.apache.axis.client.Service;
        import org.apache.axis.encoding.XMLType;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.data.domain.Page;
        import org.springframework.data.domain.PageRequest;
        import org.springframework.data.domain.Pageable;
        import org.springframework.data.domain.Sort;
        import org.springframework.transaction.annotation.Transactional;

        import javax.xml.namespace.QName;
        import javax.xml.rpc.ParameterMode;
        import javax.xml.rpc.ServiceException;
        import java.net.MalformedURLException;
        import java.net.URL;
        import java.rmi.RemoteException;
        import java.util.List;

/**
 * Created by xxtang on 2018/7/24.
 */
@org.springframework.stereotype.Service
public class ControlTableServcieImpl implements ControlTableService{

    @Autowired
    private ControlTableRepository controlTableRepository;

    @Override
    @Transactional
    public List<Object[]> findByPollingStatus() {
        return controlTableRepository.findByPollingStatus();
    }

    @Override
    public void sendEmail(String processCode,String serverCode,String batchId){

        MailnotificationbpelprocessClientEp
                mailnotificationbpelprocessClientEp=new MailnotificationbpelprocessClientEp();

        MailNotificationBPELProcess mailNotificationBPELProcess=mailnotificationbpelprocessClientEp.getMailNotificationBPELProcessPt();

        CHPMailNotificationRequestType chpMailNotificationRequestType=new CHPMailNotificationRequestType();
        chpMailNotificationRequestType.setProcessCode(processCode);
        chpMailNotificationRequestType.setServerCode(serverCode);
        chpMailNotificationRequestType.setBatchId(batchId);
        chpMailNotificationRequestType.setMailCode("XXIFPXXX");
        chpMailNotificationRequestType.setMailContent(processCode+"--"+serverCode+"--"+batchId+"--"+"not polling success");
        mailNotificationBPELProcess.process(chpMailNotificationRequestType);

      /*  String url = "http://erpsoa01t.yfy.corp:7004/soa-infra/services/YFYP/EmailUtils/mailnotificationbpelprocess_client_ep";
        String  uurl = "http://xmlns.oracle.com/YFY_CHP_SOA/UTL_CHP_EmailNotificationService/MailNotificationBPELProcess";
        //String strXml ="XXX";
        Object[] objects=new Object[]{processCode,serverCode,batchId,"testing",
                processCode+"-"+serverCode+"-"+batchId+"-"+"not polling successful"};


        try {
            Service service = new Service();
            Call call =(Call) service.createCall();
            call.setTargetEndpointAddress(new URL(url));
            call.setUseSOAPAction(true);
            call.setOperationName(new QName(uurl,"process"));      // WSDL里面描述的接口名称
            call.addParameter(new QName(uurl,"ProcessCode"), XMLType.XSD_STRING, ParameterMode.IN);
            call.addParameter(new QName(uurl,"ServerCode"), XMLType.XSD_STRING, ParameterMode.IN);
            call.addParameter(new QName(uurl,"BatchId"), XMLType.XSD_STRING, ParameterMode.IN);
            call.addParameter(new QName(uurl,"MailCode"), XMLType.XSD_STRING, ParameterMode.IN);
            call.addParameter(new QName(uurl,"MailContent"), XMLType.XSD_STRING, ParameterMode.IN);// 接口的参数类型
            call.setEncodingStyle("UTF-8");
            call.setReturnType(XMLType.XSD_STRING);   // 设置返回值类型
            call.invoke(objects);    //传入参数并返回返回值
        } catch (ServiceException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }*/


    }
}
