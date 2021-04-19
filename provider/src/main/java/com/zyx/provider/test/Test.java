package com.zyx.provider.test;

import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;

public class Test {

    public static void main(String[] args) throws Exception {

        DefaultMQProducer producer = new DefaultMQProducer("provider");

        producer.setNamesrvAddr("127.0.0.1:9876");

        producer.start();

        Message message = new Message("myTopic", "myTags", ("test mq").getBytes());

        SendResult result = producer.send(message, 1000);

        System.out.println(result);

        producer.shutdown();
    }
}
