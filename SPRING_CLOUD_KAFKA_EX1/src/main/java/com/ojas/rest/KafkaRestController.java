package com.ojas.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.service.ProducerService;
import com.ojas.store.MessageStore;

@RestController
public class KafkaRestController {
	@Autowired
private ProducerService producer;
	@Autowired
	private MessageStore store;
	@GetMapping("/send")
	public String sendMsg(@RequestParam String message) {
		producer.sendMessage(message);
		return "SUCCES";
		}
	@GetMapping("/all")
	public String viewAll() {
		return store.viewAllMessages();
	}
}
