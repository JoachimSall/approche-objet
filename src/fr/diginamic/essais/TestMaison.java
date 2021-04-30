package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.Piece;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.WC;

public class TestMaison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maison maison = new Maison();
		
		Salon salon = new Salon(60, 0);
		maison.ajouterPiece(salon);
		Cuisine cuisine = new Cuisine(40, 0);
		maison.ajouterPiece(cuisine);
		SalleDeBain sallebain = new SalleDeBain(10, 0);
		maison.ajouterPiece(sallebain);
		WC wc = new WC(3, 0);
		maison.ajouterPiece(wc);
		
		Chambre chambre = new Chambre(20, 1);
		maison.ajouterPiece(chambre);
		Chambre chambre2 = new Chambre(15, 1);
		maison.ajouterPiece(chambre2);
		Chambre chambre3 = new Chambre(20, 1);
		maison.ajouterPiece(chambre3);
		SalleDeBain sallebain2 = new SalleDeBain(20, 1);
		maison.ajouterPiece(sallebain2);
		WC wc2 = new WC(5, 0);
		maison.ajouterPiece(wc2);
		
		Chambre chambre4 = new Chambre(25, 2);
		maison.ajouterPiece(chambre4);
		Chambre chambre5 = new Chambre(30, 2);
		maison.ajouterPiece(chambre5);
		Salon salon2 = new Salon(45, 2);
		maison.ajouterPiece(salon2);
		WC wc3 = new WC(0, 2);
		maison.ajouterPiece(wc3);
		
		maison.ajouterPiece(null);
		
		System.out.println(maison.superficieTotale());
		System.out.println(maison.superficieEtage(0));
		System.out.println(maison.superficieEtage(1));
		System.out.println(maison.superficieEtage(2));
		
		System.out.println(maison.superficieType("chambre"));
		System.out.println(maison.nbType("chambre"));
		System.out.println(maison.test());
	}

}
