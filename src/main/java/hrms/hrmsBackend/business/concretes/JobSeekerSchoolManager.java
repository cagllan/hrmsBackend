package hrms.hrmsBackend.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import hrms.hrmsBackend.business.abstracts.JobSeekerSchoolService;
import hrms.hrmsBackend.core.utilites.results.DataResult;
import hrms.hrmsBackend.core.utilites.results.Result;
import hrms.hrmsBackend.core.utilites.results.SuccessDataResult;
import hrms.hrmsBackend.core.utilites.results.SuccessResult;
import hrms.hrmsBackend.dataAccess.abstracts.JobSeekerSchoolDao;
import hrms.hrmsBackend.entities.concretes.JobSeekerSchool;

@Service
public class JobSeekerSchoolManager implements JobSeekerSchoolService{
	
	private JobSeekerSchoolDao jobSeekerSchoolDao;

	@Autowired
	public JobSeekerSchoolManager(JobSeekerSchoolDao jobSeekerSchoolDao) {
		super();
		this.jobSeekerSchoolDao = jobSeekerSchoolDao;
	}

	@Override
	public Result add(JobSeekerSchool jobSeekerSchool) {
		this.jobSeekerSchoolDao.save(jobSeekerSchool);
		return new SuccessResult("kaydedildi");
	}

	@Override
	public Result update(JobSeekerSchool jobSeekerSchool) {
		this.jobSeekerSchoolDao.save(jobSeekerSchool);
		return new SuccessResult("güncellendi");
	}

	@Override
	public Result delete(JobSeekerSchool jobSeekerSchool) {
		this.jobSeekerSchoolDao.delete(jobSeekerSchool);
		return new SuccessResult("silindi");
	}

	@Override
	public DataResult<JobSeekerSchool> getById(int id) {
		return new SuccessDataResult<JobSeekerSchool>(this.jobSeekerSchoolDao.getById(id),"görüntülendi");
	}

	@Override
	public DataResult<List<JobSeekerSchool>> getAll() {
		return new SuccessDataResult<List<JobSeekerSchool>>(this.jobSeekerSchoolDao.findAll(Sort.by("schoolFinishDate").descending()),"getirildi");
	}

}
