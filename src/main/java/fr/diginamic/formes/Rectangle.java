package fr.diginamic.formes;

public class Rectangle extends Forme {
	double longueur =0;
	double largeur=0;

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
	public double calculerPerimetre() {
		double perimetreRectangle= (this.longueur+this.largeur)*2;
		return perimetreRectangle;
	}

	@Override
	public double calculerSurface() {
		double surfaceRectangle = (this.longueur*this.largeur)/2;
		return surfaceRectangle;
	}

}
