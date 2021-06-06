package hrms.hrmsBackend.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrmsBackend.business.abstracts.MailVerificationService;
import hrms.hrmsBackend.core.utilites.results.DataResult;
import hrms.hrmsBackend.core.utilites.results.Result;
import hrms.hrmsBackend.core.utilites.results.SuccessDataResult;
import hrms.hrmsBackend.core.utilites.results.SuccessResult;
import hrms.hrmsBackend.dataAccess.abstracts.MailVerificationDao;
import hrms.hrmsBackend.entities.concretes.MailVerification;
import hrms.hrmsBackend.entities.concretes.User;
import net.bytebuddy.asm.Advice.This;

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
		
		this.mailVerificationDao.save(mailVerification);
		return new SuccessResult();
		
	}
	
	
	@Override
	public Result update(MailVerification mailVerification) {
		this.mailVerificationDao.save(mailVerification);
		return new SuccessResult();
	}

	@Override
	public Result delete(MailVerification mailVerification) {
		this.mailVerificationDao.delete(mailVerification);
		return new SuccessResult();
	}

	@Override
	public DataResult<MailVerification> getById(int id) {
		return new SuccessDataResult<MailVerification>(this.mailVerificationDao.getById(id),"görüntülendi");
	}

	@Override
	public DataResult<List<MailVerification>> getAll() {
		return new SuccessDataResult<List<MailVerification>>(this.mailVerificationDao.findAll(),"listelendi");
	}




}
