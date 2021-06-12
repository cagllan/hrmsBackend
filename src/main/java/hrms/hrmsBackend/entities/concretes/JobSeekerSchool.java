package hrms.hrmsBackend.entities.concretes;

import java.time.LocalDate;
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
@Table(name="jobseeker_schools")
@NoArgsConstructor
@AllArgsConstructor
public class JobSeekerSchool {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
//	@Column(name="cv_id")
//	private int cvId;
	
	@Column(name="school_name")
	private String schoolName;
	
	@Column(name="school_department")
	private String schoolDepartment;
	
	@Column(name="school_start_date")
	private LocalDate schoolStartDate;
	
	@Column(name="school_finish_date")
	private LocalDate schoolFinishDate;
	
	@JsonIgnore
	@ManyToOne()
	@JoinColumn(name="cv_id")
	private JobSeekerCv jobSeekerCv;

}
