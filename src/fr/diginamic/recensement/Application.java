package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Path path = Paths.get("C:/Users/Utilisateur/Documents/Diginamic/java/recensement.csv");
		List<String> lignes = Files.readAllLines(path, StandardCharsets.UTF_8);
		List<Ville> villes = new ArrayList<>();
		
		Recensement.Traiter(lignes, villes);

		Scanner scan = new Scanner(System.in);
		
		int choix = 0;
		
		while(choix != 9) {
			
			getMenu();
			
			choix = Integer.parseInt(scan.nextLine());
			
			switch(choix) {
				case 1:
					System.out.println("Entrez le nom de la ville dont vous souhaitez voir la population :");
					PopulationVille popVille = new PopulationVille();
					popVille.traiter(villes, scan);
					break;
					
				case 2:
					System.out.println("Entrez le code du département dont vous souhaitez voir la population :");
					PopulationDepartement popDpt = new PopulationDepartement();
					popDpt.traiter(villes, scan);
					break;
					
				case 3:
					System.out.println("Entrez le nom/code de la région dont vous souhaitez voir la population :");
					PopulationRegion popRegion = new PopulationRegion();
					popRegion.traiter(villes, scan);
					break;
					
				case 4:
					RegionsPlusPeuplees regions = new RegionsPlusPeuplees();
					regions.traiter(villes, scan);
					break;
					
				case 5:
					DepartementsPlusPeuplees dpt = new DepartementsPlusPeuplees();
					dpt.traiter(villes, scan);
					break;
					
				case 6:
					System.out.println("Entrez le code du département dont vous souhaitez voir les 10 villes les plus peuplées");
					VillesPeupleesDpt villesDpt = new VillesPeupleesDpt();
					villesDpt.traiter(villes, scan);
					break;
					
				case 7:
					System.out.println("Entrez le nom/code de la région dont vous souhaitez voir les 10 villes les plus peuplées");
					VillesPeupleesRegion villesRegion = new VillesPeupleesRegion();
					villesRegion.traiter(villes, scan);
					break;
					
				case 8:
					VillesPlusPeuplees villesPeuplees = new VillesPlusPeuplees();
					villesPeuplees.traiter(villes, scan);
					break;
			}
		}	
		
		scan.close();
	}
	
	public static void getMenu() {
		
		System.out.println("Choisissez une option :");
		System.out.println("1 --> Population d'une ville donnée");
		System.out.println("2 --> Population d'un département donné");
		System.out.println("3 --> Population d’une région donnée");
		System.out.println("4 --> Afficher les 10 régions les plus peuplées");
		System.out.println("5 --> Afficher les 10 départements les plus peuplés");
		System.out.println("6 --> Afficher les 10 villes les plus peuplées d’un département");
		System.out.println("7 --> Afficher les 10 villes les plus peuplées d’une région");
		System.out.println("8 --> Afficher les 10 villes les plus peuplées de France");
		System.out.println("9 --> Sortir");
		
	}

}
