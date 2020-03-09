package Interference;

/**Représente un rectangle
 * @author Jonathan
 *
 */
public class Rectangle implements ObjetGeometrique {
	double longueur = 0;
	double largeur = 0;
	
	/** Constructeur
	 * @param longueur = longueur du rectangle
	 * @param largeur = largeur du rectangle
	 */
	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}


	@Override
	public double perimetre() {
		return (this.longueur+this.largeur)*2;
	}

	@Override
	public double surface() {
		return (this.longueur*this.largeur)/2;
	}

}
