package fr.diginamic.salaire;

public class Pigiste extends Intervenant {

	/** montantJ = montant journalier à verser au pigiste */
	double montantJ;
	
	/** nbreJ = nombre de jours travaillés en entreprise */
	int nbreJ;

	/** Constructeur
	 * @param prenom prénom du pigiste
	 * @param nom nom du pigiste
	 * @param montantJ montant journalier à verser au pigiste
	 * @param nbreJ nombre de jours travaillés en entreprise
	 */
	public Pigiste(String prenom, String nom, double montantJ, int nbreJ) {
		super(prenom, nom);
		this.montantJ = montantJ;
		this.nbreJ = nbreJ;
	
	}

	@Override
	public double getSalaire() {		
		return nbreJ*montantJ;
	}

	@Override
	public String getStatut() {
		// TODO Auto-generated method stub
		return "Pigiste";
	}

}
