package fr.diginamic.recensement;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Comparator;

public class VillesPlusPeuplees extends MenuService {

	@Override
	public void traiter(List<Ville> villes, Scanner scanner) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> villePop = new HashMap<>();
		for (Ville ville : villes) {
			Integer population = ville.getPop();
			String nomVille = ville.getNom();
			villePop.put(nomVille, population);
		}
		
		List<Map.Entry<String, Integer>> listVilles = new LinkedList<Map.Entry<String, Integer>>(villePop.entrySet());
		
		Collections.sort(listVilles, new Comparator<Map.Entry<String, Integer>>(){
			 public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 ){
		    	  return (o2.getValue()).compareTo( o1.getValue());
		      }
		});
		
		HashMap<String, Integer> villesTriees = new LinkedHashMap<String, Integer>();
		for(Entry<String, Integer> entry : listVilles) {
			villesTriees.put(entry.getKey(), entry.getValue());
		}
		
		for(int i = 0; i < 10; i++) {
			   System.out.println((i+1) + ") " + villesTriees.keySet().toArray()[i] + " = " + villesTriees.values().toArray()[i] + " habitants");
		   }

	}

}
