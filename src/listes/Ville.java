package listes;

import java.util.ArrayList;
import java.util.Arrays;

public class Ville {

	/** nom = nom de la ville */
	String nom;
	/** nbHab = nombre d'habitants */
	int nbHab;

	public static void main(String[] args) {
		//Nice, 343 000 hab.
		//o Carcassonne, 47 800 hab.
		//o Narbonne, 53 400 hab.
		//o Lyon, 484 000 hab.
		//o Foix, 9 700 hab.
		//o Pau, 77 200 hab.
		//o Marseille, 850 700 hab.
		//o Tarbes, 40 600 hab.
ArrayList<Ville> liste = new ArrayList<>();
		
		Ville ville1 = new Ville("Nice",343_000);
		Ville ville2 = new Ville("Carcassone",47_800);
		Ville ville3 = new Ville("Narbonne",53_400);
		Ville ville4 = new Ville("Lyon",484_000);
		Ville ville5 = new Ville("Foix",9_700);
		Ville ville6 = new Ville("Pau",77_200);
		Ville ville7 = new Ville("Marseille",850_700);
		Ville ville8 = new Ville("Tarbes",40_600);
		
		liste.addAll(Arrays.asList(ville1,ville2,ville3,ville4,ville5,ville6,ville7,ville8));
		int max = ville1.getNbHab();
		String maxVille = ville1.getNom();
		for (Ville ville : liste) {
			if (ville.getNbHab() >= max) {
				max = ville.getNbHab();
				maxVille = ville.getNom();
			}	
		}
		System.out.println("Ville la plus peuplée : " + maxVille);
		
		int index = 0;
		int min = ville1.getNbHab();
		for (int i = 0; i < liste.size(); ++i) {
			if (liste.get(i).getNbHab() <= min) {
				min = liste.get(i).getNbHab();
				index = i;
			}	
		}
		liste.remove(index);
		
		for (Ville ville : liste) {
			if (ville.getNbHab() > 100_000) {
				ville.setNom(ville.getNom().toUpperCase());
			}
		}
		
		for (Ville ville : liste) {
			System.out.println(ville);
		}
		
	}
	@Override
	public String toString() {
		return nom + " " +nbHab;
	}


	/** Constructeur
	 * @param nom
	 * @param nbHab
	 */
	public Ville(String nom, int nbHab) {
		super();
		this.nom = nom;
		this.nbHab = nbHab;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbHab() {
		return nbHab;
	}

	public void setNbHab(int nbHab) {
		this.nbHab = nbHab;
	}
	

}
