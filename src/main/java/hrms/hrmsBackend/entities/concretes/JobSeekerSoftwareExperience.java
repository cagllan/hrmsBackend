package hrms.hrmsBackend.entities.concretes;

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
@Table(name="jobseeker_software_experiences")
@NoArgsConstructor
@AllArgsConstructor
public class JobSeekerSoftwareExperience {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
//	@Column(name="cv_id")
//	private int cvId;
	
	@Column(name="software_experience_name")
	private String softwareExperienceName;
	
	@JsonIgnore
	@ManyToOne()
	@JoinColumn(name="cv_id")
	private JobSeekerCv jobSeekerCv;

}
