package com.yonyou.ucf.mdf.app.application.mq.producer;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

@Component
public class MessageProducer {
    private final KafkaTemplate<String,Object> kafkaTemplate;

    @Autowired
    public MessageProducer(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    private Logger logger = LoggerFactory.getLogger(MessageProducer.class);

    private static final String TOPIC_SEND_JSONSTRING = "yonyou_json_data";

    public ListenableFuture<SendResult<String,Object>> sendJsonMessage(JSONObject jsonObject){
        //String objJson = JSON.toJSONString(activityPartakeRecord);
        String jsonString = jsonObject.toJSONString();
        logger.info("发送消息 ，TOPIC ：{}",TOPIC_SEND_JSONSTRING);
        return kafkaTemplate.send(TOPIC_SEND_JSONSTRING,jsonObject);

    }

    public void sendTest(JSONObject jsonobj){
        String JSONobj2String = jsonobj.toString();
        logger.info(" 准备发送的消息为： {} ",JSONobj2String);

        //发送消息
        //ListenableFuture<SendResult<String,Object>> 表示异步发送操作的结果
        ListenableFuture<SendResult<String,Object>> future = kafkaTemplate.send(TOPIC_SEND_JSONSTRING,JSONobj2String);
        //调用 future.addCallback 方法来注册 ListenableFutureCallback 回调函数，以处理发送结果
        future.addCallback(new ListenableFutureCallback<SendResult<String, Object>>() {
            @Override
            public void onFailure(Throwable ex) {
                logger.info(TOPIC_SEND_JSONSTRING + " - 生产者 发送消息失败： " + ex.getMessage());

            }

            @Override
            public void onSuccess(SendResult<String, Object> result) {
                logger.info(TOPIC_SEND_JSONSTRING + " - 生产者 发送消息成功：" + jsonobj.toJSONString());
            }
        });

    }


}
