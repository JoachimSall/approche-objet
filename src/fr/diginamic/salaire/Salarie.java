package fr.diginamic.salaire;

public class Salarie extends Intervenant {
	private double salaireMens;
	
	public Salarie() {};
	
	protected Salarie(String nom, String prenom) {
		super(nom, prenom);
	}
	
	public Salarie(String nom, String prenom, double salaireMens) {
		super(nom, prenom);
		this.salaireMens = salaireMens;
	}
	
	public String getStatut() {
		return "Salarié";
	};
	
	@Override
	public double getSalaire() {
		return salaireMens;
	}
	
	public void setSalaire(double salaireMens) {
		this.salaireMens = salaireMens;
	}

}
