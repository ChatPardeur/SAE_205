package vue;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class FenCreationZone extends Stage{

	public FenCreationZone() throws IOException 
	{
		this.setTitle("Le Patio - création de zone");
		Scene scene = new Scene(creerSceneGraphe());
		this.setScene(scene);
	}
	
	private Pane creerSceneGraphe() throws IOException
	{
     	FXMLLoader loader = new FXMLLoader();
     	loader.setLocation(getClass().getResource("CreationZone.fxml"));
     	Pane root = loader.load();
     	loader.getController();
     	return root;
     	
	}
}
