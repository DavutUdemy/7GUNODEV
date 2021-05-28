package com.example.HRMS.core.concretes;

import org.springframework.stereotype.Service;

@Service
public class MailSendManager {

	public void verificationSend(String email) {
		System.out.println("Verification Code has sent: " +email);
	}
}
