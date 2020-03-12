package sets;

import java.util.HashSet;

public class Pays implements Comparable<Pays> {
	// nom, nb d’habitants, PIB/habitant
	String nom;
	int nbHab;
	int pibHab;

	/**
	 * Constructeur d'un pays
	 * 
	 * @param nom
	 * @param nbHab
	 * @param pibHab
	 */
	public Pays(String nom, int nbHab, int pibHab) {
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

	public int getPibHab() {
		return pibHab;
	}

	public void setPibHab(int pibHab) {
		this.pibHab = pibHab;
	}

	public String toString() {
		return this.nom + " - PIB : " + this.pibHab + "USD - Population : " + this.nbHab;
	}

	/**
	 * comparateur compareTo
	 * 
	 * @param pays2
	 * @return
	 */
	// pour comparer suivant le nom et trier par ordre alphab
//	public int compareTo(Pays pays) {
//		int result=this.nom.compareTo(pays.getNom()); (pour trier par ordre inverse faire : int result= - this.nom.compareTo(pays.getNom());
//		return result;
//	}
	// pour trier par pib :
	@Override
	public int compareTo(Pays pays) {
		int result = this.pibHab - pays.getPibHab();
		return result;
	}

	@Override // redefinition de la méthode equals
	public boolean equals(Object object) {
		if (!(object instanceof Pays)) {
			return false;
		}
		Pays other = (Pays) object;
		return nom.equals(other.getNom());
	}
}
