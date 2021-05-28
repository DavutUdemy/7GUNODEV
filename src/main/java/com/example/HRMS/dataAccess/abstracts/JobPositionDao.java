package com.example.HRMS.dataAccess.abstracts;

import com.example.HRMS.entitites.concretes.JobPosition;
import org.springframework.data.jpa.repository.JpaRepository;


public interface JobPositionDao extends JpaRepository<JobPosition, Long>{

}
