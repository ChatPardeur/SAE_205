package Td4;

public class Zoo 
{
	public Zoo() 
	{
		
	}
	
	public static void main(String[] args) 
	{
		Lion l = new Lion();
		Chouette c = new Chouette();
		Ane a = new Ane();
		
		l.afficher();
		l.cri();
		c.afficher();
		c.cri();
		a.afficher();
		a.cri();
	}
}
