package tri;

public class Ville implements Comparable<Ville> {
	private String nom;
	private int nb;
	
	public Ville(String nom, int nb) {
		this.nom = nom;
		this.nb = nb;
	}
	
//	@Override
//	public int compareTo(Ville v) {
//		// TODO Auto-generated method stub
//		if (this.nom.compareTo(v.getNom()) > 0) {
//			return 1;
//		} else if (this.nom.compareTo(v.getNom()) < 0) {
//			return -1;
//		} else {
//			return 0;
//		}
//	}
	
	@Override
	public int compareTo(Ville v) {
		// TODO Auto-generated method stub
		if (this.nb > v.getNb()) {
			return 1;
		} else if (this.nb < v.getNb()) {
			return -1;
		} else {
			return 0;
		}
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

}
