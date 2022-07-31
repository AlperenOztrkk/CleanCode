package educationSales.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import educationSales.dataAccess.abstracts.EducationDal;
import educationSales.entities.concretes.Education;

public class HibernateEducationDal implements EducationDal {
	private List<Education> educations;

	@Override
	public List<Education> getAll() {
		educations = new ArrayList<>();
		educations.add(new Education(1, "C# ",180));
		educations.add(new Education(2, "JAVA", 108));
		System.out.println("Hibernate ile listeleme yapildi !\n");
		return educations;

	}
}
