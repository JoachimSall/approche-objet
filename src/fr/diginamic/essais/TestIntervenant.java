package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salarie salarie = new Salarie("Sall", "Joachim", 5000);
		Pigiste pigiste = new Pigiste("Bonnamy", "Jean", 5, 70);
		System.out.println(salarie.getSalaire());
		System.out.println(pigiste.getSalaire());
		
		System.out.println(salarie.afficherDonnees());
		

	}

}
