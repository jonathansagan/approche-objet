package fr.diginamic.banque.entites;

public class Credit extends Operation {

	public Credit(double montant, String date) {
		super(montant, date);
	}

	public String toString() {// ici string to string permettra de visualiser correcement le contenu de compte
		return "Crédit de +" + montant + " €" + " le " + date;
	}

	@Override
	public String afficherType() {

		return "Crédit";
	}
}
