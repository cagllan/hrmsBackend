package hrms.hrmsBackend.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrmsBackend.business.abstracts.JobSeekerCvService;
import hrms.hrmsBackend.core.utilites.results.DataResult;
import hrms.hrmsBackend.core.utilites.results.Result;
import hrms.hrmsBackend.core.utilites.results.SuccessDataResult;
import hrms.hrmsBackend.core.utilites.results.SuccessResult;
import hrms.hrmsBackend.dataAccess.abstracts.JobSeekerCvDao;
import hrms.hrmsBackend.entities.concretes.JobSeekerCv;

@Service
public class JobSeekerCvManager implements JobSeekerCvService{
	
	private JobSeekerCvDao jobSeekerCvDao;

	@Autowired
	public JobSeekerCvManager(JobSeekerCvDao jobSeekerCvDao) {
		super();
		this.jobSeekerCvDao = jobSeekerCvDao;
	}

	@Override
	public Result add(JobSeekerCv jobSeekerCv) {
		this.jobSeekerCvDao.save(jobSeekerCv);
		return new SuccessResult("cv kaydedildi");
	}

	@Override
	public Result update(JobSeekerCv jobSeekerCv) {
		this.jobSeekerCvDao.save(jobSeekerCv);
		return new SuccessResult("cv güncellendi");
	}

	@Override
	public Result delete(JobSeekerCv jobSeekerCv) {
		this.jobSeekerCvDao.delete(jobSeekerCv);
		return new SuccessResult("cv silindi");
	}

	@Override
	public DataResult<JobSeekerCv> getById(int id) {
		
		return new SuccessDataResult<JobSeekerCv>(this.jobSeekerCvDao.getById(id),"cv görüntülendi");
	}

	@Override
	public DataResult<List<JobSeekerCv>> getAll() {
		
		return new SuccessDataResult<List<JobSeekerCv>>(this.jobSeekerCvDao.findAll(),"cv ler getirildi");
	}

}
