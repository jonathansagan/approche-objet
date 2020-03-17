package demotestsunitaires;

import static org.junit.Assert.*;

import demoTest.StringUtils;

public class Test {

	@org.junit.Test
	public void testLevenshteinDistance() {
		int resultat = StringUtils.levenshteinDistance("voie","voile");
		
		assertEquals(1, resultat);
	}
	
	@org.junit.Test
	public void testLevenshteinDistance2() {
		int resultat2 = StringUtils.levenshteinDistance(null,null);
		
		assertEquals(1, resultat2);
	}

}
