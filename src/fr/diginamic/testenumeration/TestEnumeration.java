package fr.diginamic.testenumeration;

public class TestEnumeration {

	static String nom = "ETE";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Saison[] saisons = Saison.values();
		for(Saison saison: saisons) {	
			System.out.println(saison.getLibelle());
		}
		System.out.println(Saison.valueOf(nom).getLibelle());
		
		System.out.println(Saison.lib("Hiver"));
	}

}
