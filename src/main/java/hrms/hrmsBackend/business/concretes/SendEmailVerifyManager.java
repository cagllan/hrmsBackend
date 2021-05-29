package hrms.hrmsBackend.business.concretes;

import org.springframework.stereotype.Service;

import hrms.hrmsBackend.business.abstracts.SendEmailVerifyService;
import hrms.hrmsBackend.core.utilites.results.Result;
import hrms.hrmsBackend.core.utilites.results.SuccessResult;

@Service
public class SendEmailVerifyManager implements SendEmailVerifyService{

	@Override
	public boolean sendEmail(String email) {
		
		return false;
	}
	

}
