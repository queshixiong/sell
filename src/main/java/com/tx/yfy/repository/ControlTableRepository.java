package com.tx.yfy.repository;

import com.tx.yfy.dataobject.ControlTable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * Created by xxtang on 2018/7/24.
 */

public interface ControlTableRepository extends JpaRepository<ControlTable,String> {

    //@Transactional
    @Modifying
   /* @Query(value = "select c.process_Code,c.server_Code,c.batch_Id,c.soa_Pulling_Flag,c.creation_Date from xxif_yfyp_control_st c where c.soa_Pulling_Flag in('Out-W','in-W','OutAck-W','InAck-W') " +
            "and c.creation_Date<sysdate-1/720",nativeQuery = true)*/
    @Query(value = "select processCode,serverCode,batchId,soaPullingFlag,creationDate from ControlTable  where soaPullingFlag in('Out-W','in-W','OutAck-W','InAck-W') " +
            "and creationDate<sysdate-1/720")
    //Page<Object[]> findByPollingStatus(Pageable pageable);

   List<Object[]> findByPollingStatus();
}
