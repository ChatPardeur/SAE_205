package modele;

public class Senior extends Tarification{

    public Senior() {
    }

    @Override
    public double calculReduc(double tarif) {
        return tarif * 0.75;
    }
}
