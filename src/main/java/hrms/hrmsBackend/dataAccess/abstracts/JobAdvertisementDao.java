package hrms.hrmsBackend.dataAccess.abstracts;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import hrms.hrmsBackend.entities.concretes.JobAdvertisement;
import hrms.hrmsBackend.entities.dtos.JobAdvertisementWithActiveDto;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement,Integer>{
	
	@Query("Select new hrms.hrmsBackend.entities.dtos.JobAdvertisementWithActiveDto"
			+ "(ja.id, c.corporationName, jp.jobpositionName, ja.numberOfOpenPosition, "
			+ "ja.releaseDate,ja.applicationDeadline, ja.isActive) from Corporation c "
			+ "Inner Join c.jobAdvertisements ja Inner Join ja.jobposition jp Where ja.isActive=true")
	List<JobAdvertisementWithActiveDto> getJobAdvertisementWithActive();
	
	
	@Query("Select new hrms.hrmsBackend.entities.dtos.JobAdvertisementWithActiveDto"
			+ "(ja.id, c.corporationName, jp.jobpositionName, ja.numberOfOpenPosition, "
			+ "ja.releaseDate,ja.applicationDeadline, ja.isActive) from Corporation c "
			+ "Inner Join c.jobAdvertisements ja Inner Join ja.jobposition jp Where ja.isActive=true And ja.releaseDate=:releaseDate")
	List<JobAdvertisementWithActiveDto> getJobAdvertisementWithActiveAndReleaseDate(LocalDate releaseDate);
}
