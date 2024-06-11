package Tp3_1;

import java.util.ArrayList;
import java.util.Iterator;

public class LesSports 
{
	private ArrayList<Sport> listeSports;
	private int max;
	
	public LesSports(int max) 
	{
		this.listeSports = new ArrayList<Sport>(max);
		this.max = max;
	}
	
	public void afficher()
	{
		Iterator<Sport> it = this.listeSports.iterator();
		
		while(it.hasNext()) 
		{
			it.next().afficher();
		}
	}
	
	public void ajouterSport(Sport s)
	{
		if (this.listeSports.size() == this.max)
		{
			System.out.println("erreur, la liste est pleine");
		}
		else
		{
			this.listeSports.add(s);
		}
		
	}
}
