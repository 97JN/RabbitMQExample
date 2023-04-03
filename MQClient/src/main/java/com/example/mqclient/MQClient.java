package com.example.mqclient;



import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MQClient {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @GetMapping("/reciveMessage")
    public String get(){
        Object message = rabbitTemplate.receiveAndConvert("first");
        return message.toString();
    }

    @RabbitListener(queues = "first")
    public void rabbitListener(String s){
        System.out.println(s);
    }
}
