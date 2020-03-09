package listes;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class TestListInt {

	public static void main(String[] args) {
		ArrayList<Integer> liste1 = new ArrayList<>();
		liste1.add(-1);
		liste1.add(5);
		liste1.add(7);
		liste1.add(3);
		liste1.add(-2);
		liste1.add(4);
		liste1.add(8);
		liste1.add(5);
		System.out.println("La liste 1 est : "+liste1);// afficher une liste
		System.out.println("Sa taille est de : " + liste1.size()); // taille d'une liste
		Object max = Collections.max (liste1); // obtenir le MAX d'une liste
		System.out.println("Le max de la liste est : "+max);
		Object min = Collections.min(liste1); // obtenir le MIN
		System.out.println("Le min de la liste est : "+min);
		ArrayList <Integer> liste2 = new ArrayList<>();
		liste1.remove(min); // on enlève le min à la liste
		liste2.addAll(liste1); // on ajoute la liste1 sans le min à la liste 2
		System.out.println("La liste 1 sans le min est : "+liste2);
		// convertir des négatifs en positifs?
		liste2.replaceAll(e->Math.abs(e));
		System.out.println(liste2);
	

	}

}
