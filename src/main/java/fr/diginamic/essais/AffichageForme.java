package fr.diginamic.essais;

import fr.diginamic.formes.Forme;

public class AffichageForme {
	public void afficher(Forme formegeo) {
		System.out.println("Le p�rim�tre de votre forme est : "+formegeo.calculerPerimetre()); ;
		System.out.println("La surface de votre forme est : "+formegeo.calculerSurface());
}
	

}
