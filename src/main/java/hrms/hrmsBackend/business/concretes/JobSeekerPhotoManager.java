package hrms.hrmsBackend.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrmsBackend.business.abstracts.JobSeekerPhotoService;
import hrms.hrmsBackend.core.utilites.results.DataResult;
import hrms.hrmsBackend.core.utilites.results.Result;
import hrms.hrmsBackend.core.utilites.results.SuccessDataResult;
import hrms.hrmsBackend.core.utilites.results.SuccessResult;
import hrms.hrmsBackend.dataAccess.abstracts.JobSeekerPhotoDao;
import hrms.hrmsBackend.entities.concretes.JobSeekerPhoto;

@Service
public class JobSeekerPhotoManager implements JobSeekerPhotoService{
	
	private JobSeekerPhotoDao jobSeekerPhotoDao;
	
	@Autowired
	public JobSeekerPhotoManager(JobSeekerPhotoDao jobSeekerPhotoDao) {
		super();
		this.jobSeekerPhotoDao = jobSeekerPhotoDao;
	}

	@Override
	public Result add(JobSeekerPhoto jobSeekerPhoto) {
		this.jobSeekerPhotoDao.save(jobSeekerPhoto);
		return new SuccessResult("kaydedildi");
	}

	@Override
	public Result update(JobSeekerPhoto jobSeekerPhoto) {
		this.jobSeekerPhotoDao.save(jobSeekerPhoto);
		return new SuccessResult("güncellendi");
	}

	@Override
	public Result delete(JobSeekerPhoto jobSeekerPhoto) {
		this.jobSeekerPhotoDao.delete(jobSeekerPhoto);
		return new SuccessResult("silindi");
	}

	@Override
	public DataResult<JobSeekerPhoto> getById(int id) {
		return new SuccessDataResult<JobSeekerPhoto>(this.jobSeekerPhotoDao.getById(id),"görüntülendi");
	}

	@Override
	public DataResult<List<JobSeekerPhoto>> getAll() {
		return new SuccessDataResult<List<JobSeekerPhoto>>(this.jobSeekerPhotoDao.findAll(),"getirildi");
	}

}
