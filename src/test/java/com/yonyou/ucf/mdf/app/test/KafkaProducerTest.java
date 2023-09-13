package com.yonyou.ucf.mdf.app.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yonyou.ucf.mdf.app.application.mq.producer.MessageProducer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KafkaProducerTest {
    private Logger logger = LoggerFactory.getLogger(KafkaProducerTest.class);

    @Resource
    private MessageProducer messageProducer;

    @Test
    public void sendMessage2Kafka() throws InterruptedException {
        List<JSONObject> jsonObjects = new ArrayList<>();
        jsonObjects.add(JSON.parseObject("{\"action\":\"update\",\"batch_no\":\"sys_20230906220129999\",\"data\":{\"airport_code\":\"YYZ\",\"id\":\"2023-08yz_gjhyjzfcYYZ\",\"period\":\"2023-08\",\"settlement_unit\":\"KG\",\"transaction_number\":\"1904495\"},\"datasource\":\"kafka_topic\",\"entitycode\":\"yz_adhfgsdfg\",\"srcsystemcode\":\"u8cdaily\",\"srctablename\":\"ads_opf_oil_int_settlement\",\"tenantid\":\"qu8njvk0\"}"));
        jsonObjects.add(JSON.parseObject("{\"action\":\"update\",\"batch_no\":\"sys_20230906220121112\",\"data\":{\"airport_code\":\"LAX\",\"id\":\"2023-08yz_gjhyjzfcLAX\",\"period\":\"2023-08\",\"settlement_unit\":\"KG\",\"transaction_number\":\"1904496\"},\"datasource\":\"kafka_topic\",\"entitycode\":\"yz_jklipoiuh\",\"srcsystemcode\":\"u8cdaily\",\"srctablename\":\"ads_opf_oil_int_settlement\",\"tenantid\":\"qu8njvk0\"}"));
        jsonObjects.add(JSON.parseObject("{\"action\":\"add\",\"batch_no\":\"sys_20230906220120500\",\"data\":{\"airport_code\":\"PEK\",\"id\":\"2023-08yz_gjhyjzfcPEK\",\"period\":\"2023-08\",\"settlement_unit\":\"KG\",\"transaction_number\":\"1904497\"},\"datasource\":\"kafka_topic\",\"entitycode\":\"yz_rtyuhgfds\",\"srcsystemcode\":\"u8cdaily\",\"srctablename\":\"ads_opf_oil_int_settlement\",\"tenantid\":\"qu8njvk0\"}"));
        jsonObjects.add(JSON.parseObject("{\"action\":\"update\",\"batch_no\":\"sys_20230906220129999\",\"data\":{\"airport_code\":\"HND\",\"id\":\"2023-08yz_gjhyjzfcHND\",\"period\":\"2023-08\",\"settlement_unit\":\"KG\",\"transaction_number\":\"1904498\"},\"datasource\":\"kafka_topic\",\"entitycode\":\"yz_zxcvbnm\",\"srcsystemcode\":\"u8cdaily\",\"srctablename\":\"ads_opf_oil_int_settlement\",\"tenantid\":\"qu8njvk0\"}"));
        jsonObjects.add(JSON.parseObject("{\"action\":\"add\",\"batch_no\":\"sys_20230906220120500\",\"data\":{\"airport_code\":\"ORD\",\"id\":\"2023-08yz_gjhyjzfcORD\",\"period\":\"2023-08\",\"settlement_unit\":\"KG\",\"transaction_number\":\"1904499\"},\"datasource\":\"kafka_topic\",\"entitycode\":\"yz_qwertyuiop\",\"srcsystemcode\":\"u8cdaily\",\"srctablename\":\"ads_opf_oil_int_settlement\",\"tenantid\":\"qu8njvk0\"}"));
        jsonObjects.add(JSON.parseObject("{\"action\":\"update\",\"batch_no\":\"sys_20230906220121112\",\"data\":{\"airport_code\":\"DFW\",\"id\":\"2023-08yz_gjhyjzfcDFW\",\"period\":\"2023-08\",\"settlement_unit\":\"KG\",\"transaction_number\":\"1904500\"},\"datasource\":\"kafka_topic\",\"entitycode\":\"yz_asdfghjkl\",\"srcsystemcode\":\"u8cdaily\",\"srctablename\":\"ads_opf_oil_int_settlement\",\"tenantid\":\"qu8njvk0\"}"));
        jsonObjects.add(JSON.parseObject("{\"action\":\"add\",\"batch_no\":\"sys_20230906220139953\",\"data\":{\"airport_code\":\"LHR\",\"id\":\"2023-08yz_gjhyjzfcLHR\",\"period\":\"2023-08\",\"settlement_unit\":\"KG\",\"transaction_number\":\"1904504\"},\"datasource\":\"kafka_topic\",\"entitycode\":\"yz_yxcvbnmasdf\",\"srcsystemcode\":\"u8cdaily\",\"srctablename\":\"ads_opf_oil_int_settlement\",\"tenantid\":\"qu8njvk0\"}"));
        jsonObjects.add(JSON.parseObject("{\"action\":\"add\",\"batch_no\":\"sys_20230906220136392\",\"data\":{\"airport_code\":\"SIN\",\"id\":\"2023-08yz_gjhyjzfcSIN\",\"period\":\"2023-08\",\"settlement_unit\":\"KG\",\"transaction_number\":\"1904503\"},\"datasource\":\"kafka_topic\",\"entitycode\":\"yz_mnbvcxzlkjh\",\"srcsystemcode\":\"u8cdaily\",\"srctablename\":\"ads_opf_oil_int_settlement\",\"tenantid\":\"qu8njvk0\"}"));
        jsonObjects.add(JSON.parseObject("{\"action\":\"add\",\"batch_no\":\"sys_20230906220133402\",\"data\":{\"airport_code\":\"FRA\",\"id\":\"2023-08yz_gjhyjzfcFRA\",\"period\":\"2023-08\",\"settlement_unit\":\"KG\",\"transaction_number\":\"1904502\"},\"datasource\":\"kafka_topic\",\"entitycode\":\"yz_hjklzxcvbn\",\"srcsystemcode\":\"u8cdaily\",\"srctablename\":\"ads_opf_oil_int_settlement\",\"tenantid\":\"qu8njvk0\"}"));
        jsonObjects.add(JSON.parseObject("{\"action\":\"add\",\"batch_no\":\"sys_20230906220131079\",\"data\":{\"airport_code\":\"AMS\",\"id\":\"2023-08yz_gjhyjzfcAMS\",\"period\":\"2023-08\",\"settlement_unit\":\"KG\",\"transaction_number\":\"1904501\"},\"datasource\":\"kafka_topic\",\"entitycode\":\"yz_uiopasdfgh\",\"srcsystemcode\":\"u8cdaily\",\"srctablename\":\"ads_opf_oil_int_settlement\",\"tenantid\":\"qu8njvk0\"}"));
        jsonObjects.add(JSON.parseObject("{\"action\":\"add\",\"batch_no\":\"sys_20230906220129135\",\"data\":{\"airport_code\":\"DFW\",\"id\":\"2023-08yz_gjhyjzfcDFW\",\"period\":\"2023-08\",\"settlement_unit\":\"KG\",\"transaction_number\":\"1904500\"},\"datasource\":\"kafka_topic\",\"entitycode\":\"yz_asdfghjkl\",\"srcsystemcode\":\"u8cdaily\",\"srctablename\":\"ads_opf_oil_int_settlement\",\"tenantid\":\"qu8njvk0\"}"));
        jsonObjects.add(JSON.parseObject("{\"action\":\"add\",\"batch_no\":\"sys_20230906220127568\",\"data\":{\"airport_code\":\"ORD\",\"id\":\"2023-08yz_gjhyjzfcORD\",\"period\":\"2023-08\",\"settlement_unit\":\"KG\",\"transaction_number\":\"1904499\"},\"datasource\":\"kafka_topic\",\"entitycode\":\"yz_qwertyuiop\",\"srcsystemcode\":\"u8cdaily\",\"srctablename\":\"ads_opf_oil_int_settlement\",\"tenantid\":\"qu8njvk0\"}"));
        jsonObjects.add(JSON.parseObject("{\"action\":\"add\",\"batch_no\":\"sys_20230906220126379\",\"data\":{\"airport_code\":\"HND\",\"id\":\"2023-08yz_gjhyjzfcHND\",\"period\":\"2023-08\",\"settlement_unit\":\"KG\",\"transaction_number\":\"1904498\"},\"datasource\":\"kafka_topic\",\"entitycode\":\"yz_zxcvbnm\",\"srcsystemcode\":\"u8cdaily\",\"srctablename\":\"ads_opf_oil_int_settlement\",\"tenantid\":\"qu8njvk0\"}"));
        jsonObjects.add(JSON.parseObject("{\"action\":\"add\",\"batch_no\":\"sys_20230906220125627\",\"data\":{\"airport_code\":\"PEK\",\"id\":\"2023-08yz_gjhyjzfcPEK\",\"period\":\"2023-08\",\"settlement_unit\":\"KG\",\"transaction_number\":\"1904497\"},\"datasource\":\"kafka_topic\",\"entitycode\":\"yz_rtyuhgfds\",\"srcsystemcode\":\"u8cdaily\",\"srctablename\":\"ads_opf_oil_int_settlement\",\"tenantid\":\"qu8njvk0\"}"));
        jsonObjects.add(JSON.parseObject("{\"action\":\"add\",\"batch_no\":\"sys_20230906220125264\",\"data\":{\"airport_code\":\"LAX\",\"id\":\"2023-08yz_gjhyjzfcLAX\",\"period\":\"2023-08\",\"settlement_unit\":\"KG\",\"transaction_number\":\"1904496\"},\"datasource\":\"kafka_topic\",\"entitycode\":\"yz_jklipoiuh\",\"srcsystemcode\":\"u8cdaily\",\"srctablename\":\"ads_opf_oil_int_settlement\",\"tenantid\":\"qu8njvk0\"}"));
            for (JSONObject jsonObject : jsonObjects) {
                messageProducer.sendTest(jsonObject);
                //Thread.sleep(3600);
            }


//        String testData =
//                "    {\"action\":\"add\",\"batch_no\":\"sys_20230906220125039\",\"data\":{\"airport_code\":\"YYZ\",\"id\":\"2023-08yz_gjhyjzfcYYZ\",\"period\":\"2023-08\",\"settlement_unit\":\"KG\",\"transaction_number\":\"1904495\"},\"datasource\":\"kafka_topic\",\"entitycode\":\"yz_adhfgsdfg\",\"srcsystemcode\":\"u8cdaily\",\"srctablename\":\"ads_opf_oil_int_settlement\",\"tenantid\":\"qu8njvk0\"}\n" +
//                "    {\"action\":\"add\",\"batch_no\":\"sys_20230906220125264\",\"data\":{\"airport_code\":\"LAX\",\"id\":\"2023-08yz_gjhyjzfcLAX\",\"period\":\"2023-08\",\"settlement_unit\":\"KG\",\"transaction_number\":\"1904496\"},\"datasource\":\"kafka_topic\",\"entitycode\":\"yz_jklipoiuh\",\"srcsystemcode\":\"u8cdaily\",\"srctablename\":\"ads_opf_oil_int_settlement\",\"tenantid\":\"qu8njvk0\"}\n" +
//                "    {\"action\":\"add\",\"batch_no\":\"sys_20230906220125627\",\"data\":{\"airport_code\":\"PEK\",\"id\":\"2023-08yz_gjhyjzfcPEK\",\"period\":\"2023-08\",\"settlement_unit\":\"KG\",\"transaction_number\":\"1904497\"},\"datasource\":\"kafka_topic\",\"entitycode\":\"yz_rtyuhgfds\",\"srcsystemcode\":\"u8cdaily\",\"srctablename\":\"ads_opf_oil_int_settlement\",\"tenantid\":\"qu8njvk0\"}\n" +
//                "    {\"action\":\"add\",\"batch_no\":\"sys_20230906220126379\",\"data\":{\"airport_code\":\"HND\",\"id\":\"2023-08yz_gjhyjzfcHND\",\"period\":\"2023-08\",\"settlement_unit\":\"KG\",\"transaction_number\":\"1904498\"},\"datasource\":\"kafka_topic\",\"entitycode\":\"yz_zxcvbnm\",\"srcsystemcode\":\"u8cdaily\",\"srctablename\":\"ads_opf_oil_int_settlement\",\"tenantid\":\"qu8njvk0\"}\n" +
//                "    {\"action\":\"add\",\"batch_no\":\"sys_20230906220127568\",\"data\":{\"airport_code\":\"ORD\",\"id\":\"2023-08yz_gjhyjzfcORD\",\"period\":\"2023-08\",\"settlement_unit\":\"KG\",\"transaction_number\":\"1904499\"},\"datasource\":\"kafka_topic\",\"entitycode\":\"yz_qwertyuiop\",\"srcsystemcode\":\"u8cdaily\",\"srctablename\":\"ads_opf_oil_int_settlement\",\"tenantid\":\"qu8njvk0\"}\n" +
//                "    {\"action\":\"add\",\"batch_no\":\"sys_20230906220129135\",\"data\":{\"airport_code\":\"DFW\",\"id\":\"2023-08yz_gjhyjzfcDFW\",\"period\":\"2023-08\",\"settlement_unit\":\"KG\",\"transaction_number\":\"1904500\"},\"datasource\":\"kafka_topic\",\"entitycode\":\"yz_asdfghjkl\",\"srcsystemcode\":\"u8cdaily\",\"srctablename\":\"ads_opf_oil_int_settlement\",\"tenantid\":\"qu8njvk0\"}\n" +
//                "    {\"action\":\"add\",\"batch_no\":\"sys_20230906220131079\",\"data\":{\"airport_code\":\"AMS\",\"id\":\"2023-08yz_gjhyjzfcAMS\",\"period\":\"2023-08\",\"settlement_unit\":\"KG\",\"transaction_number\":\"1904501\"},\"datasource\":\"kafka_topic\",\"entitycode\":\"yz_uiopasdfgh\",\"srcsystemcode\":\"u8cdaily\",\"srctablename\":\"ads_opf_oil_int_settlement\",\"tenantid\":\"qu8njvk0\"}\n" +
//                "    {\"action\":\"add\",\"batch_no\":\"sys_20230906220133402\",\"data\":{\"airport_code\":\"FRA\",\"id\":\"2023-08yz_gjhyjzfcFRA\",\"period\":\"2023-08\",\"settlement_unit\":\"KG\",\"transaction_number\":\"1904502\"},\"datasource\":\"kafka_topic\",\"entitycode\":\"yz_hjklzxcvbn\",\"srcsystemcode\":\"u8cdaily\",\"srctablename\":\"ads_opf_oil_int_settlement\",\"tenantid\":\"qu8njvk0\"}\n" +
//                "    {\"action\":\"add\",\"batch_no\":\"sys_20230906220136392\",\"data\":{\"airport_code\":\"SIN\",\"id\":\"2023-08yz_gjhyjzfcSIN\",\"period\":\"2023-08\",\"settlement_unit\":\"KG\",\"transaction_number\":\"1904503\"},\"datasource\":\"kafka_topic\",\"entitycode\":\"yz_mnbvcxzlkjh\",\"srcsystemcode\":\"u8cdaily\",\"srctablename\":\"ads_opf_oil_int_settlement\",\"tenantid\":\"qu8njvk0\"}\n" +
//                "    {\"action\":\"add\",\"batch_no\":\"sys_20230906220139953\",\"data\":{\"airport_code\":\"LHR\",\"id\":\"2023-08yz_gjhyjzfcLHR\",\"period\":\"2023-08\",\"settlement_unit\":\"KG\",\"transaction_number\":\"1904504\"},\"datasource\":\"kafka_topic\",\"entitycode\":\"yz_yxcvbnmasdf\",\"srcsystemcode\":\"u8cdaily\",\"srctablename\":\"ads_opf_oil_int_settlement\",\"tenantid\":\"qu8njvk0\"}\n" +
//                "    {\"action\":\"update\",\"batch_no\":\"sys_20230906220129999\",\"data\":{\"airport_code\":\"YYZ\",\"id\":\"2023-08yz_gjhyjzfcYYZ\",\"period\":\"2023-08\",\"settlement_unit\":\"KG\",\"transaction_number\":\"1904495\"},\"datasource\":\"kafka_topic\",\"entitycode\":\"yz_adhfgsdfg\",\"srcsystemcode\":\"u8cdaily\",\"srctablename\":\"ads_opf_oil_int_settlement\",\"tenantid\":\"qu8njvk0\"}\n" +
//                "    {\"action\":\"update\",\"batch_no\":\"sys_20230906220121112\",\"data\":{\"airport_code\":\"LAX\",\"id\":\"2023-08yz_gjhyjzfcLAX\",\"period\":\"2023-08\",\"settlement_unit\":\"KG\",\"transaction_number\":\"1904496\"},\"datasource\":\"kafka_topic\",\"entitycode\":\"yz_jklipoiuh\",\"srcsystemcode\":\"u8cdaily\",\"srctablename\":\"ads_opf_oil_int_settlement\",\"tenantid\":\"qu8njvk0\"}\n" +
//                "    {\"action\":\"add\",\"batch_no\":\"sys_20230906220120500\",\"data\":{\"airport_code\":\"PEK\",\"id\":\"2023-08yz_gjhyjzfcPEK\",\"period\":\"2023-08\",\"settlement_unit\":\"KG\",\"transaction_number\":\"1904497\"},\"datasource\":\"kafka_topic\",\"entitycode\":\"yz_rtyuhgfds\",\"srcsystemcode\":\"u8cdaily\",\"srctablename\":\"ads_opf_oil_int_settlement\",\"tenantid\":\"qu8njvk0\"}\n" +
//                "    {\"action\":\"update\",\"batch_no\":\"sys_20230906220129999\",\"data\":{\"airport_code\":\"HND\",\"id\":\"2023-08yz_gjhyjzfcHND\",\"period\":\"2023-08\",\"settlement_unit\":\"KG\",\"transaction_number\":\"1904498\"},\"datasource\":\"kafka_topic\",\"entitycode\":\"yz_zxcvbnm\",\"srcsystemcode\":\"u8cdaily\",\"srctablename\":\"ads_opf_oil_int_settlement\",\"tenantid\":\"qu8njvk0\"}\n" +
//                "    {\"action\":\"add\",\"batch_no\":\"sys_20230906220120500\",\"data\":{\"airport_code\":\"ORD\",\"id\":\"2023-08yz_gjhyjzfcORD\",\"period\":\"2023-08\",\"settlement_unit\":\"KG\",\"transaction_number\":\"1904499\"},\"datasource\":\"kafka_topic\",\"entitycode\":\"yz_qwertyuiop\",\"srcsystemcode\":\"u8cdaily\",\"srctablename\":\"ads_opf_oil_int_settlement\",\"tenantid\":\"qu8njvk0\"}\n" +
//                "    {\"action\":\"update\",\"batch_no\":\"sys_20230906220121112\",\"data\":{\"airport_code\":\"DFW\",\"id\":\"2023-08yz_gjhyjzfcDFW\",\"period\":\"2023-08\",\"settlement_unit\":\"KG\",\"transaction_number\":\"1904500\"},\"datasource\":\"kafka_topic\",\"entitycode\":\"yz_asdfghjkl\",\"srcsystemcode\":\"u8cdaily\",\"srctablename\":\"ads_opf_oil_int_settlement\",\"tenantid\":\"qu8njvk0\"}\n" ;
//
//        List<JSONObject> jsonObjects = new ArrayList<>();
//        // Split the input string by newline character to get individual JSON strings
//        String[] jsonStrings = testData.split("\\r?\\n");
//        // Convert each JSON string to JSONObject and add it to the list
//        for (String jsonStr : jsonStrings) {
//            JSONObject jsonObject = JSON.parseObject(jsonStr);
//            jsonObjects.add(jsonObject);
//        }
//
//        for (JSONObject jsonObject : jsonObjects) {
//            messageProducer.sendTest(jsonObject);
//        }
    }

}
