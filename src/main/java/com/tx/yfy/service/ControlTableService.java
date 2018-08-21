package com.tx.yfy.service;

import com.tx.yfy.dataobject.ControlTable;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xxtang on 2018/7/24.
 */

public interface ControlTableService {

    //Page<Object[]> findByPollingStatus(Pageable pageable);

    List<Object[]> findByPollingStatus();

    void sendEmail(String processCode,String serverCode,String batchId);


}
