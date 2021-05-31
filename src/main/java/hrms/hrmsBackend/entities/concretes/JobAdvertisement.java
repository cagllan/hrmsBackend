package hrms.hrmsBackend.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="job_advertisements")
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="corporation_id")
	private int corporationId;
	
	@Column(name="jobposition_id")
	private int jobpositionId;
	
	@Column(name="city_id")
	private int cityId;
	
	@Column(name="job_description")
	private String jobDescription;
	
	@Column(name="minimum_salary")
	private double minimumSalary;
	
	@Column(name="maximum_salary")
	private double maximumSalary;
	
	@Column(name="number_of_open_position")
	private int numberOfOpenPosition;
	
	@Column(name="release_date")
	private LocalDate releaseDate;
	
	@Column(name="application_deadline")
	private LocalDate applicationDeadline;
	
	@Column(name="is_active")
	private boolean isActive;
	
}
