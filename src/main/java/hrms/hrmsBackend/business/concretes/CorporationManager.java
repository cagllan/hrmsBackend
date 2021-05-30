package hrms.hrmsBackend.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import hrms.hrmsBackend.business.abstracts.CorporationService;
import hrms.hrmsBackend.core.utilites.results.DataResult;
import hrms.hrmsBackend.core.utilites.results.Result;
import hrms.hrmsBackend.core.utilites.results.SuccessDataResult;
import hrms.hrmsBackend.core.utilites.results.SuccessResult;
import hrms.hrmsBackend.dataAccess.abstracts.CorporationDao;
import hrms.hrmsBackend.entities.concretes.Corporation;

@Service
public class CorporationManager implements CorporationService{
	private CorporationDao corporationDao;
	
	
	public CorporationManager(CorporationDao corporationDao) {
		super();
		this.corporationDao = corporationDao;
	}

	@Override
	public Result add(Corporation corporation) {
		this.corporationDao.save(corporation);
		return new SuccessResult("Firma kayıt oldu");
	}

	@Override
	public DataResult<List<Corporation>> getAll() {
		
		return new SuccessDataResult<List<Corporation>>(this.corporationDao.findAll(), "Tüm firmalar listelendi");
	}

}
