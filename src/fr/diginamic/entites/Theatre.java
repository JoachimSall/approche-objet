package fr.diginamic.entites;

public class Theatre {
	private String nom;
	private int max;
	private int inscrits;
	private double recette;
	
	public Theatre(int max) {
		this.max = max;
	}

	public void inscrire(int clients, double prix) {
		if (inscrits + clients <= max) {
			inscrits += clients;
			recette += clients*prix;
		} else {
			System.out.println("Il n'y a plus assez de place dans le théâtre ! Vous avez " + ((inscrits + clients) - max ) + " personnes en trop !");
		}; 
	}
	
	public String getInscrits() {
		return "Il y a " + inscrits + " personnes dans le théâtre";
	}

	public void setInscrits(int inscrits) {
		this.inscrits = inscrits;
	}

	public String getRecette() {
		return "Recette totale : " + recette + " €";
	}

	public void setRecette(double recette) {
		this.recette = recette;
	}
}
