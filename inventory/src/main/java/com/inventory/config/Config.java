package com.inventory.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Config {
	
	@LoadBalanced// This is required when we use eureka server to locate the service
	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

}
