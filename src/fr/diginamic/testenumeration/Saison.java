package fr.diginamic.testenumeration;

public enum Saison {
	PRINTEMPS("Printemps", 1),
	ETE("Eté", 2),
	AUTOMNE("Automne", 3),
	HIVER("Hiver", 4);
	
	private String libelle;
	private int num;
	
	private Saison(String libelle, int num) {
		this.libelle = libelle;
		this.num = num;
	}
	
	public static Saison lib(String libelle) {
		Saison[] saisons = Saison.values();
		for(Saison saison: saisons) {	
			if (saison.getLibelle().equals(libelle)) {
				return saison;
			}
		}
		return null;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
}
