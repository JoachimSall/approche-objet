package maps;

import java.util.HashMap;
import java.util.Iterator;

public class FusionMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Création map1
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Rouge");
		map1.put(2, "Vert");
		map1.put(3, "Orange");
		
		// Création map2
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(4, "Blanc");
		map2.put(5, "Bleu");
		map2.put(6, "Orange");
		
		HashMap<Integer,String> map3 = new HashMap<Integer, String>();
		
		Iterator<Integer> iterateurCle1 = map1.keySet().iterator();
		Iterator<String> iterateurVal1 = map1.values().iterator();
		while (iterateurCle1.hasNext()) {
			map3.put(iterateurCle1.next(),iterateurVal1.next());
		}
		
		Iterator<Integer> iterateurCle2 = map2.keySet().iterator();
		Iterator<String> iterateurVal2 = map2.values().iterator();
		while (iterateurCle2.hasNext()) {
			map3.put(iterateurCle2.next(),iterateurVal2.next());
		}
		
		Iterator<Integer> iterateurCle3 = map3.keySet().iterator();
		Iterator<String> iterateurVal3 = map3.values().iterator();
		while (iterateurCle3.hasNext()) {
			System.out.println(iterateurCle3.next() + " " + iterateurVal3.next());
		}
		
	}

}
