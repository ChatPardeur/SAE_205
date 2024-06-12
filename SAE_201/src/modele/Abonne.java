package modele;


public class Abonne extends Tarification{

    public Abonne() {
    }

    @Override
    public double calculReduc(double tarif) {
        return tarif * 0.6;
    }
}
