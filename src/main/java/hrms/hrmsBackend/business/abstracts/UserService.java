package hrms.hrmsBackend.business.abstracts;

import java.util.List;

import hrms.hrmsBackend.core.utilites.results.DataResult;
import hrms.hrmsBackend.core.utilites.results.Result;
import hrms.hrmsBackend.entities.concretes.User;

public interface UserService {
	Result add(User user);
	DataResult<List<User>> getAll();
	boolean isEmailExist(String email);
}
