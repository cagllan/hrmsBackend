package hrms.hrmsBackend.business.abstracts;

import java.util.List;

import hrms.hrmsBackend.core.utilites.results.DataResult;
import hrms.hrmsBackend.core.utilites.results.Result;
import hrms.hrmsBackend.entities.concretes.User;

public interface UserService {
	Result add(User user);
	Result update(User user);
	Result delete(User user);
	DataResult<User> getById(int id);
	DataResult<List<User>> getAll();
	boolean isEmailExist(String email);
}
