package fr.diginamic.chaines;

import entites.Personne;
import fr.diginamic.banque.entites.Compte;

public class ManipulationChaine {

	public static void main(String[] args) {
		String chaine = "Durand;Marcel;012543;1 523.5";
		
		// m�thode permettant d'identifier le premier caract�re
		char premierCaractere = chaine.charAt(0); 
		System.out.println("Premier caract�re: " + premierCaractere);

		// m�thode pour identifier la longueur de la cha�ne (; et "_" compris)
		int longueurChaine = chaine.length();
		System.out.println("La longueur de la cha�ne est de : " + longueurChaine);
		
		/*m�thode indexOf(char c) pour afficher l�index du premier � ; � contenu dans
		*la chaine de caract�res.*/
		int indexChaine = chaine.indexOf(';');
		System.out.println("Le premier index de la cha�ne est de : " + indexChaine);
		// = System.out.println("Le premier index de la cha�ne est de : " + chaine.indexOf(';'));
		// indique 6 car 7�me position, index d�butent � 0
		System.out.println("Le premier index de la cha�ne est de : " + chaine.indexOf(';'));
		
		/* La m�thode substring(int start, int end) permet d�extraire une portion de chaine de
caract�res comprise entre un index de d�but et un index de fin (exclu)*/
		
		/*Combinez la m�thode substring et indexOf pour extraire le nom de famille de la
personne.*/
		String nomFamille = chaine.substring(0, indexChaine);
		System.out.println("Le nom de famille est  : " + nomFamille);
		
		/* m�thode toUpperCase() pour afficher le nom de famille en majuscules*/
		String nomMaj = nomFamille.toUpperCase();
		System.out.println("Le nom de famille en majuscule est : " + nomMaj);
		
		/* m�thode toLowerCase() pour afficher le nom de famille en minuscule*/
		String nomMin = nomFamille.toLowerCase();
		System.out.println("Le nom de famille en minuscule est : " + nomMin);
		
		 /*la m�thode split pour d�couper la chaine de caract�res en morceaux*/
		String[] decoupe = chaine.split(";");
		for (int i = 0; i < decoupe.length; i++) {
			System.out.println("Morceau n�" + i + " : " + decoupe[i]);
		}
		/*Creez une instance et Client et de Compte � partir des �l�ments issus du d�coupage de
la chaine de caract�res.*/
		
			
				
		Client client1 = new Client(decoupe[0], decoupe[1]);
		Compte c  = new Compte(String.valueOf(decoupe[2]), Double.parseDouble(decoupe[3].replace(" ", "")));
		System.out.println("Le client : " +client1.nom + " " + client1.prenom);
		System.out.println(c);

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
