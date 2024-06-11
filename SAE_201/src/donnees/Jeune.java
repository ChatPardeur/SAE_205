package donnees;

public class Jeune extends Tarification{
    public Jeune() {
    }

    @Override
    public double calculReduc(double tarif) {
        return tarif * 0.6;
    }
}
