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
	 * Q1 : Dans la classe Personne, ajoutez une méthode qui permet d’afficher le
	 * nom et le prénom avec le nom de famille en majuscules.
	 */

	public void afficheridentite() {
		System.out.println("prenom" + " " + nom.toUpperCase());
	}
	/*
	 * Q2Dans la classe Personne, ajoutez une méthode qui prend un argument en
	 * paramètre et permet de modifier la variable d’instance nom de Personne.
	 */

	public void SetNom(String nvNom) { // Set = setter permettent de modif les attributs d'instance)
		nom = nvNom;
	}
	/*
	 * Q3 : Dans la classe Personne, ajoutez une méthode similaire pour modifier le
	 * prénom.
	 */

	public void SetPrenom(String nvPrenom) {
		prenom = nvPrenom;
	}

	/*
	 * Q4 : Dans la classe Personne, ajoutez une méthode similaire pour modifier
	 * l’adresse.
	 */

	public void SetAdresse(AdressePostale nvAd) {
		adresse = nvAd;
	}
	/* Q5 : Dans la classe Personne, ajoutez une méthode qui retourne le nom. */

	public String getNom() {
		return nom;
	}
	/* Q6 : Dans la classe Personne, ajoutez une méthode qui retourne le prénom. */

	public String getPrenom() {
		return prenom;
	}

	/* Q7 : Dans la classe Personne, ajoutez une méthode qui retourne l'adresse. */

	public AdressePostale getAdresse() {
		return adresse;
	}

}
