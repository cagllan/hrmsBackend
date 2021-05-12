package hrms.hrmsBackend.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrmsBackend.business.abstracts.CorporationService;
import hrms.hrmsBackend.dataAccess.abstracts.CorporationVerificationDao;
import hrms.hrmsBackend.entities.concretes.Corporation;

@Service
public class CorporationVerificationManager implements CorporationService{
	
	private CorporationVerificationDao corporationVerificationDao;
	
	@Autowired
	public CorporationVerificationManager(CorporationVerificationDao corporationVerificationDao) {
		super();
		this.corporationVerificationDao = corporationVerificationDao;
	}

	@Override
	public void add(Corporation corporation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Corporation corporation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Corporation corporation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Corporation get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Corporation> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
