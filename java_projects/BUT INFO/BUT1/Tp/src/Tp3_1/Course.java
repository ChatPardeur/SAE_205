package Tp3_1;

import java.util.ArrayList;
import java.util.Iterator;

public class Course 
{
	private String nom_epreuve;
	private ArrayList<ChevalDeCourse> listeChevaux;
	
	public Course(String nom) 
	{
		this.nom_epreuve = nom;
		
		this.listeChevaux = new ArrayList<ChevalDeCourse>();
	}
	
	public void affiche()
	{
		System.out.println("course " + this.nom_epreuve);
		if(this.listeChevaux.size() == 0)
			System.out.println("aucun cheval ne participe à la course");
		else
		{
			Iterator<ChevalDeCourse> it = listeChevaux.iterator();
			
			while (it.hasNext())
			{
				System.out.println("-------------------------");
				it.next().afficher();
			}
		}
	}
	
	public boolean chevalPresent(String nom)
	{
		boolean trouve = false;
		Iterator<ChevalDeCourse> it = listeChevaux.iterator();
		while (it.hasNext() && !trouve)
		{
			if(it.next().getNom().equals(nom))
			{
				trouve = true;
			}
		}
		return trouve;
	}
	
	public void enregistre(ChevalDeCourse c)
	{
		if(!chevalPresent(c.getNom()))
		{
			this.listeChevaux.add(c);
			System.out.println(c.getNom() + " a été ajouté");
		}
		else
		{
			System.out.println(c.getNom() + " est déjà dans la course");
		}
	}
	
	public void rechercheCheval(String nom)
	{
		boolean trouve = false;
		ChevalDeCourse c;
		Iterator<ChevalDeCourse> it = listeChevaux.iterator();
		while (it.hasNext() && !trouve)
		{
			c = it.next();
			if(c.getNom().equals(nom))
			{
				trouve = true;
				c.afficher();
			}
		}
		if (!trouve)
		{
			System.out.println("cheval absent");
		}
	}
	
	public ChevalDeCourse meilleureCote()
	{
		ChevalDeCourse c_max = this.listeChevaux.get(0);
		ChevalDeCourse c_actuel;
		Iterator<ChevalDeCourse> it = listeChevaux.iterator();
		while (it.hasNext())
		{
			c_actuel = it.next();
			
			if(c_actuel.getMontantGains() > c_max.getMontantGains())
			{
				c_max = c_actuel;
			}
		}
		
		return c_max;
	}
	
	public static void main(String[] args) {
		Entraineur e = new Entraineur("Flantier", "Noël", "ici", 0);
		
		Course course = new Course("course_test");
		
		ChevalDeCourse c1 = new ChevalDeCourse("c1", false, "race1", e, 0);
		ChevalDeCourse c2 = new ChevalDeCourse("c2", false, "race2", e, 100);
		ChevalDeCourse c3 = new ChevalDeCourse("c3", false, "race1", e, 0);

		course.enregistre(c1);
		course.enregistre(c2);
		course.enregistre(c3);
		
		course.affiche();
		
		System.out.println("\n");
		
		System.out.println("true : " + course.chevalPresent("c1"));
		System.out.println("true : " + course.chevalPresent("c2"));
		System.out.println("true : " + course.chevalPresent("c3"));
		System.out.println("false : " + course.chevalPresent("c4"));

		
		System.out.println("infos attendues");
		course.rechercheCheval("c1");
		System.out.println("infos attendues");
		course.rechercheCheval("c2");
		System.out.println("infos attendues");
		course.rechercheCheval("c3");
		System.out.println("absent attendu");
		course.rechercheCheval("c4");
		
		course.meilleureCote().afficher();
	}
}
