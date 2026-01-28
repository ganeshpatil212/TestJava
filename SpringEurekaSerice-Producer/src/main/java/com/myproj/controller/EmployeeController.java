package com.myproj.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myproj.pojo.Employee;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

		@GetMapping("/testGet")
		public String producerTestGet() {
			System.out.println("from producerTestGet method");
			return "return from producerTestGet method";
		}


		    @GetMapping
		    public List<Employee> getEmployees() {
		    	System.out.println("from getEmployees method from producer");
		        return List.of(
		            new Employee(1L, "Ganesh", "Java Developer"),
		            new Employee(2L, "Amit", "Backend Engineer")
		        );
		    }

		    @GetMapping("/{id}")
		    public Employee getEmployee(@PathVariable Long id) {
		    	System.out.println("from getEmployee method with path variabl e from producer");
		        return new Employee(id, "Ganesh", "Java Developer");
		    }
		    
}