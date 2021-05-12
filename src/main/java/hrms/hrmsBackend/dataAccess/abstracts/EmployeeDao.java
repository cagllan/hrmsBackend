package hrms.hrmsBackend.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrmsBackend.entities.concretes.Employee;

public interface EmployeeDao extends JpaRepository<EmployeeDao,Integer>{

}
