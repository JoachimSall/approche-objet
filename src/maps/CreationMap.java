package maps;

import java.util.HashMap;
import java.util.Iterator;

public class CreationMap {
	public static void main(String args[]) {
		HashMap<String, Integer> mapSalaires = new HashMap<>();
		mapSalaires.put("Paul",1750);
		mapSalaires.put("Hicham",1825);
		mapSalaires.put("Yu",2250);
		mapSalaires.put("Ingrid",2015);
		mapSalaires.put("Chantal",2418);
		
		Iterator<String> iterateur = mapSalaires.keySet().iterator();
		int taille = 0;
		while(iterateur.hasNext()) {
			taille++;
			iterateur.next();
		}
		System.out.println("Taille : " + taille);
		
	}
}
