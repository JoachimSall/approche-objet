package fr.diginamic.operations;

public class CalculMoyenne {
	private double[] tab;
	private int position = 0;
	
	public CalculMoyenne() {
	}
	
	public void ajout(double nb) {
		if (tab == null) {
			tab = new double[1];
		} else {
			position++;
			double[] tab2 = new double[position + 1];
			for (int i = 0; i<tab.length; i++) {
				tab2[i] = tab[i];
			}
			tab = tab2;
		}
		tab[position] = nb;
	}
	
	public double calcul() {
		double somme = 0;
		for (int i = 0; i < tab.length; i++) {
			somme += tab[i];
		}
		return somme/tab.length;
	}
}
