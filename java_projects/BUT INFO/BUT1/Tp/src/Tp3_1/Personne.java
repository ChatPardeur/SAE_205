package Tp3_1;

public class Personne 
{
	private String nom;
	private String prenom;
	private String adresse;
	
	public Personne(String n, String p, String adr) 
	{
		this.nom = n;
		this.prenom = p;
		this.adresse = adr;
	}
	
	public String toString() 
	{
		return this.nom + " " + this.prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
}
