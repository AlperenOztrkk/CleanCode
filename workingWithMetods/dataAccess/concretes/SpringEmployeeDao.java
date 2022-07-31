package workingWithMetods.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import workingWithMetods.dataAccess.EmployeeDao;
import workingWithMetods.entities.concretes.Employee;

public class SpringEmployeeDao implements EmployeeDao {

	List<Employee> employees = new ArrayList<>();

	@Override
	public List<Employee> getAll() {
	
		employees.add(new Employee(1,"Alperen","Öztürk","225225",1997,2500));
		employees.add(new Employee(2,"Fatma","Öztürk","225225",1997,2500));
		employees.add(new Employee(3,"Ayşe","Öztürk","225225",1997,2500));
		employees.add(new Employee(4,"Ali","Öztürk","225225",1997,2500));
		System.out.println("Spring ile listeleme yapildi!");
		return employees;
	}

}
