package vue;

import controleur.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import modele.DataBase;
import modele.Zone;

import java.io.IOException;

public class CtrlGestionZone {

    @FXML
    private Button bnCreerZone;

    @FXML
    private Button bnQuitter;

    @FXML
    private TableView<Zone> listeZones;
    
    @FXML
    private TableColumn<Zone, String> colNom;

    @FXML
    private TableColumn<Zone, Integer> colNbLignes;

    @FXML
    private TableColumn<Zone, Integer> colNbColumn;

    @FXML
    private TableColumn<Zone, Integer> colNbSieges;

    @FXML
    void clickCreerZone(ActionEvent event) throws IOException {
        Main.ouvrirCreationZone();
        actualiserTableView();
    }

    @FXML
    void clickQuitter(ActionEvent event) {
        Main.fermerGestionZone();
    }
    
    private void chargerDonnees() {
        ObservableList<Zone> zonesObservable = FXCollections.observableArrayList(DataBase.zones);
        listeZones.setItems(zonesObservable);
    }
    
    public void initialize() {
        if (colNom != null) {
            colNom.setCellValueFactory(new PropertyValueFactory<>("nom"));
        }
        if (colNbLignes != null) {
            colNbLignes.setCellValueFactory(new PropertyValueFactory<>("nbLignes"));
        }
        if (colNbColumn != null) {
            colNbColumn.setCellValueFactory(new PropertyValueFactory<>("nbColumn"));
        }
        if (colNbSieges != null) {
            colNbSieges.setCellValueFactory(new PropertyValueFactory<>("nbSieges"));
        }

        chargerDonnees();
    }

    public void actualiserTableView() 
    {
        chargerDonnees();
    }
}
