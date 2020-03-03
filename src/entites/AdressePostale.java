package entites;

public class AdressePostale {
	public int numRue;
	public String rue;
	public int codePostal;
	public String ville;

	public AdressePostale(int numRue, String rue, int codePostal, String ville) {
		super();
		this.numRue = numRue;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
	}
}
