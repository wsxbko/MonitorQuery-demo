package com.yonyou.ucf.mdf.app.application.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.yonyou.ucf.mdf.app.application.po.NhSourceBill;
import com.yonyou.ucf.mdf.app.application.service.IJSONObjectToNhSourceBill;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Service
@Slf4j
public class JSONObjectToNhSourceBillImpl implements IJSONObjectToNhSourceBill {

    /*
    {"action":"add","batch_no":"sys_20230906220125039",
    "data":{"airport_code":"YYZ","id":"2023-08yz_gjhyjzfcYYZ","period":"2023-08","settlement_unit":"KG","transaction_number":"1904495"},
    "datasource":"kafka_topic","entitycode":"yz_gjhyjzfc","srcsystemcode":"u8cdaily",
    "srctablename":"ads_opf_oil_int_settlement","tenantid":"qu8njvk0"}
     */
    @Override
    public NhSourceBill exchange(JSONObject jsonObject) {

        NhSourceBill nhSourceBill = new NhSourceBill();
        UUID uuid = UUID.randomUUID();
        nhSourceBill.setId(uuid.toString());
        //nhSourceBill.setId("00111");
        nhSourceBill.setAction(jsonObject.getString("action"));

        JSONObject dataObject = jsonObject.getJSONObject("data");
        nhSourceBill.setPeriod(dataObject.getString("period"));

        nhSourceBill.setBatchNo(jsonObject.getString("batch_no"));
        nhSourceBill.setDataSource(jsonObject.getString("datasource"));
        nhSourceBill.setSrcSystemCode(jsonObject.getString("srcsystemcode"));
        nhSourceBill.setSrcTableName(jsonObject.getString("srctablename"));
        nhSourceBill.setEntityCode(jsonObject.getString("entitycode"));
        nhSourceBill.setSrcDataMsg(jsonObject.toJSONString());

        return nhSourceBill;
    }
}
