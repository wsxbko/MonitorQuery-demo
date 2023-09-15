package com.yonyou.ucf.mdf.app.application.req;

import lombok.*;

import java.util.Date;


//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
@Data
public class NhSourceBillRequest {//extends NHReviewsVO

    /**
     * 用户传入的分页数据
     */
    // 页面大小
    private int pageSize;
    // 当前页
    private int currentPage;

    private int limitOffset;

    /**
     * 用户传入的查询参数
     */
    //系统来源
    private String srcName;

    //原始事项（相当于entityCode事项编码）
    private String entityCode;

    //会计期间//YearMonth
    private String period;

    //批次号
    private String batchNo;

    private Date sysBeginTime;

    private Date sysEndTime;


    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

//    public int getPageCount() {
//        return pageCount;
//    }
//
//    public void setPageCount(int pageCount) {
//        this.pageCount = pageCount;
//    }


    public int getLimitOffset() {
        return limitOffset;
    }

    public void setLimitOffset(int limitOffset) {
        this.limitOffset = limitOffset;
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

    public Date getSysBeginTime() {
        return sysBeginTime;
    }

    public void setSysBeginTime(Date sysBeginTime) {
        this.sysBeginTime = sysBeginTime;
    }

    public Date getSysEndTime() {
        return sysEndTime;
    }

    public void setSysEndTime(Date sysEndTime) {
        this.sysEndTime = sysEndTime;
    }

    public NhSourceBillRequest() {
    }

//    public NhSourceBillRequest(int pageSize, int currentPage, int pageCount, String srcName, String entityCode, String period, String batchNo, Date sysBeginTime, Date sysEndTime) {
//        this.pageSize = pageSize;
//        this.currentPage = currentPage;
//        //this.pageCount = pageCount;
//        this.srcName = srcName;
//        this.entityCode = entityCode;
//        this.period = period;
//        this.batchNo = batchNo;
//        this.sysBeginTime = sysBeginTime;
//        this.sysEndTime = sysEndTime;
//    }


    public NhSourceBillRequest(int pageSize, int currentPage, int limitOffset, String srcName, String entityCode, String period, String batchNo, Date sysBeginTime, Date sysEndTime) {
        this.pageSize = pageSize;
        this.currentPage = currentPage;
        this.limitOffset = limitOffset;
        this.srcName = srcName;
        this.entityCode = entityCode;
        this.period = period;
        this.batchNo = batchNo;
        this.sysBeginTime = sysBeginTime;
        this.sysEndTime = sysEndTime;
    }

    public NhSourceBillRequest(int pageSize, int currentPage, String srcName, String entityCode, String period, String batchNo, Date sysBeginTime, Date sysEndTime) {
        this.pageSize = pageSize;
        this.currentPage = currentPage;
        this.srcName = srcName;
        this.entityCode = entityCode;
        this.period = period;
        this.batchNo = batchNo;
        this.sysBeginTime = sysBeginTime;
        this.sysEndTime = sysEndTime;
    }
}
