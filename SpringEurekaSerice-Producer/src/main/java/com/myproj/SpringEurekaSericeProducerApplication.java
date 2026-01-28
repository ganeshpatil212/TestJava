package com.myproj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringEurekaSericeProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaSericeProducerApplication.class, args);
	}

}
