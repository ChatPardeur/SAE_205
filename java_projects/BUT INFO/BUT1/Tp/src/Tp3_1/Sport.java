package Tp3_1;

public class Sport 
{
	private int code;
	private String libelle;
	
	public Sport(int c, String l) 
	{
		this.code = c;
		this.libelle = l;
	}
	
	public String toString()
	{
		return "sport " + Integer.toString(this.code) + ", " +  this.libelle;
	}
	
	public void afficher()
	{
		System.out.println("----------------------------------");
		System.out.println(this);
	}

	
	
	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
		
}
