package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
	
	double taux;
	
	public CompteTaux(String numero, double solde, double taux) {
		super(numero, solde);
		// TODO Auto-generated constructor stub
		this.taux = taux;
	}
	
	public String toString() {
		return super.toString() + "\ntaux : " + taux; 
	}
	
	public double getTaux() {
		return taux;
	}
	
	public void setTaux(double taux) {
		this.taux = taux;
	}

}
