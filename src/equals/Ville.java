package equals;

import java.util.ArrayList;
import java.util.List;

public class Ville {
	private String nom;
	private int nb;
	
	public Ville(String nom, int nb) {
		this.nom = nom;
		this.nb = nb;
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
