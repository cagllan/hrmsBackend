
  package hrms.hrmsBackend.business.concretes;
  
  import java.util.List;
  
  import org.springframework.beans.factory.annotation.Autowired; import
  org.springframework.stereotype.Service;
  
  import hrms.hrmsBackend.business.abstracts.UserService; import
  hrms.hrmsBackend.core.utilites.results.DataResult; import
  hrms.hrmsBackend.core.utilites.results.ErrorResult; import
  hrms.hrmsBackend.core.utilites.results.Result; import
  hrms.hrmsBackend.core.utilites.results.SuccessDataResult; import
  hrms.hrmsBackend.core.utilites.results.SuccessResult; import
  hrms.hrmsBackend.dataAccess.abstracts.UserDao; import
  hrms.hrmsBackend.entities.concretes.User;
  
  @Service 
  public class UserManager implements UserService{
  
  private UserDao userDao;
  
  @Autowired 
  public UserManager(UserDao userDao) 
  { super(); this.userDao =
  userDao; }
  
  @Override 
  public Result add(User user) {
  
	  if(isEmailExist(user.getEmail())) {
		  return new ErrorResult("bu email kayıtlı");
	  }
	  
  this.userDao.save(user);
  return new SuccessResult("Kullanıcı kayıt oldu");
  }
  
  
  @Override 
  public DataResult<List<User>> getAll() {
  
  return new SuccessDataResult<List<User>>(this.userDao.findAll());
  }
  
  	public boolean isEmailExist(String email) {
  		if(this.userDao.getByEmail(email) != null) {
  			return true; 
  		}
  		return false; 
  	}
  
  }
 
