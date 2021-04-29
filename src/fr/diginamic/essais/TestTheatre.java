package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Theatre t1 = new Theatre(10);
		t1.inscrire(4, 12);
		t1.inscrire(6, 12);
		t1.inscrire(2, 12);
		
		System.out.println(t1.getInscrits());
		System.out.println(t1.getRecette());
	}

}
