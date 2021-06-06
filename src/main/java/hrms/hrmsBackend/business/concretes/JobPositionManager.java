package hrms.hrmsBackend.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrmsBackend.business.abstracts.JobPositionService;
import hrms.hrmsBackend.core.utilites.results.DataResult;
import hrms.hrmsBackend.core.utilites.results.ErrorResult;
import hrms.hrmsBackend.core.utilites.results.Result;
import hrms.hrmsBackend.core.utilites.results.SuccessDataResult;
import hrms.hrmsBackend.core.utilites.results.SuccessResult;
import hrms.hrmsBackend.dataAccess.abstracts.JobPositionDao;
import hrms.hrmsBackend.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService{
	
	private JobPositionDao jobPositionDao;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}





	@Override
	public Result add(JobPosition jobPosition) {
		
		if( isNameExists(jobPosition.getJobpositionName()) ) {
			return new ErrorResult("Bu isim kayıtlı");
		}
		
		
		this.jobPositionDao.save(jobPosition);
		return new SuccessResult("kayıt basarılı");
		
	}
	
	
	@Override
	public Result update(JobPosition jobPosition) {
		this.jobPositionDao.save(jobPosition);
		return new SuccessResult("kayıt güncellendi");
	}


	@Override
	public Result delete(JobPosition jobPosition) {
		this.jobPositionDao.delete(jobPosition);
		return new SuccessResult("kayıt silindi");
	}


	@Override
	public DataResult<JobPosition> getById(int id) {
		
		return new SuccessDataResult<JobPosition>(this.jobPositionDao.getById(id),"Kayıt görüntülendi");
	}
	
	
	@Override
	public DataResult<List<JobPosition>> getAll() {
		return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.findAll(),"Kayıtlı işler listelendi");
	}
	
	private boolean isNameExists(String name) {
		if(jobPositionDao.getByJobpositionName(name).size() > 0) {
			return true;
		}
		return false;
	}




}
