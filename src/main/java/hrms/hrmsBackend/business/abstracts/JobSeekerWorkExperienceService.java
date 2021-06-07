package hrms.hrmsBackend.business.abstracts;

import java.util.List;

import hrms.hrmsBackend.core.utilites.results.DataResult;
import hrms.hrmsBackend.core.utilites.results.Result;
import hrms.hrmsBackend.entities.concretes.JobSeekerWorkExperience;

public interface JobSeekerWorkExperienceService {
	Result add(JobSeekerWorkExperience jobSeekerWorkExperience);
	Result update(JobSeekerWorkExperience jobSeekerWorkExperience);
	Result delete(JobSeekerWorkExperience jobSeekerWorkExperience);
	DataResult<JobSeekerWorkExperience> getById(int id);
	DataResult<List<JobSeekerWorkExperience>> getAll();
}
