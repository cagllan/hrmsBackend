package hrms.hrmsBackend.business.concretes;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrmsBackend.business.abstracts.JobSeekerCheckService;
import hrms.hrmsBackend.business.abstracts.JobSeekerService;

import hrms.hrmsBackend.business.abstracts.SendEmailVerifyService;
import hrms.hrmsBackend.business.abstracts.UserService;
import hrms.hrmsBackend.core.utilites.results.DataResult;
import hrms.hrmsBackend.core.utilites.results.ErrorResult;
import hrms.hrmsBackend.core.utilites.results.Result;
import hrms.hrmsBackend.core.utilites.results.SuccessDataResult;
import hrms.hrmsBackend.core.utilites.results.SuccessResult;
import hrms.hrmsBackend.dataAccess.abstracts.JobSeekerDao;
import hrms.hrmsBackend.entities.concretes.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService{

	private JobSeekerDao jobSeekerDao;
	private UserService userService;
	private JobSeekerCheckService jobSeekerCheckService;
	private SendEmailVerifyService sendEmailVerifyService;
	
	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao, UserService userService, 
			JobSeekerCheckService jobSeekerCheckService, SendEmailVerifyService sendEmailVerifyService) {
		super();
		this.jobSeekerDao = jobSeekerDao;
		this.userService = userService;
		this.jobSeekerCheckService = jobSeekerCheckService;
		this.sendEmailVerifyService = sendEmailVerifyService;
	}

	@Override
	public Result add(JobSeeker jobSeeker) {
		
		if(jobSeeker.getDateOfBirth() == null || jobSeeker.getFirstName().isBlank() || jobSeeker.getLastName().isBlank() || jobSeeker.getNationalityId().isBlank() || jobSeeker.getUser().getEmail().isBlank() || jobSeeker.getUser().getPassword().isBlank() || jobSeeker.getUser().getPasswordRepeat().isBlank()) {
			
			return new ErrorResult("alanlar boş olamaz");
		}
		
		
		if(jobSeeker.getUser().getPassword() != jobSeeker.getUser().getPasswordRepeat()) {
			return new ErrorResult("şifreler aynı değil");
		}
			
		
		 if(userService.isEmailExist(jobSeeker.getUser().getEmail())) {
			  return new ErrorResult("bu email kayıtlı");
		  }
		 
		 if(isNationalityIdExist(jobSeeker.getNationalityId())) {
			  return new ErrorResult("bu kimlik numarası kayıtlı");
		  }
		 
		 if(!jobSeekerCheckService.checkIfRealPerson(jobSeeker)) {
			 return new ErrorResult("Kullanıcı kimlik numarası hatalı, kayıt başarısız!");
		 }
		
		 
		 if(!this.sendEmailVerifyService.sendEmail(jobSeeker.getUser().getEmail())) {
			 return new ErrorResult("kayıt başarısız, doğrulama emaili gonderilemedi");
			
		 }
		 
		 this.jobSeekerDao.save(jobSeeker);		 
		 return new SuccessResult("is arayan kayıt oldu. dogrulama emaili adresinize gonderildi" );
		 
	}



	@Override
	public DataResult<List<JobSeeker>> getAll() {
		
		return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll(), "adaylar listelendi");
	}

	
  	private boolean isNationalityIdExist(String nationalityId) {
  		if(this.jobSeekerDao.getByNationalityId(nationalityId) != null) {
  			return true; 
  		}
  		return false; 
  	}
  	
  

}
