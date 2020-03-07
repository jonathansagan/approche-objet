package fr.diginamic.salaire;

public abstract class Intervenant {
	/** prenom */
	/** nom */
	protected String prenom, nom;

	/**
	 * Constructeur
	 * 
	 * @param prenom prénom de l'intervenant
	 * @param nom    nom de l'intervenant
	 */
	public Intervenant(String prenom, String nom) {
		this.prenom = prenom;
		this.nom = nom;
	}

	/**
	 * méthode abstraite retournant le salaire
	 * 
	 * @return le salaire de l'intervenant
	 */
	public abstract double getSalaire();

	/**
	 * méthode abstraite retournant le statut
	 * 
	 * @return le statut de l'intervenant
	 */
	public abstract String getStatut();

	public final void afficherDonnees() {
		System.out.println("les données de l'intervenant sont : " + nom + " " + prenom + " , " + this.getSalaire() + "€ , "
				+ this.getStatut());
	}
}
