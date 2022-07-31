package educationSales.business.concretes;

import java.util.List;

import educationSales.business.abstracts.CampingnService;
import educationSales.entities.concretes.Education;

public class CampingManager implements CampingnService {

	@Override
	public void updatePriceFromDatabase(List<Education> educations) {
		// TODO Auto-generated method stub
		
		
		for (Education education : educations) {
			education.setUnitPrice(updatePrice());
		}

	}

	private double updatePrice() {

		
		return 10;
	
	}

}
