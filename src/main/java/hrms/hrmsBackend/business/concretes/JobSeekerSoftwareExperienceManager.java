package hrms.hrmsBackend.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrmsBackend.business.abstracts.JobSeekerSoftwareExperienceService;
import hrms.hrmsBackend.core.utilites.results.DataResult;
import hrms.hrmsBackend.core.utilites.results.Result;
import hrms.hrmsBackend.core.utilites.results.SuccessDataResult;
import hrms.hrmsBackend.core.utilites.results.SuccessResult;
import hrms.hrmsBackend.dataAccess.abstracts.JobSeekerSoftwareExperienceDao;
import hrms.hrmsBackend.entities.concretes.JobSeekerSoftwareExperience;

@Service
public class JobSeekerSoftwareExperienceManager implements JobSeekerSoftwareExperienceService{
	
	private JobSeekerSoftwareExperienceDao jobSeekerSoftwareExperienceDao;

	@Autowired
	public JobSeekerSoftwareExperienceManager(JobSeekerSoftwareExperienceDao jobSeekerSoftwareExperienceDao) {
		super();
		this.jobSeekerSoftwareExperienceDao = jobSeekerSoftwareExperienceDao;
	}

	@Override
	public Result add(JobSeekerSoftwareExperience jobSeekerSoftwareExperience) {
		this.jobSeekerSoftwareExperienceDao.save(jobSeekerSoftwareExperience);
		return new SuccessResult("kaydedildi");
	}

	@Override
	public Result update(JobSeekerSoftwareExperience jobSeekerSoftwareExperience) {
		this.jobSeekerSoftwareExperienceDao.save(jobSeekerSoftwareExperience);
		return new SuccessResult("güncellendi");
	}

	@Override
	public Result delete(JobSeekerSoftwareExperience jobSeekerSoftwareExperience) {
		this.jobSeekerSoftwareExperienceDao.delete(jobSeekerSoftwareExperience);
		return new SuccessResult("silindi");
	}

	@Override
	public DataResult<JobSeekerSoftwareExperience> getById(int id) {
		return new SuccessDataResult<JobSeekerSoftwareExperience>(this.jobSeekerSoftwareExperienceDao.getById(id),"görüntülendi");
	}

	@Override
	public DataResult<List<JobSeekerSoftwareExperience>> getAll() {
		return new SuccessDataResult<List<JobSeekerSoftwareExperience>>(this.jobSeekerSoftwareExperienceDao.findAll(),"getirildi");
	}

}
