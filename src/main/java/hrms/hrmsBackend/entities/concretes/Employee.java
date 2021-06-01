package hrms.hrmsBackend.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="employees")
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	
	@Id	 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="employee_id") 
	private int employeeId;
	
	@Column(name="first_name") 
	@NotBlank
	@NotNull
	private String firstName;
	
	@Column(name="last_name") 
	@NotBlank
	@NotNull
	private String lastName;
	
	@OneToOne()
    @MapsId
    @JoinColumn(name = "employee_id")
	private User user;
}
