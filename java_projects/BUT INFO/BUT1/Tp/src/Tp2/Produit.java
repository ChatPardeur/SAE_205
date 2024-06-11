package Tp2;
import java.util.Scanner;

public class Produit 
{
    private String reference;
    private int date_entree;

    Scanner sc = new Scanner(System.in);
    public Produit(int date)
    {
        this.date_entree = date;
        System.out.println("entrez la reference du produit");
        this.reference = sc.next();
    }

    public void afficher()
    {
        System.out.println("produit " + this.reference);
        String mois;
        int jour = this.date_entree%31;

        if(this.date_entree <= 31)
        {
            mois = "janvier";
        }
        else if(this.date_entree <= 60)
        {
            mois = "février";
        }
        else if(this.date_entree <= 91)
        {
            mois = "mars";
        }
        else if(this.date_entree <= 121)
        {
            mois = "avril";
        }
        else if(this.date_entree <= 152)
        {
            mois = "mai";
        }
        else if(this.date_entree <= 182)
        {
            mois = "juin";
        }
        else if(this.date_entree <= 213)
        {
            mois = "juillet";
        }
        else if(this.date_entree <= 244)
        {
            mois = "aout";
        }
        else if(this.date_entree <= 274)
        {
            mois = "setembre";
        }
        else if(this.date_entree <= 305)
        {
            mois = "octobre";
        }
        else if(this.date_entree <= 335)
        {
            mois = "novembre";
        }
        else
        {
            mois = "décembre";
        }

        System.out.println("entré en stock le " + jour + " " + mois);
    }


}
