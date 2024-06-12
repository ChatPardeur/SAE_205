package donnees;

public class Billet
{
    private static String nbNumero = "0";
    private String numero;

    Reservation reservation;

    Fauteuil fauteuil;

    Tarification tarification;

    public Billet(Reservation reservation, Fauteuil fauteil, Tarification tarification)
    {
        this.reservation = reservation;
        this.fauteuil = fauteil;

        this.numero = nbNumero;
        nbNumero =Integer.toString (Integer.parseInt(nbNumero) + 1);

        this.tarification = tarification;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public Fauteuil getFauteuil() {
        return fauteuil;
    }

    public void setFauteuil(Fauteuil fauteuil) {
        this.fauteuil = fauteuil;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Tarification getTarification() {
        return tarification;
    }

    public void setTarification(Tarification tarification) {
        this.tarification = tarification;
    }
}
