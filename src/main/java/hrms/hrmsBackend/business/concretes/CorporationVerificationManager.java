package hrms.hrmsBackend.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrmsBackend.business.abstracts.CorporationVerificationService;
import hrms.hrmsBackend.core.utilites.results.DataResult;
import hrms.hrmsBackend.core.utilites.results.Result;
import hrms.hrmsBackend.dataAccess.abstracts.CorporationVerificationDao;
import hrms.hrmsBackend.entities.concretes.CorporationVerification;

@Service
public class CorporationVerificationManager implements CorporationVerificationService{
	
	private CorporationVerificationDao corporationVerificationDao;
	
	@Autowired
	public CorporationVerificationManager(CorporationVerificationDao corporationVerificationDao) {
		super();
		this.corporationVerificationDao = corporationVerificationDao;
	}

	@Override
	public Result add(CorporationVerification corporationVerification) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result update(CorporationVerification corporationVerification) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result delete(CorporationVerification corporationVerification) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<CorporationVerification> get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<CorporationVerification>> getAll() {
		// TODO Auto-generated method stub
		return null;
	}




}
