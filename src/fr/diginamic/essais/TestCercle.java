package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;

public class TestCercle {


	public static void main(String[] args) {
		Cercle cercle1 = new Cercle(5.0);
		System.out.println("Le périmètre du cercle 1 est : " + cercle1.perimetre());
		System.out.println("La surface du cercle 1 est : " + cercle1.surface());

		Cercle cercle2 = new Cercle(2.5);
		System.out.println("Le périmètre du cercle 2 est : " + cercle2.perimetre());
		System.out.println("La surface du cercle 2 est : " + cercle2.surface());
	}

}
