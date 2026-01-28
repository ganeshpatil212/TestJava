package com.myproj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/testGet")
	public String test() {		
		System.out.println("inside producer testGet");
		return "from producer testGet";
	}
	@PostMapping("/testPost")
	public String testPost() {		
		System.out.println("inside producer testPost");
		return "from producer testPost";
	}
}
