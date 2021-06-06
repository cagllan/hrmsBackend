package hrms.hrmsBackend.business.abstracts;

import java.util.List;

import hrms.hrmsBackend.core.utilites.results.DataResult;
import hrms.hrmsBackend.core.utilites.results.Result;
import hrms.hrmsBackend.entities.concretes.JobSeeker;

public interface JobSeekerService {
	Result add(JobSeeker jobSeeker);
	Result update(JobSeeker jobSeeker);
	Result delete(JobSeeker jobSeeker);
	DataResult<JobSeeker> getById(int id);
	DataResult<List<JobSeeker>> getAll();
}
