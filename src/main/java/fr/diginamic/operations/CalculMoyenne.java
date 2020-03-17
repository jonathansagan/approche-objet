package fr.diginamic.operations;//exercice4

/**
 * @author Jonathan
 *
 */
public class CalculMoyenne {
double tab[];

/** Constructeur
 * @param on initioe un tableau de longueur 0
 */
public CalculMoyenne() {	
	this.tab = new double [0];
}

/**Méthode permettant d'ajouter un nbre
 * @param nbrAjoute = nombre à ajouter
 */
public void ajout(double nbrAjoute) {
	// On est obligé d'agrandir le tableau initial de 1 à chaque ajout
			// d'un nouveau nombre
			
			// Création d'un nouveau tableau temporaire appelé nvTab
			// qui a la taille de tab+1
			double[] nvTab = new double[tab.length+1];
			
			// nvTab prendra les nouvelles valeurs de tab
			for (int i=0; i<tab.length; i++){
				nvTab[i]=tab[i];
			}
			
			// On place en dernière position dans le nouveau tableau le nouveau
			// nombre
			nvTab[nvTab.length-1] = nbrAjoute;
			
			// Enfin on affecte nvTab à tab
			this.tab=nvTab;
} 

/**méthode de calcul de la moyenne
 * @return la moyenne du tableau
 */
public double calcul() {
	double somme = 0; // on initie la somme à 0

	for (int i = 0; i < this.tab.length; i++) {
		somme = somme + this.tab[i];
	}

	return (somme / this.tab.length);
}
}



