package entites;

import entite2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne jean = new Personne("Dupont", "Jean");
		
		Personne jacques = new Personne("Lorillard", "Jacques", new AdressePostale(2, "des Lys", 44000, "Nantes"));

	}

}
