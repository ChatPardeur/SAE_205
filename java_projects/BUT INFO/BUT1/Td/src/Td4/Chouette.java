package Td4;

public class Chouette extends Animal
{
	public Chouette() 
	{
		super();
	}
	
	public void cri()
	{
		System.out.println("HouHou");
	}
	
	public void afficher()
	{
		System.out.println(this.getNum_animal() + " c'est une chouette");
	}
}