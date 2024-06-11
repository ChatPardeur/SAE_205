package Tp3_2;

public abstract class Employe 
{
	static int nb_employes = 1;
	
	private String nom;
	private int age;
	private int Nb_A;
	private int numero;
	
	public Employe(String nom, int age, int nb_a) 
	{
		this.nom = nom;
		this.age = age;
		this.Nb_A = nb_a;
		this.numero = nb_employes;
		nb_employes++;
	}
	
	public void afficher()
	{
		System.out.println("employe n° " + numero);
		System.out.println(nom);
		System.out.println(age + " ans");
		System.out.println(Nb_A + " ans d'expérience");
	}
	
	
public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNb_A() {
		return Nb_A;
	}

	public void setNb_A(int nb_A) {
		Nb_A = nb_A;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}


	abstract int calculSalaire();
}
