package hrms.hrmsBackend.business.abstracts;

import java.util.List;

import hrms.hrmsBackend.core.utilites.results.DataResult;
import hrms.hrmsBackend.core.utilites.results.Result;
import hrms.hrmsBackend.entities.concretes.Corporation;

public interface CorporationService {
	Result add(Corporation corporation);
	Result update(Corporation corporation);	
	Result delete(Corporation corporation);
	DataResult<Corporation> get(Corporation corporation);
	DataResult<List<Corporation>> getAll();
}
