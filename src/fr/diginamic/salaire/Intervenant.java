package fr.diginamic.salaire;

public abstract class Intervenant {
/** prenom */
/** nom */
protected String prenom, nom;

/** Constructeur
 * @param prenom prénom de l'intervenant
 * @param nom nom de l'intervenant
 */
public Intervenant(String prenom, String nom) {
	super();
	this.prenom = prenom;
	this.nom = nom;
}

/**méthode abstraire pour le salaire
 * @return le salaire de l'intervenant
 */
public abstract double getSalaire();




}



