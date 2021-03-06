package com.example.HRMS.api.controllers;

import java.util.List;

import com.example.HRMS.business.abstracts.EmployerService;
import com.example.HRMS.core.utillities.DataResult;
import com.example.HRMS.core.utillities.Result;
import com.example.HRMS.entitites.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/employers")
public class EmployerController {
	
	private EmployerService employerService;
	
	@Autowired
	public EmployerController(EmployerService employerService) {
		super();
		this.employerService = employerService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Employer>> getAll(){
		return this.employerService.getAll();
	}
	
	@PostMapping("/register")
	public Result add(@RequestBody Employer employer) {
		return this.employerService.register(employer);
	}
}
