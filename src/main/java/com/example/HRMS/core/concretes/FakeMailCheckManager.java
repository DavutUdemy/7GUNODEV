package com.example.HRMS.core.concretes;

import com.example.HRMS.core.abstracts.CheckEmailService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Primary
@Component
public class FakeMailCheckManager implements CheckEmailService {

	@Override
	public boolean mailCheck(String email) {
		return true;
	}

}
