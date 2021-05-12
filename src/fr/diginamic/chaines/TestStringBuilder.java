package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String concat = "";
		StringBuilder build = new StringBuilder();
		
		long debut = System.currentTimeMillis();
		for(int i = 0; i < 100000; i++) {
			concat = concat + i;
		}
		long fin = System.currentTimeMillis();
		System.out.println("Tps écoule : " + (fin - debut));
		
		long debutBuild = System.currentTimeMillis();
		for(int i = 0; i < 100000; i++) {
			build.append(i);
		}
		long finBuild = System.currentTimeMillis();
		System.out.println("Tps écoule : " + (finBuild - debutBuild));
	}

}
