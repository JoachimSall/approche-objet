package fr.diginamic.recensement;

import java.util.List;
import java.util.Scanner;

public abstract class MenuService {
	
	public abstract void traiter(List<Ville> villes, Scanner scanner);
}
