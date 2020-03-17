package entites;

public class Personne {

	public String nom;
	public String prenom;
	public AdressePostale adresse;

	// 2eme constructeur

	/**
	 * Constructeur
	 * 
	 * @param nom
	 * @param prenom
	 * @param adresse
	 */
	public Personne(String nom, String prenom, AdressePostale adresse) {

		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}

	// TP 3
	/*
	 * Q1 : Dans la classe Personne, ajoutez une m�thode qui permet d�afficher le
	 * nom et le pr�nom avec le nom de famille en majuscules.
	 */

	public void afficheridentite() {
		System.out.println("prenom" + " " + nom.toUpperCase());
	}
	/*
	 * Q2Dans la classe Personne, ajoutez une m�thode qui prend un argument en
	 * param�tre et permet de modifier la variable d�instance nom de Personne.
	 */

	public void SetNom(String nvNom) { // Set = setter permettent de modif les attributs d'instance)
		nom = nvNom;
	}
	/*
	 * Q3 : Dans la classe Personne, ajoutez une m�thode similaire pour modifier le
	 * pr�nom.
	 */

	public void SetPrenom(String nvPrenom) {
		prenom = nvPrenom;
	}

	/*
	 * Q4 : Dans la classe Personne, ajoutez une m�thode similaire pour modifier
	 * l�adresse.
	 */

	public void SetAdresse(AdressePostale nvAd) {
		adresse = nvAd;
	}
	/* Q5 : Dans la classe Personne, ajoutez une m�thode qui retourne le nom. */

	public String getNom() {
		return nom;
	}
	/* Q6 : Dans la classe Personne, ajoutez une m�thode qui retourne le pr�nom. */

	public String getPrenom() {
		return prenom;
	}

	/* Q7 : Dans la classe Personne, ajoutez une m�thode qui retourne l'adresse. */

	public AdressePostale getAdresse() {
		return adresse;
	}

}
