package hrms.hrmsBackend.business.adapters;

import hrms.hrmsBackend.entities.concretes.JobSeeker;

public interface JobSeekerCheckServiceAdapter {
	boolean checkIfRealPerson(JobSeeker jobSeeker);
}
