package com.example.HRMS.business.concretes;

import java.util.List;

import com.example.HRMS.business.abstracts.JobPositionService;
import com.example.HRMS.dataAccess.abstracts.JobPositionDao;
import com.example.HRMS.entitites.concretes.JobPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class JobPositionManager implements JobPositionService {
	
	private JobPositionDao jobPositionDao;

	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public List<JobPosition> getAll() {
		return this.jobPositionDao.findAll();
	}

}
