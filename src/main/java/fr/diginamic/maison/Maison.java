package fr.diginamic.maison;

import fr.diginamic.maison.Piece;

public class Maison {
	/** pieces = pièces de la maison */
	public Piece[] pieces;

	/**
	 * Constructeur
	 * 
	 * @param pieces = nombres de pièces de la maison
	 */
	
	public Maison() {
		pieces = new Piece[0];
	}

	/**
	 * Méthode d'ajout de nouvelle pièce
	 * 
	 * @param nvPiece
	 */
	public void ajouterPiece(Piece nvPiece) {
		/*
		 * Création d'un tableau temporaire appelé newTab qui a une taille égale à la
		 * tableau du tableau pieces+1
		 */
		Piece[] newTab = new Piece[pieces.length + 1];
		
		/* On ajoute toutes les pièces du tableau pieces dans newTab */
		for (int i = 0; i < pieces.length; i++) {
			newTab[i] = pieces[i];
		}
		/*
		 * On place en dernière position dans le nouveau tableau la nouvelle pièce
		 */
		newTab[newTab.length - 1] = nvPiece;

		// Enfin on affecte newTab à pieces
		this.pieces = newTab;
	}
	/** méthode de la superficie d'un étage
	 * @param choixEtage
	 * @return la superficie de l'étage
	 */
	public double superficieEtage(int choixEtage) {
		double superficieEtage = 0;

		for (int i = 0; i < pieces.length; i++) {
			if (choixEtage == this.pieces[i].getNumEtage()) {
				superficieEtage = superficieEtage + this.pieces[i].getSuperficie();
			}
		}

		return superficieEtage;
	}
	/** Méthode superficie totale de la maison
	 * @return superficie totale de la maison
	 */
	public double calculerSurface() {
		double superficieTot = 0;

		for (int i = 0; i < pieces.length; i++) {
			superficieTot = superficieTot + this.pieces[i].getSuperficie();
		}

		return superficieTot;
	}

	public Piece[] getPieces() {
		return pieces;
	}

	public void setPieces(Piece[] pieces) {
		this.pieces = pieces;
	}

}
