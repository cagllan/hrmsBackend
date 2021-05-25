package hrms.hrmsBackend.business.abstracts;

import java.util.List;

import hrms.hrmsBackend.core.utilites.results.DataResult;
import hrms.hrmsBackend.core.utilites.results.Result;
import hrms.hrmsBackend.entities.concretes.CorporationVerification;

public interface CorporationVerificationService {
	Result add(CorporationVerification corporationVerification);
	Result update(CorporationVerification corporationVerification);
	Result delete(CorporationVerification corporationVerification);
	DataResult<CorporationVerification> get(int id);
	DataResult<List<CorporationVerification>> getAll();
}
