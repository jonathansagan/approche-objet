package fr.diginamic.testexceptions;

public class Operations {
//	Exercice 1
//		double diviser(int a, int b) throws Exception{
//		if (b == 0) {
//		throw new Exception ("Il est interdit de diviser par 0! gros naze")	;
//		}
//		return a / b;
//
//	}
	
	// exercice 2 runtime
	double diviserRunTime(int a, int b) {
		if (b == 0) {
		throw new DivException ("Il est interdit de diviser par 0! gros naze")	;
		}
		return a / b;

	}
	
}
