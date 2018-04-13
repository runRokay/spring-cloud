package com.example.cloudconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient //启用服务注册与发现
@EnableFeignClients  //启用feign进行远程调用
public class CloudConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudConsumerApplication.class, args);
	}

	//使用RestTemplate方式调用时需要，定义这个bean
	@Bean
	@LoadBalanced
	RestTemplate restTemplate(){
		return new RestTemplate();
	}
}
