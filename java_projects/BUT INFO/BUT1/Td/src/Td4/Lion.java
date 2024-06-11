package Td4;

public class Lion extends Animal
{
	public Lion() 
	{
		super();
	}
	
	public void cri()
	{
		System.out.println("Miaou");
	}
	
	public void afficher()
	{
		System.out.println(this.getNum_animal() + " c'est un lion");
	}
}
