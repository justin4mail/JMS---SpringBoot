package com.jmk.springboot.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
 
import com.jmk.springboot.model.Customer;
import com.jmk.springboot.model.MessageStorage;
 
@Component
public class JmsConsumer {
	@Autowired
	private MessageStorage customerStorage;
	
	@JmsListener(destination = "${jmk.activemq.queue}", containerFactory="jsaFactory")
	public void receive(Customer customer){
		//System.out.println("Recieved Message: " + customer);
		customerStorage.add(customer);
	}
}