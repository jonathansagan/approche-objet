package fr.diginamic.entites;

public class Cercle {
	/** rayon rayon du cercle */
	double rayon;

	/**
	 * Constructeur
	 * 
	 * @param rayon rayon du cercle
	 */
	public Cercle(double rayon) {
		this.rayon = rayon;
	}

	/**m�thode 
	 * @return le p�rim�tre du cercle
	 */
	public double perimetre() {
		return (2* Math.PI*rayon);
}
	/**m�thode
	 * @return la surface du cercle
	 */
	public double surface() {
		return (Math.PI*rayon*rayon);
	}

	/** Getter
	 * @return rayon
	 */
	public double getRayon() {
		return rayon;
	}

	/**Setter
	 * @param rayon nouveau rayon
	 */
	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	
}
