### windows 跑kafka（先跑zookeeper）
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
.\bin\windows\kafka-server-start.bat .\config\server.properties
### 本地kafka路径
D:\work\Kafka\kafka_2.13-2.8.0
### 查看主题
kafka-topics.bat --list --bootstrap-server localhost:9092

### 创建主题
kafka-topics.bat --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic yonyou_json_data

### 删除主题
kafka-topics.bat --delete --bootstrap-server localhost:9092 --topic yonyou_json_data
### 消费者监听
kafka-console-producer.bat --broker-list localhost:9092 --topic yonyou_json_data


### 消费者创建
**自带一个默认消费工厂，参数是 map ，自己设置，String是使用kafka自带的config字段，模板里有**
```java
class example {
    public DefaultKafkaConsumerFactory(Map<String, Object> configs) {
        this(configs, () -> {
            return null;
        }, () -> {
            return null;
        });
    }
}
```
### Acknowledgment 手动确认状态
Acknowledgment 是 Spring Kafka 中的一个类，它用于在消费者端手动确认消息的处理状态。当消息被消费者成功处理后，通过调用 Acknowledgment 的 acknowledge() 方法，可以通知 Kafka 服务器该消息已经被消费成功并可以从 Kafka 主题中删除。

Acknowledgment 类是 Spring Kafka 框架提供的一种手动提交偏移量（offset）的方式，与自动提交偏移量的机制相对应。通过手动确认消息的处理状态，可以更加精确地控制消息的提交时机，并确保消息在处理过程中不会丢失。

在使用 Spring Kafka 编写消费者时，可以通过在消费者方法中添加 Acknowledgment 类型的参数来使用手动确认机制。例如：

```java
class example {
    @KafkaListener(topics = "myTopic")
    public void processMessage(String message, Acknowledgment acknowledgment) {
        // 处理消息的业务逻辑

        // 手动确认消息的处理状态
        acknowledgment.acknowledge();
    }
}
```

### 关于@KafkaListener监听注解
Kafka 消费者的消息监听器，它会持续监听指定的 Kafka 主题，每当有新消息到达时，会触发该方法（方法上标记了注解）执行。每次执行该方法时，传入的 value 参数代表一个消息的值。因此，方法在每次执行时只处理当前一条消息，而不是循环处理多条消息。