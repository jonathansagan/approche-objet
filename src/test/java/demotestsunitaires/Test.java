package demotestsunitaires;

import static org.junit.Assert.*;

import demoTest.IncorrectParameterException;
import demoTest.StringUtils;

public class Test {
//Test 1
	@org.junit.Test
	public void testLevenshteinDistance() {
		int resultat;
		try {
			resultat = StringUtils.levenshteinDistance("voie", "voile");
			assertEquals(1, resultat);
		} catch (IncorrectParameterException e) {
			fail();
		}
	}

	// Test 2
	@org.junit.Test(expected = IncorrectParameterException.class)
	public void testLevenshteinDistanceAuxLimites() throws IncorrectParameterException {
		StringUtils.levenshteinDistance(null, "violon");
	}

}
