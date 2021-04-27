package entites;

import entite2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne jean = new Personne("Dupont", "Jean");
		
		Personne jacques = new Personne("Lorillard", "Jacques", new AdressePostale(2, "des Lys", 44000, "Nantes"));
		
		System.out.println(jacques.afficherNomPrenom());
		jacques.modifierPrenom("jean");
		jacques.modifierAdresse(3, "des Sorinieres", 45000, "Orléans" );
		System.out.println(jacques.afficherNomPrenom());
		System.out.println(jacques.afficherAdresse());

	}

}
