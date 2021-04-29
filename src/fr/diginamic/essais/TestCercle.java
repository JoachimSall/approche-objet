package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;

public class TestCercle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cercle c1 = new Cercle(5);
		Cercle c2 = new Cercle(12);
		
		System.out.println("Périmètre c1 : " + c1.getPerimetre() + "\nSurface c1 : " + c1.getSurface() + "\nPérimètre c2 : " + c2.getPerimetre() + "\nSurface c2 : " + c2.getSurface());

	}

}
