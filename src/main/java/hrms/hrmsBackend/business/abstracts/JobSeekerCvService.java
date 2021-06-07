package hrms.hrmsBackend.business.abstracts;

import java.util.List;

import hrms.hrmsBackend.core.utilites.results.DataResult;
import hrms.hrmsBackend.core.utilites.results.Result;
import hrms.hrmsBackend.entities.concretes.JobSeekerCv;

public interface JobSeekerCvService {
	Result add(JobSeekerCv jobSeekerCv);
	Result update(JobSeekerCv jobSeekerCv);
	Result delete(JobSeekerCv jobSeekerCv);
	DataResult<JobSeekerCv> getById(int id);
	DataResult<List<JobSeekerCv>> getAll();
}
