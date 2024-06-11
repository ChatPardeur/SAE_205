package donnees;

import java.util.Date;
import java.util.Objects;

abstract class Annulation
{
    private Date date;
    private Boolean remboursementEffectue;

    private Reservation reservation;

    public Annulation(Date date, Boolean rembouresementEffectue, Reservation reservation)
    {
        this.date = date;
        this.remboursementEffectue = remboursementEffectue;
        this.reservation = reservation;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Boolean getRemboursementEffectue() {
        return remboursementEffectue;
    }

    public void setRemboursementEffectue(Boolean remboursementEffectue) {
        this.remboursementEffectue = remboursementEffectue;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
}
