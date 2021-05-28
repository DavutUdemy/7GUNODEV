package com.example.HRMS.core.concretes;

import java.util.regex.Pattern;

import com.example.HRMS.core.abstracts.CheckEmailService;
import org.springframework.stereotype.Component;


@Component
public class CheckMailManager implements CheckEmailService {

	private static final String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
	
	@Override
	public boolean mailCheck(String email) {
		Pattern pattern = Pattern.compile(EMAIL_PATTERN, Pattern.CASE_INSENSITIVE);
		return pattern.matcher(email).find();
	}

}
