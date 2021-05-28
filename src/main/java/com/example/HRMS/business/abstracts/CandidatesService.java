package com.example.HRMS.business.abstracts;

import com.example.HRMS.core.utillities.Result;
import com.example.HRMS.entitites.concretes.Candidates;

import java.util.List;


public interface CandidatesService {

	public Result login(String email, String password);
	public Result register(Candidates candidates);
	public List<Candidates> getAll();
	public List<String> getAllEmails();
	public List<String> getAllNationalId();
}
