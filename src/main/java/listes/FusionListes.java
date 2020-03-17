package listes;

import java.util.ArrayList;
import java.util.List;

public class FusionListes {
	public static void main(String args[]) {
		List<String> liste1 = new ArrayList<String>();
		liste1.add("Rouge");
		liste1.add("Vert");
		liste1.add("Orange");
		System.out.println("La liste 1 est : "+liste1);
		List<String> liste2 = new ArrayList<String>();
		liste2.add("Blanc");
		liste2.add("Bleu");
		liste2.add("Orange");
		System.out.println("La liste 2 est : "+liste2);

		List<String> liste3 = new ArrayList<String>();
		liste3.addAll(liste1);// ajoute toute la liste 1 à la liste 3
		liste3.addAll(liste2);
		System.out.println("La liste 3 issue de la fusion des listes 1 et 2 est : " + liste3);
		
	}
}