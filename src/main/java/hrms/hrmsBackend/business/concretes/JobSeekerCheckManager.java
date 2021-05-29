package hrms.hrmsBackend.business.concretes;

import org.springframework.stereotype.Service;

import hrms.hrmsBackend.business.abstracts.JobSeekerCheckService;
import hrms.hrmsBackend.entities.concretes.JobSeeker;

@Service
public class JobSeekerCheckManager implements JobSeekerCheckService{

	@Override
	public boolean checkIfRealPerson(JobSeeker jobSeeker) {
		
		return true;
	}

}
