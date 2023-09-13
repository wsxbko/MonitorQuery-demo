package com.yonyou.ucf.mdf.app.application.service;

import com.yonyou.ucf.mdf.app.application.req.NhSourceBillRequest;
import com.yonyou.ucf.mdf.app.application.res.NhSourceBillResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

public interface INhSourceBillService {
    NhSourceBillResult doSearchService(NhSourceBillRequest request);
}
