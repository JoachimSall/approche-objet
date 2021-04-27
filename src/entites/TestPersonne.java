package entites;

import entite2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne jean = new Personne();
		jean.nom = "Dupont";
		jean.prenom = "Jean";
		jean.adressePostale = new AdressePostale();
		
		Personne jacques = new Personne();
		jacques.nom = "Lorillard";
		jacques.prenom = "Jacques";
		jacques.adressePostale = new AdressePostale();

	}

}
