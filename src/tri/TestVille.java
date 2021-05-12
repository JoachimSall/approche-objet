package tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestVille {

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
		
		System.out.println("Comparable");
		Collections.sort(ListeVilles);
		for( Ville ville : ListeVilles) {
			System.out.println(ville.getNom() + " " + ville.getNb());
		}
		
		System.out.println("\nComparatorNom");
		Collections.sort(ListeVilles, new ComparatorNom());
		for( Ville ville : ListeVilles) {
			System.out.println(ville.getNom());
		}
		
		System.out.println("\nComparatorHabitant");
		Collections.sort(ListeVilles, new ComparatorHabitant());
		for( Ville ville : ListeVilles) {
			System.out.println(ville.getNom() + " " + ville.getNb());
		}
	}

}
