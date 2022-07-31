package educationSales.dataAccess.abstracts;

import java.util.List;

import educationSales.entities.concretes.Education;

public interface EducationDal {
	List<Education> getAll();
}
