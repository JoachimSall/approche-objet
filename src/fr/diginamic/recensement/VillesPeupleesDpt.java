package fr.diginamic.recensement;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class VillesPeupleesDpt extends MenuService {

	@Override
	public void traiter(List<Ville> villes, Scanner scanner) {
		// TODO Auto-generated method stub
		String scan = scanner.nextLine();
		int compteur = 0;
		HashMap<String, Integer> villeDptPop = new HashMap<>();
		for(Ville ville : villes) {
			Integer population = ville.getPop();
			String nomVille = ville.getNom();
			if (ville.getCodeDpt().equals(scan)) {
				villeDptPop.put(nomVille, population);
				compteur++;
			}
		}
		
		if (compteur == 0) {
			System.out.println("Département non trouvé");
		} else {
			List<Map.Entry<String, Integer>> listVilles = new LinkedList<Map.Entry<String, Integer>>(villeDptPop.entrySet());
			
			Collections.sort(listVilles, new Comparator<Map.Entry<String, Integer>>(){
				 public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 ){
			    	  return (o2.getValue()).compareTo( o1.getValue());
			      }
			});
			
			HashMap<String, Integer> villesTriees = new LinkedHashMap<String, Integer>();
			for(Entry<String, Integer> entry : listVilles) {
				villesTriees.put(entry.getKey(), entry.getValue());
			}
			
			if (villesTriees.size() >= 10) {
				for(int i = 0; i < 10; i++) {
					   System.out.println((i+1) + ") " + villesTriees.keySet().toArray()[i] + " = " + villesTriees.values().toArray()[i] + " habitants");
				   }
			} else {
				for(int i = 0; i < villesTriees.size(); i++) {
					System.out.println((i+1) + ") " + villesTriees.keySet().toArray()[i] + " = " + villesTriees.values().toArray()[i] + " habitants");
				}
			}
		}
	}

}
