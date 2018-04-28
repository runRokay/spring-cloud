package com.example.cloudapiservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudApiserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudApiserviceApplication.class, args);
	}
}
