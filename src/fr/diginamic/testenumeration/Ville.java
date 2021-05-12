package fr.diginamic.testenumeration;

import java.util.ArrayList;
import java.util.List;

public class Ville {
	private String nom;
	private int nb;
	private Continent continent;
	
	public Ville(String nom, int nb) {
		this.nom = nom;
		this.nb = nb;
	}
	
	public Ville(String nom, int nb, Continent continent) {
		this.nom = nom;
		this.nb = nb;
		this.continent = continent;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNb() {
		return nb;
	}

	public void setNb(int nb) {
		this.nb = nb;
	}
	

	public Continent getContinent() {
		return continent;
	}

	public void setContinent(Continent continent) {
		this.continent = continent;
	}
	
	@Override
	public String toString() {
		return "Le nom de la Ville est " + this.nom + ", sa population est de " + this.nb + " habitants et est situé sur le continent : " + this.continent.getLibelle();
	}
	
	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Ville)) {
			return false;
		}
		Ville other = (Ville)object;
		if (!(nom.equals(other.getNom())) || nb != other.getNb()) {
			return false;
		}
		
		return true;
		
		// ou return this.nom.equals(other.getNom()) && this.nb == other.getNb();
	}

}
