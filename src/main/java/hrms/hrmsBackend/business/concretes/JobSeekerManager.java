package hrms.hrmsBackend.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrmsBackend.business.abstracts.JobSeekerService;
import hrms.hrmsBackend.dataAccess.abstracts.JobSeekerDao;
import hrms.hrmsBackend.entities.concretes.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService{

	private JobSeekerDao jobSeekerDao;
	
	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao) {
		super();
		this.jobSeekerDao = jobSeekerDao;
	}

	@Override
	public void add(JobSeeker jobSeeker) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(JobSeeker jobSeeker) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(JobSeeker jobSeeker) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public JobSeeker get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<JobSeeker> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
