package Tp2_2;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Voiture
{
	private String immatriculation;
	private String modele;
	private int kilometrage;
	private float tarif;
	
	
	public Voiture()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("entrez immatriculation");
		this.immatriculation = sc.nextLine();
		System.out.println("entrez modèle");
		this.modele = sc.nextLine();
		System.out.println("entrez kilomètrage");
		this.kilometrage = Integer.parseInt(sc.nextLine());
		System.out.println("entrez tarif");
		this.tarif = Float.parseFloat(sc.nextLine());
		
		sc.close();
	}
	
	public Voiture(String imm, String modele, int kil, float tarif)
	{
		this.immatriculation = imm;
		this.modele = modele;
		this.kilometrage = kil;
		this.tarif = tarif;
	}

	public String getImmatriculation() {
		return immatriculation;
	}

	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public int getKilometrage() {
		return kilometrage;
	}

	public void setKilometrage(int kilometrage) {
		this.kilometrage = kilometrage;
	}

	public float getTarif() {
		return tarif;
	}

	public void setTarif(float tarif) {
		this.tarif = tarif;
	}
	
	public void affiche()
	{
		System.out.println("immatriculation : "+ immatriculation);
		System.out.println("modèle : "+ modele);
		System.out.println("kilomètrage : "+ kilometrage);
		System.out.println("tarif : " + tarif);
		System.out.println("--------------------------");
	}
	
	public static void main(String[] args)
	{
		ArrayList<Voiture> liste = new ArrayList<>(10);
		liste.add(new Voiture("AB123CD", "modele1", 200000, 0.21f));
		liste.add(new Voiture("CD456EF", "modele2", 125641, 0.21f));
		liste.add(new Voiture("GH789IJ", "modele3", 87445, 0.21f));
		
		ListIterator<Voiture> li1 = liste.listIterator();
		while(li1.hasNext())
		{
			li1.next().affiche();
		}
		
		liste.remove(2);
		
		ListIterator<Voiture> li2 = liste.listIterator();
		while(li2.hasNext())
		{
			li2.next().affiche();
		}
		
	}
}
