package Td2;

public class Table 
{
	Domino[] tab;
	int nbDominos;
	
	public Table(int n)
	{
		this.tab = new Domino[n];
		this.nbDominos = 0;
	}
	
	public Domino[] getTab() 
	{
		return tab;
	}

	public int getNbDominos()
	{
		return nbDominos;
	}

	public void initTab()
	{
		this.tab[0] = new Domino();
		
		this.nbDominos++;
	}
	
	public void affTable()
	{
		System.out.println("        table de jeu        ");
		System.out.println("----------------------------");
		for (int i = 0; i < this.nbDominos; i++) 
		{
			this.tab[i].afficher();
		}
		System.out.println("----------------------------");

	}

	public int recherche(int g, int d)
	{
		int result = 0;
		
		if(this.nbDominos != this.tab.length)
		{
			if (this.tab[0].getGauche() == g || this.tab[0].getGauche() == d)
			{
				result = -1;
			}
			else if(this.tab[this.nbDominos-1].getDroite() == g || this.tab[this.nbDominos-1].getDroite() == d)
			{
				result = 1;
			}
		}

		return result;
	}
	
	public void poserAgauche(int g, int d)
	{
		if(this.nbDominos == this.tab.length)
		{
			System.out.println("erreur, la table de jeu est complète");
		}
		else
		{
			for (int i = this.nbDominos; i > 0; i--)
			{
				this.tab[i] = this.tab[i-1];
			}
			
			this.tab[0] = new Domino(g, d);
			
			if(this.tab[0].getGauche() == this.tab[1].getGauche())
			{
				this.tab[0].inverser();
			}
			
			this.nbDominos++;
		}
	}
	
	public void PoserAdroite(int g, int d)
	{
		if(this.nbDominos == this.tab.length)
		{
			System.out.println("erreur, la table de jeu est complète");
		}
		else
		{
			this.tab[this.nbDominos] = new Domino(g, d);
			
			if(this.tab[this.nbDominos].getDroite() == this.tab[this.nbDominos-1].getDroite())
			{
				this.tab[this.nbDominos].inverser();
			}
			this.nbDominos++;
		}
	}

	public static void main(String[] args) 
	{
		Table t = new Table(5);
		
		t.tab[0] = new Domino(1, 6);
		t.nbDominos++;
		t.affTable();
		
		t.PoserAdroite(5,6);
		t.affTable();
	}
}
