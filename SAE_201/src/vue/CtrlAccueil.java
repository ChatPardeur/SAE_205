package vue;

import java.io.IOException;

import controleur.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class CtrlAccueil {

    @FXML
    private Button bnCreaZone;

    @FXML
    private Button bnListeReservAnnule;

    @FXML
    private Button bnQuitter;

    @FXML
    void clickGestionZone(ActionEvent event) throws IOException {
    	Main.ouvrirGestionZone();
    }
    
    @FXML
    void clickListe(ActionEvent event) throws IOException {
    	Main.ouvrirListe();
    }

    @FXML
    void clickQuitter(ActionEvent event) 
    {
    	Main.fermerAccueil();
    }
    
    @FXML
    private void initialize()
    {
    	bnQuitter.setCancelButton(true);
    }

}
