package fr.diginamic.banque.entites;

public class TestBanque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compte compte1 = new Compte("23444", 200);
		//System.out.println(compte1.toString());
		CompteTaux compte2 = new CompteTaux("774faz", 4567, 1.1);
		
		Compte[] tabCompte = {compte1, compte2};
		
		for(int i = 0; i < tabCompte.length; i++) {
			System.out.println(tabCompte[i].toString());
		}

	}

}
