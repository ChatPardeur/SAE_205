package Tp3_1;

public class Jockey extends Personne
{
	private float poids;
	private float salaire;
	
	public Jockey(String n, String p, String adr, float poids, float salaire) 
	{
		super(n, p,adr);
		this.poids = poids;
		this.salaire = salaire;
	}
	
	public void afficher()
	{
		System.out.println("nom du jockey : " + super.toString());
		System.out.println("poids du jockey : " + this.poids + " Kg");
		System.out.println("salaire du jockey : " + this.salaire + " €");
	}

	public float getPoids() {
		return poids;
	}

	public void setPoids(float poids) {
		this.poids = poids;
	}

	public float getSalaire() {
		return salaire;
	}

	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}
	
	
}
