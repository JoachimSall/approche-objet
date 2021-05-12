package fr.diginamic.recensement;

import java.util.List;
import java.util.Scanner;

public class PopulationVille extends MenuService {
	
	public void traiter(List<Ville> villes, Scanner scanner ) {
		int population = 0;
		String scan = scanner.next().toUpperCase();
		for(int i = 0; i < villes.size(); i++) {
			if(villes.get(i).getNom().toUpperCase().equals(scan)) {
				population = villes.get(i).getPop();
			}
		}
		System.out.println(population + " habitants");
	}
}
