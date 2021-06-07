package hrms.hrmsBackend.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrmsBackend.entities.concretes.JobSeekerWorkExperience;

public interface JobSeekerWorkExperienceDao extends JpaRepository<JobSeekerWorkExperience, Integer>{
	JobSeekerWorkExperience getById(int id);
}
