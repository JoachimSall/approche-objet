package fr.diginamic.banque.entites;

public class Compte {
	private String numero;
	private int solde;
	
	public Compte(String numero, int solde) {
		this.numero = numero;
		this.solde = solde;
	}
	
	public String getNumero() {
		return numero;
		
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public int getSolde() {
		return solde;
		
	}
	
	public void setSolde(int solde) {
		this.solde = solde;
	}
	
	public String toString() {
		return "numero de compte : " + numero + " \nsolde du compte : " + solde + " €"; 
	}
}
