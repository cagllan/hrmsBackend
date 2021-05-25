package hrms.hrmsBackend.entities.concretes;

import java.util.Date;

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
@Table(name="corporations_verification")
@AllArgsConstructor
@NoArgsConstructor
public class CorporationVerification {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="corporation_id")
	private int corporationId;
	
	@Column(name="employee_id")
	private int employeeId;
	
	@Column(name="verification")
	private boolean verification;
	
	@Column(name="verification_date")
	private Date verificationDate;

}
