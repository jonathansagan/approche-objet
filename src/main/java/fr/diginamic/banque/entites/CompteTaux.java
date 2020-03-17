package fr.diginamic.banque.entites;

/**
 * Compte spécifique : taux de rémunération
 * 
 * @author Jonathan
 *
 */
public class CompteTaux extends Compte {
	/** tauxRemuneration est le taux de rémunération du compte */
	private double tauxRemuneration;

	/**
	 * Constructeur
	 * 
	 * @param num              est le numéro du compte
	 * @param solde            est le numéro du compte
	 * @param tauxRemuneration est le taux de rémunération en %
	 */
	public CompteTaux(String num, double solde, double tauxRemuneration) {
		super(num, solde);
		this.tauxRemuneration = tauxRemuneration;
	}

	/**
	 * Redéfinition de la méthode toString() de classe Compte Ajout du taux de
	 * rémunération.
	 *
	 * @return String une représentation du compte bancaire de la forme : Compte
	 *         numéro : [numero], solde = [solde], taux de rémunération :
	 *         [tauxRemuneration]%
	 */

	@Override
	public String toString() {
		return super.toString() + ", taux de rémunération : " + tauxRemuneration + "%";
	}
}
