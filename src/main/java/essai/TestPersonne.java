package essai;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		AdressePostale a1 = new AdressePostale(25, "rue des pervenches", 29470, "Plougastel-Daoulas");
		Personne p1 = new Personne("Dupont", "Antoine", a1);

		AdressePostale a2 = new AdressePostale(2, "du chien", 44000, "Nantes");
		Personne p2 = new Personne("Dup", "Paul", a2);

		/*
		 * TP3.Q7 : Modifier la classe TestPersonne de manière à o utiliser le
		 * constructeur avec arguments de la classe Personne pour valoriser les
		 * attributs nom et prenom o utiliser la méthode qui permet de modifier
		 * l’adresse pour valoriser l’adresse.
		 */
		
		String Nom1 = p1.getNom();
		System.out.println(Nom1);

		String Prenom1 = p1.getPrenom();
		System.out.println(Prenom1);
		
		AdressePostale Adr1 = p1.getAdresse();
		System.out.println(Adr1);
	}

}
