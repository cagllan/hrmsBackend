package hrms.hrmsBackend.business.abstracts;

import hrms.hrmsBackend.core.utilites.results.Result;

public interface SendEmailVerifyService {
	boolean sendEmail(String email);
}
