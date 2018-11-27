package com.jmk.springboot.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;
 
import com.jmk.springboot.model.Customer;
 
@Component
public class JmsProducer {
	@Autowired
	JmsTemplate jmsTemplate;
	
	@Value("${jmk.activemq.queue}")
	String queue;
	
	public void send(Customer customer){
		jmsTemplate.convertAndSend(queue, customer);
	}
	
	public void send(String msg){
		jmsTemplate.convertAndSend(queue, msg);
	}
}