package hrms.hrmsBackend.business.abstracts;

import java.util.List;

import hrms.hrmsBackend.entities.concretes.JobPosition;

public interface JobPositionService {
	List<JobPosition> getAll();
}
