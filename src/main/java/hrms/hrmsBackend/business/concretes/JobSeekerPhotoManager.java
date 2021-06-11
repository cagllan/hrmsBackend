package hrms.hrmsBackend.business.concretes;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import hrms.hrmsBackend.business.abstracts.JobSeekerPhotoService;
import hrms.hrmsBackend.business.adapters.CloudinaryImageService;
import hrms.hrmsBackend.core.utilites.results.DataResult;
import hrms.hrmsBackend.core.utilites.results.Result;
import hrms.hrmsBackend.core.utilites.results.SuccessDataResult;
import hrms.hrmsBackend.core.utilites.results.SuccessResult;
import hrms.hrmsBackend.dataAccess.abstracts.JobSeekerPhotoDao;
import hrms.hrmsBackend.entities.concretes.JobSeekerPhoto;

@Service
public class JobSeekerPhotoManager implements JobSeekerPhotoService{
	
	private JobSeekerPhotoDao jobSeekerPhotoDao;
	private CloudinaryImageService cloudinaryImageService;
	
	@Autowired
	public JobSeekerPhotoManager(JobSeekerPhotoDao jobSeekerPhotoDao, CloudinaryImageService cloudinaryImageService) {
		super();
		this.jobSeekerPhotoDao = jobSeekerPhotoDao;
		this.cloudinaryImageService = cloudinaryImageService;
	}

	@Override
	public Result add(int jobSeekerId, MultipartFile image) {
		
		Map<String,String> uploadImage = this.cloudinaryImageService.uploadImage(image).getData();
		
		JobSeekerPhoto jobSeekerPhoto = new JobSeekerPhoto();
		jobSeekerPhoto.setJobSeekerId(jobSeekerId);;
		jobSeekerPhoto.setImagePath(uploadImage.get("url"));
		
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
