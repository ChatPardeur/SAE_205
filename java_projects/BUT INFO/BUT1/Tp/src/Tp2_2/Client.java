package Tp2_2;

public class Client
{
	private static int nbClients = 0;
	private int numeroClient;
	private String nom;
	private String domicile;
	
	public Client(String nom, String domicile) 
	{
		this.numeroClient = nbClients+1;
		nbClients++;
		
		this.nom = nom;
		this.domicile = domicile;
	}
	
	
	
	
	public int getNumeroClient() {
		return numeroClient;
	}

	public void setNumeroClient(int numeroClient) {
		this.numeroClient = numeroClient;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDomicile() {
		return domicile;
	}

	public void setDomicile(String domicile) {
		this.domicile = domicile;
	}


	public void affiche()
	{
		System.out.println("client n°" + this.numeroClient + " : " + this.nom);
		System.out.println("----------------------");
	}
	
	public static void main(String[] args) {
		Client c1 = new Client("cli", "m1");
		Client c2 = new Client("clicli", "m2");
		c1.affiche();
		c2.affiche();
	}
}
