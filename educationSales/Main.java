import java.util.List;

import educationSales.business.abstracts.EducationService;
import educationSales.business.concretes.EducationManager;
import educationSales.business.concretes.PercentileCampingManager;
import educationSales.dataAccess.concretes.HibernateEducationDal;


public class Main {

	public static void main(String[] args) {
		EducationService educationService = new EducationManager(new HibernateEducationDal(),
				new PercentileCampingManager());
		
		
		for (var item : educationService.getAll()) {
			System.out.println("Egitim adi : " + item.getName() + "\n" + "Egitim fiyati : " + item.getUnitPrice()
					+ "\n------------------------");
		}

	}

}
