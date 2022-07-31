package workingWithMetods.api;

import workingWithMetods.bussiness.CustomerService;
import workingWithMetods.bussiness.EmployeeManager;
import workingWithMetods.bussiness.EmployeeService;
import workingWithMetods.bussiness.concretes.CustomerManager;
import workingWithMetods.core.utilites.adapter.concretes.KpsServiceAdapter;
import workingWithMetods.dataAccess.concretes.JdbcCustomerDao;
import workingWithMetods.dataAccess.concretes.SpringEmployeeDao;
import workingWithMetods.entities.concretes.Customer;
import workingWithMetods.entities.concretes.Employee;

public class Main {

	public static void main(String[] args) throws Exception {

		emloyeeDemo();
		customerDemo();

	}

	private static void customerDemo() throws Exception {
		CustomerService customerService = new CustomerManager(new JdbcCustomerDao(), new KpsServiceAdapter());
		Customer customer1 = new Customer();
		Customer customer2 = new Customer();
		Customer customer3 = new Customer();

	    customer1.setFirstName("Alperen");
	    customer1.setLastName("Öztürk");
	    customer2.setFirstName("Meral ");
	    customer2.setFirstName("Öztürk");
	    customer3.setFirstName("Ak");
	}

	private static void emloyeeDemo() {
		EmployeeService employeeService = new EmployeeManager(new SpringEmployeeDao());
		for (Employee item : employeeService.getAll()) {
			System.out.println(item.getFirstName());
		}
	}

}
