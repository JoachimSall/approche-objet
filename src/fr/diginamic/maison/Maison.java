package fr.diginamic.maison;

public class Maison {
	
	private Piece[] tabPieces;
	private int position = 0;
	
	public void ajouterPiece(Piece piece) {
		if (piece == null) {
			System.out.println("Ajoutez une pièce ayant une superficie non nulle !");
		} else if (piece.getSuperficie() <= 0) {
			System.out.println("Ajoutez une pièce ayant une superficie supérieure à 0 !");
		} 
		else {
			if (tabPieces == null) {
				tabPieces = new Piece[1];
			} else {
				position ++;
				Piece[] tabPieces2 = new Piece[position + 1];
				for (int i = 0; i < tabPieces.length; i++) {
					tabPieces2[i] = tabPieces[i];
				}
				tabPieces = tabPieces2;
			}
			tabPieces[position] = piece;
		}
	}
	
	public double superficieTotale() {
		double total = 0;
		for(int i = 0; i < tabPieces.length; i++) {
			total += tabPieces[i].getSuperficie();
		}
		return total;
	}
	
	public double superficieEtage(int etage) {
		double total = 0;
		for (int i = 0; i < tabPieces.length; i++) {
			if (tabPieces[i].getEtage() == etage) {
				total += tabPieces[i].getSuperficie();
			}
		}
		return total;
	}
	
	public double superficieType(String piece) {
		double total = 0;
		for (int i = 0; i < tabPieces.length; i++) {
			if (tabPieces[i].getType().equals(piece.toUpperCase().toLowerCase())) {
				total += tabPieces[i].getSuperficie();
			}
		}
		return total;
	}
	
	public double nbType(String piece) {
		double total = 0;
		for (int i = 0; i < tabPieces.length; i++) {
			if (tabPieces[i].getType().equals(piece.toUpperCase().toLowerCase())) {
				total += 1;
			}
		}
		return total;
	}
	
	public String test() {
		return tabPieces[0].getType();
	}
}
