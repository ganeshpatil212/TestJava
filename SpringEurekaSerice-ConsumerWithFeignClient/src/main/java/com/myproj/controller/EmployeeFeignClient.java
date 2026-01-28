package com.myproj.controller;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.myproj.pojo.Employee;

@FeignClient(name = "SpringEurekaEmployeeSerice-Producer")
public interface EmployeeFeignClient {

    @GetMapping("/employees")
    List<Employee> getEmployees();
}
