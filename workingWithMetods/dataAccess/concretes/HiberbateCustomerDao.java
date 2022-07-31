package workingWithMetods.dataAccess.concretes;

import workingWithMetods.dataAccess.CustomerDao;
import workingWithMetods.entities.concretes.Customer;

public class HiberbateCustomerDao implements CustomerDao {
	@Override
	public void add(Customer customer) {
		System.out.println("Hibernate kullanarak veritabanına eklendi");
		
	}

	@Override
	public boolean customerExists(Customer customer) {
		
		return true;
	}
}
