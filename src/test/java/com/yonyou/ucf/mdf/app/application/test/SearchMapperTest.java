package com.yonyou.ucf.mdf.app.application.test;

import com.yonyou.ucf.mdf.app.Application;
import com.yonyou.ucf.mdf.app.application.dto.NhSourceBillDto;
import com.yonyou.ucf.mdf.app.application.mapper.INhSourceBillDtoMapper;
import com.yonyou.ucf.mdf.app.application.req.NhSourceBillRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class SearchMapperTest {
    private Logger logger = LoggerFactory.getLogger(SearchMapperTest.class);

    @Resource
    INhSourceBillDtoMapper mapper;

    @Test
    public void search(){
        logger.debug("20230912");
        //        无过滤条件
        //       NhSourceBillRequest request = new NhSourceBillRequest(5,1,5,"","","","",null,null);

        //下面不能test了，构造函数改了，关于limit 的 offset ，只是新增了这个参数
        NhSourceBillRequest request1 = new NhSourceBillRequest(5,1,"default_src_name","","","",null,null);

        NhSourceBillRequest request2 = new NhSourceBillRequest(5,0,"","yz_gjhyjzfc","","",null,null);

        NhSourceBillRequest request3 = new NhSourceBillRequest(5,1,"","","2023-08","",null,null);

        List<NhSourceBillDto> list1 = mapper.searchNhSourceBillList(request1);
        //logger.info(" lch debug 准备执行查询：Parameters: entityCode={}, srcName={}, period={}, batchNo={}", request2.getEntityCode(), request2.getSrcName(), request2.getPeriod(), request2.getBatchNo());
        List<NhSourceBillDto> list2 = mapper.searchNhSourceBillList(request2);
        List<NhSourceBillDto> list3 = mapper.searchNhSourceBillList(request3);


        logger.info("查询条件: srcName = {} ,查询结果： {}", request1.getSrcName(), list1.toString());
        logger.info("entityCode = {} ,查询结果： {}",request2.getEntityCode() ,list2.toString());
        logger.info("查询条件: period = {} ,查询结果： {}",request3.getPeriod() , list3.toString());
    }


//    @Test
//    public void search2(){
//        logger.debug("20230912");
//        //NhSourceBillRequest request2 = new NhSourceBillRequest(5,1,5,"","yz_rtyuhgfds","","",null,null);
//        NhSourceBillRequest request2 = new NhSourceBillRequest(5,1,5,"","yz_rtyuhgfds","","",null,null);
//
//        List<NhSourceBillDto> list2 = mapper.searchNhSourceBillList(request2);
//
//        logger.info("查询条件: entityCode = {} ,查询结果： {}",request2.getEntityCode() ,list2.toString());
//    }



}
