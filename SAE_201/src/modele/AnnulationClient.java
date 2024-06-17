package modele;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

public class AnnulationClient extends Annulation
{
	
    public AnnulationClient(Date date, Boolean remboursementEffectue, Reservation reservation)
    {
        super(date, remboursementEffectue, reservation);
    }
    
    
    
    
    public ArrayList<String> detail()
    {
    	String nomClient = getReservation().getClient().getNom();
    	String numClient = getReservation().getClient().getNum();
    	String nomSpectacle = getReservation().getRepresentation().getSpectacle().getNom();
    	String dateHeure = getReservation().getRepresentation().getJour() + " " + getReservation().getRepresentation().getHeure();
    	String dateAnnulation = getDate().toString();
    	String nbBilletsVendus = Integer.toString(getReservation().getBillets().size());
    	String nbBilletsRetournes;
    	String totalRemboursement;
    	
    	if(getRemboursementEffectue())
    	{
    		nbBilletsRetournes = nbBilletsVendus;
    		
    		double total = 0;
    		
    		double tarifBase = getReservation().getRepresentation().getSpectacle().getTarif().getPleinTarif();
    		
    		Iterator<Billet> it = getReservation().getBillets().iterator();
    		Billet b;
    		while(it.hasNext())
    		{
    			b = it.next();
    			total += b.getTarification().calculReduc(tarifBase);
    		}
    		
    		totalRemboursement = Double.toString(total);
    	}
    	else
    	{
    		nbBilletsRetournes = "0";
    		totalRemboursement = "0";
    	}
    	
    	ArrayList<String> liste = new ArrayList<String>();
    	liste.add(nomClient);
    	liste.add(numClient);
    	liste.add(nomSpectacle);
    	liste.add(dateHeure);
    	liste.add(dateAnnulation);
    	liste.add(nbBilletsVendus);
    	liste.add(nbBilletsRetournes);
    	liste.add(totalRemboursement);
    	
    	return liste;
    }
    
    private Object getDate() {
		// TODO Auto-generated method stub
		return super.getDateAnnulation();
	}




	@Override
    public Reservation getReservation() {
    	// TODO Auto-generated method stub
    	return super.getReservation();
    }

	public String getNbBilletsRetournes() {
		// TODO Auto-generated method stub
		if(this.getRemboursementEffectue())
		{
			return Integer.toString(this.getReservation().getBillets().size());
		}
		else
		{
			return "0";
		}
	}




	public String getTotalRemboursement() {
		// TODO Auto-generated method stub
		if(getRemboursementEffectue())
		{
			int total = 0;
			ArrayList<Billet> billets = getReservation().getBillets();
			Billet b;
			
			Iterator<Billet> it = billets.iterator();
			while(it.hasNext())
			{
				b = it.next();
				total += b.getTarification().calculReduc(b.getReservation().getRepresentation().getSpectacle().getTarif().getPleinTarif());
			}
			
			return Integer.toString(total);
		}
		else
		{
			return "0";
		}
	}
}
