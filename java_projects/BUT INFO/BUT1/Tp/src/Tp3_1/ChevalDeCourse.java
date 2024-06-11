package Tp3_1;

public class ChevalDeCourse extends Cheval
{
	private Jockey jockey;
	private Entraineur entraineur;
	private int montantGains;
	
	public ChevalDeCourse(String nom, boolean male, String race, Entraineur e, int m)
	{
		super(nom, male, race);
		this.entraineur = e;
		this.montantGains = m;
	}
	
	public void attribueJokey(Jockey j)
	{
		this.jockey = j;
	}
	
	
	
	public Jockey getJockey() {
		return jockey;
	}

	public void setJockey(Jockey jockey) {
		this.jockey = jockey;
	}

	public Entraineur getEntraineur() {
		return entraineur;
	}

	public void setEntraineur(Entraineur entraineur) {
		this.entraineur = entraineur;
	}

	public int getMontantGains() {
		return montantGains;
	}

	public void setMontantGains(int montantGains) {
		this.montantGains = montantGains;
	}

	public void afficher()
	{
		super.afficher();
		
		if(this.jockey != null)
		{
			jockey.afficher();
		}
		else
		{
			System.out.println("pas de jockey attribué");
		}
		
		this.entraineur.afficher();
		System.out.println("montant des gains : " + this.montantGains);
	}
}
