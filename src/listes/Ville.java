package listes;

import java.util.ArrayList;
import java.util.List;

public class Ville {
	private String nom;
	private int nb;
	
	public Ville(String nom, int nb) {
		this.nom = nom;
		this.nb = nb;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Ville> ListeVilles = new ArrayList<>();
		Ville nice = new Ville("Nice", 343000);
		ListeVilles.add(nice);
		Ville carcassonne = new Ville("Carcassonne", 47800);
		ListeVilles.add(carcassonne);
		Ville narbonne = new Ville("Narbonne", 53400);
		ListeVilles.add(narbonne);
		Ville lyon = new Ville("Lyon", 484000);
		ListeVilles.add(lyon);
		Ville foix = new Ville("Foix", 9700);
		ListeVilles.add(foix);
		Ville pau = new Ville("Pau", 77200);
		ListeVilles.add(pau);
		Ville marseille = new Ville("Marseille", 850700);
		ListeVilles.add(marseille);
		Ville tarbes = new Ville("Tarbes", 40600);
		ListeVilles.add(tarbes);
		
		Ville min = ListeVilles.get(0);
		
		for(int i = 1; i < ListeVilles.size() - 1; i++) {
			if(ListeVilles.get(i).nb < ListeVilles.get(i - 1).nb) {
				min = ListeVilles.get(i);
			}
		}
		
		System.out.println("La ville la moins peuplée est " + min.nom + " avec une population de " + min.nb + " habitants.");
		ListeVilles.remove(min);
		
		for(int i = 0; i < ListeVilles.size(); i++) {
			if(ListeVilles.get(i).nb > 100000) {
				ListeVilles.get(i).nom = ListeVilles.get(i).nom.toUpperCase();
			}
		}
		
		for(int i = 0; i < ListeVilles.size(); i++) {
			System.out.println(ListeVilles.get(i).nom + ", " + ListeVilles.get(i).nb + " hab.");
		}

	}


}
