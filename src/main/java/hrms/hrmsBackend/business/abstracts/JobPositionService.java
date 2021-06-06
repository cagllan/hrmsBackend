package hrms.hrmsBackend.business.abstracts;

import java.util.List;

import hrms.hrmsBackend.core.utilites.results.DataResult;
import hrms.hrmsBackend.core.utilites.results.Result;
import hrms.hrmsBackend.entities.concretes.JobPosition;

public interface JobPositionService {
	Result add(JobPosition jobPosition);
	Result update(JobPosition jobPosition);
	Result delete(JobPosition jobPosition);
	DataResult<JobPosition> getById(int id);
	DataResult<List<JobPosition>> getAll();
}
