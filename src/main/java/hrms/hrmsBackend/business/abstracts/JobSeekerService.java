package hrms.hrmsBackend.business.abstracts;

import java.util.List;

import hrms.hrmsBackend.entities.concretes.JobSeeker;

public interface JobSeekerService {
	void add(JobSeeker jobSeeker);
	void update(JobSeeker jobSeeker);
	void delete(JobSeeker jobSeeker);
	JobSeeker get(int id);
	List<JobSeeker> getAll();
}
