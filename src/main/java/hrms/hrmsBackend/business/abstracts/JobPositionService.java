package hrms.hrmsBackend.business.abstracts;

import java.util.List;

import hrms.hrmsBackend.entities.concretes.JobPosition;

public interface JobPositionService {
	void add(JobPosition jobPosition);
	void update(JobPosition jobPosition);
	void delete(JobPosition jobPosition);
	JobPosition get(int id);
	List<JobPosition> getAll();
}
