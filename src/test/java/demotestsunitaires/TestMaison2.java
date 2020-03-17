package demotestsunitaires;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import demoTest.IncorrectParameterException;
import demoTest.StringUtils;
import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.WC;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.PieceException;

public class TestMaison2 {

	private static final double Delta = 0.000001;
	private Maison maison;

	@Before
	public void initialisationMaison() throws PieceException {
		maison = new Maison();
		maison.ajouterPiece(new Chambre(10.0,1));
		maison.ajouterPiece(new Cuisine(14.0,0));
		maison.ajouterPiece(new WC(1.0,0));
		maison.ajouterPiece(new Salon(25.0,0));
	}
	

	@Test
	public void testAjouterPiece() {
		int piece = maison.getPieces().length;
		assertEquals(4, piece);
	}
	// Test si null
	@Test(expected = PieceException.class)
	public void testAjouterPieceNomNominal() throws PieceException{
		maison.ajouterPiece(null);
	}


	@Test
	public void testSuperficieEtage() {
		double superficie = maison.superficieEtage(1);
		assertEquals(10.0, superficie, Delta);
	}

	@Test
	public void testCalculerSurface() {
		double surface = maison.calculerSurface();
		assertEquals(50.0, surface, Delta);
	}

}
