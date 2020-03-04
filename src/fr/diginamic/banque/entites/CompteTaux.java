package fr.diginamic.banque.entites;

/**
 * Compte sp�cifique : taux de r�mun�ration
 * 
 * @author Jonathan
 *
 */
public class CompteTaux extends Compte {
	/** tauxRemuneration est le taux de r�mun�ration du compte */
	private double tauxRemuneration;

	/**
	 * Constructeur
	 * 
	 * @param num              est le num�ro du compte
	 * @param solde            est le num�ro du compte
	 * @param tauxRemuneration est le taux de r�mun�ration en %
	 */
	public CompteTaux(String num, double solde, double tauxRemuneration) {
		super(num, solde);
		this.tauxRemuneration = tauxRemuneration;
	}

	/**
	 * Red�finition de la m�thode toString() de classe Compte Ajout du taux de
	 * r�mun�ration.
	 *
	 * @return String une repr�sentation du compte bancaire de la forme : Compte
	 *         num�ro : [numero], solde = [solde], taux de r�mun�ration :
	 *         [tauxRemuneration]%
	 */

	@Override
	public String toString() {
		return super.toString() + ", taux de r�mun�ration : " + tauxRemuneration + "%";
	}
}
