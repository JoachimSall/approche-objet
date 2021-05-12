package fr.diginamic.testenumeration;

public enum Continent {
	AFRIQUE("Afrique"),
	AMERIQUE("Amérique"),
	ASIE("Asie"),
	EUROPE("Europe"),
	OCEANIE("Océanie");
	
	private Continent(String libelle) {
		this.libelle = libelle;
	}
	
	private String libelle;

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
}
