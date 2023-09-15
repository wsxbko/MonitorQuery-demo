package com.yonyou.ucf.mdf.app.application.controller;

import com.yonyou.ucf.mdf.app.application.req.NHConditionsVo;
import com.yonyou.ucf.mdf.app.application.req.NHPageVo;
import com.yonyou.ucf.mdf.app.application.req.NHReviewsVO;
import com.yonyou.ucf.mdf.app.application.req.NhSourceBillRequest;
import com.yonyou.ucf.mdf.app.application.res.NhSourceBillResult;
import com.yonyou.ucf.mdf.app.application.res.R;
import com.yonyou.ucf.mdf.app.application.service.impl.NhSourceBillServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;
import java.util.Date;

@RestController
@RequestMapping("/yonyo")
@CrossOrigin(origins = "*")
@Slf4j
public class NhSourceBillController {

    /**
     * 传入格式：
     * {
     *     "condition":{
     *           "batch_no": "",
     *           "entityCode": "",
     *           "period": "2023-08",
     *           "srcName": null,
     *           "sysBeginTime": "2023-07-30 00:00:19",
     *           "sysEndTime": "2023-09-30 00:00:19"
     *     },
     *     "pagination":{
     *           "current": 0,
     *           "pageSize": 100
     *     }
     * }
     */
    @Autowired
    NhSourceBillServiceImpl nhSourceBillService;

    Logger logger = LoggerFactory.getLogger(NhSourceBillController.class);
    @PostMapping("/test/search")
    public R<NhSourceBillResult> service(@RequestBody NHReviewsVO nhReviewsVO) {

        logger.info(" 111接受到来自文森的请求 ： {} ",nhReviewsVO.toString());
        //logger.info("Nh")

      NHConditionsVo nhConditionsVo = nhReviewsVO.getCondition();
      NHPageVo nhPageVo = nhReviewsVO.getPagination();
//        try {
//            NhSourceBillResult result = nhSourceBillService.doSearchService(alterRequest(nhPageVo,nhConditionsVo));
//            logger.info("1111 result 打印结果 ：{}",result.toString());
//            //return R.success(result);
//            return R.success(null);
//        } catch (Exception e) {
//            return R.error(e.getMessage());
//        }

//        NhSourceBillRequest request = null;
        try {
            //request = alterRequest(nhPageVo,nhConditionsVo);
            NhSourceBillResult result = nhSourceBillService.doSearchService(alterRequest(nhPageVo,nhConditionsVo));
            return R.success(result);
        } catch (Exception e) {
            return R.error(e.getMessage());
        }
        //logger.info("1111 request 打印结果 ：{}",request.toString());

        //logger.info("1111 result 打印结果 ：{}",result.toString());


    }

