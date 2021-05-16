package fr.diginamic.recensement;

import java.util.List;

public abstract class Recensement {
	public static void Traiter(List<String> lignes, List<Ville> villes) {
		for (int i = 1; i < lignes.size(); i++) {
			
			String[] valeurs = lignes.get(i).split(";");
			String codeRegion = valeurs[0];
			String region = valeurs[1];
			String codeDpt = valeurs[2];
			String codeCommune = valeurs[5];
			String nom = valeurs[6];
			int pop = Integer.parseInt(valeurs[9].replaceAll(" ", ""));
			
			Ville ville = new Ville();
			ville.setCodeRegion(codeRegion);
			ville.setRegion(region);
			ville.setCodeDpt(codeDpt);
			ville.setCodeCommune(codeCommune);
			ville.setNom(nom);
			ville.setPop(pop);
			
			villes.add(ville);
			
		}
	}
}
