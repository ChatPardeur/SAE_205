package Td4;

public class Ane extends Animal
{
	public Ane() 
	{
		super();
	}
	
	public void cri()
	{
		System.out.println("HiHan");
	}
	
	public void afficher()
	{
		System.out.println(this.getNum_animal() + " c'est un âne");
	}
}
