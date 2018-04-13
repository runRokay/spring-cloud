package com.example.cloudapiservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudApiserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudApiserviceApplication.class, args);
	}
}
