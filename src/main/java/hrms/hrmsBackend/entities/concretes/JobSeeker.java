package hrms.hrmsBackend.entities.concretes;

import java.time.LocalDate;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="jobseekers")
@AllArgsConstructor
@NoArgsConstructor
public class JobSeeker{
	
	@Id
	  @Column(name="jobseeker_id")
	  private int jobSeekerId;
	  
	@Column(name="first_name")
	@NotBlank
	@NotNull
	private String firstName;
	
	@Column(name="last_name")
	@NotBlank
	@NotNull
	private String lastName;
	
	@Column(name="nationality_id")
	@NotBlank
	@NotNull
	private String nationalityId;
	
	@Column(name="date_of_birth")
	@NotBlank
	@NotNull
	private LocalDate dateOfBirth;
	
	@OneToOne()
    @MapsId
    @JoinColumn(name = "jobseeker_id")
	private User user;

}
