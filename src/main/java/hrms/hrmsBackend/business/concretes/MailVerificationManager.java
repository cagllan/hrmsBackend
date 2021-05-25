package hrms.hrmsBackend.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrmsBackend.business.abstracts.MailVerificationService;
import hrms.hrmsBackend.core.utilites.results.DataResult;
import hrms.hrmsBackend.core.utilites.results.Result;
import hrms.hrmsBackend.dataAccess.abstracts.MailVerificationDao;
import hrms.hrmsBackend.entities.concretes.MailVerification;

@Service
public class MailVerificationManager implements MailVerificationService{
	
	private MailVerificationDao mailVerificationDao;
	
	@Autowired
	public MailVerificationManager(MailVerificationDao mailVerificationDao) {
		super();
		this.mailVerificationDao = mailVerificationDao;
	}

	@Override
	public Result add(MailVerification mailVerification) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result update(MailVerification mailVerification) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result delete(MailVerification mailVerification) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<MailVerification> get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<MailVerification>> getAll() {
		// TODO Auto-generated method stub
		return null;
	}



}
