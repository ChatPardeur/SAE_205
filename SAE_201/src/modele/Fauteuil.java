package modele;

public class Fauteuil
{
    private String rangee;
    private String numero;

    public Fauteuil(String rangee, String numero)
    {
        this.rangee = rangee;
        this.numero = numero;
    }
    
    public void afficher()
    {
    	System.out.println(rangee + " " + numero);
    }
}
