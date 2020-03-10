package fr.diginamic.recensement;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

import org.apache.commons.io.FileUtils;

public class Application {

	public static void main(String[] args) throws IOException {
		/*
		 * // Pour la population, avant la conversion en int, il faut d’abord supprimer
		 * les // espaces qui se trouvent à l’intérieur. int populationTotale =
		 * Integer.parseInt(population.replace(" ", "").trim()); // On cree enfin la
		 * ville avec toutes les données utiles Ville ville = new Ville(codeRegion,
		 * nomRegion, codeDepartement, codeCommune, nomCommune, populationTotale);
		 */
		// Lecture du fichier :
		File file = new File("C:/temp/recensement population 2016.csv");
		List<String> lignes = FileUtils.readLines(file, "UTF-8");

		List<Ville> villes = new ArrayList<Ville>();

		for (int ligne = 1; ligne < lignes.size(); ++ligne) {

			String[] morceaux = lignes.get(ligne).split(";");
			String codeRegion = morceaux[0];
			String nomRegion = morceaux[1];
			String codeDepartement = morceaux[2];
			String codeCommune = morceaux[5];
			String nomCommune = morceaux[6];
			String population = morceaux[7];

			int populationTotale = Integer.parseInt(population.replace(" ", ""));

			// On cree maintenant la ville avec toutes ses données
			Ville ville = new Ville(codeRegion, nomRegion, codeDepartement, codeCommune, nomCommune, populationTotale);

			// On ajoute la ville à la liste des villes
			villes.add(ville);
		}
		// Etape 3 : Recherche et affichage de Montpellier
		for (int i = 0; i < villes.size(); i++) {
			if (villes.get(i).getNom().equals("Montpellier")) {
				System.out.println(villes.get(i));
			}
		}
		// Etape 4 : Recherche et affichage de la population du 34
		int popDept = 0;
		for (int i = 0; i < villes.size(); i++) {
			Ville v = villes.get(i);
			if (v.getCodeDepartement().equals("34")) {
				popDept += v.getPopulation();
			}
		}
		System.out.println("Population du département 34 : " + popDept + " habitants");

		// Etape 5 : Recherche et affichage de la plus petite ville du 34
		int popMin = Integer.MAX_VALUE;
		Ville villeMin = null;
		for (int i = 0; i < villes.size(); i++) {
			Ville v = villes.get(i);
			if (v.getCodeDepartement().equals("34") && v.getPopulation() < popMin) {
				popMin = v.getPopulation();
				villeMin = v;
			}
		}
		System.out.println("Plus petite ville du département :" + villeMin);

		// Etape 7 : Afficher la population d'occitanie
		int popRegion = 0;
		for (int i = 0; i < villes.size(); i++) {
			Ville v = villes.get(i);
			if (v.getNomRegion().equals("Occitanie")) {
				popRegion += v.getPopulation();
			}
		}
		System.out.println("Population de la région Occitanie : " + popRegion);
		
	}

}