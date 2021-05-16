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

public class DepartementsPlusPeuplees extends MenuService {

	@Override
	public void traiter(List<Ville> villes, Scanner scanner) {
		HashMap<String, Integer> dptPop = new HashMap<>();
		for (Ville ville : villes) {
			Integer population = ville.getPop();
			String dpt = ville.getCodeDpt();
			Integer compteur = dptPop.get(dpt);
			if (compteur == null){
				compteur = population;
				dptPop.put(dpt, compteur);
			} else {
				compteur = compteur + population;
				dptPop.put(dpt, compteur);
			}
		}
				
	   List<Map.Entry<String, Integer>> listDpt = new LinkedList<Map.Entry<String, Integer>>( dptPop.entrySet() );
	   
	   Collections.sort( listDpt, new Comparator<Map.Entry<String, Integer>>(){
	      public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 ){
	    	  return (o2.getValue()).compareTo( o1.getValue());
	      }
	   });
	
	   HashMap<String,Integer> dptTriees = new LinkedHashMap<String, Integer>();
	   for(Entry<String, Integer> entry : listDpt)
		   dptTriees.put( entry.getKey(), entry.getValue() );
		
	   for(int i = 0; i < 10; i++) {
		   System.out.println((i+1) + ") Département " + dptTriees.keySet().toArray()[i] + " = " + dptTriees.values().toArray()[i] + " habitants");
	   }
	   
	}

}
