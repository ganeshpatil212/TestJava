package com.myproj.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/departments")
public class ConsumerController {

	private final RestTemplate restTemplate;

	public ConsumerController(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	
	@GetMapping()
	public List<?> getEmployees() {
		System.out.println("from getEmployeesByDepartment method in consumer");
		String url = "http://SpringEurekaEmployeeSerice-Producer/employees";
		return restTemplate.getForObject(url, List.class);
	}

	@GetMapping("/{id}/employees")
	public List<?> getEmployeesByDepartment(@PathVariable Long id) {
		System.out.println("from getEmployeesByDepartment method with path variable in consumer");
		String url = "http://SpringEurekaEmployeeSerice-Producer/employees";
		return restTemplate.getForObject(url, List.class);
	}
}



