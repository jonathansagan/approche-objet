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

/**M�thode permettant d'ajouter un nbre
 * @param nbrAjoute = nombre � ajouter
 */
public void ajout(double nbrAjoute) {
	// On est oblig� d'agrandir le tableau initial de 1 � chaque ajout
			// d'un nouveau nombre
			
			// Cr�ation d'un nouveau tableau temporaire appel� nvTab
			// qui a la taille de tab+1
			double[] nvTab = new double[tab.length+1];
			
			// nvTab prendra les nouvelles valeurs de tab
			for (int i=0; i<tab.length; i++){
				nvTab[i]=tab[i];
			}
			
			// On place en derni�re position dans le nouveau tableau le nouveau
			// nombre
			nvTab[nvTab.length-1] = nbrAjoute;
			
			// Enfin on affecte nvTab � tab
			this.tab=nvTab;
} 

/**m�thode de calcul de la moyenne
 * @return la moyenne du tableau
 */
public double calcul() {
	double somme = 0; // on initie la somme � 0

	for (int i = 0; i < this.tab.length; i++) {
		somme = somme + this.tab[i];
	}

	return (somme / this.tab.length);
}
}



