package hrms.hrmsBackend.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrmsBackend.entities.concretes.MailVerification;

public interface MailVerificationDao extends JpaRepository<MailVerification,Integer>{
	MailVerification getById(int id);
}
