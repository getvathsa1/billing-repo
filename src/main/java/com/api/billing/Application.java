package com.api.billing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@EnableCircuitBreaker
@SpringBootApplication
@ComponentScan(basePackages = { "com.api.billing.*", "com.ibm.dip.framework.*" })
public class Application {

	public static void main(String[] args) {
		
		SpringApplication.run(Application.class, args);
		
	}

}
