package fr.diginamic.recensement;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class RegionsPlusPeuplees extends MenuService{
	
	@Override
	public void traiter(List<Ville> villes, Scanner scan) {
		HashMap<String, Integer> regionPop = new HashMap<>();
		for (Ville ville : villes) {
			Integer population = ville.getPop();
			String region = ville.getRegion();
			Integer compteur = regionPop.get(region);
			if (compteur == null){
				compteur = population;
				regionPop.put(region, compteur);
			} else {
				compteur = compteur + population;
				regionPop.put(region, compteur);
			}
		}
		
	   List<Map.Entry<String, Integer>> listRegions = new LinkedList<Map.Entry<String, Integer>>( regionPop.entrySet() );
	   
	   Collections.sort( listRegions, new Comparator<Map.Entry<String, Integer>>(){
	      public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 ){
	    	  return (o2.getValue()).compareTo( o1.getValue());
	      }
	   });

	   HashMap<String,Integer> regionTriees = new LinkedHashMap<String, Integer>();
	   for(Entry<String, Integer> entry : listRegions)
		   regionTriees.put( entry.getKey(), entry.getValue() );
			
	   for(int i = 0; i < 10; i++) {
		   System.out.println((i+1) + ") " + regionTriees.keySet().toArray()[i] + " = " + regionTriees.values().toArray()[i] + " habitants");
	   }
		
	}
}
