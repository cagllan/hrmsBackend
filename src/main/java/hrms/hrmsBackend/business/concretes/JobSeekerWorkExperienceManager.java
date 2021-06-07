package hrms.hrmsBackend.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrmsBackend.business.abstracts.JobSeekerWorkExperienceService;
import hrms.hrmsBackend.core.utilites.results.DataResult;
import hrms.hrmsBackend.core.utilites.results.Result;
import hrms.hrmsBackend.core.utilites.results.SuccessDataResult;
import hrms.hrmsBackend.core.utilites.results.SuccessResult;
import hrms.hrmsBackend.dataAccess.abstracts.JobSeekerWorkExperienceDao;
import hrms.hrmsBackend.entities.concretes.JobSeekerWorkExperience;

@Service
public class JobSeekerWorkExperienceManager implements JobSeekerWorkExperienceService{
	
	private JobSeekerWorkExperienceDao jobSeekerWorkExperienceDao;

	@Autowired
	public JobSeekerWorkExperienceManager(JobSeekerWorkExperienceDao jobSeekerWorkExperienceDao) {
		super();
		this.jobSeekerWorkExperienceDao = jobSeekerWorkExperienceDao;
	}

	@Override
	public Result add(JobSeekerWorkExperience jobSeekerWorkExperience) {
		this.jobSeekerWorkExperienceDao.save(jobSeekerWorkExperience);
		return new SuccessResult("kaydedildi");
	}

	@Override
	public Result update(JobSeekerWorkExperience jobSeekerWorkExperience) {
		this.jobSeekerWorkExperienceDao.save(jobSeekerWorkExperience);
		return new SuccessResult("güncellendi");
	}

	@Override
	public Result delete(JobSeekerWorkExperience jobSeekerWorkExperience) {
		this.jobSeekerWorkExperienceDao.delete(jobSeekerWorkExperience);
		return new SuccessResult("silindi");
	}

	@Override
	public DataResult<JobSeekerWorkExperience> getById(int id) {
		return new SuccessDataResult<JobSeekerWorkExperience>(this.jobSeekerWorkExperienceDao.getById(id),"görüntülendi");
	}

	@Override
	public DataResult<List<JobSeekerWorkExperience>> getAll() {
		return new SuccessDataResult<List<JobSeekerWorkExperience>>(this.jobSeekerWorkExperienceDao.findAll(),"getirildi");
	}

}
