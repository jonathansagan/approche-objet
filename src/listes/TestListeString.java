package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestListeString {

	public static void main(String[] args) {
		// Nice, Carcassonne, Narbonne, Lyon, Foix, Pau, Marseille, Tarbes
		ArrayList<String> listeVilles = new ArrayList<>();
		//pour éviter de faire une liste de list1.add("machin1"); list2.add("machin2"); .... 
		//on fait la commande ci-dessous
		listeVilles.addAll(Arrays.asList("Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes"));
		System.out.println(listeVilles);
		
		String max = listeVilles.get(0);
		for (String ville : listeVilles) {
			if (ville.length() >= max.length()) {
				max = ville;
			}
		}
		System.out.println("Ville avec le nom le + long : " +max + "\n");

		for (int i = 0; i < listeVilles.size(); ++i) {
			listeVilles.set(i, listeVilles.get(i).toUpperCase());
		}

		for (int i = 0; i < listeVilles.size(); ++i) {
			if (listeVilles.get(i).charAt(0) == 'N') {
				listeVilles.remove(i);
			}
		}

		for (String villes : listeVilles) {
			System.out.println(villes);
		}


	}

}