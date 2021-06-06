package hrms.hrmsBackend.entities.concretes;

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
@Table(name="jobseeker_cvs")
@NoArgsConstructor
@AllArgsConstructor
public class JobSeekerCv {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="jobseeker_id")
	private int jobSeekerId;
	
	@Column(name="cv_title")
	private String cvTitle;
	
	@Column(name="cv_text")
	private String cvText;
	
	@Column(name="github")
	private String github;
	
	@Column(name="linkedin")
	private String linkedin;
}
