package sets;

import java.util.HashSet;

public class Pays implements Comparable<Pays>{
	// nom, nb d’habitants, PIB/habitant
	String nom;
	int nbHab;
	double pibHab;
	
	/** Constructeur d'un pays
	 * @param nom
	 * @param nbHab
	 * @param pibHab
	 */
	public Pays(String nom, int nbHab, double pibHab) {
		super();
		this.nom = nom;
		this.nbHab = nbHab;
		this.pibHab = pibHab;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbHab() {
		return nbHab;
	}

	public void setNbHab(int nbHab) {
		this.nbHab = nbHab;
	}

	public double getPibHab() {
		return pibHab;
	}

	public void setPibHab(double pibHab) {
		this.pibHab = pibHab;
	}
	
	public String toString() {
		return this.nom+" - PIB : "+this.pibHab+"USD - Population : "+this.nbHab;
	}

	/** comparateur compareTo
	 * @param pays2
	 * @return
	 */
	@Override
	public int compareTo(Pays pays) {
		int result=this.nom.compareTo(pays.getNom());
		return result;
	}

}
