package com.yonyou.ucf.mdf.app.application.mq.listener;


import com.alibaba.fastjson.JSONObject;
import com.yonyou.ucf.mdf.app.application.mapper.INhSourceBillMapper;
import com.yonyou.ucf.mdf.app.application.po.NhSourceBill;
import com.yonyou.ucf.mdf.app.application.service.IJSONObjectToNhSourceBill;
import org.apache.commons.lang3.StringUtils;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

import java.util.Date;


@Component
public class KafkaMessageListener {

    @Autowired
    IJSONObjectToNhSourceBill objectToNhSourceBill;

    @Autowired
    INhSourceBillMapper nhSourceBillMapper;

    private static final String TOPIC = "yonyou_json_data";
    private static final String GROUP_ID = "G1_test";

    private static final Logger logger = LoggerFactory.getLogger(KafkaMessageListener.class);


    @KafkaListener(topics = TOPIC, groupId = GROUP_ID)
    public void listenDataGroup (ConsumerRecord<String, String> record, Acknowledgment acknowledgment) {
        logger.info(" Kafka Consume ：Partition: {}, Offset: {}", record.partition(), record.offset());
        String JSONValue = record.value();
        logger.info("JSONValue : "+ JSONValue);
        if (StringUtils.isNotBlank(JSONValue)){
            logger.info(" 正在监听数据 ：{} " , JSONValue);
            try {

                JSONObject jsonObject = JSONObject.parseObject(JSONValue);
                NhSourceBill nhSourceBill = objectToNhSourceBill.exchange(jsonObject);

                String srcName = createSrcName(nhSourceBill);
                nhSourceBill.setSrcName(srcName);
                nhSourceBill.setSrcDataMsg(jsonObject.toJSONString());
                nhSourceBill.setSysTime(new Date());

                nhSourceBillMapper.insertNhSourceBill(nhSourceBill);

                logger.info(" [ 插入数据 ]--- 向数据库表插入数据 ：{}  成功" ,nhSourceBill.toString());

                //手动提交偏移量
                acknowledgment.acknowledge();

            } catch (Exception e) {
                logger.error(" 处理kafka数据失败 ：{}  " ,e.getMessage());
            }
        }

    }

    public String createSrcName(NhSourceBill nhSourceBill) {

        final String ERROR_INVALID_BATCH_NO = "批次号格式错误";
        final String ERROR_INVALID_ENTITY_CODE = "事项编码格式错误";
        if (!nhSourceBill.getBatchNo().contains("_")) {
            return ERROR_INVALID_BATCH_NO;
        }
        if (!nhSourceBill.getEntityCode().contains("_")) {
            return ERROR_INVALID_ENTITY_CODE;
        }

        String prefixBatchNo = nhSourceBill.getBatchNo().substring(0, nhSourceBill.getBatchNo().indexOf("_"));
        String prefixEntityCode = nhSourceBill.getEntityCode().substring(0, nhSourceBill.getEntityCode().indexOf("_"));

        if (prefixBatchNo.equals("EWA")) return "EWA";
        else return prefixEntityCode + "数据中台";

    }
}
