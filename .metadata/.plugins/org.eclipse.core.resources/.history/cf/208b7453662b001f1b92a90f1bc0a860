package modele;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;

public class DataBase {
	static public ArrayList<AnnulationClient> annulations;
	
	
	static public void chargerReservationsAnnulees() throws ParseException
	{
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
		annulations.add(new AnnulationClient(formatter.parse("19-Nov-2009"), true, 
				new Reservation(formatter.parse("17-Nov-2009"), formatter.parse("17-Nov-2009"),
						new Client("Flantier", "Noël", "ici", "0102030405", "truc@null.com", "01"))));
	}

}
