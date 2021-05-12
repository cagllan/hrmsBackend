package hrms.hrmsBackend.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="corporations")
public class Corporation {
	
	@Id
	@GeneratedValue
	@Column(name="corporation_id")
	private int corporationId;
	
	@Column(name="corporation_name")
	private String corporation_name;
	
	@Column(name="website")
	private String website;
	
	@Column(name="phone_number")
	private String phoneNumber;

	public Corporation(int corporationId, String corporation_name, String website, String phoneNumber) {
		super();
		this.corporationId = corporationId;
		this.corporation_name = corporation_name;
		this.website = website;
		this.phoneNumber = phoneNumber;
	}
	
	
}
