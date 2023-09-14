package com.yonyou.ucf.mdf.app.application.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.yonyou.ucf.mdf.app.application.po.NhSourceBillPO;
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
    public NhSourceBillPO exchange(JSONObject jsonObject) {

        NhSourceBillPO nhSourceBillPO = new NhSourceBillPO();
        UUID uuid = UUID.randomUUID();
        nhSourceBillPO.setId(uuid.toString());
        //nhSourceBill.setId("00111");
        nhSourceBillPO.setAction(jsonObject.getString("action"));

        JSONObject dataObject = jsonObject.getJSONObject("data");
        nhSourceBillPO.setPeriod(dataObject.getString("period"));

        nhSourceBillPO.setBatchNo(jsonObject.getString("batch_no"));
        nhSourceBillPO.setDataSource(jsonObject.getString("datasource"));
        nhSourceBillPO.setSrcSystemCode(jsonObject.getString("srcsystemcode"));
        nhSourceBillPO.setSrcTableName(jsonObject.getString("srctablename"));
        nhSourceBillPO.setEntityCode(jsonObject.getString("entitycode"));
        nhSourceBillPO.setSrcDataMsg(jsonObject.toJSONString());

        return nhSourceBillPO;
    }
}
