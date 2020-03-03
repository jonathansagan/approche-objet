package essai;

import entites.AdressePostale;

public class TestAdressePostale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdressePostale a1 = new AdressePostale(15, "du chat", 35000, "Rennes");

		AdressePostale a2 = new AdressePostale(2, "du chien", 44000, "Nantes");

		System.out.println("L'adresse a1 est : "+a1.numRue+" rue "+a1.rue+" "+a1.codePostal+" "+a1.ville);

		System.out.println("L'adresse a2 est : "+a2.numRue+" rue "+a2.rue+" "+a2.codePostal+" "+a2.ville);

	}
	
}
