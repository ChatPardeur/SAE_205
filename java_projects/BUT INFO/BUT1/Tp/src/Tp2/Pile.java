package Tp2;

public class Pile 
{
	Produit[] tab;
	int indice;
	int max;
	
	public Pile(int max)
	{
		this.tab = new Produit[max];
		this.indice = -1;
	}
	
	public boolean pileVide()
	{
		return this.indice == -1;
	}
	
	public boolean pilePleine()
	{
		return this.indice == this.tab.length;
	}
	
	public void empiler(Produit p)
	{
		this.indice++;
		this.tab[this.indice] = p;
	}
	
	public void depiler()
	{
		this.tab[this.indice] = null;
		this.indice--;
	}
	
	public Produit sommet()
	{
		return this.tab[this.indice];
	}
	
	public void afficherStock()
	{
		for (Produit p : tab) 
		{
			p.afficher();
		}
	}
}
