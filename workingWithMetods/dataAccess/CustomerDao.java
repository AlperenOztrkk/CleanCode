package workingWithMetods.dataAccess;

import workingWithMetods.entities.concretes.Customer;

public interface CustomerDao {
	void add(Customer customer);
	boolean customerExists(Customer customer);
}
