package essai;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		AdressePostale a1 = new AdressePostale(25, "rue des pervenches", 29470, "Plougastel-Daoulas");
		Personne p1 = new Personne("Dupont", "Antoine", a1);

		AdressePostale a2 = new AdressePostale(2, "du chien", 44000, "Nantes");
		Personne p2 = new Personne("Dup", "Paul", a2);

	}

}
