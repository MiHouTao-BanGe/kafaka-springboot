package org.example.consumer;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafakaConsumer {

    // 指定要监听的 topic
    @KafkaListener(topics = "tb",groupId = "test")
    public void consumeTopic(String msg) { // 参数: 收到的 value
        System.out.println("收到的信息: " + msg);
    }
}
