package fr.diginamic.salaire;

public class Salarie extends Intervenant {
	double salaireMensuel;

	/** Constructor
	 * @param prenom pr�nom du salari�
	 * @param nom nom du salari�
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
