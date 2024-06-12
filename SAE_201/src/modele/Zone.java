package modele;

import java.util.ArrayList;
import java.util.Iterator;

public class Zone
{
    String nom;

    private ArrayList<Fauteuil> fauteuils;

    public Zone(String nom) {
        this.nom = nom;
        this.fauteuils = new ArrayList<>();
        this.fauteuils.add(new Fauteuil("a", "1"));
    }

    public boolean contientfauteuil(Fauteuil f)
    {
        return fauteuils.contains(f);
    }

    private void ajouteF(Fauteuil f)
    {
        fauteuils.add(f);
    }

    public String ajouteFauteuil(Fauteuil f)
    {
        if(contientfauteuil(f))
        {
            return "erreur : le fauteuil est déjà ajouté";
        }
        else
        {
            ajouteF(f);
            return "opération effectuée";
        }
    }

    private void enleverF(Fauteuil f)
    {
        fauteuils.remove(f);
    }

    public String enleverFauteuil(Fauteuil f)
    {
        if(fauteuils.size() == 1)
        {
            return "erreur : impossible d'enlever le dernier fauteuil";
        }
        else if(!contientfauteuil(f))
        {
            return "erreur : fauteuil non trouvé";
        }
        else
        {
            enleverF(f);
            return "operation effectuée";
        }
    }

    public void listerFauteuils()
    {
    	Iterator<Fauteuil> it = fauteuils.iterator();
    	
    	while(it.hasNext())
    	{
    		it.next().afficher();
    	}
    }
    
    public boolean ajouterFauteuils(int nbRangees, int nbNumeros)
    {
    	if(nbRangees > 25)
    	{
    		System.out.println("erreur : il ne peut pas y avoir plus de 26 rangées");
    		return false;
    	}
    	else
    	{
    		String alphabet = "abcdefghijklmnopqrstuvwxyz";
    		
    		enleverF(fauteuils.get(0));
    		
    		for(int rangee = 0; rangee < nbRangees; rangee++)
    		{
    			for(int numero = 1; numero < nbNumeros+1; numero++)
    			{
    				ajouteF(new Fauteuil(Character.toString(alphabet.toCharArray()[rangee]), Integer.toString(numero)));
    			}
    		}
    		return true;
    	}
    }

   public static void main(String[] args)
   {
	   Zone z = new Zone("test");
	   z.ajouterFauteuils(10, 10);
	   z.listerFauteuils();
   }
}
