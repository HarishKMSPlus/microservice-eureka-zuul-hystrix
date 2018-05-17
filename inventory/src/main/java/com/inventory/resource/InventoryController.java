package com.inventory.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/inventory")
public class InventoryController {
	@Autowired
	RestTemplate restTemplate;

	// This is used when we have not registered store service in eureka server
	// final String uriWithoutEurekaServer= "http://localhost:9000/store/test";

	// As Store service is registered with Eureka Server we can use the service
	// name
	final String uri = "http://STORE-SERVICE/store/test";

	@HystrixCommand(fallbackMethod = "fallback")
	@RequestMapping(value = "/test")
	public String test() {

		String result = "";
		if (restTemplate != null) {
			result = restTemplate.getForObject(uri, String.class);
		} else {
			result = "restTemplate is null";
		}

		return result + " ---testing inventory system";
	}

	public String fallback() {
		return "store serviec is not up. Start the service";
	}

}
