package fr.diginamic.banque.entites;

/**
 * Op�ration sur comptes
 * 
 * @author Jonathan
 *
 */
public abstract class Operation {
	/** montant montant de l'op�ration */
	protected double montant;
	/** date date de l'op�ration */
	protected String date;

	/**
	 * Constructeur
	 * 
	 * @param montant montant de l'op�ration
	 * @param date    date de l'op�ration
	 */
	public Operation(double montant, String date) {
		super();
		this.montant = montant;
		this.date = date;
	}

	/**
	 * @return
	 */
	public double getMontant() {
		return montant;
	}

	/**
	 * @param montant
	 */
	public void setMontant(double montant) {
		this.montant = montant;
	}

	/**
	 * @return
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * ici string to string permettra de visualiser correcement le contenu de
	 * l'op�ration
	 */
	public String toString() {
		return montant + " " + date;
	}
	// q5 : affectation cr�dit ou d�bit

	/**
	 * @return M�thode pour retourner le type de l'op�ration (Cr�dit ou D�bit)
	 */
	public abstract String afficherType();
}
