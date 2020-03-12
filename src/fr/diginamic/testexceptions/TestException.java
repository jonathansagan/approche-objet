package fr.diginamic.testexceptions;

public class TestException {

	public static void main(String[] args) {

		Operations operation = new Operations();
		
		try {
			double resultat = operation.diviser(4, 2);
			System.out.println("résulat 1 : "+ resultat);
			double resultat2 = operation.diviser(3, 0);
			System.out.println("résultat 2 : " + resultat2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
