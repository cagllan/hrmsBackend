package hrms.hrmsBackend.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;


import hrms.hrmsBackend.entities.concretes.User;

public interface UserDao extends JpaRepository<User,Integer>{
	User getById(int id);
	User getByEmail(String email);
}
