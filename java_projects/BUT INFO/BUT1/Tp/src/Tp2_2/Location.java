package Tp2_2;

public class Location 
{
	private static int nbLocations = 0;
	private int numero;
	private Voiture voiture;
	private Client client;
	private Date dateLocation;
	private Date dateRetour;
	private int kilometres;
	
	public Location(Voiture v, Client c, Date d_l)
	{
		this.voiture = v;
		this.client = c;
		this.numero = nbLocations+1;
		nbLocations++;
		this.dateLocation = d_l;
		this.dateRetour = null;
		this.kilometres = v.getKilometrage();
	}
	
	
	
	public int getNumero() {
		return numero;
	}



	public void setNumero(int numero) {
		this.numero = numero;
	}



	public Voiture getVoiture() {
		return voiture;
	}



	public void setVoiture(Voiture voiture) {
		this.voiture = voiture;
	}



	public Client getClient() {
		return client;
	}



	public void setClient(Client client) {
		this.client = client;
	}



	public Date getDateLocation() {
		return dateLocation;
	}



	public void setDateLocation(Date dateLocation) {
		this.dateLocation = dateLocation;
	}



	public Date getDateRetour() {
		return dateRetour;
	}



	public void setDateRetour(Date dateRetour) {
		this.dateRetour = dateRetour;
	}



	public int getKilometres() {
		return kilometres;
	}



	public void setKilometres(int kilometres) {
		this.kilometres = kilometres;
	}



	public void affiche()
	{
		System.out.println("-----------------------------");
		System.out.println("location n°" + this.numero);
		this.voiture.affiche();
		this.client.affiche();
		System.out.println("date de location");
		this.dateLocation.affiche();
		
		if (this.dateRetour != null)
		{
			System.out.println("date de retour");
			this.dateRetour.affiche();
		}
	}
	
	public static void main(String[] args)
	{
		Voiture v = new Voiture("AB123CD", "modele1", 231000, 0.3f);
		Client c = new Client("cli", "hab1");
		Date d = new Date(14,2,2024);
		Location l = new Location(v, c, d);
		l.affiche();
		l.affiche();
	}
}
