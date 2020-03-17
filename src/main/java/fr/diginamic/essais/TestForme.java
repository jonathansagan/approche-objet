package fr.diginamic.essais;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Rectangle;

public class TestForme {

	public static void main(String[] args) {
		Cercle c1 = new Cercle(3);
		Rectangle r1 = new Rectangle(3,2);
		Carre ca1 = new Carre (2,2);

		AffichageForme affichage = new AffichageForme();
		affichage.afficher(c1);
		affichage.afficher(r1);
		affichage.afficher(ca1);
	

}}
