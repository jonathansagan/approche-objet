package fr.diginamic.banque.entites;

/** Représente un compte bancaire
 * @author Jonathan
 *
 */
public class Compte {
	
	/** numéro du Compte */
	private String num; // attributs
	/** solde du Compte */
	private double solde; //attributs
	
	/** Constructeur
	 * @param numéro du compte
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
		return "Compte numéro : " + num + ", solde = " + solde;
	}

}
