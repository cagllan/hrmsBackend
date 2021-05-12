package hrms.hrmsBackend.business.abstracts;

import java.util.List;

import hrms.hrmsBackend.entities.concretes.CorporationVerification;

public interface CorporationVerificationService {
	void add(CorporationVerification corporationVerification);
	void update(CorporationVerification corporationVerification);
	void delete(CorporationVerification corporationVerification);
	CorporationVerification get(int id);
	List<CorporationVerification> getAll();
}
