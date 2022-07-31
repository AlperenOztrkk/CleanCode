package educationSales.business.abstracts;

import java.util.List;

import educationSales.entities.concretes.Education;

public interface CampingnService {
	void updatePriceFromDatabase(List<Education> educations);
}
