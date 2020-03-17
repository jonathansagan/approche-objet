package maps;

import java.util.HashMap;

import sets.Pays;

public class MapPays {

	public static void main(String[] args) {
		/*
		 * Dans cette classe, creez une map permettant de stocker les instances de pays
		 * (valeur) en fonction de leur nom (clé).
		 */
////		set.add(new Pays("USA", 	372_200_000, 	59_531.66));
//		set.add(new Pays("France",	66_990_000,		38_476.66));
//		set.add(new Pays("Allemagne",82_520_000,	44_469.91));
//		set.add(new Pays("UK",		66_040_000,		39_720.44));
//		set.add(new Pays("Italie",	60_590_000,		31_952.98));
//		set.add(new Pays("Japon",	126_800_000,	38_428.10));
//		set.add(new Pays("Chine",	1_386_000_000,	8_826.99));
//		set.add(new Pays("Russie",	144_500_000,	10_743.10));
//		set.add(new Pays("Inde",	1_339_000_000,	1_939.61));
		
		HashMap<String,Pays> m = new HashMap<>();

		m.put("USA",new Pays("USA", 372_200_000, 	59_531));
		m.put("France",new Pays("France", 66_990_000,		38_476));
		m.put("Allemagne",new Pays("Allemagne",82_520_000,	44_469));
		m.put("UK",new Pays("UK", 66_040_000,		39_720));
		m.put("Italie",new Pays("Italie",60_590_000,		31_952));
		m.put("Japon",new Pays("Japon", 126_800_000,	38_428));
		m.put("Chine",new Pays("Chine", 1_386_000_000,	8_826));
		m.put("Russie",new Pays("Russie", 144_500_000,	10_743));
		m.put("Inde",new Pays("Inde",1_339_000_000,	1_939));

		System.out.println("Map : "+m);

		int minPop = Integer.MAX_VALUE;
		String minPays = "";
		for(String key : m.keySet()) {

			Pays current = m.get(key);

			if(current.getNbHab() < minPop) {
				minPop = current.getNbHab();
				minPays = key;
			}
		}

		m.remove(minPays);

		System.out.println("Map sans le pays le moins peuplé ("+minPays+") : "+m);

	}

}
