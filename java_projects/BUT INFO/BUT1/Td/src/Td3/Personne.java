package Td3;


class Personne{
	private String nom, prenom, adresse;

	
	Personne(String nom, String prenom, String adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}
	
	public String toString()
	{
		return nom+" "+" "+prenom+" "+adresse;
	}
	
	public void afficher()
	{
		System.out.println("Nom : "+nom);
		System.out.println("Prénom : "+prenom);
		System.out.println("Adresse : "+adresse);
	}
	
	public String getNom()
	{
		return nom+" "+prenom;
	}
	
	public static void main(String[] args) {
		Personne p = new Personne("ce", "der", "ad");
		
	}

}