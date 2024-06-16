package vue;

import controleur.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import modele.AnnulationClient;
import modele.ReservationAnnulee;

public class CtrlListeAnnule {

    @FXML
    private Button bnQuitter;

    @FXML
    private ComboBox<?> bnTrier;

    @FXML
    private TableView<ReservationAnnulee> tableViewAnnule;

    @FXML
    private TextField txt_Filtrer;

    @FXML
    void clickQuitter(ActionEvent event) {
    	Main.fermerListe();
    }

    
    private void Initialize() 
    {
    	TableColumn<ReservationAnnulee,String> c1 = new TableColumn<ReservationAnnulee,String>("Nom client");
        c1.setCellValueFactory(new PropertyValueFactory<ReservationAnnulee,String>("Nom client"));	
        tableViewAnnule.getColumns().set(0, c1);
        TableColumn<ReservationAnnulee,String> c2 = new TableColumn<ReservationAnnulee,String>("N° client");
        c2.setCellValueFactory(new PropertyValueFactory<ReservationAnnulee,String>("N° client"));	
        tableViewAnnule.getColumns().set(1, c2);
        TableColumn<ReservationAnnulee,String> c3 = new TableColumn<ReservationAnnulee,String>("Nom spectacle");
        c3.setCellValueFactory(new PropertyValueFactory<ReservationAnnulee,String>("Non spectacle"));	
        tableViewAnnule.getColumns().set(2, c3);
        TableColumn<ReservationAnnulee,String> c4 = new TableColumn<ReservationAnnulee,String>("Date et heure");
        c4.setCellValueFactory(new PropertyValueFactory<ReservationAnnulee,String>("Date et heure"));	
        tableViewAnnule.getColumns().set(1, c4);
        TableColumn<ReservationAnnulee,String> c5 = new TableColumn<ReservationAnnulee,String>("Date d'annulation");
        c5.setCellValueFactory(new PropertyValueFactory<ReservationAnnulee,String>("Date d'annulation"));	
        tableViewAnnule.getColumns().set(1, c5);
	}
}
