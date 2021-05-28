package com.example.HRMS.business.concretes;

import java.util.ArrayList;
import java.util.List;

import com.example.HRMS.business.abstracts.CandidatesService;
import com.example.HRMS.core.abstracts.CheckEmailService;
import com.example.HRMS.core.abstracts.EmailSendService;
import com.example.HRMS.core.abstracts.MernisCheckService;
import com.example.HRMS.core.utillities.ErrorResult;
import com.example.HRMS.core.utillities.Result;
import com.example.HRMS.core.utillities.SuccessResult;
import com.example.HRMS.dataAccess.abstracts.CandidatesDao;
import com.example.HRMS.entitites.concretes.Candidates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CandidatesManager implements CandidatesService {

	private CandidatesDao candidatesDao;
	private CheckEmailService checkEmailService;
	private MernisCheckService mernisCheckService;
	private EmailSendService emailSendService;
	private List<String> emails = new ArrayList<>();
	private List<String> identificationNumbers = new ArrayList<>();
	
	@Autowired
	public CandidatesManager(CandidatesDao candidatesDao, CheckEmailService checkEmailService, MernisCheckService mernisCheckService, EmailSendService emailSendService) {
		super();	
		this.candidatesDao = candidatesDao;
		this.checkEmailService = checkEmailService;
		this.mernisCheckService = mernisCheckService;
		this.emailSendService = emailSendService;
	}
	
	@Override
	public Result login(String email, String password) {
		Result result = new ErrorResult("Giriş başarısız.");
		for (int i = 0; i < candidatesDao.findAll().size(); i++) {
			if(candidatesDao.findAll().get(i).getEmail() == email && candidatesDao.findAll().get(i).getPassword() == password) {
				result = new SuccessResult("Giriş başarılı.");
			}
		}
		return result;
	}

	@Override
	public Result register(Candidates candidates) {
		Result result = new ErrorResult("Kayıt başarızıs.");
		if(checkEmailService.mailCheck(candidates.getEmail()) && emailIsItUsed(candidates.getEmail()) && nationalIdIsItUsed(candidates.getNationalIdentity()) && mernisCheckService.checkIfRealPerson(candidates)){
			emailSendService.emailSend(candidates.getEmail());
			this.candidatesDao.save(candidates);
			result = new SuccessResult("Kayıt Başarılı.");
		}
		return result;
	}

	private boolean nationalIdIsItUsed(String nationalIdentity) {
		boolean result = true;
		if (getAllNationalId().contains(nationalIdentity)) {
			result = false;
		}
		return result;
	}

	private boolean emailIsItUsed(String email) {
		boolean result = true;
		if(getAllEmails().contains(email)) {
			result = false;
		}
		return result;
	}

	@Override
	public List<Candidates> getAll() {
		return this.candidatesDao.findAll();
	}

	@Override
	public List<String> getAllEmails() {
		for(int i = 0; i < getAll().size(); i++) {
			emails.add(getAll().get(i).getEmail());
		}
		return emails;
	}

	@Override
	public List<String> getAllNationalId() {
		for(int i = 0; i < getAll().size(); i++) {
			identificationNumbers.add(getAll().get(i).getNationalIdentity());
		}
		return identificationNumbers;
	}

}
