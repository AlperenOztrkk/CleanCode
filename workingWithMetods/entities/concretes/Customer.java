package workingWithMetods.entities.concretes;

import workingWithMetods.entities.Person;

public class Customer extends Person {
	private int cityId;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int id, String firstName, String lastName, String identityNumber, int yearOfBirth, int cityId) {
		super(id, firstName, lastName, identityNumber, yearOfBirth);
		this.cityId = cityId;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

}
