package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Compte a = new Compte("F1", 2000.0);
		// System.out.println(a);

		CompteTaux c2 = new CompteTaux("F2", 3000.0, 3);

		// création tableau

		Compte[] tabCompte = { a, c2 };

		// boucle for
		for (int i = 0; i < tabCompte.length; i++) {
			System.out.println(tabCompte[i]);
		}
	}
}
