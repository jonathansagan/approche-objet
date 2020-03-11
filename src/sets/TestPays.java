package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestPays {

	public static void main(String[] args) {
		HashSet<Pays> set = new HashSet<Pays>();
		set.add(new Pays("USA", 	372_200_000, 	59_531.66));
		set.add(new Pays("France",	66_990_000,		38_476.66));
		set.add(new Pays("Allemagne",82_520_000,	44_469.91));
		set.add(new Pays("UK",		66_040_000,		39_720.44));
		set.add(new Pays("Italie",	60_590_000,		31_952.98));
		set.add(new Pays("Japon",	126_800_000,	38_428.10));
		set.add(new Pays("Chine",	1_386_000_000,	8_826.99));
		set.add(new Pays("Russie",	144_500_000,	10_743.10));
		set.add(new Pays("Inde",	1_339_000_000,	1_939.61));
		
		Iterator<Pays> iterator = set.iterator();
		Pays maxPib = iterator.next();
		while (iterator.hasNext()) {

			Pays current = iterator.next();

			if (maxPib.getPibHab() < current.getPibHab()) {

				maxPib = current;
			}
		}

		System.out.println("Pays avec le PIB/habitant le plus important : " + maxPib);

		iterator = set.iterator();
		Pays maxPibTotal = iterator.next();
		Pays minPibTotal = maxPibTotal;
		while (iterator.hasNext()) {

			Pays current = iterator.next();

			if (maxPibTotal.getPibHab()*maxPibTotal.getNbHab() < current.getPibHab()*current.getNbHab()) {

				maxPibTotal = current;
			}

			if(minPibTotal.getPibHab()*minPibTotal.getNbHab() > current.getPibHab()*current.getNbHab()) {

				minPibTotal = current;

			}
		}

		maxPibTotal.setNom(maxPibTotal.getNom().toUpperCase());

		set.remove(minPibTotal);

		System.out.println(set);

	}

}