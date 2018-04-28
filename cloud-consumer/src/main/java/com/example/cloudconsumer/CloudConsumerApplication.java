package com.example.cloudconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableFeignClients  //启用feign进行远程调用
@EnableEurekaClient //启用服务注册与发现
@EnableHystrixDashboard
@EnableCircuitBreaker
public class CloudConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudConsumerApplication.class, args);
	}

	//使用RestTemplate方式调用时需要，定义这个bean
//	@Bean
//	@LoadBalanced
//	RestTemplate restTemplate(){
//		return new RestTemplate();
//	}
}
