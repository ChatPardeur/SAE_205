package vue;

import java.io.IOException;

import controleur.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;

public class CtrlGestionZone {

    @FXML
    private Button bnCreerZone;

    @FXML
    private Button bnQuitter;

    @FXML
    private TableView<?> listeZones;

    @FXML
    void clickCreerZone(ActionEvent event) throws IOException {
    	Main.ouvrirCreationZone();
    }

    @FXML
    void clickQuitter(ActionEvent event) {
    	Main.fermerGestionZone();
    }

}
