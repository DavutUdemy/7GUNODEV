package com.example.HRMS.business.abstracts;

import com.example.HRMS.entitites.concretes.JobPosition;

import java.util.List;


public interface JobPositionService {
	List<JobPosition> getAll();
}
