package com.example.HRMS.business.concretes;

import java.util.List;

import com.example.HRMS.business.abstracts.EmployeeService;
import com.example.HRMS.core.utillities.DataResult;
import com.example.HRMS.core.utillities.Result;
import com.example.HRMS.core.utillities.SuccessDataResult;
import com.example.HRMS.core.utillities.SuccessResult;
import com.example.HRMS.dataAccess.abstracts.EmployeeDao;
import com.example.HRMS.entitites.concretes.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class EmployeeManager implements EmployeeService {

	private EmployeeDao employeeDao;
	
	@Autowired
	public EmployeeManager(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}

	@Override
	public DataResult<List<Employee>> getAll() {
		return new SuccessDataResult<List<Employee>>(this.employeeDao.findAll(),"Çalışanlar Listelendi");
	}

	@Override
	public Result register(Employee employee) {
		this.employeeDao.save(employee);
		return new SuccessResult("Çalışan kayıt oldu.");
	}

}
