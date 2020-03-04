package fr.diginamic.banque.entites;

public class Debit extends Operation {

	public Debit(double montant, String date) {
		super(montant, date);		
	}
	public String toString(){// ici string to string permettra de visualiser correcement le contenu de compte
		return "Débit de -"+montant + " €"+ " le " +date;}
	
	
	@Override
	public String afficherType() {
		
		return "Débit";
	}
}
