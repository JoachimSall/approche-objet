package maps;

public class Pays {
	private String nom;
	private int hab;
	private String continent;
	
	public Pays(String nom, int hab, String continent) {
		this.nom = nom;
		this.hab = hab;
		this.continent = continent;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getHab() {
		return hab;
	}
	public void setHab(int hab) {
		this.hab = hab;
	}
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	
}
