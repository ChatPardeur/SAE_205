package Td4;

public abstract class Animal 
{
	static int numero = 1;
	private int num_animal;
	
	public Animal() 
	{
		this.num_animal = numero;
		numero++;
	}

	public int getNum_animal() 
	{
		return num_animal;
	}
	
	abstract void cri();
	abstract void afficher();
}
