package com.myproj.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myproj.pojo.Employee;

@RestController
@RequestMapping("/departments")
public class ConsumerController {

    private final EmployeeFeignClient employeeClient;

    public ConsumerController(EmployeeFeignClient employeeClient) {
        this.employeeClient = employeeClient;
    }

    @GetMapping("/{id}/employees")
    public List<Employee> getEmployees(@PathVariable Long id) {
        return employeeClient.getEmployees();
    }
}




