package Td3;

public class Entreprise 
{
	private String nom;
	private Personne comptable;
	
	public Entreprise(String nom, Personne comptable)
	{
		this.nom = nom;
		this.comptable = comptable;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Personne getComptable() {
		return comptable;
	}
	public void setComptable(Personne comptable) {
		this.comptable = comptable;
	}
	
	public String Tostring()
	{
		return this.nom + " gérée par " + comptable.toString();
	}
	
	public void afficher()
	{
		System.out.println("entreprise : " + this.nom + this.comptable.toString());
	}
}
