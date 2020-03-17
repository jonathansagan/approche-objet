package fr.diginamic.salaire;

import fr.diginamic.salaire.*;
public class TestIntervenant {

	public static void main(String[] args) {
		
		Salarie s1 = new Salarie ("Harry", "Potter", 1950);
		System.out.println("Le salaire du salarié est de : "+s1.getSalaire()+" €");
		s1.afficherDonnees();
		Pigiste p1 = new Pigiste("Drago", "Malfoy", 40.2,5);
		System.out.println("Le salaire du pigiste est de : "+p1.getSalaire()+" €");
		p1.afficherDonnees();

	}

}
