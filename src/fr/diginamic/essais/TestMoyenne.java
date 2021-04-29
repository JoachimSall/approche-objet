package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculMoyenne c1 = new CalculMoyenne();
		c1.ajout(2);
		c1.ajout(3);
		System.out.println(c1.calcul());
		
		CalculMoyenne c2 = new CalculMoyenne();
		c2.ajout(18);
		c2.ajout(13);
		c2.ajout(19);
		c2.ajout(15);
		c2.ajout(16);
		c2.ajout(20);
		System.out.println(c2.calcul());

	}

}
