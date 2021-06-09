package hrms.hrmsBackend.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrmsBackend.entities.concretes.Corporation;


public interface CorporationDao extends JpaRepository<Corporation,Integer>{
	Corporation getByCorporationId(int id);
}
