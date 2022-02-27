package org.example.produce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class produceController {
    // Kafka 模板用来向 kafka 发送数据
    @Autowired
    KafkaTemplate<String, String> kafka;

    @RequestMapping("/tb")
    public String data(String msg) {
        kafka.send("four", msg);
        return "ok";
    }
}
