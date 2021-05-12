package hrms.hrmsBackend.business.abstracts;

import java.util.List;

import hrms.hrmsBackend.entities.concretes.Employee;

public interface EmployeeService {
	void add(Employee employee);
	void update(Employee employee);
	void delete(Employee employee);
	Employee get(int id);
	List<Employee> getAll();
}
