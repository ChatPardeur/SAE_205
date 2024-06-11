package Tp4;

public class Rectangle extends FormeGeometrique implements Dessinable, Comparable
{
	private float longueur;
	private float largeur;

	public Rectangle(double x, double y, float longueur, float largeur) 
	{
		super(x,y);
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	public void afficher()
	{
		System.out.println("rectangle");
		System.out.println(super.toString());
	}
	
	public double surface()
	{
		return this.longueur * this.largeur;
	}
	
	public double perimetre()
	{
		return this.longueur * 2 + this.largeur * 2;
	}
	
	public void dessiner(String couleur)
	{
		System.out.println("un rectangle de couleur " + couleur);
	}
	
	public int compareTo(Object autre)
	{
		Rectangle c2 = (Rectangle) autre;
		return Double.compare(this.surface(), c2.surface());
	}
}
