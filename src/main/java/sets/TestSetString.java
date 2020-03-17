package sets;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class TestSetString {

	public static void main(String[] args) {
		// USA, France, Allemagne, UK, Italie, Japon, Chine, Russie, Inde
		HashSet<String> set = new HashSet<>(
				Arrays.asList("USA", "France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde"));

Iterator<String> iterator = set.iterator();
		// Recherchez le plus grand élément de la collection
		int nbMaxLettre = 0;
		String paysMaxLettres = null;
		while (iterator.hasNext()) {
			String pays = iterator.next();
			if (pays.length() > nbMaxLettre) {
				nbMaxLettre = pays.length();
				paysMaxLettres = pays;
			}
		}
		System.out.println("Le max de la liste est : " + paysMaxLettres + " avec : " + nbMaxLettre + " lettres");
		
		
						//Supprimez le :		
				
				set.remove(paysMaxLettres);
				System.out.println("La nouvelle liste est : "+set);

	}

}
