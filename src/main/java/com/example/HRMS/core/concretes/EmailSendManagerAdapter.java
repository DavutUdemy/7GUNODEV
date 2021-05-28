package com.example.HRMS.core.concretes;

import com.example.HRMS.core.abstracts.EmailSendService;
import org.springframework.stereotype.Service;


@Service
public class EmailSendManagerAdapter implements EmailSendService {

	private MailSendManager mailSendManager;
	
	public EmailSendManagerAdapter(MailSendManager mailSendManager) {
		super();
		this.mailSendManager = mailSendManager;
	}
	
	@Override
	public void emailSend(String email) {
		mailSendManager.verificationSend(email);
	}

}
