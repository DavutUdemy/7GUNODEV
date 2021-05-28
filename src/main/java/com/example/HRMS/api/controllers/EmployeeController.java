package com.example.HRMS.api.controllers;

import java.util.List;

import com.example.HRMS.business.abstracts.EmployeeService;
import com.example.HRMS.core.utillities.DataResult;
import com.example.HRMS.core.utillities.Result;
import com.example.HRMS.entitites.concretes.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	
	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Employee>> getAll(){
		return this.employeeService.getAll();
	}
	
	@PostMapping("/register")
	public Result add(@RequestBody Employee employee) {
		return this.employeeService.register(employee);
	}

}
