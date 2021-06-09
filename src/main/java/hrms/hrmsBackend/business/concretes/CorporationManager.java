package hrms.hrmsBackend.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import hrms.hrmsBackend.business.abstracts.CorporationService;
import hrms.hrmsBackend.business.abstracts.SendEmailVerifyService;
import hrms.hrmsBackend.business.abstracts.UserService;
import hrms.hrmsBackend.core.utilites.results.DataResult;
import hrms.hrmsBackend.core.utilites.results.ErrorResult;
import hrms.hrmsBackend.core.utilites.results.Result;
import hrms.hrmsBackend.core.utilites.results.SuccessDataResult;
import hrms.hrmsBackend.core.utilites.results.SuccessResult;
import hrms.hrmsBackend.dataAccess.abstracts.CorporationDao;
import hrms.hrmsBackend.entities.concretes.Corporation;

@Service
public class CorporationManager implements CorporationService{
	private CorporationDao corporationDao;
	private UserService userService;
	private SendEmailVerifyService sendEmailVerifyService;
	
	
	public CorporationManager(CorporationDao corporationDao, UserService userService, SendEmailVerifyService sendEmailVerifyService) {
		super();
		this.corporationDao = corporationDao;
		this.userService = userService;
		this.sendEmailVerifyService = sendEmailVerifyService;
	}

	@Override
	public Result add(Corporation corporation) {
		


if(!corporation.getUser().getPassword().equals(corporation.getUser().getPasswordRepeat()) ) {
	return new ErrorResult("şifreler aynı değil");
}

if(userService.isEmailExist(corporation.getUser().getEmail())) {
	  return new ErrorResult("bu email kayıtlı");
}

if(  !checkEmailAndDomainNameIsEqual(corporation)) {
	return new ErrorResult("email , web sitesi ile aynı domaine sahip olmalı");
}
		
if(!this.sendEmailVerifyService.sendEmail(corporation.getUser().getEmail())) {
	 return new ErrorResult("kayıt başarısız, doğrulama emaili gonderilemedi");
	
}
		
		this.corporationDao.save(corporation);
		return new SuccessResult("Firma kayıt oldu, dogrulama emaili adresinize gonderildi");
	}
	
	
	@Override
	public Result update(Corporation corporation) {
		this.corporationDao.save(corporation);
		return new SuccessResult("Firma bilgisi güncellendi");
	}

	@Override
	public Result delete(Corporation corporation) {
		this.corporationDao.delete(corporation);
		return new SuccessResult("Firma silindi");
	}

	@Override
	public DataResult<Corporation> getById(int id) {
		return new SuccessDataResult<Corporation>(this.corporationDao.getByCorporationId(id), "Firma goruntulendi");
	}

	@Override
	public DataResult<List<Corporation>> getAll() {
		
		return new SuccessDataResult<List<Corporation>>(this.corporationDao.findAll(), "Tüm firmalar listelendi");
	}
	
	
	
    private boolean checkEmailAndDomainNameIsEqual(Corporation corporation){

        String[] email = corporation.getUser().getEmail().split("@", 2);
        String webSite = corporation.getWebsite().substring(4); 

        if (!email[1].equals(webSite)){
            return false;
        }

        return true;
    }



}
