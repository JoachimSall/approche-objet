package entites;

public class TestAdressePostale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdressePostale a = new AdressePostale();
		a.numeroRue = 3;
		a.libelleVoie = "du Petit Bois";
		a.codePostal = 75000;
		a.ville = "Paris";
		
		AdressePostale b = new AdressePostale();
		b.numeroRue = 3;
		b.libelleVoie = "des Lys";
		b.codePostal = 44000;
		b.ville = "Nantes";

	}

}
