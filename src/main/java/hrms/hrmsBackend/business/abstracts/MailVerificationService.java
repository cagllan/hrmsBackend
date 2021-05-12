package hrms.hrmsBackend.business.abstracts;

import java.util.List;

import hrms.hrmsBackend.entities.concretes.MailVerification;

public interface MailVerificationService {
	void add(MailVerification mailVerification);
	void update(MailVerification mailVerification);
	void delete(MailVerification mailVerification);
	MailVerification get(int id);
	List<MailVerification> getAll();
}
