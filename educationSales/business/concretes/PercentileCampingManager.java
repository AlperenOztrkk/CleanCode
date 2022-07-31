package educationSales.business.concretes;

import java.util.List;

import educationSales.business.abstracts.CampingnService;
import educationSales.entities.concretes.Education;

public class PercentileCampingManager implements CampingnService {

	@Override
	public void updatePriceFromDatabase(List<Education> educations) {

		for (Education education : educations) {
			education.setUnitPrice(education.getUnitPrice() - (education.getUnitPrice() * updatePrice()));
		}
	}

	private double updatePrice() {

		return 0.15;
	}
}
