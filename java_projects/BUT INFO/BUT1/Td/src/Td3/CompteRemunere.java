package Td3;


public class CompteRemunere extends Compte
{
	private double taux;
	private Personne titulaire;
	
	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}

	public CompteRemunere(String numero, Personne titulaire, double taux) 
	{
		super(numero);
		this.taux = taux;
		this.titulaire = titulaire;
	}
	
	public String toString()
	{
		return super.toString() + ", taux : " + this.taux;
	}
	
	public void afficher()
	{
		System.out.println("--------------------------------------");
		System.out.println("compte " + super.getNumero() + " : " + this.titulaire.getNom());
		System.out.println("solde : " + super.getSolde());
		System.out.println("taux : " + this.taux);
		System.out.println("--------------------------------------");
	}
	
	public void versement()
	{
		super.deposer(super.getSolde() * this.taux);
	}
	
	
	
	public static void main(String[] args) {
		CompteRemunere cr = new CompteRemunere("3", new Personne("nom", "prenom", "adresse"), 0.2);
		
		cr.afficher();
	}
}
