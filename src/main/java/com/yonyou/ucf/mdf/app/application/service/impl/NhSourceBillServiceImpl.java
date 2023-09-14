package com.yonyou.ucf.mdf.app.application.service.impl;

import com.yonyou.ucf.mdf.app.application.req.NhSourceBillRequest;
import com.yonyou.ucf.mdf.app.application.res.NhSourceBillResult;
import com.yonyou.ucf.mdf.app.application.service.INhSourceBillService;
import com.yonyou.ucf.mdf.app.application.dto.NhSourceBillDto;
import com.yonyou.ucf.mdf.app.application.mapper.INhSourceBillDtoMapper;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
@Slf4j
public class NhSourceBillServiceImpl implements INhSourceBillService {

    @Autowired
    INhSourceBillDtoMapper nhSourceBillDtoMapper;
    private static final Logger logger = LoggerFactory.getLogger(NhSourceBillServiceImpl.class);
    @Override
    public NhSourceBillResult doSearchService(NhSourceBillRequest request) {
        //logger.info("Executing NH source bill query. Parameters: entityCode={}, srcName={}, period={}, batchNo={}", entityCode, srcName, period, batchNo);//根据查询返回结果集
        List<NhSourceBillDto> queryList = nhSourceBillDtoMapper.searchNhSourceBillList(request);
        /*
        NhSourceBillResult(int pageSize, int currentPage, int totalCount, List<NhSourceBillDto> nhSourceBillDTODataList, int totalPage)
         */
        int totalCount = queryList.size();
        return new NhSourceBillResult(request.getPageSize(), request.getCurrentPage()+1, totalCount,queryList);
    }
}
