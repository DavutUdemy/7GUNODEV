package com.example.HRMS.core.concretes;

import com.example.HRMS.core.abstracts.MernisCheckService;
import com.example.HRMS.entitites.concretes.Candidates;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Primary
@Component
public class FakeMernisCheckAdapter implements MernisCheckService {

	@Override
	public boolean checkIfRealPerson(Candidates candidates) {
		return true;
	}
	
}
