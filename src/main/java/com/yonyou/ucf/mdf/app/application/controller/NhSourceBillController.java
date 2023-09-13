package com.yonyou.ucf.mdf.app.application.controller;

import com.yonyou.ucf.mdf.app.application.req.NhSourceBillRequest;
import com.yonyou.ucf.mdf.app.application.res.NhSourceBillResult;
import com.yonyou.ucf.mdf.app.application.res.R;
import com.yonyou.ucf.mdf.app.application.service.impl.NhSourceBillServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;
import java.util.Date;

@RestController
@RequestMapping("/yonyo")
public class NhSourceBillController {

    @Autowired
    NhSourceBillServiceImpl nhSourceBillService;

    @GetMapping("/test/serach")
    public R<NhSourceBillResult> service(@RequestParam(required = false) String srcName,
                                      @RequestParam(required = false) String entitycode,
                                      @RequestParam(required = false) String batchNo,
                                      @RequestParam(required = false) String period,
                                      @RequestParam(required = false) Date sysBeginTime,
                                      @RequestParam(required = false) Date sysEndTime,
                                      @RequestParam(required = false) int currentPage,
                                      @RequestParam(required = false) int pageSize){

        NhSourceBillRequest request = new NhSourceBillRequest();
        request.setSrcName(srcName);
        request.setPeriod(period);// 设置请求参数的值
        request.setEntityCode(entitycode);
        request.setBatchNo(batchNo);
        request.setSysBeginTime(sysBeginTime);
        request.setSysEndTime(sysEndTime);
        request.setCurrentPage(currentPage);
        request.setPageSize(pageSize);
        request.setPageCount(request.getCurrentPage()* request.getPageSize());

        try {
            return R.success(nhSourceBillService.doSearchService(request));
        } catch (Exception e) {
            return R.error(e.getMessage());
        }

    }
// http://localhost:8080/yonyo/test/serach
}
/**
 @RestController
 @RequestMapping("/yonyo")
 public class NhSourceBillController {

 @Autowired
 INhSourceBill nhSourceBillService;

 @GetMapping("/test/serach") // 修改为 GetMapping 注解
 public NhSourceBillResult service(@RequestParam(required = false) String param1,
 @RequestParam(required = false) String param2) {
 NhSourceBillRequest request = new NhSourceBillRequest();
 request.setParam1(param1); // 设置请求参数的值
 request.setParam2(param2); // 设置请求参数的值

 return nhSourceBillService.doSearchService(request);
 }
 }
 */