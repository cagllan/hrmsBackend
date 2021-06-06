package hrms.hrmsBackend.business.abstracts;

import java.util.List;

import hrms.hrmsBackend.core.utilites.results.DataResult;
import hrms.hrmsBackend.core.utilites.results.Result;
import hrms.hrmsBackend.entities.concretes.MailVerification;

public interface MailVerificationService {
	Result add(MailVerification mailVerification);
	Result update(MailVerification mailVerification);
	Result delete(MailVerification mailVerification);
	DataResult<MailVerification> getById(int id);
	DataResult<List<MailVerification>> getAll();
}
