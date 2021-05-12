package fr.diginamic.recensement;

import java.util.List;
import java.util.Scanner;

public class PopulationDepartement extends MenuService {
	
	@Override
	public void traiter(List<Ville> villes, Scanner scanner ) {
		int population = 0;
		String scan = scanner.next().toUpperCase();
		for(int i = 0; i < villes.size(); i++) {
			if(villes.get(i).getCodeDpt().toUpperCase().equals(scan)) {
				population = population + villes.get(i).getPop();
			}
		}
		System.out.println(population + " habitants");
	}
}
