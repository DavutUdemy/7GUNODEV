package com.example.HRMS.business.abstracts;

import com.example.HRMS.core.utillities.DataResult;
import com.example.HRMS.core.utillities.Result;
import com.example.HRMS.entitites.concretes.Employee;

import java.util.List;


public interface EmployeeService {
	
	DataResult<List<Employee>> getAll();
	public Result register(Employee employee);
}
