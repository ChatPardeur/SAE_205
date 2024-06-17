package modele;

import java.util.ArrayList;

public class Client
{
    private String nom;
    private String prenom;
    private String adresse;
    private String tel;
    private String mail;
    private String numero;

    private ArrayList<Reservation> reservations;


    public Client(String nom, String prenom, String adresse, String tel, String mail, String numero)
    {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.tel = tel;
        this.mail = mail;
        this.numero = numero;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNum() {
        return numero;
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }

    public boolean contientRes(Reservation r)
    {
        return reservations.contains(r);
    }
    private void ajouteRes(Reservation r)
    {
        reservations.add(r);
    }

    public String ajouteReservations(Reservation r)
    {
        if(contientRes(r))
        {
            return "erreur : réservation déjà ajoutée";
        }
        else
        {
            ajouteRes(r);
            return "opération effectuée";
        }
    }

    private void enleveRes(Reservation r)
    {
        reservations.remove(r);
    }

    public String enleveReservations(Reservation r)
    {
        if(contientRes(r))
        {
            enleveRes(r);
            return "opération effectuée";
        }
        else
        {
            return "erreur : réservation non trouvée";
        }
    }


}
