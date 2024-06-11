package donnees;

import java.util.ArrayList;

public class Representation
{
    private String jour;
    private String heure;
    private boolean annee;
    private Spectacle spectacle;
    private ArrayList<Reservation> reservations;

    public Representation(String jour, String heure, boolean annee, Spectacle spectacle) {
        this.jour = jour;
        this.heure = heure;
        this.annee = annee;
        this.spectacle = spectacle;

        this.reservations = new ArrayList<>();
    }

    public String getJour() {
        return jour;
    }
    public void setJour(String jour) {
        this.jour = jour;
    }
    public String getHeure() {
        return heure;
    }
    public void setHeure(String heure) {
        this.heure = heure;
    }
    public boolean isAnnee() {
        return annee;
    }
    public void setAnnee(boolean annee) {
        this.annee = annee;
    }
    public Spectacle getSpectacle() {
        return spectacle;
    }
    public void setSpectacle(Spectacle spectacle) {
        this.spectacle = spectacle;
    }

    public boolean contientRes(Reservation r)
    {
        return reservations.contains(r);
    }
    private void ajouteRes(Reservation r)
    {
        reservations.add(r);
    }

    public String ajouteReservation(Reservation r)
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

    public String enleveReservation(Reservation r)
    {
        if(contientRes(r))
        {
            enleveRes(r);
            return "opération ajoutée";
        }
        else
        {
            return "erreur : réservation non trouvée";
        }
    }
}
