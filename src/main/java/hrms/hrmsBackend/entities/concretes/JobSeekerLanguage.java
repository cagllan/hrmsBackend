package hrms.hrmsBackend.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="jobseeker_languages")
@NoArgsConstructor
@AllArgsConstructor
public class JobSeekerLanguage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
//	@Column(name="cv_id")
//	private int cvId;
	
	@Column(name="language_name")
	private String languageName;
	
	@Column(name="language_level")
	private String languageLevel;
	
	@JsonIgnore
	@ManyToOne()
	@JoinColumn(name="cv_id")
	private JobSeekerCv jobSeekerCv;
	

}
