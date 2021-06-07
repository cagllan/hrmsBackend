package hrms.hrmsBackend.business.abstracts;

import java.util.List;

import hrms.hrmsBackend.core.utilites.results.DataResult;
import hrms.hrmsBackend.core.utilites.results.Result;
import hrms.hrmsBackend.entities.concretes.JobSeekerSchool;

public interface JobSeekerSchoolService {
	Result add(JobSeekerSchool jobSeekerSchool);
	Result update(JobSeekerSchool jobSeekerSchool);
	Result delete(JobSeekerSchool jobSeekerSchool);
	DataResult<JobSeekerSchool> getById(int id);
	DataResult<List<JobSeekerSchool>> getAll();
}
