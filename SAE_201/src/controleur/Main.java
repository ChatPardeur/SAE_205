package controleur;

import java.io.IOException;

import javafx.application.Application;
import javafx.stage.Stage;
import modele.DataBase;
import vue.FenAccueil;
import vue.FenCreationZone;
import vue.FenGestionZone;
import vue.FenListe;
import vue.CtrlGestionZone;

public class Main extends Application
{
	static private FenAccueil fnAccueil;
	static private FenCreationZone fnCreationZone;
	static private FenGestionZone fnGestionZone;
	static private FenListe fnListe;
	
	
	
	@Override
	public void start(Stage arg0) throws Exception
	{
		fnAccueil = new FenAccueil();
		fnAccueil.show();
	}
	
	public static void main(String[] args) 
	{
		Application.launch(args);
	}
	
	public static void fermerAccueil()
	{
		System.exit(0);
	}
	
	public static void ouvrirListe() throws IOException
	{
		fnListe = new FenListe();
		fnListe.show();
	}

	public static void ouvrirZones() throws IOException
	{
		fnGestionZone = new FenGestionZone();
		fnGestionZone.show();
	}
	
	public static void ouvrirCreationZone() throws IOException
	{
		fnCreationZone = new FenCreationZone();
		fnCreationZone.show();
	}
	

	public static void fermerListe()
	{
		fnListe.close();
	}
	
	public static void ouvrirGestionZone() throws IOException
	{
		fnGestionZone = new FenGestionZone();
		fnGestionZone.show();
	}
	
	public static void fermerGestionZone()
	{
		fnGestionZone.close();
	}
	
	
	public static void fermerCreationZone()
	{
		fnGestionZone.actualiserTable();
		fnCreationZone.close();
	}
	
}
