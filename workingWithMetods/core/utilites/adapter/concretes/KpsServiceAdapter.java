package workingWithMetods.core.utilites.adapter.concretes;

import workingWithMetods.core.utilites.adapter.abstracts.PersonService;
import workingWithMetods.entities.Person;

public class KpsServiceAdapter implements PersonService {
	@Override
	public boolean checkPerson(Person person) {
		KpsService kpsService = new KpsService();
		return kpsService.checkPerson(person.getIdentityNumber(), person.getFirstName(), person.getLastName(),
				person.getYearOfBirth());
	}
}
