package fr.diginamic.salaire;

public class Salarie extends Intervenant {
	double salaireMensuel;

	/** Constructor
	 * @param prenom prénom du salarié
	 * @param nom nom du salarié
	 */
	public Salarie(String prenom, String nom, double salaireMensuel) {
		super(prenom, nom);
		this.salaireMensuel = salaireMensuel;
		
	}

	@Override
	public double getSalaire() {
		return this.salaireMensuel;
	}

}
