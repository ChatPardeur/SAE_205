package modele;

import java.util.ArrayList;
import java.util.Date;

public class Reservation
{
    private String numero;

    private static String nbNumero = "0";

    private Date date;
    private Date dateEnvoiConf;

    private Client client;
    private Representation representation;

    private ArrayList<Billet> billets;

    public Reservation(Date date, Date dateEnvoiConf, Client c) {
        this.numero = nbNumero;
        nbNumero =Integer.toString (Integer.parseInt(nbNumero) + 1);

        this.date = date;
        this.dateEnvoiConf = dateEnvoiConf;

        this.client = c;
    }

    public String getNumero() {
        return numero;
    }
    
    

    public ArrayList<Billet> getBillets() {
		return billets;
	}

	public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDateEnvoiConf() {
        return dateEnvoiConf;
    }

    public void setDateEnvoiConf(Date dateEnvoiConf) {
        this.dateEnvoiConf = dateEnvoiConf;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Representation getRepresentation() {
        return representation;
    }

    public void setRepresentation(Representation representation) {
        this.representation = representation;
    }

    public boolean contientBillet(Billet b)
    {
        return billets.contains(b);
    }

    private void ajouteBill(Billet b)
    {
        billets.add(b);
    }

    public String ajouteBillet(Billet b)
    {
        if(contientBillet(b))
        {
            return "erreur : billet déjà ajouté";
        }
        else
        {
            ajouteBill(b);
            return "opération effectuée";
        }
    }

    private void enleveBill(Billet b)
    {
        billets.remove(b);
    }

    public String enleveBillet(Billet b)
    {
        if(contientBillet(b))
        {
            enleveBill(b);
            return "opération effectuée";
        }
        else
        {
            return "erreur : billet non trouvé";
        }
    }
}
