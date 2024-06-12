package modele;

public class Groupe extends Tarification{
    public Groupe() {
    }

    @Override
    public double calculReduc(double tarif) {
        return tarif * 0.85;
    }
}