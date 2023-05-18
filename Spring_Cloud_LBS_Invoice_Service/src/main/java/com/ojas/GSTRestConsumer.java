package com.ojas;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class GSTRestConsumer {
	@Autowired
private LoadBalancerClient client;
	
	
	public String GetDetailsFromGST() {
		
		
		//get one instance by using service id
		ServiceInstance si = client.choose("GST-SERVICE");
		//read uri from si
		URI uri = si.getUri();
		//add path to get url
		String url=uri+"/gst/data";
		//use RestTemplate 
		RestTemplate rt = new RestTemplate();
		//make HTTP call
		String responce = rt.getForObject(url, String.class);
		return responce;
		
	}
}
