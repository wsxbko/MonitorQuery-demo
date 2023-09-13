package com.yonyou.ucf.mdf.app.application.po;


import java.util.Date;

public class NhSourceBill {

  private String srcName;
  private String id;

  //事项编码
  private String entityCode;

  //批次号
  private String batchNo;
  private String dataSource;
  private String srcSystemCode;
  private String srcTableName;
  private String action;
  //会计期间
  private String period;
  private String srcDataMsg;

  private Date sysTime;

  public String getSrcName() {
    return srcName;
  }

  public void setSrcName(String srcName) {
    this.srcName = srcName;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getEntityCode() {
    return entityCode;
  }

  public void setEntityCode(String entityCode) {
    this.entityCode = entityCode;
  }


  public String getBatchNo() {
    return batchNo;
  }

  public void setBatchNo(String batchNo) {
    this.batchNo = batchNo;
  }


  public String getDataSource() {
    return dataSource;
  }

  public void setDataSource(String dataSource) {
    this.dataSource = dataSource;
  }


  public String getSrcSystemCode() {
    return srcSystemCode;
  }

  public void setSrcSystemCode(String srcSystemCode) {
    this.srcSystemCode = srcSystemCode;
  }


  public String getSrcTableName() {
    return srcTableName;
  }

  public void setSrcTableName(String srcTableName) {
    this.srcTableName = srcTableName;
  }


  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }


  public String getPeriod() {
    return period;
  }

  public void setPeriod(String period) {
    this.period = period;
  }

  public String getSrcDataMsg() {
    return srcDataMsg;
  }

  public void setSrcDataMsg(String srcDataMsg) {
    this.srcDataMsg = srcDataMsg;
  }

  public Date getSysTime() {
    return sysTime;
  }

  public void setSysTime(Date sysTime) {
    this.sysTime = sysTime;
  }

  @Override
  public String toString() {
    return "NhSourceBill{" +
            "srcName='" + srcName + '\'' +
            ", id='" + id + '\'' +
            ", entityCode='" + entityCode + '\'' +
            ", batchNo='" + batchNo + '\'' +
            ", dataSource='" + dataSource + '\'' +
            ", srcSystemCode='" + srcSystemCode + '\'' +
            ", srcTableName='" + srcTableName + '\'' +
            ", action='" + action + '\'' +
            ", period='" + period + '\'' +
            ", srcDataMsg='" + srcDataMsg + '\'' +
            ", sysTime=" + sysTime +
            '}';
  }
}
