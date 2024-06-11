package Tp4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ListeRectangles 
{
	private ArrayList<Rectangle> liste;
	final int MAX = 10;
	public ListeRectangles() 
	{
		this.liste = new ArrayList<Rectangle>();
	}
	
	public void ajouter(Rectangle r)
	{
		this.liste.add(r);
	}
	
	public void afficher()
	{
		Iterator<Rectangle> it = liste.iterator();
		
		while (it.hasNext())
		{
			System.out.println("---------------------------");
			it.next().afficher();
		}
	}
	
	public void trier()
	{
		Rectangle []Tr = new Rectangle[MAX];
		int nb = liste.size();
		liste.toArray(Tr);
		
		Arrays.sort(Tr, 0, nb);
		
		this.liste.toArray();
		
		this.liste = new ArrayList<Rectangle>();
		for (int i=0; i<nb; i++)
		{
			this.liste.add(Tr[i]);
		}
	}
	
	public static void main(String[] args) 
	{
		ListeRectangles l = new ListeRectangles();
		l.ajouter(new Rectangle(1.2, 2, 10, 2));
		l.ajouter(new Rectangle(5, 1, 1, 1));
		l.ajouter(new Rectangle(8, 7, 6, 5));
		
		l.afficher();
		l.trier();
		l.afficher();
	}
}
