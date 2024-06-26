package vue;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class FenAccueil extends Stage{

	public FenAccueil() throws IOException {
		this.setTitle("Le Patio - Accueil");
		Scene scene = new Scene(creerSceneGraphe());
		this.setScene(scene);
	}
	
	private Pane creerSceneGraphe() throws IOException
	{
     	FXMLLoader loader = new FXMLLoader();
     	loader.setLocation(getClass().getResource("Accueil.fxml"));
     	Pane root = loader.load();
     	loader.getController();
     	return root;
     	
	}
}