    public NhSourceBillRequest alterRequest(NHPageVo nhPageVo, NHConditionsVo nhConditionsVo){
        NhSourceBillRequest request = new NhSourceBillRequest();
        request.setPageSize(nhPageVo.getPageSize());

        logger.info(" testtest **NHPageVO**: Current Page : {} ",nhPageVo.getCurrent());
        // -1
        request.setCurrentPage(nhPageVo.getCurrent()-1);
        //new insert

        request.setLimitOffset((nhPageVo.getCurrent()-1)*nhPageVo.getPageSize());
        //request.setPageCount(nhPageVo.getPageSize()*(nhPageVo.getCurrent()));
        //logger.info(" testtest ** request ** :Current Page = {} , PageSize = {} , PageCount = {}",request.getCurrentPage(),request.getPageSize(),request.getPageCount());

        request.setPeriod(nhConditionsVo.getPeriod());
        request.setEntityCode(nhConditionsVo.getEntityCode());
        request.setSrcName(nhConditionsVo.getSrcName());
        request.setSysBeginTime(nhConditionsVo.getSysBeginTime());
        request.setSysEndTime(nhConditionsVo.getSysEndTime());
        request.setBatchNo(nhConditionsVo.getBatchNo());


        return request;
    }

//    @GetMapping("/test/serach")
//    public R<NhSourceBillResult> service(@RequestParam(required = false) String srcName,
//                                      @RequestParam(required = false) String entitycode,
//                                      @RequestParam(required = false) String batchNo,
//                                      @RequestParam(required = false) String period,
//                                      @RequestParam(required = false) Date sysBeginTime,
//                                      @RequestParam(required = false) Date sysEndTime,
//                                      @RequestParam(required = false) int currentPage,
//                                      @RequestParam(required = false) int pageSize){
//
//        NhSourceBillRequest request = new NhSourceBillRequest();
//        request.setSrcName(srcName);
//        request.setPeriod(period);// 设置请求参数的值
//        request.setEntityCode(entitycode);
//        request.setBatchNo(batchNo);git pull gittee master git add .
//git commit -m "111"
//        request.setSysBeginTime(sysBeginTime);
//        request.setSysEndTime(sysEndTime);
//        request.setCurrentPage(currentPage);
//        request.setPageSize(pageSize);
//        request.setPageCount(request.getCurrentPage()* request.getPageSize());
//
//        try {
//            return R.success(nhSourceBillService.doSearchService(request));
//        } catch (Exception e) {
//            return R.error(e.getMessage());
//        }
//
//    }
// http://localhost:8080/yonyo/test/serach
}
/**
 * @Slf4j
 * @RestController
 * @RequestMapping("/hello") //@CrossOrigin(origins = "*")
 * public class HelloController {
 * @PostMapping("/post/search") public R<NhSourceBillResult> service(@RequestBody NHReviewsVO reviewsVO){
 * log.info("reviewsVO is {}",reviewsVO);
 * return R.success(null);
 * <p>
 * }
 * }
 * @RestController
 * @RequestMapping("/yonyo") public class NhSourceBillController {
 * @Autowired INhSourceBill nhSourceBillService;
 * @GetMapping("/test/serach") // 修改为 GetMapping 注解
 * public NhSourceBillResult service(@RequestParam(required = false) String param1,
 * @RequestParam(required = false) String param2) {
 * NhSourceBillRequest request = new NhSourceBillRequest();
 * request.setParam1(param1); // 设置请求参数的值
 * request.setParam2(param2); // 设置请求参数的值
 * <p>
 * return nhSourceBillService.doSearchService(request);
 * }
 * }
 * @PostMapping("/test/search") // 使用 PostMapping 注解
 * public R<NhSourceBillResult> service(@RequestBody Map<String, Object> json) {
 * Map<String, Object> condition = (Map<String, Object>) json.get("condition");
 * Map<String, Object> pagination = (Map<String, Object>) json.get("pagination");
 * <p>
 * String srcName = ;
 * String entityCode = ;
 * String batchNo = ;
 * String period = (String) condition.get("period");
 * Date sysBeginTime = parseDate((String) condition.get("sysBeginTime"));
 * Date sysEndTime = parseDate((String) condition.get("sysEndTime"));
 * int currentPage = (int) pagination.get("current");
 * int pageSize = (int) pagination.get("pageSize");
 * <p>
 * NhSourceBillRequest request = new NhSourceBillRequest();
 * request.setSrcName((String) condition.get("srcName"));
 * request.setEntityCode((String) condition.get("entityCode"));
 * request.setBatchNo((String) condition.get("batch_no"));
 * request.setPeriod(period);
 * request.setSysBeginTime(sysBeginTime);
 * request.setSysEndTime(sysEndTime);
 * request.setCurrentPage(currentPage);
 * request.setPageSize(pageSize);
 * request.setPageCount(request.getCurrentPage() * request.getPageSize());
 */

/**
 @RestController
 @RequestMapping("/yonyo") public class NhSourceBillController {

 @Autowired INhSourceBill nhSourceBillService;

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
/**
 *  @PostMapping("/test/search") // 使用 PostMapping 注解
 *     public R<NhSourceBillResult> service(@RequestBody Map<String, Object> json) {
 *         Map<String, Object> condition = (Map<String, Object>) json.get("condition");
 *         Map<String, Object> pagination = (Map<String, Object>) json.get("pagination");
 *
 *         String srcName = ;
 *         String entityCode = ;
 *         String batchNo = ;
 *         String period = (String) condition.get("period");
 *         Date sysBeginTime = parseDate((String) condition.get("sysBeginTime"));
 *         Date sysEndTime = parseDate((String) condition.get("sysEndTime"));
 *         int currentPage = (int) pagination.get("current");
 *         int pageSize = (int) pagination.get("pageSize");
 *
 *         NhSourceBillRequest request = new NhSourceBillRequest();
 *         request.setSrcName((String) condition.get("srcName"));
 *         request.setEntityCode((String) condition.get("entityCode"));
 *         request.setBatchNo((String) condition.get("batch_no"));
 *         request.setPeriod(period);
 *         request.setSysBeginTime(sysBeginTime);
 *         request.setSysEndTime(sysEndTime);
 *         request.setCurrentPage(currentPage);
 *         request.setPageSize(pageSize);
 *         request.setPageCount(request.getCurrentPage() * request.getPageSize());
 */