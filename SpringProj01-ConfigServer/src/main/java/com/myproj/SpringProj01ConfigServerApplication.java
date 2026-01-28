package com.myproj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringProj01ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringProj01ConfigServerApplication.class, args);
	}

}
