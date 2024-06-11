package Tp2_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Agence {
	private String nom;
	private ArrayList<Voiture> parc;
	private ArrayList<Client> clientele;
	private ArrayList<Location> listeContrats;
	
	private static Voiture v1 = new Voiture("ABC123", "M1", 214320, 25f);
	private static Voiture v2 = new Voiture("DEF456", "M1", 94301, 30f);
	private static Voiture v3 = new Voiture("GHI789", "M2", 541327, 10f);
	
	Client c1 = new Client("cli", "adr1");
	Client c2 = new Client("clicli", "adr2");
	Client c3 = new Client("cliclicli", "adr3");
	
	
	public Agence(String nom) 
	{
		this.nom = nom;
		
		
		
		this.parc = new ArrayList<Voiture>();
		this.parc.add(v1);
		this.parc.add(v2);
		this.parc.add(v3);
		
		this.clientele = new ArrayList<Client>();
		this.clientele.add(c1);
		this.clientele.add(c2);
		this.clientele.add(c3);
		
		this.listeContrats = new ArrayList<Location>();
		this.listeContrats.add(new Location(v1, c3, new Date(20,12,2004)));
		this.listeContrats.add(new Location(v2, c2, new Date(31,04,2010)));
	}
	
	public void afficheParc()
	{
		Iterator<Voiture> itV = this.parc.iterator();
		
		while(itV.hasNext())
		{
			itV.next().affiche();
		}
	}
	
	public void afficheClientele()
	{
		Iterator<Client> itC = this.clientele.iterator();
		
		while(itC.hasNext())
		{
			itC.next().affiche();;
		}
	}
	
	public void afficheContrats()
	{
		Iterator<Location> itCo = this.listeContrats.iterator();
		
		while(itCo.hasNext())
		{
			itCo.next().affiche();;
		}
	}
	
	public Client trouveClient(int num_cli)
	{
		Iterator<Client> it = this.clientele.iterator();
		Client c;
		while (it.hasNext())
		{
			c = it.next();
			if(c.getNumeroClient() == num_cli)
			{
				return c;
			}
		}
		return null;
	}
	
	public boolean voitureDispo(Voiture voiture)
	{
		Iterator<Location> it = this.listeContrats.iterator();
		Location l;
		while(it.hasNext())
		{
			l = it.next();
			
			if(l.getVoiture() == voiture && l.getDateRetour() == null)
			{
				return false;
			}
		}
		return true;
	}
	
	public Voiture trouveVoiture(String imm)
	{
		Iterator<Voiture> it = this.parc.iterator();
		Voiture v;
		while (it.hasNext())
		{
			v = it.next();
			if(v.getImmatriculation() == imm)
			{
				return v;
			}
		}
		return null;
	}
	
	public Location trouveLocation(Voiture v)
	{
		Iterator<Location> it = this.listeContrats.iterator();
		Location l;
		while (it.hasNext())
		{
			l = it.next();
			
			if(l.getVoiture() == v)
			{
				return l;
			}
		}
		return null;
	}
	
	public void enregistrerLocation()
	{
		Scanner sc = new Scanner(System.in);
		int num_cli = -1;
		Client c = trouveClient(num_cli);
		
		while (c == null)
		{
			System.out.println("veuillez entrer le n° de client");
			num_cli = sc.nextInt();
			c = trouveClient(num_cli);
		}
		
		afficheParc();
		String imm = null;
		
		Voiture v = trouveVoiture(imm);
		
		while(v == null || !voitureDispo(v))
		{
			System.out.println("entrez l'immatriculation de la voiture");
			imm = sc.next();
			v = trouveVoiture(imm);
		}
		
		Date d = new Date();
		
		Location l = new Location(v, c, d);
		this.listeContrats.add(l);
		sc.close();
	}
	
	public void retourLocation()
	{
		Scanner sc = new Scanner(System.in);

		String imm = null;
		Location l;
		Date dateRetour;

		Voiture v = trouveVoiture(imm);
		
		//trouver voiture louée 
		while(v == null || voitureDispo(v))
		{
			System.out.println("entrez l'immatriculation de la voiture");
			imm = sc.next();
			v = trouveVoiture(imm);
		}
		
		//trouver location
		l = trouveLocation(v);
		System.out.println("caractéistiques de la location");
		System.out.println("-------------------------");
		l.affiche();
		
		//date retour
		System.out.println("date de du retour");
		dateRetour = new Date();
		
		//kilomètres parcourus
		int kilometrage_depart, kilometrage_retour, kmParcourus;
		kilometrage_depart = l.getVoiture().getKilometrage();
		kilometrage_retour = kilometrage_depart;
		kmParcourus = kilometrage_retour - kilometrage_depart;
		
		while (kmParcourus <= 0)
		{
			System.out.println("veuillez entrer le kilomètrage de la voiture");
			kilometrage_retour = sc.nextInt();
			kmParcourus = kilometrage_retour - kilometrage_depart;
		}
		
		//calcul prix
		float prix = kmParcourus * l.getVoiture().getTarif();
		System.out.println("vous avez " + prix + " € à payer");
		
		//MaJ location
		l.setDateRetour(dateRetour);
		
		//MaJ voiture
		l.getVoiture().setKilometrage(kilometrage_retour);
	}
	
	public static void main(String[] args) {
		
	}
}
