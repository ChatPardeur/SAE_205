package modele;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DataBase {
	static public ArrayList<AnnulationClient> annulations2 = new ArrayList<AnnulationClient>();
	static public ObservableList<AnnulationClient> annulations = FXCollections.observableArrayList();
	
	
	static public void chargerReservationsAnnulees() throws ParseException
	{
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
		
		AnnulationClient a1 = new AnnulationClient(formatter.parse("19-Nov-2009"), true, 
									new Reservation(formatter.parse("17-Nov-2009"), formatter.parse("17-Nov-2009"),
											new Client("Flantier", "Noël", "ici", "0102030405", "mail117@aol.com", "012")));
		
		AnnulationClient a2 = new AnnulationClient(formatter.parse("25-Jun-2015"), true, 
									new Reservation(formatter.parse("14-Jun-2015"), formatter.parse("14-Jun-2015"),
											new Client("Bramard", "Lucien", "là", "0102030405", "mail117bis@gmail.com", "123")));
		
		AnnulationClient a3 = new AnnulationClient(formatter.parse("01-Oct-2023"), true, 
				new Reservation(formatter.parse("31-Sep-2023"), formatter.parse("31-Sep-2023"),
						new Client("Faubourd", "Gertrude", "rue", "0203040506", "GertrudeF@gmail.com", "096")));
		
		AnnulationClient a4 = new AnnulationClient(formatter.parse("04-May-2020"), true, 
				new Reservation(formatter.parse("04-May-2020"), formatter.parse("04-May-2020"),
						new Client("Castille", "Claude", "avenue", "0506070809", "cc@orange.com", "452")));
	}
	

}
