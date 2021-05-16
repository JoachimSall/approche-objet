package fr.diginamic.recensement;

import java.util.List;
import java.util.Scanner;

public class PopulationVille extends MenuService {
	
	public void traiter(List<Ville> villes, Scanner scanner ) {
		int population = 0;
		String scan = scanner.nextLine();
		for(Ville ville : villes) {
			if(ville.getNom().toUpperCase().equals(scan.toUpperCase())) {
				population = ville.getPop();
			}
		}
		if (population > 0)
			System.out.println(population + " habitants");
		else 
			System.out.println("Ville non trouvée");
	}
}
