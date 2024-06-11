package Tp3_2;
import java.util.ArrayList;
import java.util.Iterator;


public class ListeEmployes 
{
	private ArrayList<Employe> employes;
	
	public ListeEmployes() 
	{
		this.employes = new ArrayList<Employe>();
	}
	
	public void ajouterEmploye(Employe e)
	{
		if(employes.contains(e))
		{
			System.out.println("l'employé est déjà dans la liste");
		}
		else
		{
			this.employes.add(e);
			System.out.println("employé ajouté");
		}
	}
	
	public void echange(int i1, int i2)
	{
		Employe temp = employes.get(i1);
		employes.set(i1, employes.get(i2));
		employes.set(i2, temp);
	}
	
	public void triParSalaire()
	{
		int i = 1;
		int j;

		while (i < employes.size())
		{
			j = i;
			while(employes.get(j).calculSalaire() < employes.get(j-1).calculSalaire() && j >= 0)
			{
				echange(j, j-1);
				j--;
			}
		}
	}
	
	public void afficher()
	{
		Iterator<Employe> it = employes.iterator();
		
		while (it.hasNext())
		{
			System.out.println("---------------------------");
			it.next().afficher();
		}
	}
	
	public void selectionner(int min, int max)
	{
		ListeEmployes l = new ListeEmployes();
		
		Iterator<Employe> it = employes.iterator();
		Employe e;
		while (it.hasNext())
		{
			System.out.println("---------------------------");
			it.next().afficher();
		}
	}
}
