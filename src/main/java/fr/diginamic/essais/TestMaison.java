package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.Piece;
import fr.diginamic.maison.PieceException;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.WC;

public class TestMaison {

	public static void main(String[] args) throws PieceException {
		Maison maison2 = new Maison();
		
		
		maison2.ajouterPiece(new Cuisine(13.2, 0));
		maison2.ajouterPiece(new WC(1.5,0));
		maison2.ajouterPiece(new Salon(40.2, 0));
		maison2.ajouterPiece(new Chambre(10,1));
		maison2.ajouterPiece(new Chambre(12.5,1));
		maison2.ajouterPiece(new Chambre(11.3,1));
		maison2.ajouterPiece(new SalleDeBain(4.5,1));
		maison2.ajouterPiece(new WC(1,1));
		
		System.out.println("La superficie Totale: " + maison2.calculerSurface());
		System.out.println("Superficie du RDC : " + maison2.superficieEtage(0));
		System.out.println("Superficie de l'étage : " + maison2.superficieEtage(1));
		

	}

}
