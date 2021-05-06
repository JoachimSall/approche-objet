package maps;

import java.util.HashMap;
import java.util.Iterator;

public class CreationEtManipulationMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");
		
		Iterator<Integer> iterateurCle = mapVilles.keySet().iterator();
		while (iterateurCle.hasNext()) {
			System.out.println(iterateurCle.next());
		}
		
		Iterator<String> iterateurVal = mapVilles.values().iterator();
		while (iterateurVal.hasNext()) {
			System.out.println(iterateurVal.next());
		}
		
		int taille = 0;
		
		iterateurCle = mapVilles.keySet().iterator();
		while (iterateurCle.hasNext()) {
			taille++;
			iterateurCle.next();
		}
		System.out.println(taille);
	}

}
