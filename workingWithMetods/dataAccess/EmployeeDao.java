package workingWithMetods.dataAccess;

import java.util.List;

import workingWithMetods.entities.concretes.Employee;

public interface EmployeeDao {
	List<Employee> getAll();
}
