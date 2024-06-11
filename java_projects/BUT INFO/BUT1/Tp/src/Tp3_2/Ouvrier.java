package Tp3_2;

public class Ouvrier extends Employe
{
	private int Nb_H_O;
	
	public Ouvrier(String nom, int age, int nb_a)
	{
		super(nom, age, nb_a);
		this.Nb_H_O = 35;
	}
	
	public int calculSalaire()
	{
		return 4 * Nb_H_O * (10 + this.getNb_A() /2);
	}
	
	public void afficher()
	{
		System.out.println("ouvrier");
		super.afficher();
		System.out.println("salaire : " + calculSalaire() + "€");
	}
}
