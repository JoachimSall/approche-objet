package fr.diginamic.essais;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Rectangle;

public class TestForme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cercle c = new Cercle(5);
		Rectangle r = new Rectangle(20, 10);
		Carre c2 = new Carre(8);
		
		System.out.println(AffichageForme.afficher(r));
		System.out.println(AffichageForme.afficher(c));
		System.out.println(AffichageForme.afficher(c2));
	}

}
