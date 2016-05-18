package com.kellonge.demo.rabbitmq.spring;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableRabbit
@ComponentScan("com.kellonge.demo.rabbitmq.spring")
public class MqSpringConsumerMain {
 
	
	
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MqSpringConsumerMain.class);
		RabbitTemplate rabbitTemplate = ctx.getBean(RabbitTemplate.class);
	 
	}
}
