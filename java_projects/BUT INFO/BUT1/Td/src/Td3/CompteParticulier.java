package Td3;

public class CompteParticulier extends Compte
{
	private Personne titulaire;
	
	public CompteParticulier(String numero, Personne titulaire)
	{
		super(numero);
		this.titulaire = titulaire;
	}

	public Personne getTitulaire() {
		return titulaire;
	}

	public void setTitulaire(Personne titulaire) {
		this.titulaire = titulaire;
	}

	
	public String toString()
	{
		return "numéro de compte : "+super.getNumero();
	}
	
	public void afficher()
	{
		System.out.println("--------------------------------------");

		System.out.println("compte n°" + super.getNumero() + " : " + this.titulaire.getNom());
		System.out.println("solde : " + super.getSolde());
		System.out.println("--------------------------------------");
	}
	
	
	public static void main(String[] args)
	{
		CompteParticulier c1 = new CompteParticulier("1", new Personne("n1", "p1", "adr1"));
		CompteParticulier c2 = new CompteParticulier("2", new Personne("n2", "p2", "adr2"));
		c1.afficher();
		c1.deposer(100);
		c1.afficher();
		c1.retirer(120);
		c1.retirer(60);
		c1.afficher();
	}
}
