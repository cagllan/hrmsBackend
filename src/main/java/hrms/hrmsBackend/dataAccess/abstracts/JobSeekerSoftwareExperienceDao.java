package hrms.hrmsBackend.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrmsBackend.entities.concretes.JobSeekerSoftwareExperience;

public interface JobSeekerSoftwareExperienceDao extends JpaRepository<JobSeekerSoftwareExperience, Integer>{
	JobSeekerSoftwareExperience getById(int id);
}
