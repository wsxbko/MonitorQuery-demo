package com.yonyou.ucf.mdf.app.application.service;

import com.alibaba.fastjson.JSONObject;
import com.yonyou.ucf.mdf.app.application.po.NhSourceBill;

public interface IJSONObjectToNhSourceBill {
    NhSourceBill exchange(JSONObject jsonObject);
}
