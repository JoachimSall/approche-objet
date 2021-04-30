package fr.diginamic.salaire;

public class Pigiste extends Salarie {
	private double jourTrav;
	private double salaireJour;
	
	public Pigiste() {
		
	}
	
	public Pigiste(String nom, String prenom, double jourTrav, double salaireJour) {
		super(nom, prenom);
		this.jourTrav = jourTrav;
		this.salaireJour = salaireJour;
	}
	
	public String getStatut() {
		return "Pigiste";
	};
	
	@Override
	public double getSalaire() {
		return jourTrav * salaireJour;
	}
	
	public void setSalaire(double jourTrav, double salaireJour) {
		this.jourTrav = jourTrav;
		this.salaireJour = salaireJour;
	}

	public double getJourTrav() {
		return jourTrav;
	}

	public void setJourTrav(double jourTrav) {
		this.jourTrav = jourTrav;
	}

	public double getSalaireJour() {
		return salaireJour;
	}

	public void setSalaireJour(double salaireJour) {
		this.salaireJour = salaireJour;
	}
}
