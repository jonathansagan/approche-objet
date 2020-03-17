package fr.diginamic.recensement;

/** Réalisation d'une ville
 * @author Jonathan
 *
 */
public class Ville {
	/** codeRegion */
	/** nomRegion */
	/** codeDepartement */
	/** codeCommune */
	/** nomCommune */
	/** population */
	
	String codeRegion;	
	String nomRegion;	
	String codeDepartement;	
	String codeVille;	
	String nom;	
	int population;
	
	

	/** Constructeur de la ville
	 * @param nomRegion
	 * @param codeDepartement
	 * @param codeCommune
	 * @param nomCommune
	 * @param populationTotale
	 */
	public Ville(String codeRegion, String nomRegion, String codeDepartement, String codeVille, String nom, int population) {
		super();
		this.codeRegion=codeRegion;
		this.nomRegion=nomRegion;
		this.codeDepartement=codeDepartement;
		this.codeVille = codeVille;
		this.nom = nom;
		this.population = population;
	}
	
	@Override
	public String toString(){
		return nom + " " + codeDepartement + " " + nomRegion + ":" + population +" hab.";
	}

	/** Getter
	 * @return the codeRegion
	 */
	public String getCodeRegion() {
		return codeRegion;
	}

	/** Setter
	 * @param codeRegion the codeRegion to set
	 */
	public void setCodeRegion(String codeRegion) {
		this.codeRegion = codeRegion;
	}

	/** Getter
	 * @return the nomRegion
	 */
	public String getNomRegion() {
		return nomRegion;
	}

	/** Setter
	 * @param nomRegion the nomRegion to set
	 */
	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	/** Getter
	 * @return the codeDepartement
	 */
	public String getCodeDepartement() {
		return codeDepartement;
	}

	/** Setter
	 * @param codeDepartement the codeDepartement to set
	 */
	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
	}

	/** Getter
	 * @return the codeVille
	 */
	public String getCodeVille() {
		return codeVille;
	}

	/** Setter
	 * @param codeVille the codeVille to set
	 */
	public void setCodeVille(String codeVille) {
		this.codeVille = codeVille;
	}

	/** Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter
	 * @return the population
	 */
	public int getPopulation() {
		return population;
	}

	/** Setter
	 * @param population the population to set
	 */
	public void setPopulation(int population) {
		this.population = population;
	}

}