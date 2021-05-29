package hrms.hrmsBackend.business.abstracts;

import hrms.hrmsBackend.entities.concretes.JobSeeker;

public interface JobSeekerCheckService {
	
	boolean checkIfRealPerson(JobSeeker jobSeeker);
}
