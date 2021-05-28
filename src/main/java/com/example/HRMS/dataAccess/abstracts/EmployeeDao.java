package com.example.HRMS.dataAccess.abstracts;

import com.example.HRMS.entitites.concretes.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeDao extends JpaRepository<Employee, Long>{

}
