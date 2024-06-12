package modele;

public abstract class Tarification
{
    private double reductionStatic;
    public Tarification()
    {

    }

    public abstract double calculReduc(double tarif);

    public double getReductionStatic() {
        return reductionStatic;
    }

    public void setReductionStatic(double reductionStatic) {
        this.reductionStatic = reductionStatic;
    }
}
