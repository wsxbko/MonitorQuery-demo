package com.yonyou.ucf.mdf.app.application.req;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @author xin麒
 * @date 2023/9/13 14:35
 */
@Data
public class NHConditionsVo {
    private String entityCode;
    private String batchNo;
    private String period;
    private String srcName;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date sysBeginTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date sysEndTime;

//          batch_no: "xxxxxxxxxxxxxx",
//          entityCode: "xxxxxxxxxxx",
//          period: "2023-05",
//          srcName: null,
//          sysBeginTime: "2023-09-30 00:00:19",
//          sysEndTime: "2023-09-30 14:16:14"
}
