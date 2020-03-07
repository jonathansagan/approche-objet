package fr.diginamic.salaire;

public class Pigiste extends Intervenant {

	/** montantJ = montant journalier � verser au pigiste */
	double montantJ;
	
	/** nbreJ = nombre de jours travaill�s en entreprise */
	int nbreJ;

	/** Constructeur
	 * @param prenom pr�nom du pigiste
	 * @param nom nom du pigiste
	 * @param montantJ montant journalier � verser au pigiste
	 * @param nbreJ nombre de jours travaill�s en entreprise
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
