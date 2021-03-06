package hrms.hrmsBackend.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
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
@Table(name="corporations")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisements"})
public class Corporation{
	
	@Id	 
	@GeneratedValue(strategy = GenerationType.IDENTITY)	  
	@Column(name="corporation_id") 
	private int corporationId;
	 
	
	@Column(name="name")
	@NotBlank
	@NotNull
	private String corporationName;
	
	@Column(name="website")
	@NotBlank
	@NotNull
	private String website;
	
	@Column(name="phone_number")
	@NotBlank
	@NotNull
	private String phoneNumber;
	
	@OneToOne()
    @MapsId
    @JoinColumn(name = "corporation_id")
	private User user;
	
	
	@OneToMany(mappedBy = "corporation")
	private List<JobAdvertisement> jobAdvertisements;

}
