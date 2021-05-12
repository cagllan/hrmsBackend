package hrms.hrmsBackend.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="mail_verification")
public class MailVerification {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="user_id")
	private int userId;
	
	@Column(name="verification_code")
	private String verificationCode;
	
	@Column(name="verification")
	private boolean verification;

	public MailVerification(int id, int userId, String verificationCode, boolean verification) {
		super();
		this.id = id;
		this.userId = userId;
		this.verificationCode = verificationCode;
		this.verification = verification;
	}
	
	

}
