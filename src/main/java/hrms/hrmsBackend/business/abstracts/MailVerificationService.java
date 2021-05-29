package hrms.hrmsBackend.business.abstracts;

import java.util.List;

import hrms.hrmsBackend.core.utilites.results.DataResult;
import hrms.hrmsBackend.core.utilites.results.Result;
import hrms.hrmsBackend.entities.concretes.MailVerification;

public interface MailVerificationService {
	Result add(MailVerification mailVerification);
	DataResult<List<MailVerification>> getAll();
}
