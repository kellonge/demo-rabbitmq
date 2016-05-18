package com.kellonge.demo.rabbitmq.spring;

import org.springframework.amqp.core.Message;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSONObject;

@Component
public class MqSpringConsumer {

	//@RabbitListener(queues = "hello")
	public void merchantsSpecifiedCoupon_NoticeUser_Handler(Message message) {
	 
		System.out.println(JSONObject.toJSONString(message));
	}
}
