package com.yonyou.ucf.mdf.app.application.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


//@Getter
//@Setter
//@AllArgsConstructor
public class NhSourceBillDto {

    /**
     * 需要方法操作生成返回
     */

    //系统来源
    private String srcName;

    /**
     *  和数据库表对应的字段
     */
    //事项编码
    private String entityCode;

    //会计期间
    private String period;

    //批次号
    private String batchNo;


    /**
     * 需要根据数据库表生成的新字段
     */
    //发送量
    private Long sendCount;



    /**
     * 还没得
     */
    //接收量
    private Long receiveCount;
    //异常数量
    private Long errCount;
    //系统时间
    private Date sysTime;

    public NhSourceBillDto() {
    }

    public NhSourceBillDto(String srcName, String entityCode, String period, String batchNo, Long sendCount, Long receiveCount, Long errCount, Date sysTime) {
        this.srcName = srcName;
        this.entityCode = entityCode;
        this.period = period;
        this.batchNo = batchNo;
        this.sendCount = sendCount;
        this.receiveCount = receiveCount;
        this.errCount = errCount;
        this.sysTime = sysTime;
    }

    public String getSrcName() {
        return srcName;
    }

    public void setSrcName(String srcName) {
        this.srcName = srcName;
    }

    public String getEntityCode() {
        return entityCode;
    }

    public void setEntityCode(String entityCode) {
        this.entityCode = entityCode;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public Long getSendCount() {
        return sendCount;
    }

    public void setSendCount(Long sendCount) {
        this.sendCount = sendCount;
    }

    public Long getReceiveCount() {
        return receiveCount;
    }

    public void setReceiveCount(Long receiveCount) {
        this.receiveCount = receiveCount;
    }

    public Long getErrCount() {
        return errCount;
    }

    public void setErrCount(Long errCount) {
        this.errCount = errCount;
    }

    public Date getSysTime() {
        return sysTime;
    }

    public void setSysTime(Date sysTime) {
        this.sysTime = sysTime;
    }

    @Override
    public String toString() {
        return "NhSourceBillDto{" +
                "srcName='" + srcName + '\'' +
                ", entityCode='" + entityCode + '\'' +
                ", period='" + period + '\'' +
                ", batchNo='" + batchNo + '\'' +
                ", sendCount=" + sendCount +
                ", receiveCount=" + receiveCount +
                ", errCount=" + errCount +
                ", sysTime=" + sysTime +
                '}';
    }
}
