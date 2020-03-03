package entites;

public class AdressePostale {
	public int numeroRue;
	public String rue;
	public int codePostal;
	public String ville;
	
// constructeurs : (on peut faire source>générer constructeur)
	public AdressePostale(int n, String rue, int codePostal, String ville) {
		// = contructeur en bas
		this.numeroRue = n;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
	}
}
