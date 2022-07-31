package workingWithMetods.dataAccess.concretes;

import workingWithMetods.dataAccess.CustomerDao;
import workingWithMetods.entities.concretes.Customer;

public class JdbcCustomerDao implements CustomerDao {
 
	@Override
	public void add(Customer customer) {
		System.out.println("JDBC kullanarak veritabanına eklendi");
	}

	@Override
	public boolean customerExists(Customer customer) {
		// TODO Auto-generated method stub
		return true;
	}
}
