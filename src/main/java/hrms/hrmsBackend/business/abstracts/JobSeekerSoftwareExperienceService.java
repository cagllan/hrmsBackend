package hrms.hrmsBackend.business.abstracts;

import java.util.List;

import hrms.hrmsBackend.core.utilites.results.DataResult;
import hrms.hrmsBackend.core.utilites.results.Result;
import hrms.hrmsBackend.entities.concretes.JobSeekerSoftwareExperience;

public interface JobSeekerSoftwareExperienceService {
	Result add(JobSeekerSoftwareExperience jobSeekerSoftwareExperience);
	Result update(JobSeekerSoftwareExperience jobSeekerSoftwareExperience);
	Result delete(JobSeekerSoftwareExperience jobSeekerSoftwareExperience);
	DataResult<JobSeekerSoftwareExperience> getById(int id);
	DataResult<List<JobSeekerSoftwareExperience>> getAll();
}
