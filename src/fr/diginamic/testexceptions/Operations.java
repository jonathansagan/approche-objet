package fr.diginamic.testexceptions;

public class Operations {
	double diviser(int a, int b) throws Exception{
		if (b == 0) {
		throw new Exception ("Il est interdit de diviser par 0! gros naze")	;
		}
		return a / b;

	}
}
