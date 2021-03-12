package com.huynhbaoloc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UserSubscriberServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserSubscriberServiceApplication.class, args);
	}

}
