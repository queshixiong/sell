package com.tx.yfy.controller;

import com.tx.yfy.dataobject.ControlTable;
import com.tx.yfy.service.ControlTableService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by xxtang on 2018/7/24.
 */
@RestController
@RequestMapping("/poll")
@Slf4j
public class ControlTableController {

    @Autowired
    private ControlTableService controlTableService;

   @GetMapping("/index")
    public ModelAndView findByPollingStatus(@RequestParam(value="page",defaultValue = "1") Integer page,
                                            @RequestParam(value="size",defaultValue = "10")Integer size,
                                            Map<String,Object> map) {

          /*  PageRequest request = new PageRequest(page - 1, size);
           //  Sort sort=Sort.unsorted();
            Page<Object[]> controlTablePage=controlTableService.findByPollingStatus(request);*/


            List list=new ArrayList();
            list=controlTableService.findByPollingStatus();

            List<ControlTable> list2=new ArrayList<ControlTable>();
            for(int i=0;i<list.size();i++){
                ControlTable controlTable=new ControlTable();

                Object[] tempObj=(Object[]) list.get(i);

                controlTable.setProcessCode(tempObj[0].toString());
                controlTable.setServerCode(tempObj[1].toString());
                controlTable.setBatchId(tempObj[2].toString());
                controlTable.setSoaPullingFlag(tempObj[3].toString());
                /*SimpleDateFormat format=new SimpleDateFormat("yyyy-M-dd HH:mm:ss");
                Date d= null;
                try {
                    d = format.parse(tempObj[4].toString());
                } catch (ParseException e) {
                    e.printStackTrace();
                }*/
                controlTable.setCreationDate(tempObj[4].toString());
                list2.add(controlTable);
            }



            map.put("list",list2);

           return new ModelAndView("index",map);
    }

    @GetMapping("/email")
    public ModelAndView sendEmail(@RequestParam(value = "processCode",required = false) String processCode,
                          @RequestParam(value = "serverCode",required = false) String serverCode,
                          @RequestParam(value = "batchId",required = false) String batchId,
                                  Map<String,Object> map){
          //System.out.println("txtxtxtxtx");
          System.out.println(processCode+"--"+serverCode+"--"+batchId);
          log.info("ready to sending email");
          controlTableService.sendEmail(processCode,serverCode,batchId);
          log.info("sending email end");
          return new ModelAndView("success",map);
    }
}
