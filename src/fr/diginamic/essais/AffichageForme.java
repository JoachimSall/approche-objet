package fr.diginamic.essais;

import fr.diginamic.formes.Forme;

public class AffichageForme {
	public static String afficher(Forme forme) {
		return "Le périmètre de la forme est de " + forme.calculerPerimetre() + " et sa surface est de " + forme.calculerSurface();
	}
}
