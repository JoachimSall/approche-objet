package fr.diginamic.testenumeration;

import java.util.ArrayList;
import java.util.List;

import fr.diginamic.testenumeration.Ville;
import fr.diginamic.testenumeration.Continent;

public class TestContinentAvecEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Ville> ListeVilles = new ArrayList<>();
		Ville bombay = new Ville("Bombay", 15000000, Continent.ASIE);
		ListeVilles.add(bombay);
		Ville carcassonne = new Ville("Carcassonne", 47800, Continent.EUROPE);
		ListeVilles.add(carcassonne);
		Ville kinshasa = new Ville("Kinshasa", 1000000, Continent.AFRIQUE);
		ListeVilles.add(kinshasa);
		Ville rio = new Ville("Rio de Janeiro", 10000000, Continent.AMERIQUE);
		ListeVilles.add(rio);
		Ville melbourne = new Ville("Melbourne", 200000, Continent.OCEANIE);
		ListeVilles.add(melbourne);
		
		for (Ville ville : ListeVilles) {
			System.out.println(ville.toString());
		}
	}

}
