package fr.diginamic.formes;

public class Carre extends Forme{
	private double longueur;
	
	public Carre(double longueur) {
		this.longueur = longueur;
	}
	@Override
	public double calculerSurface() {
		// TODO Auto-generated method stub
		return Math.pow(longueur, 2);
	}

	@Override
	public double calculerPerimetre() {
		// TODO Auto-generated method stub
		return longueur*4;
	}

}
