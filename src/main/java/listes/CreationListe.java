package listes;

import java.util.ArrayList;

public class CreationListe {

	public static void main(String[] args) {
		ArrayList<Integer> numero = new ArrayList<>();
		for (int nombre = 1; nombre < 101; nombre++) {
			numero.add(nombre);
		}
		System.out.println("La taille de la liste de numéros est de : "+ numero.size());
	}
}
