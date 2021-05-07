package fichier;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ManipulationFichier {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//FileOutputStream fos = new FileOutputStream("C:/Users/Utilisateur/Documents/Diginamic/java/recensement_copie.csv");
		
		Path path = Paths.get("C:/Users/Utilisateur/Documents/Diginamic/java/recensement.csv");
		List<String> lignes = Files.readAllLines(path, StandardCharsets.UTF_8);
		List<String> lignes_copie = new ArrayList<>();
		
		Iterator<String> iterateur = lignes.iterator();
		
		while(iterateur.hasNext()) {
			System.out.println(iterateur.next());
		}
		
		int pop =0;
		int popMin = 25000;
		String popString =null;
		lignes.remove(0);
		iterateur = lignes.iterator();
		
		
		while(iterateur.hasNext()) {
			String ligne = iterateur.next();
			String[] valeurs = ligne.split(";");
			popString = valeurs[9].replaceAll(" ","");
			valeurs[9] = popString;
			pop = Integer.parseInt(valeurs[9]);
			
			if (pop > popMin) {
				ligne = valeurs[2] + ";" + valeurs[6] + ";" + valeurs[9];
				lignes_copie.add(ligne);
			}
		}
		
		//Path path_copie = Paths.get("C:/Users/Utilisateur/Documents/Diginamic/java/recensement_copie.csv");
		//Files.write(path_copie,lignes_copie);
		//fos.flush();
		//close();
		
		Files.write(Paths.get("C:/Users/Utilisateur/Documents/Diginamic/java/recensement_"+popMin+".csv"),lignes_copie);

	}
	

}
