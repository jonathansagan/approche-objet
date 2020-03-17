package fr.diginamic.testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {
		// Utilisez une boucle pour affichez toutes les saisons contenues dans
		// l��num�ration
		Saison[] array = Saison.values();
		for (Saison s : array) {
			System.out.println("Les saisons sont : " + s.getLibelle());			
		}
		
		/*
		 * m�thode de base des �num�rations pour retrouver et afficher l��num�ration
		 * dont le nom est ETE
		 */
		String valeur = "ETE";
		Saison sa = Saison.valueOf(valeur);
		System.out.println("la valeur de l'�num�ration de ETE est : " +sa.getNum());
		
		String valeur2 = "HIVER";
		Saison sai = Saison.valueOf(valeur);
		System.out.println("le libell� de ETE est : " +sai.getLibelle());
	}

}
