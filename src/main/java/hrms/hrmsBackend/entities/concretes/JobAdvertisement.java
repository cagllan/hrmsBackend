package hrms.hrmsBackend.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.ManyToAny;

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
	
//	@Column(name="corporation_id")
//	private int corporationId;
	
//	@Column(name="jobposition_id")
//	private int jobpositionId;
	
//	@Column(name="city_id")
//	private int cityId;
	
	@Column(name="job_description")
	@NotBlank
	@NotNull
	private String jobDescription;
	
	@Column(name="minimum_salary")
	@NotBlank
	@NotNull
	private int minimumSalary;
	
	@Column(name="maximum_salary")
	@NotBlank
	@NotNull
	private int maximumSalary;
	
	@Column(name="number_of_open_positions")
	@NotBlank
	@NotNull
	private int numberOfOpenPosition;
	
	@Column(name="release_date")
	private LocalDate releaseDate;
	
	@Column(name="application_deadline")
	@NotBlank
	@NotNull
	private LocalDate applicationDeadline;
	
	@Column(name="is_active")
	@NotBlank
	@NotNull
	private boolean isActive;
	
	@ManyToOne()
	@JoinColumn(name="corporation_id")
	private Corporation corporation;
	
	@ManyToOne()
	@JoinColumn(name="jobposition_id")
	private JobPosition jobposition;
	
	@ManyToOne()
	@JoinColumn(name="city_id")
	private City city;
	

	

	
}
