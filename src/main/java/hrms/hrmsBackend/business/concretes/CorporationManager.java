package hrms.hrmsBackend.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrmsBackend.business.abstracts.CorporationService;
import hrms.hrmsBackend.core.utilites.results.DataResult;
import hrms.hrmsBackend.core.utilites.results.Result;
import hrms.hrmsBackend.core.utilites.results.SuccessDataResult;
import hrms.hrmsBackend.core.utilites.results.SuccessResult;
import hrms.hrmsBackend.dataAccess.abstracts.CorporationDao;
import hrms.hrmsBackend.entities.concretes.Corporation;
import hrms.hrmsBackend.entities.concretes.JobSeeker;

@Service
public class CorporationManager implements CorporationService{

	private CorporationDao corporationDao;
	
	@Autowired
	public CorporationManager(CorporationDao corporationDao) {
		super();
		this.corporationDao = corporationDao;
	}

	@Override
	public Result add(Corporation corporation) {
		this.corporationDao.save(corporation);
		return new SuccessResult("firma kayıt oldu");
	}

	@Override
	public DataResult<List<Corporation>> getAll() {
		
		return new SuccessDataResult<List<Corporation>>(this.corporationDao.findAll(), "şirketler listelendi");
	}

	@Override
	public Result update(Corporation corporation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result delete(Corporation corporation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<Corporation> get(Corporation corporation) {
		// TODO Auto-generated method stub
		return null;
	}


}
