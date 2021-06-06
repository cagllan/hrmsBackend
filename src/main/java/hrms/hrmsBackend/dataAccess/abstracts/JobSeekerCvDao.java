package hrms.hrmsBackend.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrmsBackend.entities.concretes.JobSeekerCv;

public interface JobSeekerCvDao extends JpaRepository<JobSeekerCv, Integer>{

}
