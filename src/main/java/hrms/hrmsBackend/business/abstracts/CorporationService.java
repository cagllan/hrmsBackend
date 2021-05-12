package hrms.hrmsBackend.business.abstracts;

import java.util.List;

import hrms.hrmsBackend.entities.concretes.Corporation;

public interface CorporationService {
	void add(Corporation corporation);
	void update(Corporation corporation);
	void delete(Corporation corporation);
	Corporation get(int id);
	List<Corporation> getAll();
}
