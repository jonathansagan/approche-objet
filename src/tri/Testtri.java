package tri;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

import sets.Pays;

public class Testtri {

	public static void main(String[] args) {
		ArrayList<Pays> liste = new ArrayList<Pays>();
		liste.add(new Pays("USA", 	372_200_000, 	59_531));
		liste.add(new Pays("France",	66_990_000,		38_476));
		liste.add(new Pays("Allemagne",82_520_000,	44_469));
		liste.add(new Pays("UK",		66_040_000,		39_720));
		liste.add(new Pays("Italie",	60_590_000,		31_952));
		liste.add(new Pays("Japon",	126_800_000,	38_428));
		liste.add(new Pays("Chine",	1_386_000_000,	8_826));
		liste.add(new Pays("Russie",	144_500_000,	10_743));
		liste.add(new Pays("Inde",	1_339_000_000,	1_939));
		
		// tri de la liste : 
		Collections.sort(liste);
		for (Pays pays : liste) {
			System.out.println(pays);
		}
	}
	
	

}
