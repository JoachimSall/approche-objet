package entites;

public class AdressePostale {
	int numeroRue;
	String libelleVoie;
	int codePostal;
	String ville;
	
	AdressePostale(int numeroRue, String libelleVoie, int codePostal, String ville){
		this.numeroRue = numeroRue;
		this.libelleVoie = libelleVoie;
		this.codePostal = codePostal;
		this.ville = ville;
	}
}
