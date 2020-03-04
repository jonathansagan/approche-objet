package fr.diginamic.banque.entites;

/**
 * Opération sur comptes
 * 
 * @author Jonathan
 *
 */
public abstract class Operation {
	/** montant montant de l'opération */
	protected double montant;
	/** date date de l'opération */
	protected String date;

	/**
	 * Constructeur
	 * 
	 * @param montant montant de l'opération
	 * @param date    date de l'opération
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
	 * l'opération
	 */
	public String toString() {
		return montant + " " + date;
	}
	// q5 : affectation crédit ou débit

	/**
	 * @return Méthode pour retourner le type de l'opération (Crédit ou Débit)
	 */
	public abstract String afficherType();
}
