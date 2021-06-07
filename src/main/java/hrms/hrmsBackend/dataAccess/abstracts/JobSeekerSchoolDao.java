package hrms.hrmsBackend.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrmsBackend.entities.concretes.JobSeekerSchool;

public interface JobSeekerSchoolDao extends JpaRepository<JobSeekerSchool, Integer>{
	JobSeekerSchool getById(int id);
}
