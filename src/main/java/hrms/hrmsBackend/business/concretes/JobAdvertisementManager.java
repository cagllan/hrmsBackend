package hrms.hrmsBackend.business.concretes;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrmsBackend.business.abstracts.JobAdvertisementService;
import hrms.hrmsBackend.core.utilites.results.DataResult;
import hrms.hrmsBackend.core.utilites.results.Result;
import hrms.hrmsBackend.core.utilites.results.SuccessDataResult;
import hrms.hrmsBackend.core.utilites.results.SuccessResult;
import hrms.hrmsBackend.dataAccess.abstracts.JobAdvertisementDao;
import hrms.hrmsBackend.entities.concretes.JobAdvertisement;
import hrms.hrmsBackend.entities.dtos.JobAdvertisementWithActiveDto;

@Service
public class JobAdvertisementManager implements JobAdvertisementService{
	
	private JobAdvertisementDao jobAdvertisementDao;
	
	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;
	}

	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
		
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("ilan olusturuldu");
	}
	
	@Override
	public Result update(JobAdvertisement jobAdvertisement) {
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("ilan güncellendi");
	}

	@Override
	public Result delete(JobAdvertisement jobAdvertisement) {
		this.jobAdvertisementDao.delete(jobAdvertisement);
		return new SuccessResult("ilan silindi");
	}

	@Override
	public DataResult<JobAdvertisement> getById(int id) {
		return new SuccessDataResult<JobAdvertisement>(this.jobAdvertisementDao.getById(id), "ilan goruntulendi");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAll() {
		
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findAll(), "ilanlar listelendi");
	}

	@Override
	public DataResult<List<JobAdvertisementWithActiveDto>> getJobAdvertisementWithActive() {
		
		return new SuccessDataResult<List<JobAdvertisementWithActiveDto>>(this.jobAdvertisementDao.getJobAdvertisementWithActive(),"aktif olanlar getirildi");
	}

	@Override
	public DataResult<List<JobAdvertisementWithActiveDto>> getJobAdvertisementWithActiveAndReleaseDate(
			LocalDate releaseDate) {
		return new SuccessDataResult<List<JobAdvertisementWithActiveDto>>(this.jobAdvertisementDao.getJobAdvertisementWithActiveAndReleaseDate(releaseDate),"tarihli ilanlar getirildi");
	}

	@Override
	public DataResult<List<JobAdvertisementWithActiveDto>> getJobAdvertisementWithActiveAndCorporationId(int id) {
		
		return new SuccessDataResult<List<JobAdvertisementWithActiveDto>>(this.jobAdvertisementDao.getJobAdvertisementWithActiveAndCorporationId(id),"şirkete ait tüm ilanlar getirildi");
	}

	@Override
	public Result updateJobAdvertisementDeActive(int id) {
		
		JobAdvertisement tempJobAdvert = this.jobAdvertisementDao.getById(id);
		
		tempJobAdvert.setActive(false);
		
		this.jobAdvertisementDao.save(tempJobAdvert);
		
		return new SuccessResult("İş ilanı pasif yapıldı.");
	}





}
