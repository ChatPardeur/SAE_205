package Tp3_1;

public class SportCo extends Sport
{

	private int nbJoueurs;
	public SportCo(int code, String libelle, int nbJoueurs) 
	{
		super(code, libelle);
		this.nbJoueurs = nbJoueurs;
	}
	
	public void afficher()
	{
		super.afficher();
		System.out.println("nombre de joueurs par équipe : " + this.nbJoueurs);
	}

	
	public int getNbJoueurs() {
		return nbJoueurs;
	}

	public void setNbJoueurs(int nbJoueurs) {
		this.nbJoueurs = nbJoueurs;
	}
	
	
}
