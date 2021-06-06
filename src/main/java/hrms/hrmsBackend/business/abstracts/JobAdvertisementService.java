package hrms.hrmsBackend.business.abstracts;

import java.time.LocalDate;
import java.util.List;

import hrms.hrmsBackend.core.utilites.results.DataResult;
import hrms.hrmsBackend.core.utilites.results.Result;
import hrms.hrmsBackend.entities.concretes.JobAdvertisement;
import hrms.hrmsBackend.entities.dtos.JobAdvertisementWithActiveDto;

public interface JobAdvertisementService {
	Result add(JobAdvertisement jobAdvertisement);
	Result update(JobAdvertisement jobAdvertisement);
	Result delete(JobAdvertisement jobAdvertisement);
	DataResult<JobAdvertisement> getById(int id);
	DataResult<List<JobAdvertisement>> getAll();
	DataResult<List<JobAdvertisementWithActiveDto>> getJobAdvertisementWithActive();
	
	DataResult<List<JobAdvertisementWithActiveDto>> getJobAdvertisementWithActiveAndReleaseDate(LocalDate releaseDate);
	
	DataResult<List<JobAdvertisementWithActiveDto>> getJobAdvertisementWithActiveAndCorporationId(int id);
	
	Result updateJobAdvertisementDeActive(int id);
}
