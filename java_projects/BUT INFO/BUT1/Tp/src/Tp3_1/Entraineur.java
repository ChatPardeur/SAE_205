package Tp3_1;

public class Entraineur extends Personne
{
	private int num_licence;
	public Entraineur(String n, String p, String adr, int n_l) 
	{
		super(n, p, adr);
		this.num_licence = n_l;
	}
	
	public void afficher()
	{
		System.out.println("entraîneur : " + super.toString());
		System.out.println("licence de l'entraîneur n°" + this.num_licence);
	}
	
	public static void main(String[] args) 
	{
		Jockey j = new Jockey("Flantier", "Noël", "ici", 70, 2100);
		Entraineur e = new Entraineur("zad", "fveg", "là", 2457);
		
		j.afficher();
		e.afficher();
	}

	public int getNum_licence() {
		return num_licence;
	}

	public void setNum_licence(int num_licence) {
		this.num_licence = num_licence;
	}
	
	
}
