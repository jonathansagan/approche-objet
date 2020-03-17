package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		CalculMoyenne calculateurMoyenne = new CalculMoyenne();
		
		calculateurMoyenne.ajout(20);
		calculateurMoyenne.ajout(15);
		calculateurMoyenne.ajout(20);

		double result = calculateurMoyenne.calcul();
		System.out.println("La moyenne de vos saisies est de : " + result);
	}

}
