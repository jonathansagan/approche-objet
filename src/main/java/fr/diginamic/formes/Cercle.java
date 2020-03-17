package fr.diginamic.formes;

public class Cercle extends Forme {
double rayon = 0;


/** Constructeur
 * @param rayon r= rayon du cercle
 */
public Cercle(double r) {
	super();
	this.rayon = r;
}

	@Override
	public double calculerSurface() {
		double surfaceCercle = Math.PI*this.rayon*this.rayon;		
		return surfaceCercle;
	}

	@Override
	public double calculerPerimetre() {
		double perimetreCercle = 2*Math.PI*this.rayon;
		return perimetreCercle;
	}

	
}
