package fr.diginamic.maison;

public abstract class Piece {
/** superficie */
double superficie;
/** numetage */
int numEtage;
/** Constructeur
 * @param superficie
 * @param numEtage
 */
/** Constructeur
 * @param superficie = superficie de la pi�ce
 * @param numetage = num�ro de l'�tage (0 = RDC)
 */
public Piece(double superficie, int numetage) {
	
	this.superficie = superficie;
	this.numEtage = numetage;
}
public double getSuperficie() {
	return superficie;
}
public void setSuperficie(double superficie) {
	this.superficie = superficie;
}
public int getNumEtage() {
	return numEtage;
}
public void setNumEtage(int numEtage) {
	this.numEtage = numEtage;
}




}
