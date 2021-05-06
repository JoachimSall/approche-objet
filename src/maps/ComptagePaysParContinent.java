package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class ComptagePaysParContinent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Pays> listePays = new ArrayList<>();
		
		Pays france = new Pays("France", 65000000, "Europe");
		listePays.add(france);
		Pays allemagne = new Pays("Allemagne", 80000000, "Europe");
		listePays.add(allemagne);
		Pays belgique = new Pays("Belgique", 10000000, "Europe");
		listePays.add(belgique);
		Pays russie = new Pays("Russie", 150000000, "Europe");
		listePays.add(russie);
		Pays chine = new Pays("Chine", 1400000000, "Asie");
		listePays.add(chine);
		Pays indonesie = new Pays("Indonésie", 220000000, "Asie");
		listePays.add(indonesie);
		Pays australie = new Pays("Australie", 20000000, "Océanie");
		listePays.add(australie);
		
		HashMap<String, Integer> comptage = new HashMap<>();
		comptage.put("Europe", 0);
		comptage.put("Asie", 0);
		comptage.put("Océanie", 0);
		
		Iterator<String> iterateurKey = comptage.keySet().iterator();
		Iterator<Integer> iterateurVal = comptage.values().iterator();
		
		Iterator<Pays> iterateurPays = listePays.iterator();
		
		//premiere methode
		while(iterateurPays.hasNext()) {
			Pays pays = iterateurPays.next();
			String continentPays = pays.getContinent();
			iterateurKey = comptage.keySet().iterator();
			iterateurVal = comptage.values().iterator();
			while(iterateurKey.hasNext()) {
				String continent = iterateurKey.next();
				int nb = iterateurVal.next() + 1;
				if(continentPays == continent) {
					comptage.put(continent, nb);
				}
			}
		}
		
		iterateurKey = comptage.keySet().iterator();
		iterateurVal = comptage.values().iterator();
		while(iterateurKey.hasNext()) {
			String cle = iterateurKey.next();
			System.out.println("Le continent " + cle + " a " + iterateurVal.next() + " pays");
		}
		
		//methode corrigé
		HashMap<String, Integer> mapContinent = new HashMap<>();
		
		iterateurPays = listePays.iterator();
		
		while(iterateurPays.hasNext()) {
			
			Pays pays = iterateurPays.next();
			String continent = pays.getContinent();
			Integer compteur = mapContinent.get(continent);
			
			if (compteur == null) {
				mapContinent.put(continent, 1);
			} else {
				compteur++;
				mapContinent.put(continent, compteur);
			}

		}
		
		System.out.println(mapContinent);
		
		
		
		
		
	}

}
