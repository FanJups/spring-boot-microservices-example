package com.javacodegeeks.example.rest.substraction;

import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@EnableDiscoveryClient
@ComponentScan

public class SubstractionServer {
	
	protected Logger logger = Logger.getLogger(SubstractionServer.class.getName());

	public static void main(String[] args) {
		
		System.setProperty("spring.config.name", "substraction-server");
        SpringApplication.run(SubstractionServer.class, args);
		

	}

}
