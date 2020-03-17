package fr.diginamic.operations;

public class Operations {

	/**méthode d'opération
	 * @param a
	 * @param b
	 * @param ope = opérateur
	 * @return suivant l'opérateur retourne la bonne opération à suivre
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
