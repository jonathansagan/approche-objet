package fr.diginamic.chaines;

import entites.Personne;
import fr.diginamic.banque.entites.Compte;

public class ManipulationChaine {

	public static void main(String[] args) {
		String chaine = "Durand;Marcel;012543;1 523.5";
		
		// méthode permettant d'identifier le premier caractère
		char premierCaractere = chaine.charAt(0); 
		System.out.println("Premier caractère: " + premierCaractere);

		// méthode pour identifier la longueur de la chaîne (; et "_" compris)
		int longueurChaine = chaine.length();
		System.out.println("La longueur de la chaîne est de : " + longueurChaine);
		
		/*méthode indexOf(char c) pour afficher l’index du premier « ; » contenu dans
		*la chaine de caractères.*/
		int indexChaine = chaine.indexOf(';');
		System.out.println("Le premier index de la chaîne est de : " + indexChaine);
		// = System.out.println("Le premier index de la chaîne est de : " + chaine.indexOf(';'));
		// indique 6 car 7ème position, index débutent à 0
		System.out.println("Le premier index de la chaîne est de : " + chaine.indexOf(';'));
		
		/* La méthode substring(int start, int end) permet d’extraire une portion de chaine de
caractères comprise entre un index de début et un index de fin (exclu)*/
		
		/*Combinez la méthode substring et indexOf pour extraire le nom de famille de la
personne.*/
		String nomFamille = chaine.substring(0, indexChaine);
		System.out.println("Le nom de famille est  : " + nomFamille);
		
		/* méthode toUpperCase() pour afficher le nom de famille en majuscules*/
		String nomMaj = nomFamille.toUpperCase();
		System.out.println("Le nom de famille en majuscule est : " + nomMaj);
		
		/* méthode toLowerCase() pour afficher le nom de famille en minuscule*/
		String nomMin = nomFamille.toLowerCase();
		System.out.println("Le nom de famille en minuscule est : " + nomMin);
		
		 /*la méthode split pour découper la chaine de caractères en morceaux*/
		String[] decoupe = chaine.split(";");
		for (int i = 0; i < decoupe.length; i++) {
			System.out.println("Morceau n°" + i + " : " + decoupe[i]);
		}
		/*Creez une instance et Client et de Compte à partir des éléments issus du découpage de
la chaine de caractères.*/
		
			
				
		Client client1 = new Client(decoupe[0], decoupe[1]);
		Compte c  = new Compte(String.valueOf(decoupe[2]), Double.parseDouble(decoupe[3].replace(" ", "")));
		System.out.println("Le client : " +client1.nom + " " + client1.prenom);
		System.out.println(c);

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
