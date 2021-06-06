package hrms.hrmsBackend.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrmsBackend.entities.concretes.JobSeekerPhoto;

public interface JobSeekerPhotoDao extends JpaRepository<JobSeekerPhoto, Integer>{

}
