package hrms.hrmsBackend.business.abstracts;

import java.util.List;

import hrms.hrmsBackend.core.utilites.results.DataResult;
import hrms.hrmsBackend.core.utilites.results.Result;
import hrms.hrmsBackend.entities.concretes.JobSeekerLanguage;

public interface JobSeekerLanguageService {
	Result add(JobSeekerLanguage jobSeekerLanguage);
	Result update(JobSeekerLanguage jobSeekerLanguage);
	Result delete(JobSeekerLanguage jobSeekerLanguage);
	DataResult<JobSeekerLanguage> getById(int id);
	DataResult<List<JobSeekerLanguage>> getAll();
}
