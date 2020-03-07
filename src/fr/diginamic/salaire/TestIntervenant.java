package fr.diginamic.salaire;

import fr.diginamic.salaire.*;
public class TestIntervenant {

	public static void main(String[] args) {
		
		Salarie s1 = new Salarie ("Harry", "Potter", 1950);
		System.out.println("Le salaire du salarié "+ s1+ "est de : "+s1.getSalaire()+"€");
		Pigiste p1 = new Pigiste("Drago", "Malfoy", 40.2,4);
		System.out.println("Le salaire du pigiste "+ p1+ "est de : "+p1.getSalaire()+"€");

	}

}
