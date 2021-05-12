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

public class RegionsPlusPeuplees{

	public void trier(List<Ville> villes) {
		HashMap<String, Integer> regionPop = new HashMap<>();
		for (int i = 0; i < villes.size(); i++) {
			Integer population = villes.get(i).getPop();
			String region = villes.get(i).getRegion();
			Integer compteur = regionPop.get(region);
			if (compteur == null){
				compteur = population;
				regionPop.put(region, compteur);
			} else {
				compteur = compteur + population;
				regionPop.put(region, compteur);
			}
		}
		
		
	   List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>( regionPop.entrySet() );
	   
	   System.out.println(regionPop);
	   System.out.println(list);
	   
	   Collections.sort( list, new Comparator<Map.Entry<String, Integer>>(){
	      public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 ){
	    	  return (o1.getValue()).compareTo( o2.getValue());
	      }
	   });

	   HashMap<String,Integer> regionTriees = new LinkedHashMap<String, Integer>();
	   for(Entry<String, Integer> entry : list)
		   regionTriees.put( entry.getKey(), entry.getValue() );
			
		System.out.println(regionTriees);
		
	}
}
