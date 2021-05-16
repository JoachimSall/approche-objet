package fr.diginamic.testexceptions;

import tri.Ville;

public class TestReflectionUtils {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub
		Ville paris = new Ville("Paris", 12000000);
		ReflectionUtils refl = new ReflectionUtils();
		refl.afficherAttributs(paris);
		refl.afficherAttributs(null);
	}

}
