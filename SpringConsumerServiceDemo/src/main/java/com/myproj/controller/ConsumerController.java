package com.myproj.controller;

import java.util.Optional;

import org.jspecify.annotations.Nullable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myproj.config.WebClientConfig;
import com.myproj.dto.UserDto;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class ConsumerController {
	
	private WebClientConfig webClientConfig;
	
	public ConsumerController(WebClientConfig webClientConfig) {
		// TODO Auto-generated constructor stub
		this.webClientConfig = webClientConfig;
	}
	
	@GetMapping("/cunsume")
	public String consume() {
		System.out.println("from consume method");
	 @Nullable String ss=	webClientConfig.webClient()
			// .post()
			 .get()
			.uri("/testGet")
			.retrieve().bodyToMono(String.class)
			.block();		
		 return "return from consume method ss: "+ss;
	}

}
