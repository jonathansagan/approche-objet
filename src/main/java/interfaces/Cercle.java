package interfaces;

/** Représente un Cercle
 * @author Jonathan
 *
 */
public class Cercle implements ObjetGeometrique {
	double rayon;

	/** Constructeur d'un cercle
	 * @param r rayon du cercle
	 */
	public Cercle(double r) {
		super();
		this.rayon = r;
	}
	@Override
	public double perimetre() {
		return 2*Math.PI*this.rayon;
	}

	@Override
	public double surface() {	
		return Math.PI*this.rayon*this.rayon;
	}
	

}
