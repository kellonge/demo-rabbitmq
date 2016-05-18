package com.kellonge.demo.rabbitmq.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.kellonge.demo.rabbitmq.spring")
public class MqSpringProductMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MqSpringProductMain.class);
		MqSpringProduct mqSpringProduct = ctx.getBean(MqSpringProduct.class);
		mqSpringProduct.sendMsg();

	}
}
