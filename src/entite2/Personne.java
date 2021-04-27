package entite2;

import entites.AdressePostale;

public class Personne {
	public String nom;
	public String prenom;
	public AdressePostale adressePostale;
	
	public Personne(String nom, String prenom){
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public Personne(String nom, String prenom, AdressePostale adressePostale){
		this.nom = nom;
		this.prenom = prenom;
		this.adressePostale = adressePostale;
	}
	public String afficherNomPrenom() {
		return nom.toUpperCase() + " " + prenom;
	}
	public void modifierNom(String nouveauNom) {
		nom = nouveauNom;
	}
	public void modifierPrenom(String nouveauPrenom) {
		prenom = nouveauPrenom;
	}
	public void modifierAdresse(int numeroRue, String libelleVoie, int codePostal, String ville) {
		adressePostale.numeroRue = numeroRue;
		adressePostale.libelleVoie = libelleVoie;
		adressePostale.codePostal = codePostal;
		adressePostale.ville = ville;
	}
	public String afficherNom() {
		return nom;
	}
	public String afficherPrenom() {
		return prenom;
	}
	public String afficherAdresse() {
		return adressePostale.numeroRue + " rue " + adressePostale.libelleVoie + " " + adressePostale.codePostal + " " + adressePostale.ville;
	}



}
