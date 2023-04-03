package com.example.mqpublisher;

import org.apache.logging.log4j.message.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MQPublisher {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @GetMapping("/getMessage")
    public String get(@RequestParam String message){
        rabbitTemplate.convertAndSend("first",message);
        return "message recived";
    }


}
