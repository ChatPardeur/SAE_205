package Tp3_2;

public class Gerant extends Employe
{
	private int Nb_H_G;
	public Gerant(String nom, int age, int nb_a) 
	{
		super(nom, age, nb_a);
		this.Nb_H_G = 30;
	}
	
	public int calculSalaire()
	{
		return 5 * Nb_H_G * (20 + this.getNb_A() /2);
	}
	
	public void afficher()
	{
		System.out.println("gérant");
		super.afficher();
		System.out.println("salaire : " + calculSalaire() + "€");
	}
}