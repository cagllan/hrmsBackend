package hrms.hrmsBackend.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="jobseekers")
public class JobSeeker {
	
	@Id
	@GeneratedValue
	@Column(name="jobseeker_id")
	private int jobSeekerId;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="nationality_id")
	private String nationalityId;
	
	@Column(name="date_of_birth")
	private Date dateOfBirth;

	public JobSeeker(int jobSeekerId, String firstName, String lastName, String nationalityId, Date dateOfBirth) {
		super();
		this.jobSeekerId = jobSeekerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
		this.dateOfBirth = dateOfBirth;
	}
	
	
	
}
