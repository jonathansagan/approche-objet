package fr.diginamic.operations;

public class Operations {

	/**m�thode d'op�ration
	 * @param a
	 * @param b
	 * @param ope = op�rateur
	 * @return suivant l'op�rateur retourne la bonne op�ration � suivre
	 */
	public static double calcul(double a, double b, char ope) {
		double result = 0;
		if (ope == '+') {
			result = a + b;
		} else if (ope == '-') {
			result = a - b;
		} else if (ope == '*') {
			result = a * b;
		} else if (ope == '/') {
			result = a / b;
		}
		return result;

	}
}
