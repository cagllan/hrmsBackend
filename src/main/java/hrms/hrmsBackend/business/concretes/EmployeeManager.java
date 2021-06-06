package hrms.hrmsBackend.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrmsBackend.business.abstracts.EmployeeService;
import hrms.hrmsBackend.business.abstracts.UserService;
import hrms.hrmsBackend.core.utilites.results.DataResult;
import hrms.hrmsBackend.core.utilites.results.ErrorResult;
import hrms.hrmsBackend.core.utilites.results.Result;
import hrms.hrmsBackend.core.utilites.results.SuccessDataResult;
import hrms.hrmsBackend.core.utilites.results.SuccessResult;
import hrms.hrmsBackend.dataAccess.abstracts.EmployeeDao;
import hrms.hrmsBackend.entities.concretes.Employee;

@Service
public class EmployeeManager implements EmployeeService{
	
	private EmployeeDao employeeDao;	
	private UserService userService;
	
	@Autowired
	public EmployeeManager(EmployeeDao employeeDao, UserService userService) {
		super();
		this.employeeDao = employeeDao;
		this.userService = userService;
	}

	@Override
	public Result add(Employee employee) {
		
		if(this.userService.isEmailExist(employee.getUser().getEmail())) {
			return new ErrorResult("bu email kayıtlı");
		}
		
		this.employeeDao.save(employee);
		return new SuccessResult("Calisan kayıt oldu");
	}
	
	
	@Override
	public Result update(Employee employee) {
		this.employeeDao.save(employee);
		return new SuccessResult("Calisan güncellendi");
	}

	@Override
	public Result delete(Employee employee) {
		this.employeeDao.delete(employee);
		return new SuccessResult("Calisan silindi");
	}

	@Override
	public DataResult<Employee> getById(int id) {
		
		return new SuccessDataResult<Employee>(this.employeeDao.getById(id),"Calisan goruntulendi");
	}

	@Override
	public DataResult<List<Employee>> getAll() {
		
		return new SuccessDataResult<List<Employee>>(this.employeeDao.findAll(),"Calisanlar goruntulendi");
	}



}
