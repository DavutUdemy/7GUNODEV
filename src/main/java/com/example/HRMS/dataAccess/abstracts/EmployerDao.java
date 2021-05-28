package com.example.HRMS.dataAccess.abstracts;

import com.example.HRMS.entitites.concretes.Employer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployerDao extends JpaRepository<Employer, Long>{

}
