package controleur;

import java.io.IOException;

import javafx.application.Application;
import javafx.stage.Stage;
import modele.DataBase;
import vue.FenAccueil;
import vue.FenCreationZone;
import vue.FenGestionZone;
import vue.FenListe;

public class Main extends Application{
	static private FenAccueil fnAccueil;
	static private FenCreationZone fnCreationZone;
	static private FenGestionZone fnGestionZone;
	static private FenListe fnListe;
	
	
	
	@Override
	public void start(Stage arg0) throws Exception 
	{
		DataBase.chargerReservationsAnnulees();
		fnAccueil = new FenAccueil();
		fnAccueil.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	
	public static void ouvrirListe() throws IOException
	{
		fnListe = new FenListe();
		fnListe.show();
	}
	
	public static void fermerAccueil()
	{
		fnAccueil.close();
	}

	public static void fermerListe()
	{
		fnListe.close();
	}
	
	
	
	public void chargerRerservationsAnnulees()
	{
		
	}
}
