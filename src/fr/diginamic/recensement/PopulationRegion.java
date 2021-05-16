package fr.diginamic.recensement;

import java.util.List;
import java.util.Scanner;

public class PopulationRegion extends MenuService {
	
	@Override
	public void traiter(List<Ville> villes, Scanner scanner ) {
		int population = 0;
		String scan = scanner.nextLine();
		for(Ville ville : villes) {
			if(ville.getRegion().toUpperCase().equals(scan.toUpperCase()) || ville.getCodeRegion().toUpperCase().equals(scan.toUpperCase())) {
				population = population + ville.getPop();
			}
		}
		if (population > 0)
			System.out.println(population + " habitants");
		else 
			System.out.println("Région non trouvée");
	}
	
}
