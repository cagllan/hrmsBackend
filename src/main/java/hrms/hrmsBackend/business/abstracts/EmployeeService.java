package hrms.hrmsBackend.business.abstracts;

import java.util.List;

import hrms.hrmsBackend.core.utilites.results.DataResult;
import hrms.hrmsBackend.core.utilites.results.Result;
import hrms.hrmsBackend.entities.concretes.Employee;

public interface EmployeeService {
	Result add(Employee employee);
	Result update(Employee employee);
	Result delete(Employee employee);
	DataResult<Employee> getById(int id);
	DataResult<List<Employee>> getAll();
}
