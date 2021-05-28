package com.example.HRMS.core.abstracts;

import com.example.HRMS.entitites.concretes.Candidates;
import org.springframework.stereotype.Service;


@Service
public interface MernisCheckService {
	public boolean checkIfRealPerson(Candidates candidates);

}
