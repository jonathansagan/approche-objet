package fr.diginamic.testenumeration;

public enum Saison {
	PRINTEMPS("Printemps",1), ETE("Et�",2), AUTOMNE("Automne",3), HIVER("Hiver",4);
	private String libelle;
	private int num;
	
	/** Constructeur d'une saison
	 * @param libelle libell� de la ssaison
	 * @param num num�ro d'ordre de la saison
	 */
	private Saison(String libelle, int num) {
		this.libelle = libelle;
		this.num = num;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	
}
