package educationSales.business.abstracts;

import java.util.List;

import educationSales.entities.concretes.Education;

public interface EducationService {
	List<Education> getAll();
}
