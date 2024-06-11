package Tp2_2;

import java.util.Scanner;

public class Date
{
	private int jour;
	private int mois;
	private int annee;
	
	public Date(int j, int m, int a)
	{
		this.jour = j;
		this.mois = m;
		this.annee = a;
	}
	
	
	
	public int getJour() {
		return jour;
	}

	public void setJour(int jour) {
		this.jour = jour;
	}

	public int getMois() {
		return mois;
	}

	public void setMois(int mois) {
		this.mois = mois;
	}

	public int getAnnee() {
		return annee;
	}



	public void setAnnee(int annee) {
		this.annee = annee;
	}



	public Date() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("entrez la date (jj mm aaaa)");
		this.jour = sc.nextInt();
		this.mois = sc.nextInt();
		this.annee = sc.nextInt();
		
		sc.close();
	}
	
	public String strMois()
	{
			String m;		
		switch (this.mois)
		{
			case 1:
				m = "janvier";
				break;
			case 2:
				m = "février";
				break;
			case 3:
				m = "mars";
				break;
			case 4:
				m = "avril";
				break;
			case 5:
				m = "mai";
				break;
			case 6:
				m = "juin";
				break;
			case 7:
				m = "juillet";
				break;
			case 8:
				m = "août";
				break;
			case 9:
				m = "septembre";
				break;
			case 10:
				m = "octobre";
				break;
			case 11:
				m = "novembre";
				break;
			case 12:
				m = "décembre";
				break;
			default:
				m = "erreur";
				break;
		}
		return m;
	}

	public void affiche()
	{
		System.out.println(jour + " " + strMois() + " " + annee);
		System.out.println("----------------");
	}
	
	public static void main(String[] args) {
		Date d = new Date();
		d.affiche();
	}
}
