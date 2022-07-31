package workingWithMetods.bussiness;

import java.util.List;

import workingWithMetods.dataAccess.EmployeeDao;
import workingWithMetods.entities.concretes.Employee;

public class EmployeeManager implements EmployeeService {
private EmployeeDao employeeDao;
	
	public EmployeeManager(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}

	@Override
	public List<Employee> getAll() {
		return this.employeeDao.getAll();
	}
}
