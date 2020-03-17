package fr.diginamic.testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {
		// Utilisez une boucle pour affichez toutes les saisons contenues dans
		// l’énumération
		Saison[] array = Saison.values();
		for (Saison s : array) {
			System.out.println("Les saisons sont : " + s.getLibelle());			
		}
		
		/*
		 * méthode de base des énumérations pour retrouver et afficher l’énumération
		 * dont le nom est ETE
		 */
		String valeur = "ETE";
		Saison sa = Saison.valueOf(valeur);
		System.out.println("la valeur de l'énumération de ETE est : " +sa.getNum());
		
		String valeur2 = "HIVER";
		Saison sai = Saison.valueOf(valeur);
		System.out.println("le libellé de ETE est : " +sai.getLibelle());
	}

}
