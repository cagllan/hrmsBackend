package hrms.hrmsBackend.business.abstracts;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import hrms.hrmsBackend.core.utilites.results.DataResult;
import hrms.hrmsBackend.core.utilites.results.Result;
import hrms.hrmsBackend.entities.concretes.JobSeekerPhoto;

public interface JobSeekerPhotoService {
	Result add(int jobSeekerId, MultipartFile image);
	Result update(JobSeekerPhoto jobSeekerPhoto);
	Result delete(JobSeekerPhoto jobSeekerPhoto);
	DataResult<JobSeekerPhoto> getById(int id);
	DataResult<List<JobSeekerPhoto>> getAll();
}
