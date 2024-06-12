
package modele;

public class Tarif 
{
	private Spectacle spectacle;
	private Zone zone;
	private double pleinTarif;
	
	public Tarif(Spectacle s, Zone z, double t) 
	{
		this.spectacle = s;
		this.zone = z;
		this.pleinTarif = t;
	}

	public double getPleinTarif() {
		return pleinTarif;
	}

	public void setPleinTarif(double pleinTarif) {
		this.pleinTarif = pleinTarif;
	}
	
}
