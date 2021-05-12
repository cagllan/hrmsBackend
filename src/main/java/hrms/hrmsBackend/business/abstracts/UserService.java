package hrms.hrmsBackend.business.abstracts;

import java.util.List;

import hrms.hrmsBackend.entities.concretes.User;

public interface UserService {
	void add(User user);
	void update(User user);
	void delete(User user);
	User get(int id);
	List<User> getAll();
}
