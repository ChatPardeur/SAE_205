package Tp3_1;

public class Cheval 
{
	static int nbInscriptions = 0;
	
	private String nom;
	private boolean male;
	private String race;
	private int num_inscription;
	
	public Cheval(String nom, boolean male, String race) 
	{
		nbInscriptions++;
		this.num_inscription = nbInscriptions;
		
		this.nom = nom;
		this.male = male;
		this.race = race;
	}
	
	public String toString()
	{
		return "n°" + Integer.toString(num_inscription) + " " + this.nom;
	}
	
	public void afficher()
	{
		System.out.println(this);
		if(this.male)
		{
			System.out.println("mâle de race " + this.race);
		}
		else
		{
			System.out.println("femelle de race " + this.race);
		}
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public boolean isMale() {
		return male;
	}

	public void setMale(boolean male) {
		this.male = male;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public int getNum_inscription() {
		return num_inscription;
	}

	public void setNum_inscription(int num_inscription) {
		this.num_inscription = num_inscription;
	}
	
	
}
