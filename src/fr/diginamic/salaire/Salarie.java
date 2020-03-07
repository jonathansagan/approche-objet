package fr.diginamic.salaire;

public class Salarie extends Intervenant {
	double salaire;

	/** Constructor
	 * @param prenom prénom du salarié
	 * @param nom nom du salarié
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
		return "Salarié";
	}
	

}
