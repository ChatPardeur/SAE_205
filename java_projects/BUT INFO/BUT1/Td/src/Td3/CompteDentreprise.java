package Td3;

public class CompteDentreprise extends Compte
{
	private Entreprise entreprise;
	
	public CompteDentreprise(String numero, Entreprise e)
	{
		super(numero);
		this.entreprise = e;
	}
	
	
	
	public Entreprise getEntreprise() {
		return entreprise;
	}



	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}



	void mettreSoldeAzero()
	{
		super.setSolde(0);
	}
	
	public void afficher()
	{
		System.out.println("--------------------------------------");
		System.out.println("compte n°" + this.getNumero() + " : " + this.entreprise.getNom());
		System.out.println("solde : " + this.getSolde());
		System.out.println("--------------------------------------");
	}
}
