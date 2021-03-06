package fr.diginamic.banque.entites;

/** Repr�sente un compte bancaire
 * @author Jonathan
 *
 */
public class Compte {
	
	/** num�ro du Compte */
	private String num; // attributs
	/** solde du Compte */
	private double solde; //attributs
	
	/** Constructeur
	 * @param num�ro du compte
	 * @param solde du compte
	 */
	public Compte(String num, double solde) {//constructeur
		
		this.num = num;
		this.solde = solde;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}
	/**
	 *
	 */
	@Override
	
	public String toString() {// ici string to string permettra de visualiser correcement le contenu de compte
		return "Compte num�ro : " + num + ", solde = " + solde;
	}

}
