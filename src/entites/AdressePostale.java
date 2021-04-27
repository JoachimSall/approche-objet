package entites;

public class AdressePostale {
	public int numeroRue;
	public String libelleVoie;
	public int codePostal;
	public String ville;
	
	AdressePostale(int numeroRue, String libelleVoie, int codePostal, String ville){
		this.numeroRue = numeroRue;
		this.libelleVoie = libelleVoie;
		this.codePostal = codePostal;
		this.ville = ville;
	}
}
