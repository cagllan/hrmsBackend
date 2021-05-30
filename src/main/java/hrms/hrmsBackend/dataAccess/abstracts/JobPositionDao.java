package hrms.hrmsBackend.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrmsBackend.entities.concretes.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition,Integer>{
	List<JobPosition> getByName(String name);
}
