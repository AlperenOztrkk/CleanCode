package educationSales.business.concretes;

import java.util.List;

import educationSales.business.abstracts.CampingnService;
import educationSales.business.abstracts.EducationService;
import educationSales.dataAccess.abstracts.EducationDal;
import educationSales.entities.concretes.Education;

public class EducationManager implements EducationService {

	private EducationDal educationDal;
	private CampingnService campaignService;

	public EducationManager(EducationDal educationDalal, CampingnService campaignService) {
		super();
		this.educationDal = educationDalal;
		this.campaignService = campaignService;
	}

	@Override
	public List<Education> getAll() {
		List<Education> educationsDaoList = educationDal.getAll();
		this.campaignService.updatePriceFromDatabase(educationsDaoList);
		return educationsDaoList;
	}
}
