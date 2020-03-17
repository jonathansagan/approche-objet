package fr.diginamic.utils;

import fr.diginamic.entites.Cercle;

public class CercleFactory {
	/**m�thode pour retourner un cercle avec en param�tre un nouveau rayon
	 * @param nrayon = nouveau param�tre de rayon
	 * @return cercle
	 */
	public static Cercle creerCercle(double nrayon) {
		Cercle cer = new Cercle (nrayon);
		return cer;
	}
	}


