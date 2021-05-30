package hrms.hrmsBackend.entities.concretes;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="users")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobSeeker"})

public class User {
		
	  @Id	  
	  @GeneratedValue(strategy = GenerationType.IDENTITY)	  
	  @Column(name="id") 
	  private int id;
	 
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="password_repeat")
	private String passwordRepeat;
	
	@JsonIgnore
	@OneToOne(mappedBy = "user")
    @PrimaryKeyJoinColumn
	private JobSeeker jobSeeker;
	
	@JsonIgnore
	@OneToOne(mappedBy = "user")
    @PrimaryKeyJoinColumn
	private Corporation corporation;
	
		
}
