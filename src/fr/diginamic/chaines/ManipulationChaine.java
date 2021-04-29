package fr.diginamic.chaines;

import fr.diginamic.entites.Salarie;

public class ManipulationChaine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chaine = "Durand;Marcel;2 523.5";
		System.out.println("Premier caractère : " + chaine.charAt(0));
		System.out.println("Longueur chaîne de caractère : " + chaine.length());
		System.out.println("index du premier \';\' de la chaine : " + chaine.indexOf(';'));
		System.out.println("Son nom de famille est " + chaine.substring(chaine.indexOf('D'), chaine.indexOf(';')));
		System.out.println("Son nom de famille en majuscules est " + chaine.substring(chaine.indexOf('D'), chaine.indexOf(';')).toUpperCase());
		System.out.println("Son nom de famille en minuscules est " + chaine.substring(chaine.indexOf('D'), chaine.indexOf(';')).toLowerCase());
		
		for (int i = 0; i < chaine.split(";").length; i++) {
			System.out.println(chaine.split(";")[i]);
		}
		
		Salarie marcel = new Salarie(chaine.split(";")[0], chaine.split(";")[1], Double.parseDouble(chaine.split(";")[2].replace(" ", "")));
		System.out.println("Le salarié créé s'appelle " + marcel.getNom().toUpperCase() + " " + marcel.getPrenom() + " et gagne un salaire de " + marcel.getSalaire() + "€");
	
	}

}
