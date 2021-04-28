package fr.diginamic.banque.entites;

public class Compte {
	private String numero;
	private double solde;
	
	public Compte(String numero, double solde) {
		this.numero = numero;
		this.solde = solde;
	}
	
	public String getNumero() {
		return numero;
		
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public double getSolde() {
		return solde;
		
	}
	
	public void setSolde(double solde) {
		this.solde = solde;
	}
	
	public String toString() {
		return "numero de compte : " + numero + " \nsolde du compte : " + solde + " €"; 
	}
}
