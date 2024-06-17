package vue;

import java.text.ParseException;

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
import modele.DataBase;
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

    @FXML
    void clickTrier(ActionEvent event) {

    }

    @FXML
    void rechercher(ActionEvent event) {

    }
    
    @FXML private void initialize() throws ParseException
    {
    	TableColumn<ReservationAnnulee,String> c1 = new TableColumn<ReservationAnnulee,String>("Nom client");
        c1.setCellValueFactory(new PropertyValueFactory<ReservationAnnulee,String>("Nom client"));	
        tableViewAnnule.getColumns().add(c1);
        TableColumn<ReservationAnnulee,String> c2 = new TableColumn<ReservationAnnulee,String>("N° client");
        c2.setCellValueFactory(new PropertyValueFactory<ReservationAnnulee,String>("N° client"));	
        tableViewAnnule.getColumns().add(c2);
        TableColumn<ReservationAnnulee,String> c3 = new TableColumn<ReservationAnnulee,String>("Nom spectacle");
        c3.setCellValueFactory(new PropertyValueFactory<ReservationAnnulee,String>("Non spectacle"));	
        tableViewAnnule.getColumns().add(c3);
        TableColumn<ReservationAnnulee,String> c4 = new TableColumn<ReservationAnnulee,String>("Date et heure");
        c4.setCellValueFactory(new PropertyValueFactory<ReservationAnnulee,String>("Date et heure"));	
        tableViewAnnule.getColumns().add(c4);
        TableColumn<ReservationAnnulee,String> c5 = new TableColumn<ReservationAnnulee,String>("Date d'annulation");
        c5.setCellValueFactory(new PropertyValueFactory<ReservationAnnulee,String>("Date d'annulation"));	
        tableViewAnnule.getColumns().add(c5);
        TableColumn<ReservationAnnulee,String> c6 = new TableColumn<ReservationAnnulee,String>("Billets vendus");
        c6.setCellValueFactory(new PropertyValueFactory<ReservationAnnulee,String>("Billets vendus"));	
        tableViewAnnule.getColumns().add(c6);
        TableColumn<ReservationAnnulee,String> c7 = new TableColumn<ReservationAnnulee,String>("Billets retournés");
        c6.setCellValueFactory(new PropertyValueFactory<ReservationAnnulee,String>("Billets retournés"));	
        tableViewAnnule.getColumns().add(c7);
        TableColumn<ReservationAnnulee,String> c8 = new TableColumn<ReservationAnnulee,String>("Total remboursement");
        c6.setCellValueFactory(new PropertyValueFactory<ReservationAnnulee,String>("Total remboursement"));	
        tableViewAnnule.getColumns().add(c8);

        DataBase.chargerReservationsAnnulees();
        tableViewAnnule.setItems(DataBase.getAnnulations());
	}	
    

}

    


