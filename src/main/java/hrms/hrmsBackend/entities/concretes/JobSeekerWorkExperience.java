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

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="jobseeker_work_experiences")
@NoArgsConstructor
@AllArgsConstructor
public class JobSeekerWorkExperience {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
//	@Column(name="cv_id")
//	private int cvId;
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="company_department")
	private String companyDepartment;
	
	@Column(name="company_start_date")
	private LocalDate companyStartDate;
	
	@Column(name="company_departure_date")
	private LocalDate companyDepartureDate;
	
	@JsonIgnore
	@ManyToOne()
	@JoinColumn(name="cv_id")
	private JobSeekerCv jobSeekerCv;

}
