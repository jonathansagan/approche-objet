package fr.diginamic.utils;

import fr.diginamic.entites.Cercle;

public class CercleFactory {
	/**méthode pour retourner un cercle avec en paramètre un nouveau rayon
	 * @param nrayon = nouveau paramètre de rayon
	 * @return cercle
	 */
	public static Cercle creerCercle(double nrayon) {
		Cercle cer = new Cercle (nrayon);
		return cer;
	}
	}


