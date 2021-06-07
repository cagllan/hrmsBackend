package hrms.hrmsBackend.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrmsBackend.business.abstracts.JobSeekerLanguageService;
import hrms.hrmsBackend.core.utilites.results.DataResult;
import hrms.hrmsBackend.core.utilites.results.Result;
import hrms.hrmsBackend.core.utilites.results.SuccessDataResult;
import hrms.hrmsBackend.core.utilites.results.SuccessResult;
import hrms.hrmsBackend.dataAccess.abstracts.JobSeekerLanguageDao;
import hrms.hrmsBackend.entities.concretes.JobSeekerLanguage;

@Service
public class JobSeekerLanguageManager implements JobSeekerLanguageService{

	private JobSeekerLanguageDao jobSeekerLanguageDao;
	
	@Autowired
	public JobSeekerLanguageManager(JobSeekerLanguageDao jobSeekerLanguageDao) {
		super();
		this.jobSeekerLanguageDao = jobSeekerLanguageDao;
	}

	@Override
	public Result add(JobSeekerLanguage jobSeekerLanguage) {
		this.jobSeekerLanguageDao.save(jobSeekerLanguage);
		return new SuccessResult("kaydedildi");
	}

	@Override
	public Result update(JobSeekerLanguage jobSeekerLanguage) {
		this.jobSeekerLanguageDao.save(jobSeekerLanguage);
		return new SuccessResult("güncellendi");
	}

	@Override
	public Result delete(JobSeekerLanguage jobSeekerLanguage) {
		this.jobSeekerLanguageDao.delete(jobSeekerLanguage);
		return new SuccessResult("silindi");
	}

	@Override
	public DataResult<JobSeekerLanguage> getById(int id) {
		return new SuccessDataResult<JobSeekerLanguage>(this.jobSeekerLanguageDao.getById(id),"görüntülendi");
	}

	@Override
	public DataResult<List<JobSeekerLanguage>> getAll() {
		return new SuccessDataResult<List<JobSeekerLanguage>>(this.jobSeekerLanguageDao.findAll(),"getirildi");
	}

}
