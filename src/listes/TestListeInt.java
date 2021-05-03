package listes;

import java.util.ArrayList;
import java.util.List;

public class TestListeInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> liste = new ArrayList<>();
		liste.add(-1);
		liste.add(5);
		liste.add(7);
		liste.add(3);
		liste.add(-2);
		liste.add(4);
		liste.add(8);
		liste.add(5);
		
		//afficher tous les éléments de la liste
		System.out.println("Eléments de la liste :");
		for(int i = 0; i < liste.size(); i++) {
			System.out.println(liste.get(i));
		}
		
		//afficher la taille de la liste
		System.out.println("Taille de la liste :");
		System.out.println(liste.size());
		
		//plus grand élément de la liste
		int max = liste.get(0);
		
		for(int i = 1; i < liste.size() - 1; i++) {
			if (liste.get(i) > liste.get(i-1)) {
				max = liste.get(i);
			}
		}
		
		System.out.println("Le plus grand élément de la liste est " + max);
		
		//suppression du plus petit élément de la liste et affichage de celle-ci
		int min = liste.get(0);
		
		for(int i = 1; i < liste.size() - 1; i++) {
			if (liste.get(i) < liste.get(i-1)) {
				min = liste.get(i);
			}
		}
		
		for(int i = 0; i < liste.size() - 1; i++) {
			if (liste.get(i) == min) {
				liste.remove(i);
			}
		}
		
		System.out.println("Liste sans le plus petit élément :");
		for(int i = 0; i < liste.size(); i++) {
			System.out.println(liste.get(i));
		}
		
		//transformation des éléments négatifs en positifs et affichage de la liste modifiée
		int elem = 0;
		for(int i = 0; i < liste.size(); i++) {
			if (liste.get(i) < 0) {
				elem = - liste.get(i);
				liste.remove(i);
				liste.add(i, elem);
			}
		}
		
		System.out.println("Liste sans valeurs négatives :");
		for(int i = 0; i < liste.size(); i++) {
			System.out.println(liste.get(i));
		}
		
	}

}
