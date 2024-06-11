package Tp4;

public class Cercle extends FormeGeometrique implements Dessinable, Comparable
{
	private double rayon;
	private String couleur;
	
	public Cercle(double x, double y, double r) 
	{
		super(x,y);
		this.rayon = r;
	}
	
	public void afficher()
	{
		System.out.println("cercle");
		System.out.println(super.toString());
	}
	
	public double surface()
	{
		return rayon*rayon * Math.PI;
	}
	
	public double perimetre()
	{
		return 2 * Math.PI * rayon;
	}
	
	public void dessiner(String couleur)
	{
		System.out.println("un cercle de couleur " + couleur);
	}
	
	public int compareTo(Object autre)
	{
		Cercle c2 = (Cercle) autre;
		return (int)(this.surface() - c2.surface());
	}
}
