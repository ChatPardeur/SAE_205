package Td3;


public abstract class Compte{

	private String numero;
	private double solde;


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public double getSolde() {
		return solde;
	}


	public void setSolde(double solde) {
		this.solde = solde;
	}


	Compte(String i)
	{
		this.numero = i;
		this.solde = 0;
	}
	
	

	
	public String toString()
	{
		return "numéro de compte : "+numero;
	}
	
	
	public void deposer(double somme)
	{
		this.solde = this.solde + somme;
	}
	
	
	public void retirer(double somme)
	{
		if (somme >= this.solde)
		{
			this.solde = this.solde - somme;
		}
		else
		{
			System.out.println("impossible de retirer " + somme + " : solde insuffisant");
		}
	}

	abstract void afficher();
}