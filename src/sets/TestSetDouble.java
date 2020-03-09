package sets;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSetDouble {

	public static void main(String[] args) {
		// 1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01
		HashSet<Double> set = new HashSet<>(Arrays.asList(1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01));
		
		// pour lire le set: utilisation de l'itérator
		Iterator<Double> iterator = set.iterator();
		while (iterator.hasNext()) {
		Double myDouble = iterator.next();
		System.out.println(myDouble);
		}
		
		//Recherchez le plus grand élément de la collection
		Object max = Collections.max(set); 
		System.out.println("Le max de la liste est : "+max);
		
		//Supprimez le plus petit élément de la collection
		Object min = Collections.min(set); 
		System.out.println("Le min de la liste est : "+min);
		set.remove(min);
		System.out.println("La nouvelle liste est : "+set);
		
		
		
		


	}

}
