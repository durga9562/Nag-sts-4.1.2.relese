package com.ojas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
@Component
public class AddressRestConsumer {
@Autowired
private DiscoveryClient client;

public String callAddressShow() {
	List<ServiceInstance> list = client.getInstances("ADDRESS-SERVICE");
	ServiceInstance Si = list.get(1);
	System.out.println("=================>"+Si);
	String url=Si.getUri()+"/addr/show";
	RestTemplate rt=new RestTemplate();
	String resp = rt.getForObject(url, String.class);
	
	return resp;
	
}
}
