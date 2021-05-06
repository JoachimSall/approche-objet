package maps;

import java.util.HashMap;
import java.util.Iterator;

import maps.Ville;

public class MapVille {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Ville> mapVilles = new HashMap<>();
		Ville nice = new Ville("Nice", 343000);
		mapVilles.put(nice.getNom(), nice);
		Ville carcassonne = new Ville("Carcassonne", 47800);
		mapVilles.put(carcassonne.getNom(), carcassonne);
		Ville narbonne = new Ville("Narbonne", 53400);
		mapVilles.put(narbonne.getNom(), narbonne);
		Ville lyon = new Ville("Lyon", 484000);
		mapVilles.put(lyon.getNom(), lyon);
		Ville foix = new Ville("Foix", 9700);
		mapVilles.put(foix.getNom(), foix);
		Ville pau = new Ville("Pau", 77200);
		mapVilles.put(pau.getNom(), pau);
		Ville marseille = new Ville("Marseille", 850700);
		mapVilles.put(marseille.getNom(), marseille);
		Ville tarbes = new Ville("Tarbes", 40600);
		mapVilles.put(tarbes.getNom(), tarbes);
		
		Iterator<Ville> iterateurVal = mapVilles.values().iterator();
		
		Ville min = mapVilles.get("Marseille");
		int taille = 0;
		
		while (iterateurVal.hasNext()) {
			Ville ville = iterateurVal.next();
			if (ville.getNb() < min.getNb()) {
				min = ville;
			}
		}
		mapVilles.remove(min.getNom());
		
		iterateurVal = mapVilles.values().iterator();
		
		while (iterateurVal.hasNext()) {
			System.out.println(iterateurVal.next().getNom());
		}
				
	}

}
