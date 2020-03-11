package maps;

import java.util.HashMap;
import java.util.Iterator;

public class CreationEtManipulationMap {

	public static void main(String[] args) {
		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");

		// Ajouter dans mapVilles les informations pour Lille, Lyon et Bordeaux
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");

		// Mettre en place une boucle pour afficher l'ensemble des clés contenues dans
		// la map

		Iterator<Integer> iteratorMapVilles = mapVilles.keySet().iterator();
		while (iteratorMapVilles.hasNext()) {
			Integer cle = iteratorMapVilles.next();
			String courant = mapVilles.get(cle);
			System.out.println("L'ensemble des clés sont : " + cle);
		}

		// Mettre en place une boucle pour afficher l'ensemble des valeurs contenues
		// dans la map

		// afficher la map :
		Iterator<String> iteratorVilles = mapVilles.values().iterator();
		while (iteratorVilles.hasNext()) {
			String courant = iteratorVilles.next();
			System.out.println("L'ensemble des valeurs sont : " + courant);
		}

		// Taille de la map :
		System.out.println("La taille de la map est : " + mapVilles.size());

	}

}
