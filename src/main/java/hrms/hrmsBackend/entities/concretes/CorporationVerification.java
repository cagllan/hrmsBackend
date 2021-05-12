package hrms.hrmsBackend.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="corporations_verification")
public class CorporationVerification {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="user_id")
	private int userId;
	
	@Column(name="verification")
	private boolean verification;

	public CorporationVerification(int id, int userId, boolean verification) {
		super();
		this.id = id;
		this.userId = userId;
		this.verification = verification;
	}
	
	

}
