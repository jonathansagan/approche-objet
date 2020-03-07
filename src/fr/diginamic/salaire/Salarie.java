package fr.diginamic.salaire;

public class Salarie extends Intervenant {
	double salaire;

	/** Constructor
	 * @param prenom pr�nom du salari�
	 * @param nom nom du salari�
	 */
	public Salarie(String prenom, String nom, double salaire) {
		super(prenom, nom);
		this.salaire = salaire;
		
	}

	@Override
	public double getSalaire() {
		return this.salaire;
	}

	@Override
	public String getStatut() {
		// TODO Auto-generated method stub
		return "Salari�";
	}
	

}
