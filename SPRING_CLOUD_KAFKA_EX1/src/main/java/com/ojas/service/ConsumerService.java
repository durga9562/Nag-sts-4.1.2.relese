package com.ojas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.ojas.store.MessageStore;

@Component
public class ConsumerService {
	/*
	 * ==>consumer will automatically execute when message came 
	 * ==> When producer send the data, coinsumer is automatically exexcuted
	 */
	
	@Autowired
	private MessageStore ms;
	@KafkaListener(topics="${my.kafka.topic.name}",groupId="groupId")
	public void readMessage(String message) {
		System.out.println("FROME CONSUMER===>"+message);
		ms.addMessage(message);
	}
	

}
