package modele;

public class Adulte extends Tarification{

    public Adulte() {
    }

    @Override
    public double calculReduc(double tarif)
    {
        return tarif;
    }
}
