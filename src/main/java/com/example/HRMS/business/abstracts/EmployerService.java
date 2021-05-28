package com.example.HRMS.business.abstracts;

import com.example.HRMS.core.utillities.DataResult;
import com.example.HRMS.core.utillities.Result;
import com.example.HRMS.entitites.concretes.Employer;

import java.util.List;


public interface EmployerService {
	
	public Result login(String email, String password);
	public Result register(Employer employer);
	
	DataResult<List<Employer>> getAll();
	public List<String> getAllEmails();
}
