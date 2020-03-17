package fr.diginamic.maison;

import fr.diginamic.maison.Piece;

public class Maison {
	/** pieces = pi�ces de la maison */
	public Piece[] pieces;

	/**
	 * Constructeur
	 * 
	 * @param pieces = nombres de pi�ces de la maison
	 */
	
	public Maison() {
		pieces = new Piece[0];
	}

	/**
	 * M�thode d'ajout de nouvelle pi�ce
	 * 
	 * @param nvPiece
	 */
	public void ajouterPiece(Piece nvPiece) {
		/*
		 * Cr�ation d'un tableau temporaire appel� newTab qui a une taille �gale � la
		 * tableau du tableau pieces+1
		 */
		Piece[] newTab = new Piece[pieces.length + 1];
		
		/* On ajoute toutes les pi�ces du tableau pieces dans newTab */
		for (int i = 0; i < pieces.length; i++) {
			newTab[i] = pieces[i];
		}
		/*
		 * On place en derni�re position dans le nouveau tableau la nouvelle pi�ce
		 */
		newTab[newTab.length - 1] = nvPiece;

		// Enfin on affecte newTab � pieces
		this.pieces = newTab;
	}
	/** m�thode de la superficie d'un �tage
	 * @param choixEtage
	 * @return la superficie de l'�tage
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
	/** M�thode superficie totale de la maison
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
