package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestListeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> liste = new ArrayList<>(Arrays.asList("Nice","Carcassonne","Narbonne","Lyon","Foix","Pau","Marseille","Tarbes"));
		String max = "";
		for(int i = 0; i < liste.size(); i++) {
			if (liste.get(i).length() > max.length()) {
				max = liste.get(i);
			}
		}
		System.out.println("La ville qui a le plus grand nombre de caractères est " + max);
		
		//liste en majuscule
		System.out.println("Liste en majuscule :");
		String maj = "";
		for(int i = 0; i < liste.size(); i++) {
			maj = liste.get(i).toUpperCase();
			liste.remove(i);
			liste.add(i, maj);
			System.out.println(liste.get(i));
		}
		
		//suppression villes qui commencent par N
		System.out.println("Liste sans les villes commençant par N");
		for(int i = 0; i < liste.size(); i++) {
			if (liste.get(i).charAt(0) == 'N') {
				liste.remove(i);
			}
		}
		for(int i = 0; i < liste.size(); i++) {
			System.out.println(liste.get(i));
		}
		
	}

}
