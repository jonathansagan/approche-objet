package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {


	public static void main(String[] args) {
		Cercle cercle1 = new Cercle(5.0);
		System.out.println("Le périmètre du cercle 1 est : " + cercle1.perimetre());
		System.out.println("La surface du cercle 1 est : " + cercle1.surface());

		Cercle cercle2 = new Cercle(2.5);
		System.out.println("Le périmètre du cercle 2 est : " + cercle2.perimetre());
		System.out.println("La surface du cercle 2 est : " + cercle2.surface());
		
		Cercle cercle3 = CercleFactory.creerCercle (4.0); 
		System.out.println("Le périmètre du cercle 3 est : " + cercle3.perimetre());
		System.out.println("La surface du cercle 3 est : " + cercle3.surface());
	}

}
/**méthode pour retourner un cercle avec en paramètre un nouveau rayon
* @param nrayon = nouveau paramètre de rayon
* @return cercle

public static Cercle creerCercle(double nrayon) {
	Cercle cer = new Cercle (nrayon);
	return cer;*/