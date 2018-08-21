package com.tx.yfy.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.zip.DataFormatException;

/**
 * Created by xxtang on 2018/7/24.
 */

@Data
@Entity
@Table(name="xxif_yfyp_control_st")
public class ControlTable {



    //private Integer id;
    @Id
    private String processCode;

    private String serverCode;

    private String batchId;

    private String soaPullingFlag;


    private String creationDate;



}
