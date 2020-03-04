package fr.diginamic.banque.entites;

public class TestOperation {

	public static void main(String[] args) {
		// création du tableau contenant 4 opérations
		Operation[] ops = new Operation[4];
		ops[0] = new Debit(50.0, "03/03/2020");
		ops[1] = new Credit(150.0, "03/03/2020");
		ops[2] = new Debit(99.0, "04/03/2020");
		ops[3] = new Credit(1850.0, "04/03/2020");

		double soldeGlobal = 0.0;
		for (int i = 0; i < ops.length; i++) {
			System.out.println(ops[i]);
			if (ops[i].afficherType().equals("Débit")) {
				soldeGlobal -= ops[i].getMontant();
			} else {
				soldeGlobal += ops[i].getMontant();
			}

		}
		System.out.println("Votre solde s'élève à : "+soldeGlobal+" €");
	}
}
