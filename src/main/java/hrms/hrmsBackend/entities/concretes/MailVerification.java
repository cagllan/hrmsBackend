package hrms.hrmsBackend.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="mail_verification")
@AllArgsConstructor
@NoArgsConstructor
public class MailVerification {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="user_id")
	private int userId;
	
	@Column(name="verification_code")
	@NotBlank
	@NotNull
	private String verificationCode;
	
	@Column(name="verification")
	@NotBlank
	@NotNull
	private boolean verification;
	
	@Column(name="verification_date")
	@NotBlank
	@NotNull
	private LocalDate verificationDate;
	

}
