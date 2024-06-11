package Td2;

public class Domino {
	
	private int gauche;
	private int droite;
	
	@Override
	public String toString() {
		return "Domino [gauche=" + gauche + ", droite=" + droite + "]";
	}
	
	public Domino(int gauche, int droite) {
		super();
		this.gauche = gauche;
		this.droite = droite;
	}
	
	public Domino()
	{
		int min = 1;
		int max = 7;
		
		this.gauche = (int)(Math.random() * (max-min)+1);
		this.droite = (int)(Math.random() * (max-min)+1);
	}

	public static void main(String[] args) 
	{
		Domino d = new Domino();
		d.afficher();
		d.inverser();
		d.afficher();
	}
	
	public int getGauche()
	{
		return gauche;
	}
	
	public int getDroite()
	{
		return droite;
	}
	
	public void afficher()
	{
		System.out.println(this);
	}

	
	public void inverser()
	{
		int temp = this.gauche;
		this.gauche = this.droite;
		this.droite = temp;
	}
}
