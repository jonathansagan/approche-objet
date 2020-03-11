package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CreationMap {

	public static void main(String[] args) {

		Map<String, Integer> mapSalaire = new HashMap<>();
		// association d'une clé à chaque élément
		mapSalaire.put("Paul", 1750);
		mapSalaire.put("Hicham", 1825);
		mapSalaire.put("Yu", 2250);
		mapSalaire.put("Ingrid", 2015);
		mapSalaire.put("Chantal", 2418);

		// afficher la map : 
		Iterator<String> iteratorMapSalaire = mapSalaire.keySet().iterator();
		while (iteratorMapSalaire.hasNext()) {
			String cle = iteratorMapSalaire.next();
			Integer courant = mapSalaire.get(cle);
			System.out.println(cle+ " -> "+courant+ "€");
		}
		
		// Taille de la map :
		System.out.println("La taille de la map est : " + mapSalaire.size());
		

	}

}
