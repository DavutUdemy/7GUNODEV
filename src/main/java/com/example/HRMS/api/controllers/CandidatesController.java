package com.example.HRMS.api.controllers;

import java.util.List;

import com.example.HRMS.business.abstracts.CandidatesService;
import com.example.HRMS.core.utillities.Result;
import com.example.HRMS.entitites.concretes.Candidates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/candidates")
public class CandidatesController {
	
	private CandidatesService candidatesService;
	
	@Autowired
	public CandidatesController(CandidatesService candidatesService) {
		super();
		this.candidatesService = candidatesService;
	}
	
	@GetMapping("/getall")
	public List<Candidates> getAll(){
		return this.candidatesService.getAll();
		
	}
	
	@PostMapping("/register")
	public Result add(@RequestBody Candidates candidates) {
		return this.candidatesService.register(candidates);
	}
}
