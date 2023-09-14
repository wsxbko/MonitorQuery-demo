package com.yonyou.ucf.mdf.app.application.service;

import com.alibaba.fastjson.JSONObject;
import com.yonyou.ucf.mdf.app.application.po.NhSourceBillPO;

public interface IJSONObjectToNhSourceBill {
    NhSourceBillPO exchange(JSONObject jsonObject);
}
