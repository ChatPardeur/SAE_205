package Td3;

import java.util.Iterator;

public class Banque
{
	private String nom;
	private Compte[] tabComptes;
	private int nbComptes;
	
	public Banque(String nom, int n)
	{
		this.nom = nom;
		this.tabComptes = new Compte[n];
		this.nbComptes = 0;
	}
	
	public void ajouterCompte(Compte c)
	{
		this.tabComptes[this.nbComptes] = c;
		this.nbComptes++;
	}
	
	public void afficher()
	{
		System.out.println("Banque " + this.nom);

		for (int i = 0; i < this.nbComptes; i++) 
		{
			this.tabComptes[i].afficher();
		}
	}

	public static void main(String[] args) {
		Banque b = new Banque("b1", 100);
		
		CompteParticulier c_p = new CompteParticulier("1", new Personne("Flantier", "Noël", "là"));
		CompteRemunere c_r = new CompteRemunere("2", new Personne("Bramard", "Lucien", "ici"), 0.2);
		CompteDentreprise c_e = new CompteDentreprise("3", new Entreprise("testCorp", new Personne("Ban", "Ray", "US")));
		
		b.ajouterCompte(c_p);
		b.ajouterCompte(c_r);
		b.ajouterCompte(c_e);
		
		b.afficher();
		
	}
}
