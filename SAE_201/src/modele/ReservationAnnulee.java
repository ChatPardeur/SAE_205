package modele;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class ReservationAnnulee {
    private String nomClient;
    private String numClient;
    private String nomSpectacle;
    private String dateHeure;
    private String dateAnnulation;
    private String nbBilletsVendus;
    private String nbBilletsRetournes;
    private String totalRemboursement;

    public ReservationAnnulee(AnnulationClient annulation) {
        this.nomClient = annulation.getReservation().getClient().getNom();
        this.numClient = annulation.getReservation().getClient().getNum();
        this.nomSpectacle = annulation.getReservation().getRepresentation().getSpectacle().getNom();
        this.dateHeure = annulation.getReservation().getRepresentation().getDateHeure();
        this.dateAnnulation = annulation.getDateAnnulation().toString();
        this.nbBilletsVendus = String.valueOf(annulation.getReservation().getNbBilletsVendus());
        this.nbBilletsRetournes = String.valueOf(annulation.getNbBilletsRetournes());
        this.totalRemboursement = String.valueOf(annulation.getTotalRemboursement());
    }

    public String getNomClient() {
        return nomClient;
    }

    public String getNumClient() {
        return numClient;
    }

    public String getNomSpectacle() {
        return nomSpectacle;
    }

    public String getDateHeure() {
        return dateHeure;
    }

    public String getDateAnnulation() {
        return dateAnnulation;
    }

    public String getNbBilletsVendus() {
        return nbBilletsVendus;
    }

    public String getNbBilletsRetournes() {
        return nbBilletsRetournes;
    }

    public String getTotalRemboursement() {
        return totalRemboursement;
    }

	@Override
	public String toString() {
		return "ReservationAnnulee [nomClient=" + nomClient + ", numClient=" + numClient + ", nomSpectacle="
				+ nomSpectacle + ", dateHeure=" + dateHeure + ", dateAnnulation=" + dateAnnulation
				+ ", nbBilletsVendus=" + nbBilletsVendus + ", nbBilletsRetournes=" + nbBilletsRetournes
				+ ", totalRemboursement=" + totalRemboursement + "]";
	}
	
	public boolean numCommencePar(String texte)
	{
		if(texte.length() > this.numClient.length())
		{
			return false;
		}
		if(texte.length() == numClient.length())
		{
			return texte.equals(numClient);
		}
		
		boolean valide = true;
		int i = 0;
		
		while(i < texte.length() && valide)
		{
			if(texte.charAt(i) == numClient.charAt(i))
			{
				i++;
			}
			else
			{
				valide = false;
			}
		}
		
		return valide;
				
	}
	
	public static void main(String[] args) throws ParseException 
	{
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
		Client c1 = new Client("Flantier", "Noël", "ici", "0102030405", "mail117@aol.com", "012");
		Spectacle s = new Spectacle("spectacle_test", 100, 100, "concert");
		Representation r = new Representation("lundi", "20h", true, s);
		
		
		AnnulationClient a1 = new AnnulationClient(formatter.parse("19-Nov-2009"), true, 
				new Reservation(formatter.parse("17-Nov-2009"), formatter.parse("17-Nov-2009"), c1));
		a1.getReservation().setRepresentation(r);
		a1.getReservation().getRepresentation().setSpectacle(s);
		Zone z = new Zone("balcon");

		a1.getReservation().getRepresentation().getSpectacle().setTarif(new Tarif(s, z , 10));
		a1.setRemboursementEffectue(true);
		
		ReservationAnnulee r1 = new ReservationAnnulee(a1);
		
		//System.out.println("0 : " + r1.numCommencePar("87"));
	}
    
    
}
