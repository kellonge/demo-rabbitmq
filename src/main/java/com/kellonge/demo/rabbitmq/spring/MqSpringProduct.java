package com.kellonge.demo.rabbitmq.spring;

import java.util.Date;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MqSpringProduct {

    @Autowired
    RabbitTemplate              rabbitTemplate;

    private final static String QUEUE_NAME = "hello";

    public void sendMsg() {
        rabbitTemplate.convertAndSend("", QUEUE_NAME, new Date().toString());
        System.out.println("send");
        while (true) {
            try {
                Thread.sleep(10000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
