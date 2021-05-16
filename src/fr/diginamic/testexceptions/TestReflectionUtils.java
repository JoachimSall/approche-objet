package fr.diginamic.testexceptions;

import tri.Ville;

public class TestReflectionUtils {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Ville paris = new Ville("Paris", 12000000);
		try {
			ReflectionUtils.afficherAttributs(paris);
		} catch (IllegalArgumentException | IllegalAccessException | ReflectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			ReflectionUtils.afficherAttributs(null);
		} catch (IllegalArgumentException | IllegalAccessException | ReflectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
